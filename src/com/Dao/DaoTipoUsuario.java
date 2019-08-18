package com.Dao;

import com.Entidades.TipoUsuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: DaoTipoUsuario
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class DaoTipoUsuario extends Conexion implements CrudTipoUsuario
{
    PreparedStatement ps;
    ResultSet rs;
    TipoUsuario tU;
    int res;

    @Override
    public ArrayList<TipoUsuario> mostrar() throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("select * from producto");
        ArrayList<TipoUsuario> ar= new ArrayList<TipoUsuario>();
        try
        {
            rs=ps.executeQuery();
            while (rs.next())
            {                
                tU=new TipoUsuario(rs.getInt("codigoTipo"),
                        rs.getString(2));
                ar.add(tU);
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
    public int agregar(TipoUsuario tU) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("insert into tipoUsuario (nombre) "
                + "values (?);");
        ps.setString(1, tU.getNombre());
        
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
    public int modificar(TipoUsuario tU) throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("update tipoUsuario set nombre=? "
                + "where codigoTipo=?;");
        ps.setString(1, tU.getNombre());
        ps.setInt(2, tU.getCodigoTipo());
        
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
    public int eliminar(TipoUsuario tU) throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("delete from tipoUsuario where "
                + "codigoTipo=?");
       ps.setInt(1, tU.getCodigoTipo());
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
