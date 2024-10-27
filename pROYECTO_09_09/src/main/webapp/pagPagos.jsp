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
          List<Pagos> lista=(ArrayList<Pagos>)request.getAttribute("dato");
          String nom=(String)request.getAttribute("dato2");
        %>    
    <center>
        <h2>Lista de Pagos  de <%=nom%></h2>
        <a href="#" onclick="history.back()">Retornar</a>      
        <table class="table table-hover">
            <thead>
                <tr class="text-white bg-blue">
                    <th>Ciclo<th>Ncuota<th>Fecha<th>Monto   
                </tr>   
            </thead>   
            <%    
               double sm=0;
               for(Pagos x:lista){
               sm=sm+x.getMonto();
               %>
               <tr><td><%=x.getCiclo()%><td><%=x.getNcuota()%><td><%=x.getFecha()%>
                   <td><%=x.getMonto()%>   
               <%
                }
              %>    
               <tr><td colspan="3">monto total<td><%=sm%>
        </table>
        
    </center>
    </body>
</html>
