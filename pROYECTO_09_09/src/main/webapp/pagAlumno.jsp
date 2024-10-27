<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*,java.util.* " %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
          List<Alumno> lista=(ArrayList<Alumno>)request.getAttribute("dato");
          String nom=(String)request.getAttribute("dato2");
        %>    
    <center>
        <h2>Lista de Alumnos de <%=nom%></h2>
        <table class="table table-hover">
            <thead>
                <tr class="text-white bg-blue">
                    <th>Codigo<th>Apellido<th>Nombre<th>Foto<th>Pagos<th>Notas   
                </tr>   
            </thead>   
            <%    
               String noma;
               for(Alumno x:lista){
               noma=x.getApe()+","+x.getNoma();
               %>
               <tr><td><%=x.getCoda()%><td><%=x.getApe()%><td><%=x.getNoma()%>
                   <td><img src="fotos/<%=x.getCoda()%>.jpg" width="90" height="90"
                            onerror="src='fotos/sin_foto.jpg' " class='img-circle'>       
                   <td><a href="control?opc=2&cod=<%=x.getCoda()%>&nom=<%=noma%>">Pagos</a>
                   <td><a href="control?opc=3&cod=<%=x.getCoda()%>&nom=<%=noma%>">Notas</a>    
               <%
                }
              %>    
        </table>
        
    </center>
    </body>
</html>
