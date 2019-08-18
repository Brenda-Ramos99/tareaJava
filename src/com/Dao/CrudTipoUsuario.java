package com.Dao;

import com.Entidades.TipoUsuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Nombre de la Interfaz: CrudTipoUsuario
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

/*Métodos abstractos*/
public interface CrudTipoUsuario {
    public ArrayList<TipoUsuario> mostrar()throws ClassNotFoundException,
            SQLException;
    public int agregar(TipoUsuario tU)throws ClassNotFoundException,
            SQLException;
    public int modificar(TipoUsuario tU)throws ClassNotFoundException,
            SQLException;
    public int eliminar(TipoUsuario tU)throws ClassNotFoundException,
            SQLException;
}
