package com.LogicaNegocio;

import com.Dao.DaoFacultad;
import com.Entidades.Facultad;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BymerGomez
 */
public class TsFacultad
{
    Facultad f;
    DaoFacultad obF = new DaoFacultad();
    public DefaultTableModel datos()
    {        
        String[] title={"Código","Nombre","Teléfono"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        ArrayList<Facultad> ar= new ArrayList<Facultad>();
        Object[] re = new Object[3];
        try
        {
            ar.addAll(obF.mostrar());
            for (Facultad v:ar)
            {
                re[0]=v.getCodigoFacultad();
                re[1]=v.getNombre();
                re[2]=v.getTelefono();
                tm.addRow(re);
            }
        }
        catch (Exception e)
        {
            
        }
        return tm;
    }
    
    public void agregar(String nombre,String telefono)
    {
        f = new Facultad(nombre,String.valueOf(telefono));
        try {
            if (obF.agregar(f)>0) {
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
    public void modificar(String codigoFacultad, String nombre,String telefono)
    {
        f = new Facultad(Integer.valueOf(codigoFacultad),nombre,
                String.valueOf(telefono));
        try {
            if (obF.modificar(f)>0) {
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
    
    public void eliminar(String codigoFacultad)
    {
        f = new Facultad(Integer.valueOf(codigoFacultad));
        try {
            if (obF.eliminar(f)>0) {
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
