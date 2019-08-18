package com.Dao;

import com.Entidades.Estudiante;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Nombre de la Interfaz: CrudEstudiante
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

/*Métodos abstractos*/
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
