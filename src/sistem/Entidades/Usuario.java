package sistem.Entidades;

/**
 * Nombre de la Clase: Usuario
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class Usuario
{
    private int codigoUsuario;
    private String usuario;
    private String nombre;
    private String apellido;
    private int edad;
    private int codigoTipo;

    public Usuario()
    {
        
    }

    public Usuario(int codigoUsuario, String usuario, String nombre,
            String apellido, int edad, int codigoTipo) {
        this.codigoUsuario = codigoUsuario;
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigoTipo = codigoTipo;
    }

    public Usuario(String usuario, String nombre, String apellido, int edad, int codigoTipo) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigoTipo = codigoTipo;
    }

    public Usuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }
    
    
}
