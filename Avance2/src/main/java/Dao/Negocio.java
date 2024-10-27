package Dao;
import java.sql.*;
import java.util.*;
import Modelo.Usuario;

import util.MySQLConexion;
public class Negocio {
   public void adicion(Usuario u){
     Connection cn=MySQLConexion.getConexion();
     
     String sql="INSERT INTO usuario VALUEs(null,?,?,?,?,?,?,?,?)";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setString(1, u.getNombre());
       st.setString(2, u.getApellido());
       st.setString(3, u.getDni());
       st.setString(4, u.getCorreo());
       st.setString(5, u.getTipoUsuario());
       st.setString(6, u.getPass());
       st.setString(7, u.getCel());
       st.setDate(8, u.getFeNac());
       
       st.executeUpdate();
     }catch(Exception ex){
         ex.printStackTrace();
     }
    }
    //modificacion de datos
     public void modifica(Usuario u){
     Connection cn=MySQLConexion.getConexion();
     String sql="update usuario set nombre=?,apellido=?, dni=?, correo=?, tipousuario=?, password=?, celular=?, fechanac=? where idusuario=?";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setString(1, u.getNombre());
       st.setString(2, u.getApellido());
       st.setString(3, u.getDni());
       st.setString(4, u.getCorreo());
       st.setString(5, u.getTipoUsuario());
       st.setString(6, u.getPass());
       st.setString(7, u.getCel());
       st.setDate(8, u.getFeNac());
       st.setInt(9, u.getIdUsuario());
       st.executeUpdate();
     }catch(Exception ex){
         ex.printStackTrace();
     }
    }
    //anulacion 
      public void anular(int nro){
     Connection cn=MySQLConexion.getConexion();
     String sql="delete from usuario where idusuario=?";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setInt(1, nro);
       st.executeUpdate();
     }catch(Exception ex){
         ex.printStackTrace();
     }
    }
    //listar los datos de la tabla
      public List<Usuario> listado(){
     Connection cn=MySQLConexion.getConexion();
     List<Usuario> lista=new ArrayList();
     String sql="select idUsuario,nombre, apellido, dni, correo, tipousuario,password, celular, fechanac from usuario";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       ResultSet rs=st.executeQuery();
       while(rs.next()){//es un valor logico es verdad si la fila es leida
           Usuario u=new Usuario();
           u.setIdUsuario(rs.getInt(1));
           u.setNombre(rs.getString(2));
           u.setApellido(rs.getString(3));
           u.setDni(rs.getString(4));
           u.setCorreo(rs.getString(5));
           u.setTipoUsuario(rs.getString(6));
           u.setPass(rs.getString(7));
           u.setCel(rs.getString(8));
           u.setFeNac(rs.getDate(9));
           
           lista.add(u);
       }
       
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return lista;
    } 
     //consulta x nro de prestamo
      public Usuario consulta(int nro){
     Connection cn=MySQLConexion.getConexion();
     Usuario u=null;
     String sql="select idusuario,nombre,apellido,dni, correo, tipousuario,password,celular, fechanac from usuario where idusuario=?";
     try{
       PreparedStatement st=cn.prepareStatement(sql);
       st.setInt(1, nro);
       ResultSet rs=st.executeQuery();
       if(rs.next()){//es un valor logico es verdad si la fila es leida
           u=new Usuario();
           u.setIdUsuario(rs.getInt(1));
           u.setNombre(rs.getString(2));
           u.setApellido(rs.getString(3));
           u.setDni(rs.getString(4));
          u.setCorreo(rs.getString(5));
           u.setTipoUsuario(rs.getString(6));
           u.setPass(rs.getString(7));
           u.setCel(rs.getString(8));
           u.setFeNac(rs.getDate(9));
           
       }
       
     }catch(Exception ex){
         ex.printStackTrace();
     }
     return u;
    } 
      
}
