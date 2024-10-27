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
          List<Notas> lista=(ArrayList<Notas>)request.getAttribute("dato");
          String nom=(String)request.getAttribute("dato2");
        %>    
    <center>
        <h2>Lista de Notas <%=nom%></h2>
        <table class="table table-hover">
            <thead>
                <tr class="text-white bg-orange">
                    <th>Código<th>Nombre del curso<th>Nota de Examen Parcial<th>Nota de Examen Final<th>Promedio  
                </tr>   
            </thead>   
            <%    
               for(Notas x:lista){
               %>
               <tr><td><%=x.getCodc()%><td><%=x.getNomcur()%><td><%=x.getExp()%>
                       <td><%=x.getExf()%> <td><%=x.prom()%>
                    
                      
               <%
                }
              %>    
        </table>
        
    </center>
    </body>
</html>
