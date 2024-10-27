package controlador;
import java.sql.*;
import java.util.*;
import modelo.Prestamo;
import util.MySQLConexion;
public class Negocio {
   public void adicion(Prestamo p){
     Connection cn=MySQLConexion.getConexion();
     String sql="INSERT INTO PRESTAMO VALUEs(null, ?,?,?)";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setString(1, p.getCliente());
       st.setDouble(2, p.getMonto());
       st.setInt(3, p.getMeses());
       st.executeUpdate();
     }catch(Exception ex){
         ex.printStackTrace();
     }
    }
    //modificacion de datos
     public void modifica(Prestamo p){
     Connection cn=MySQLConexion.getConexion();
     String sql="update prestamo set cliente=?,monto=?,meses=? where nropre=?";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setString(1, p.getCliente());
       st.setDouble(2, p.getMonto());
       st.setInt(3, p.getMeses());
       st.setInt(4, p.getNropre());
       st.executeUpdate();
     }catch(Exception ex){
         ex.printStackTrace();
     }
    }
    //anulacion 
      public void anular(int nro){
     Connection cn=MySQLConexion.getConexion();
     String sql="delete from prestamo where nropre=?";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setInt(1, nro);
       st.executeUpdate();
     }catch(Exception ex){
         ex.printStackTrace();
     }
    }
    //listar los datos de la tabla
      public List<Prestamo> listado(){
     Connection cn=MySQLConexion.getConexion();
     List<Prestamo> lista=new ArrayList();
     String sql="select nropre,cliente,monto,meses from prestamo";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       ResultSet rs=st.executeQuery();
       while(rs.next()){//es un valor logico es verdad si la fila es leida
           Prestamo p=new Prestamo();
           p.setNropre(rs.getInt(1));
           p.setCliente(rs.getString(2));
           p.setMonto(rs.getDouble(3));
           p.setMeses(rs.getInt(4));
           lista.add(p);
       }
       
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return lista;
    } 
     //consulta x nro de prestamo
      public Prestamo consulta(int nro){
     Connection cn=MySQLConexion.getConexion();
     Prestamo p=null;
     String sql="select nropre,cliente,monto,meses from prestamo where nropre=?";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setInt(1, nro);
       ResultSet rs=st.executeQuery();
       if(rs.next()){//es un valor logico es verdad si la fila es leida
           p=new Prestamo();
           p.setNropre(rs.getInt(1));
           p.setCliente(rs.getString(2));
           p.setMonto(rs.getDouble(3));
           p.setMeses(rs.getInt(4));
       }
       
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return p;
    } 
      
}
