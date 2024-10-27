
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Modelo.Usuario,Dao.Negocio"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/adminlte.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Negocio obj=new Negocio();
            %>
        <h2 class=" text-center">Usuario</h2>
        <a href="PagAdicion.jsp">Registro de Usuarios</a>
        <table class="table table-hover">
            <thead>
                <tr class="text-blue bg-ping">
                    <th>N° de Usuario<th>Nombre<th>Apellido<th>N° de DNI<th>Correo<th>Tipo de Usuario<th>Password<th>N° de Celular<th>Fecha de Nacimiento<th>Anular<th>Edita
            </thead> 
                                         
            
                    <%
                        for (Usuario u : obj.listado()) {
                        out.print("<tr><td>" + u.getIdUsuario()+ "<td>" + u.getNombre()+ "<td>" + u.getApellido()+ "<td>" + u.getDni() + "<td>" + u.getCorreo()
                        + "<td>" + u.getTipoUsuario()+ "<td>" + u.getPass() + "<td>" + u.getCel()+ "<td>" + u.getFeNac()) ;
                        %> 
                    <td><a href="control1?opc=2&nro=<%=u.getIdUsuario() %>">Del</a>
                    <td><a href="control1?opc=3&nro=<%=u.getIdUsuario()%>">Edita</a>       
                               
                         <%
                             }
                        %>
        </table>   
      </body>
</html>
