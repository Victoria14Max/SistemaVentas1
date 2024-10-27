
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Registro de Prestamo</h1>
        <form action="control" method="post">
            <table class="table table-bordered">
                <input type="hidden" name="opc" value="1">
                <tr><td>cliente<td><input name="cliente" required>
                <tr><td>Monto<td><input name="monto" required>
                <tr><td>Meses<td><input name="mes" required>
                <tr><td><input type="submit">         
            </table>
         </form>
      </body>
</html>
