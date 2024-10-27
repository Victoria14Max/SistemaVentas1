
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro de Usuario</h1>
        <form action="control1" method="post">
            <table class="table table-bordered">
                 <input type="hidden" name="opc" value="1">
                <tr><td>Nombre<td><input name="nombre" required>
                <tr><td>Apellido<td><input name="apellido" required>
                <tr><td>N° de DNI<td><input name="dni" required>
                <tr><td>Correo<td><input name="correo" required>
                <tr><td>Tipo de Usuario<td><input name="tipousuario" required>
                <tr><td>Password<td><input name="password" required>
                <tr><td>Celular<td><input name="celular" required>
                <tr><td>Fecha de Nacimiento<td><input type="date"  name="fechanac" required>
                <tr><td><input type="submit">
                    
                </tr>
            </table
        </form>
    </body>
</html>
