/**
 * @author Mario Medrano
 */
package tools;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Configuration {
    /**
     * Establecemos los objetos necesarios para:
     * Establecer la conexion.
     * Ejecutar sentencias SQL atraves de la conexion.
     * Recibir la respuesta desde la base de datos.
     */
    Conexion conexion = new Conexion();
    Connection connection;
    Statement statement;
    ResultSet result;
    
    /**
     * Metodo donde se establece la conexion, se ejecuta una sentecia SQL con
     * una instruccion y se muestra el cambio hecho en la base de datos
     * listando la tabla.
     * @param sql
     */
    
    public void configuration(String sql){
        try {
            connection = conexion.conectar();
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            result = statement.executeQuery("SELECT * FROM user");
            result.next();
            do{
            System.out.println(result.getInt("iduser")+" : "+result.getString("userName"));
            }while(result.next());
        } catch (SQLException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

