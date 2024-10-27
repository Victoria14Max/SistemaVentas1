
import java.util.*;
 
// Una clase para almacenar un borde de graph
class Edge
{
    int source, dest;
 
    public Edge(int source, int dest)
    {
        this.source = source;
        this.dest = dest;
    }
}
 
// Una clase para representar un objeto graph
class Graph
{
    // Una lista de listas para representar una lista de adyacencia
    List<List<Integer>> adjList = null;
 
    // Constructor
    Graph(List<Edge> edges, int n)
    {
        adjList = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
 
        // agrega bordes al grafo no dirigido
        for (Edge edge: edges)
        {
            int src = edge.source;
            int dest = edge.dest;
 
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }
}
 
class Main
{
    // Realiza BFS recursivamentemente en el graph
    public static void recursiveBFS(Graph graph, Queue<Integer> q,
                                    boolean[] discovered)
    {
        if (q.isEmpty()) {
            return;
        }
 
        // quitar la queue del nodo frontal e imprimirlo
        int v = q.poll();
        System.out.print(v + " ");
 
        // hacer para cada borde (v, u)
        for (int u: graph.adjList.get(v))
        {
            if (!discovered[u])
            {
                // marcarlo como descubierto y ponerlo en queue
                discovered[u] = true;
                q.add(u);
            }
        }
 
        recursiveBFS(graph, q, discovered);
    }
 
    public static void main(String[] args)
    {
        // Lista de bordes de graph según el diagrama anterior
        List<Edge> edges = Arrays.asList(
                new Edge(1, 2), new Edge(1, 3), new Edge(1, 4), new Edge(2, 5),
                new Edge(2, 6), new Edge(5, 9), new Edge(5, 10), new Edge(4, 7),
                new Edge(4, 8), new Edge(7, 11), new Edge(7, 12)
                // los vértices 0, 13 y 14 son nodos individuales
        );
 
        // número total de nodos en el graph (etiquetados de 0 a 14)
        int n = 15;
 
        // construye un graph a partir de los bordes dados
        Graph graph = new Graph(edges, n);
 
        // para realizar un seguimiento de si se descubre un vértice o no
        boolean[] discovered = new boolean[n];
 
        // crea una queue para hacer BFS
        Queue<Integer> q = new ArrayDeque<>();
 
        // Realizar el recorrido BFS desde todos los nodos no descubiertos hasta
        // cubrir todos los componentes conectados de un graph
        for (int i = 0; i < n; i++)
        {
            if (discovered[i] == false)
            {
                // marca el vértice de origen como descubierto
                discovered[i] = true;
 
                // poner en queue el vértice fuente
                q.add(i);
 
                // inicia el recorrido BFS desde el vértice `i`
                recursiveBFS(graph, q, discovered);
            }
        }
    }
}