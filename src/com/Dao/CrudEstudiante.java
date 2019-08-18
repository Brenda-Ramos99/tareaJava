/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Dao;

import com.Entidades.Estudiante;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author BymerGomez
 */
public interface CrudEstudiante
{
    public ArrayList<Estudiante> mostrar()throws ClassNotFoundException,
            SQLException;
    public int agregar(Estudiante es)throws ClassNotFoundException,
            SQLException;
    public int modificar(Estudiante es)throws ClassNotFoundException,
            SQLException;
    public int eliminar(Estudiante es)throws ClassNotFoundException,
            SQLException;
}
