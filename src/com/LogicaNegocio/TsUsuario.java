package com.LogicaNegocio;

import com.Dao.DaoUsuario;
import com.Entidades.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Nombre de la Clase: TsUsuario
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class TsUsuario
{
    Usuario usu;
    DaoUsuario obU = new DaoUsuario();
    public DefaultTableModel datos()
    {        
        String[] title={"Código","Usuario","Contraseña","Nombre","Apellido",
        "Edad","Tipo Usuario"};
        DefaultTableModel tm=new DefaultTableModel(title,0);
        ArrayList<Usuario> ar= new ArrayList<Usuario>();
        Object[] re = new Object[7];
        try
        {
            ar.addAll(obU.mostrar());
            for (Usuario v:ar)
            {
                re[0]=v.getCodigoUsuario();
                re[1]=v.getUsuario();
                re[2]=v.getContra();//Encriptarla
                re[3]=v.getNombre();
                re[4]=v.getApellido();
                re[5]=v.getEdad();
                re[6]=v.getCodigoTipo();//obtener el nombre y no el código
                tm.addRow(re);
            }
        }
        catch (Exception e)
        {
            
        }
        return tm;
    }
    
    public void agregar(String usuario, String contra,String nombre,
            String apellido, String edad,String codigoTipo)
    {
        usu = new Usuario(usuario, contra, nombre, apellido,
                Integer.valueOf(edad), Integer.valueOf(codigoTipo));
        try {
            if (obU.agregar(usu)>0) {
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
    public void modificar(String codigoUsuario, String usuario, String contra,
            String nombre,String apellido, String edad,String codigoTipo)
    {
        usu = new Usuario(Integer.valueOf(codigoUsuario), usuario, contra,
                nombre, apellido,Integer.valueOf(edad),
                Integer.valueOf(codigoTipo));
        try {
            if (obU.modificar(usu)>0) {
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
    
    public void eliminar(String codigoUsuario)
    {
        usu = new Usuario(Integer.valueOf(codigoUsuario));
        try {
            if (obU.eliminar(usu)>0) {
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
