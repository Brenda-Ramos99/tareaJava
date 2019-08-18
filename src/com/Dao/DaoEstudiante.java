package com.Dao;

import com.Entidades.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: DaoEstudiante
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */

public class DaoEstudiante extends Conexion implements CrudEstudiante
{
    PreparedStatement ps;
    ResultSet rs;
    Estudiante es;
    int res;

    @Override
    public ArrayList<Estudiante> mostrar() throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("select * from estudiante");
        ArrayList<Estudiante> ar= new ArrayList<Estudiante>();
        try
        {
            rs=ps.executeQuery();
            while (rs.next())
            {                
                es = new Estudiante(rs.getInt("codigoEstudiante"),
                rs.getString(2),
                rs.getInt(3),
                rs.getString(4),
                rs.getDouble(5),
                rs.getString(6),
                rs.getInt(7));
                ar.add(es);
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
    public int agregar(Estudiante es) throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("insert into estudiante (nombre, edad, "
                + "genero, cum, intereses, codigoCarrera) values (?,?,?,?,"
                + "?,?);");
        ps.setString(1, es.getNombre());
        ps.setInt(2, es.getEdad());
        ps.setString(3, es.getGenero());
        ps.setDouble(4, es.getCum());
        ps.setString(5, es.getIntereses());
        ps.setInt(6, es.getCodigoCarrera());
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
    public int modificar(Estudiante es) throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("update estudiante set nombre=?,"
                + " edad=?, genero=?, intereses=?,codigoCarrera=? "
                + "where codigoEstudiante=?;");
        ps.setString(1, es.getNombre());
        ps.setInt(2, es.getEdad());
        ps.setString(3, es.getGenero());
        ps.setString(4, es.getIntereses());
        ps.setInt(5, es.getCodigoCarrera());
        ps.setInt(6, es.getCodigoEstudiante());
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
    public int eliminar(Estudiante es) throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("delete from estudiante where "
                + "codigoEstudiante=?;");
       ps.setInt(1, es.getCodigoEstudiante());
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
