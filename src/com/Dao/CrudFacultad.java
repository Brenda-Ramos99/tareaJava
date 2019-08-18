package com.Dao;

import com.Entidades.Facultad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Nombre de la Interfaz: CrudFacultad
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public interface CrudFacultad
{
    public ArrayList<Facultad> mostrar()throws ClassNotFoundException,
            SQLException;
    public int agregar(Facultad f)throws ClassNotFoundException,SQLException;
    public int modificar(Facultad f)throws ClassNotFoundException,SQLException;
    public int eliminar(Facultad f)throws ClassNotFoundException,SQLException;
}
