<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Prestamo,controlador.Negocio" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
          Negocio  obj=new Negocio();
         %>
        <h1>Listado de Prestamos</h1>
        <a href="pagAdicion.jsp">Registrar prestamos</a>
        <table class="table table-hover">
            <thead>
                <tr class="text-white bg-black">
                <th>Nropre<th>Cliente<th>Monto<th>Meses<th>Interes
                <th>Anular<th>Edit<th>Calendario
            </thead>
           <%
             for(Prestamo p:obj.listado()){
             out.print("<tr><td>"+p.getNropre()+"<td>"+p.getCliente()+"<td>"+p.getMonto()+
                 "<td>"+p.getMeses()+"<td>"+p.interes());
               %>
               <td><a href="control?opc=2&nro=<%=p.getNropre()%>">Del</a>
               <td><a href="control?opc=3&nro=<%=p.getNropre()%>">Edit</a>
                  
               <%
               }  
           %>    
        </table>
    </body>
</html>
