package Modelo;
import java.sql.*;

public class Conexion{
    
    //Conexión Local
   Connection con;
   public Connection getConnection(){
       
       try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds_copia", "root", "");
            return con;
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e);
        }
        return (null);
       
   }
}
   
       

      
        