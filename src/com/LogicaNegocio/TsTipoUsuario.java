package com.LogicaNegocio;

import com.Dao.DaoTipoUsuario;
import com.Entidades.TipoUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Nombre de la Clase: TsTipoUsuario
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class TsTipoUsuario
{
    TipoUsuario tU;
    DaoTipoUsuario obTU = new DaoTipoUsuario();
    public DefaultTableModel datos()
    {        
        String[] title={"Código","Nombre"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        ArrayList<TipoUsuario> ar= new ArrayList<TipoUsuario>();
        Object[] re = new Object[2];
        try
        {
            ar.addAll(obTU.mostrar());
            for (TipoUsuario v:ar)
            {
                re[0]=v.getCodigoTipo();
                re[1]=v.getNombre();
                tm.addRow(re);
            }
        }
        catch (Exception e)
        {
            
        }
        return tm;
    }
    
    public void agregar(String nombre)
    {
        tU = new TipoUsuario(nombre);
        try {
            if (obTU.agregar(tU)>0) {
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
    public void modificar(String codigoTipo, String nombre)
    {
        tU = new TipoUsuario(Integer.valueOf(codigoTipo),nombre);
        try {
            if (obTU.modificar(tU)>0) {
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
    
    public void eliminar(String codigoTipo)
    {
        tU = new TipoUsuario(Integer.valueOf(codigoTipo));
        try {
            if (obTU.eliminar(tU)>0) {
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
