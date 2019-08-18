package com.Entidades;

/**
 * Nombre de la Clase: Facultad
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public class Facultad
{
    /*Variables definidas para las tablas según el modelo de la base de datos*/
    
    private int codigoFacultad;
    private String nombre;
    private String telefono;

    /*Constructor vacío de la clase Facultad*/
    public Facultad()
    {
        
    }
    
    /*Método constructor con todos los campos, para mostrar datos*/
    public Facultad(int codigoFacultad, String nombre, String telefono) {
        this.codigoFacultad = codigoFacultad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    /*Método contstructor con los atributos necesarios
    para la inserción de datos, sin código, ya que es autoincrementable*/
    public Facultad(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    /*Método contstructor con los atributos necesarios
    para la eliminación de datos en base al ID/código*/
    public Facultad(int codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }
    
    /*Métodos para obtener y setear datos de la clase*/
    public int getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(int codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
        
}
