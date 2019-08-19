package com.Dao;

import com.Entidades.Carrera;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Nombre de la Clase: DaoCarrera
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class DaoCarrera extends Conexion implements CrudCarrera
{
    PreparedStatement ps;
    ResultSet rs;
    Carrera c;
    int res;

    @Override
    public ArrayList<Carrera> mostrar() throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("select codigoCarrera, nombre,"
                + " cantidadMaterias,(select nombre from facultad where "
                + "codigoFacultad=carrera.codigoFacultad) as facultad from carrera;");
        
        ArrayList<Carrera> ar = new ArrayList<Carrera>();
        try
        {
            rs=ps.executeQuery();            
            while (rs.next())
            {                
                c= new Carrera(rs.getInt("codigoCarrera"),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4));                
                ar.add(c);
            }
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
        return ar;
    }
    
    @Override
    public ArrayList<Carrera> llenar() throws ClassNotFoundException,
            SQLException {
        ps=super.con().prepareStatement("select nombre from carrera");
        ArrayList<Carrera> a1 = new ArrayList<Carrera>();
        try
        {
            rs=ps.executeQuery();
            while (rs.next())
            {                
                c = new Carrera(rs.getInt("codigoCarrera"));
                a1.add(c);
            }
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
        return a1;
    }

    @Override
    public int agregar(Carrera c) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("insert into carrera (nombre,"
                + "cantidadMaterias,codigoFacultad) values(?,?,"
                + "(select codigoFacultad from facultad where nombre=?));");
        ps.setString(1, c.getNombre());
        ps.setInt(2, c.getCantidadMaterias());
        ps.setString(3, c.getCodigoFacultad());
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
    public int modificar(Carrera c) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("update carrera set "
                + "nombre=?, cantidadMaterias=?, "
                + "codigoFacultad=(select codigoFacultad from "
                + "facultad where nombre=?) where codigoCarrera=?;");
        ps.setString(1, c.getNombre());
        ps.setInt(2, c.getCantidadMaterias());
        ps.setString(3, c.getCodigoFacultad());
        ps.setInt(4, c.getCodigoCarrera());
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
    public int eliminar(Carrera c) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("delete from carrera where "
                + "codigoCarrera=?;");
        ps.setInt(1, c.getCodigoCarrera());
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
