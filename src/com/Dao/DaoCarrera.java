/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    public ArrayList<Carrera> mostrar() throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("select * from carrera");
        ArrayList<Carrera> ar = new ArrayList<Carrera>();
        try
        {
            rs=ps.executeQuery();
            while (rs.next())
            {                
                c= new Carrera(rs.getInt("codigoCarrera"),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getInt(4)
                );
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
    public int agregar(Carrera c) throws ClassNotFoundException, SQLException {
        ps=super.con().prepareStatement("insert into producto(nombre,precio) "
                + "values(?,?)");
        ps.setString(1, c.getNombre());
        ps.setInt(2, c.getCantidadMaterias());
        //ps.setInt(3, res);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int eliminar(Carrera c) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
