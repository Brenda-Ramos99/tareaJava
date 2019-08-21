package com.Entidades;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import com.Vistas.*;

/**
 * Nombre de la Clase: Validar
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Brenda Lizeth Ramos
 */
public class Validar 
{
    //validacio de caracteres solo letras
    public void validarLetras(JTextField campo)
    {
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c= e.getKeyChar();
                if(!Character.isAlphabetic(c))
                {
                    e.consume();
                }
            }
    });
    }
    
    //validacio de caracteres solo numeros
    public void validarumeros(JTextField campo)
    {
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c= e.getKeyChar();
                if(!Character.isDigit(c))
                {
                    e.consume();
                }
            }
    });
    }
    
    
    public void validarCUM(JTextField campo)
    {
        campo.addKeyListener(new KeyAdapter(){
            @Override
            public void keyTyped(KeyEvent e){
                Character c= e.getKeyChar();
                if(!Character.isDigit(c) && c!='.')
                {
                    e.consume();
                }
            }
    });
    }
    
    public void validarNombres(JTextField campo)
    {
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c= e.getKeyChar();
                if(!Character.isAlphabetic(c) && c!=' ')
                {
                    e.consume();
                }
            }
    });
    }
    
    public void validarUsuario(JTextField campo)
    {
        campo.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                Character c= e.getKeyChar();
                if(!Character.isDigit(c) && !Character.isAlphabetic(c) && c!='.')
                {
                    e.consume();
                }
            }
    });
    }
}
