package com.LogicaNegocio;

import com.Dao.DaoCarrera;
import com.Entidades.Carrera;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Nombre de la Clase: TsCarrera
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class TsCarrera
{
    Carrera c;
    DaoCarrera obC = new DaoCarrera();
    public DefaultTableModel datos()
    {        
        String[] title={"Código","Carrera","Cant Materias", "Facultad"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        ArrayList<Carrera> ar= new ArrayList<Carrera>();
        Object[] re = new Object[4];
        try
        {
            ar.addAll(obC.mostrar());
            for (Carrera v:ar)
            {
                re[0]=v.getCodigoCarrera();
                re[1]=v.getNombre();
                re[2]=v.getCantidadMaterias();
                re[3]=v.getCodigoFacultad();
                tm.addRow(re);
            }
        }
        catch (Exception e)
        {
            
        }
        return tm;
    }
    
    
    public void agregar(String nombre,String cantidadMaterias
            , String codigoFacultad)
    {
        c = new Carrera(nombre,Integer.valueOf(cantidadMaterias),
                codigoFacultad);
        try {
            if (obC.agregar(c)>0) {
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
    public void modificar(String codigoCarrera, String nombre,
            String cantidadMaterias, String codigoFacultad)
    {
        c = new Carrera(Integer.valueOf(codigoCarrera),nombre,
                Integer.valueOf(cantidadMaterias),codigoFacultad);
        try {
            if (obC.modificar(c)>0) {
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
    
    public void eliminar(String codigoCarrera)
    {
        c = new Carrera(Integer.valueOf(codigoCarrera));
        try {
            if (obC.eliminar(c)>0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado "
                        + "correctamente");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Registro no eliminado");
            }
        } catch (Exception e) {
        }
    }
}
