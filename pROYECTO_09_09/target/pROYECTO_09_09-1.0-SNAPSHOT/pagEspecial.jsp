<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*,dao.Negocio " %>
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
    <center>
        <h2>Lista de especialidades</h2>
        <table class="table table-hover">
            <thead>
                <tr class="text-white bg-blue">
                    <th>Codigo<th>Especialidad<th>Alumnos   
                </tr>   
            </thead>   
            <%    
               for(Especial x:obj.lisEsp()){
               %>
               <tr><td><%=x.getCode()%><td><%=x.getNomesp()%>
                   <td><a href="control?opc=1&cod=<%=x.getCode()%>&nom=<%=x.getNomesp()%>">Ver</a>       
               <%
                }
              %>    
        </table>
        
    </center>
    </body>
</html>
