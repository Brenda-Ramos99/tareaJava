package com.LogicaNegocio;

import com.Dao.DaoEstudiante;
import com.Entidades.Estudiante;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Nombre de la Clase: TsEstudiante
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class TsEstudiante
{
    Estudiante es;
    DaoEstudiante obE = new DaoEstudiante();
    public DefaultTableModel datos()
    {        
        String[] title={"Código","Nombre","Edad", "Gènero", "CUM", "Intereses",
            "Carrera"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        ArrayList<Estudiante> ar= new ArrayList<Estudiante>();
        Object[] re = new Object[7];
        try
        {
            ar.addAll(obE.mostrar());
            for (Estudiante v:ar)
            {
                re[0]=v.getCodigoEstudiante();
                re[1]=v.getNombre();
                re[2]=v.getEdad();
                re[3]=v.getGenero();
                re[4]=v.getCum();
                re[5]=v.getIntereses();
                re[6]=v.getCodigoCarrera();
                tm.addRow(re);
            }
        }
        catch (Exception e)
        {
            
        }
        return tm;
    }
    
    public void agregar(String nombre,String edad, String genero, String cum,
            String intereses,String codigoCarrera)
    {
        es = new Estudiante(nombre,Integer.valueOf(edad),genero,
                Integer.valueOf(cum),intereses,Integer.valueOf(codigoCarrera));
        try {
            if (obE.agregar(es)>0) {
                JOptionPane.showMessageDialog(null, "Registro insertado "
                        + "correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Registro no insertado");
            }
        } catch (Exception e) {
        }
    }
    public void modificar(String codigoEstudiante, String nombre,
            String edad,String genero, String cum,String intereses,
            String codigoCarrera)
    {
        es = new Estudiante(Integer.valueOf(codigoEstudiante),nombre,
                Integer.valueOf(edad),genero,Integer.valueOf(cum),intereses,
                Integer.valueOf(codigoCarrera));
        try {
            if (obE.modificar(es)>0) {
                JOptionPane.showMessageDialog(null, "Registro modificado "
                        + "correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Registro no modificado");
            }
        } catch (Exception e) {
        }
    }
    
    public void eliminar(String codigoEstudiante)
    {
        es = new Estudiante(Integer.valueOf(codigoEstudiante));
        try {
            if (obE.eliminar(es)>0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado "
                        + "correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
            }
        } catch (Exception e)
        {
            
        }
    }
}
