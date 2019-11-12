/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;
import java.sql.*;

public class ConexionBD {
    
    Connection conn;
    Statement st;
    public Connection Conexion() {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "pass123");
            System.out.println("Conexion exitosa");
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar " + e);
        }
        return conn;
    }
    
     Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}