package com.Dao;

import com.Entidades.Carrera;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Nombre de la Interfaz: CrudCarrera
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public interface CrudCarrera
{
    public ArrayList<Carrera> mostrar()throws ClassNotFoundException,
            SQLException;
    public int agregar(Carrera c)throws ClassNotFoundException,SQLException;
    public int modificar(Carrera c)throws ClassNotFoundException,SQLException;
    public int eliminar(Carrera c)throws ClassNotFoundException,SQLException;
    public ArrayList<Carrera> llenar() throws ClassNotFoundException,
            SQLException;
}
