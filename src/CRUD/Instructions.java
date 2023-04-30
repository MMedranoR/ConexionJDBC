/**
 * @author Mario Medrano
 */
package CRUD;

import tools.Configuration;

public class Instructions {
    //Sentencia SQL para crear un nuevo usuario.
    String create = "INSERT INTO user(userName, userPassword) VALUES('BOrozco','1234')";
    //Sentencia SQL para actualizar un nuevo usuario.
    String update ="UPDATE user SET userName = 'MCordero' WHERE iduser = '3'";
    //Sentencia SQL para eliminar un nuevo usuario.
    String delete = "DELETE FROM user WHERE iduser ='3'";
    
    Configuration config = new Configuration();
    
    //Metodo que llama al metodo configuracion y le pasa la sentencia a realizar.
    public void instruction (){
        config.configuration(create);
    }
    //Medoto main, para probar que se este realizando la instruccion a la base de datos.
    public static void main (String [] args){
        Instructions instructions = new Instructions();
        instructions.instruction();
    }
        
}