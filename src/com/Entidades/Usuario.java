package com.Entidades;

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
    private String contra;
    private String nombre;
    private String apellido;
    private int edad;
    private String codigoTipo;

    public Usuario()
    {
        
    }

    public Usuario(int codigoUsuario, String usuario, String contra,
            String nombre, String apellido, int edad, String codigoTipo) {
        this.codigoUsuario = codigoUsuario;
        this.usuario = usuario;
        this.contra = contra;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigoTipo = codigoTipo;
    }

    public Usuario(String usuario, String contra, String nombre,
            String apellido, int edad, String codigoTipo) {
        this.usuario = usuario;
        this.contra = contra;
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

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
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

    public String getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(String codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    
}
