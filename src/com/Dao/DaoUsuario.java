package com.Dao;

import com.Entidades.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author BymerGomez
 */
public class DaoUsuario extends Conexion implements CrudUsuario
{
    PreparedStatement ps;
    ResultSet rs;
    Usuario usu;
    int res;

    @Override
    public ArrayList<Usuario> mostrar() throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("select * from usuario");
        ArrayList<Usuario> ar= new ArrayList<Usuario>();
        try
        {
            rs=ps.executeQuery();
            while (rs.next())
            {                
                usu = new Usuario(rs.getInt("codigoUsuario"),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
                ar.add(usu);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            super.con().close();
        }
        return ar;
    }

    @Override
    public int agregar(Usuario usu) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("insert into usuario(usuario,"
                + "contra,nombre,apellido,edad,codigoTipo) values(?,?,?,?,"
                + "?,?);");
        ps.setString(1, usu.getUsuario());
        ps.setString(2, usu.getContra());
        ps.setString(3, usu.getNombre());
        ps.setString(4, usu.getApellido());
        ps.setInt(5, usu.getEdad());
        ps.setInt(6, usu.getCodigoTipo());
        try
        {
            res=ps.executeUpdate();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps.close();
            super.con().close();
        }
        return res;
    }

    @Override
    public int modificar(Usuario usu) throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("update usuario set usuario=?, "
                + "contra=?, nombre=?, apellido=?, edad=?,codigoTipo=? "
                + "where codigoUsuario=?;");
        ps.setString(1, usu.getUsuario());
        ps.setString(2, usu.getContra());
        ps.setString(3, usu.getNombre());
        ps.setString(4, usu.getApellido());
        ps.setInt(5, usu.getEdad());
        ps.setInt(6, usu.getCodigoTipo());
        ps.setInt(7, usu.getCodigoUsuario());
        try
        {
            res=ps.executeUpdate();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps.close();
            super.con().close();
        }
        return res;
    }

    @Override
    public int eliminar(Usuario usu) throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("delete from usuario where "
                + "codigoUsuario=?");
       ps.setInt(1, usu.getCodigoUsuario());
        try
        {
            res=ps.executeUpdate();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally
        {
            ps.close();
            super.con().close();
        }
        return res;
    }
    
}
