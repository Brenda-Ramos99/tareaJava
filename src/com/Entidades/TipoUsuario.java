package com.Entidades;

/**
 * Nombre de la Clase: TipoUsuario
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class TipoUsuario
{
    private int codigoTipo;
    private String nombre;

    public TipoUsuario()
    {
        
    }

    public TipoUsuario(int codigoTipo, String nombre) {
        this.codigoTipo = codigoTipo;
        this.nombre = nombre;
    }

    public TipoUsuario(String nombre) {
        this.nombre = nombre;
    }

    public TipoUsuario(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
