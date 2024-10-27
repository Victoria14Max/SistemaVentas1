
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Prestamo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%
          Prestamo p=(Prestamo)request.getAttribute("dato");
         %>
        <h1>Actualizar Prestamo</h1>
        <form action="control" method="post">
            <table class="table table-bordered">
                <input type="hidden" name="opc" value="4">
                <tr><td>Nro<td><input name="nro" value="<%=p.getNropre()%>" readonly>
                <tr><td>cliente<td><input name="cliente" value="<%=p.getCliente()%>">
                <tr><td>Monto<td><input name="monto" value="<%=p.getMonto()%>">
                <tr><td>Meses<td><input name="mes" value="<%=p.getMeses()%>">
                <tr><td><input type="submit">         
            </table>
         </form>
      </body>
</html>
