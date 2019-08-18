package com.Dao;

import com.Entidades.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author BymerGomez
 */
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
