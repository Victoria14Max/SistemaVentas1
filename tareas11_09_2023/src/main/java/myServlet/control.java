package myServlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Prestamo;
import controlador.Negocio;
public class control extends HttpServlet {
     Negocio obj=new Negocio();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int op=Integer.parseInt(request.getParameter("opc"));
       if(op==1)adicion(request, response);
       if(op==2)anula(request, response);
       if(op==3)edita(request, response);
       if(op==4)actualiza(request, response);
    }
protected void adicion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Prestamo p=new Prestamo();
        p.setCliente(request.getParameter("cliente"));
        p.setMonto(Double.parseDouble(request.getParameter("monto")));
        p.setMeses(Integer.parseInt(request.getParameter("mes")));
        obj.adicion(p);
        String pag="/pagListado.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    protected void anula(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int nro=Integer.parseInt(request.getParameter("nro"));
        obj.anular(nro);
        String pag="/pagListado.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    protected void edita(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int nro=Integer.parseInt(request.getParameter("nro"));
        request.setAttribute("dato", obj.consulta(nro));
        String pag="/pagEdit.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    protected void actualiza(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Prestamo p=new Prestamo();
        p.setCliente(request.getParameter("cliente"));
        p.setMonto(Double.parseDouble(request.getParameter("monto")));
        p.setMeses(Integer.parseInt(request.getParameter("mes")));
        p.setNropre(Integer.parseInt(request.getParameter("nro")));
        obj.modifica(p);
        String pag="/pagListado.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
