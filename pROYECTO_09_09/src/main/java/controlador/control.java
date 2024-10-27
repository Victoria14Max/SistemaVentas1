
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.*;
import dao.Negocio;
public class control extends HttpServlet {
    Negocio  obj=new Negocio();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       int op=Integer.parseInt(request.getParameter("opc"));
       if(op==1)lisAlu(request, response);
       if(op==2)lisPago(request, response);
       if(op==3)lisNota(request, response);
    }
protected void lisAlu(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cod=request.getParameter("cod");
        String nom=request.getParameter("nom");
        request.setAttribute("dato", obj.lisAlu(cod));
        request.setAttribute("dato2", nom);
        String pag="/pagAlumno.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    protected void lisPago(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String cod=request.getParameter("cod");
        String nom=request.getParameter("nom");
        request.setAttribute("dato", obj.lisPago(cod));
        request.setAttribute("dato2", nom);
        String pag="/pagPagos.jsp";
        request.getRequestDispatcher(pag).forward(request, response);
    }
    
    protected void lisNota(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String cod=request.getParameter("cod");
        String nom=request.getParameter("nom");
        request.setAttribute("dato", obj.lisNota(cod));
        request.setAttribute("dato2", nom);
        String pag="/pagNotas.jsp";
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
