/**
 * @author Mario Medrano
 * 
 * Descripcion:
 * En esta clase se define la conexion a la base de datos MySQL
 */

package tools;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    //Creamos las varibles necesarias para poder hacer la conexion a la base de datos 
    String bd = "prueba";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String pass = "";
    /** 
     * Agregamos el driver mysql-connector-j-version.jar, en nuestro caso
     * en la version 8.0.33 a la libreria, para poder establecer la coneccion
     * atraves de JDBC.
    */
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection conexion;
    
    //Metodo que me va a permitir conectarme con la base de datos
    public Connection conectar(){
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url+bd, user, pass);
            //System.out.print("Conexion exitosa a la base de datos: "+bd);
        } catch (ClassNotFoundException | SQLException ex) {
            //System.out.print("No se pudo conectar a la base de datos: "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
    }
    // Medoto main, para probar la conexion a la base de datos.
   /* public static void main (String [] args){
    Conexion Conexion = new Conexion();
    Conexion.conectar();
    } */
    
}
