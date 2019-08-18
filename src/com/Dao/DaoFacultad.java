package com.Dao;
import com.Entidades.Facultad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: DaoFacultad
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class DaoFacultad extends Conexion implements CrudFacultad
{
    PreparedStatement ps;
    ResultSet rs;/*Cursor de valores en la tabla "ITERADOR - next()"*/
    Facultad f;/*Instancia a la clase facultad*/
    int res;

    @Override
    public ArrayList<Facultad> mostrar() throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("select * from facultad");
        ArrayList<Facultad> ar = new ArrayList<Facultad>();
        try
        {
            rs=ps.executeQuery();
            while (rs.next())
            {                
                f=new Facultad(rs.getInt("codigoFacultad"),
                        rs.getString(2),
                        rs.getString(3));
                ar.add(f);
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        finally
        {
            super.con().close();
        }
        return ar;
    }

    @Override
    public int agregar(Facultad f) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("insert into facultad (nombre,"
                + "telefono) values (?,?);");
        ps.setString(1, f.getNombre());
        ps.setString(2, f.getTelefono());
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
    public int modificar(Facultad f) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Facultad f) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
