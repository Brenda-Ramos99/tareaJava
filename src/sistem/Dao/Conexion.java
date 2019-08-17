package sistem.Dao;
import java.sql.*;

/**
 * Nombre de la Clase: Conexion
 * Versión: 1.0
 * Fecha: 17 Ago. 2019
 * Copyright: ITCA-FEPADE
 * @author Elvis Adalberto Alfaro Gómez
 */
public class Conexion
{
    /*Variables definidas para parámetros de conexión*/
    private String driver="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/"
            + "AlfaroRecinosAyalaVillatoroRamos";
    private String user="root";
    private String password="";
    
    /*Método constructor vacío de la clase Conexión*/
    public Conexion()
    {
        
    }
    
    /*Método constructor de conexión con excepciones e inicializando
    los parámetro de conexión*/
    public Connection con() throws ClassNotFoundException, SQLException
    {
        Class.forName(driver);
        return DriverManager.getConnection(url,user,password);
    }
}
