package config;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * @author HP - MSS
 */
public class Conexion {
    
    //  Variable de tipo Connection
    Connection conn;
    
    //  Metodo publico
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_dni_java", "root", "");
        } catch (Exception e) {
        }
    }
    
    
    //  Retornando el valor de la conexion
    public Connection getConnection(){
        return conn;
    }
    
    
    
}