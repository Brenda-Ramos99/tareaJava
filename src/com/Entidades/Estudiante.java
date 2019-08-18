package com.Entidades;

/**
 * Nombre de la Clase: Estudiante
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public class Estudiante
{
    private int codigoEstudiante;
    private String nombre;
    private int edad;
    private String genero;
    private double cum;
    private String intereses;
    private int codigoCarrera;
    

    public Estudiante()
    {
        
    }

    public Estudiante(int codigoEstudiante, String nombre, int edad,
            String genero, double cum, String intereses, int codigoCarrera) {
        this.codigoEstudiante = codigoEstudiante;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cum = cum;
        this.intereses = intereses;
        this.codigoCarrera = codigoCarrera;
    }

    public Estudiante(String nombre, int edad, String genero,
            double cum, String intereses, int codigoCarrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cum = cum;
        this.intereses = intereses;
        this.codigoCarrera = codigoCarrera;
    }

    public Estudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getCum() {
        return cum;
    }

    public void setCum(double cum) {
        this.cum = cum;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

      
}
