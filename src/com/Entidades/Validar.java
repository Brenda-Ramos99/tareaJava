package com.Entidades;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Brenda Ramos
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
}
