
package Modelo;

import java.sql.Date;

public class Usuario {
    int idUsuario;
    String Nombre;
    String Apellido;
    String Dni;
    String Correo;
    String tipoUsuario;
    String pass;
    String cel;
    Date feNac;

    public Usuario() {
    }

    public Usuario(int idUsuario, String Nombre, String Apellido, String Dni, String Correo, String tipoUsuario, String pass, String cel, Date feNac) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Dni = Dni;
        this.Correo = Correo;
        this.tipoUsuario = tipoUsuario;
        this.pass = pass;
        this.cel = cel;
        this.feNac = feNac;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public Date getFeNac() {
        return feNac;
    }

    public void setFeNac(Date feNac) {
        this.feNac = feNac;
    }

   
    
}
