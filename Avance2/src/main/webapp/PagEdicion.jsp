

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Usuario" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
           Usuario u=(Usuario)request.getAttribute("dato");
            
            %>
        <h1>Actualizar Usuario</h1>
        <form action="control1" method="post">
            <table class="table table-bordered">
                <input type="hidden" name="opc" value="4">
                <tr><td>Nro<td><input name="nro" value ="<%=u.getIdUsuario()%>" readonly> 
                <tr><td>Nombre<td><input name="nombre" value="<%=u.getNombre()%>">
                 <tr><td>Apellido<td><input name="apellido" value="<%=u.getApellido()%>">
                 <tr><td>DNI<td><input name="dni" value="<%=u.getDni()%>">
                  <tr><td>Correo<td><input name="correo" value="<%=u.getCorreo()%>">   
                  <tr><td>Tipo de Usuario<td><input name="tipousuario" value="<%=u.getTipoUsuario()%>">
                  <tr><td>password<td><input name="password" value="<%=u.getPass()%>">
                  <tr><td>celular<td><input name="celular" value="<%=u.getIdUsuario()%>">
                  <tr><td>Fecha de Nacimiento<td><input name="fechanac" value="<%=u.getFeNac()%>">
                <tr><td><input type="submit">
            </table>        
                
           </form>
    </body>
</html>
