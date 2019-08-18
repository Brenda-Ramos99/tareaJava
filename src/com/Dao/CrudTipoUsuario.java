package com.Dao;

import com.Entidades.TipoUsuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author BymerGomez
 */
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
