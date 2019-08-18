package com.Dao;

import com.Entidades.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Nombre de la Interfaz: CrudUsuario
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

/*Métodos Abstractos*/
public interface CrudUsuario
{
    public ArrayList<Usuario> mostrar()throws ClassNotFoundException,
            SQLException;
    public int agregar(Usuario usu)throws ClassNotFoundException,
            SQLException;
    public int modificar(Usuario usu)throws ClassNotFoundException,
            SQLException;
    public int eliminar(Usuario usu)throws ClassNotFoundException,
            SQLException;
}
