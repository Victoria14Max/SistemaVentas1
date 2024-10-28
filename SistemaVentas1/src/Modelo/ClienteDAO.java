
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
    Conexion cn= new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean RegistrarCliente (Cliente cl){
        String sql = "INSERT INTO clientes  (dni, nombre, telefono, direccion,correo,RazonSocial) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cl.getDni());
            ps.setString(2,cl.getNombre());
            ps.setInt(3,cl.getTelefono());
            ps.setString(4,cl.getDireccion());
            ps.setString(5,cl.getCorreo());
            ps.setString(6,cl.getRazon());
            ps.execute ();
       return true;
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
       return false;
        }finally{
            try{
               con.close();
            }catch (SQLException e){
                System.out.println(e.toString());
            }
            
        }
    }
    public List ListarCliente(){
    List <Cliente> ListaCl = new ArrayList();
    String sql = "SELECT * FROM clientes (dni, nombre, telefono, direccion,correo,RazonSocial) VALUES (?,?,?,?,?,?)" ;
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = (ResultSet) ps.executeQuery();
        while(rs.next()){
            Cliente cl = new Cliente ();
            cl.setId(rs.getInt("id"));
            cl.setDni(rs.getInt("dni"));
            cl.setNombre(rs.getString("nombre"));
            cl.setTelefono(rs.getInt("telefono"));
            cl.setDireccion(rs.getString("direccion"));
            cl.setCorreo(rs. getString("correo"));
            cl.setRazon(rs.getString("RazonSocial"));
            ListaCl.add(cl);
            
            
        }
        
    }catch (SQLException e){
        System.out.println(e.toString());
        
    }
    return ListaCl;
    
    
 }

    private static class ResultSet {

        public ResultSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int getInt(String id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String getString(String nombre) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
