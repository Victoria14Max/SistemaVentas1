
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Usuario;
import Dao.Negocio;
import java.util.Date;


public class control1 extends HttpServlet {
    Negocio obj=new Negocio();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            int op=Integer.parseInt(request.getParameter("opc"));
        if(op==1)adicion(request,response);
        if(op==2)anula(request,response);
        if(op==3)edita(request,response);
        if(op==4)actualiza(request,response);
        }
protected void adicion(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     Usuario u=new Usuario();
     u.setNombre(request.getParameter("nombre"));
     u.setApellido(request.getParameter("apellido"));
     u.setDni(request.getParameter("dni"));
     u.setCorreo(request.getParameter("correo"));
     u.setTipoUsuario(request.getParameter("tipousuario"));
     u.setPass(request.getParameter("password"));
     u.setCel(request.getParameter("celular"));
     String fecha = (request.getParameter("fechanac"));
     u.setFeNac(java.sql.Date.valueOf(fecha));
     obj.adicion(u);
     String pag="/PagRegistro.jsp";
     request.getRequestDispatcher(pag).forward(request, response);
         
       
    }

protected void anula(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      int nro=Integer.parseInt(request.getParameter("nro"));
      obj.anular(nro);
      String pag="/PagRegistro.jsp";
      request.getRequestDispatcher(pag).forward(request, response);
      
           
    }
 protected void edita(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          int nro=Integer.parseInt(request.getParameter("nro"));
      request.setAttribute("dato",obj.consulta(nro));
            String pag="/PagEdicion.jsp";
      request.getRequestDispatcher(pag).forward(request, response);
       
    }
 protected void actualiza(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Usuario u=new Usuario();
     u.setNombre(request.getParameter("nombre"));  
     u.setApellido(request.getParameter("apellido"));
     u.setDni(request.getParameter("dni"));
     u.setCorreo(request.getParameter("correo"));
     u.setTipoUsuario(request.getParameter("tipousuario"));
     u.setPass(request.getParameter("password"));
     u.setCel(request.getParameter("celular"));
     String fecha = (request.getParameter("fechanac"));
     u.setFeNac(java.sql.Date.valueOf(fecha));
     u.setIdUsuario(Integer.parseInt(request.getParameter("nro")));
     obj.modifica(u);
     String pag="/PagRegistro.jsp";
     request.getRequestDispatcher(pag).forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
