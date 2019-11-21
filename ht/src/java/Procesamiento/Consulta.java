 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesamiento;

import ConexionBD.ConexionDB;
import ConexionBD.Pool;
import static ConexionBD.Pool.Consulta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author ale64
 */
public class Consulta {
    
    public String consultarHabitaciones(int nombreH){
        
    
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "pass123";
        int minConnections = 100;
        int maxConnections = 101;
        JSONArray json = null;

        Pool pool = new Pool(driver, user, password, url, minConnections, maxConnections);
            /*
            pool.Connect();
            try {
                ResultSet rs = pool.command.executeQuery("Select nombre From hotel");
                while (rs.next()) {
                    System.out.println(rs.getString(1));
                }
            } catch (SQLException ex) {
                System.err.println("Error    ::    " + ex);
            }finally{
                  pool.Disconnect();
            }
            */
            
            pool.Connect();
            ResultSet rs2 =Consulta(pool,"Select * From Habitacion inner join Tipo_Habitacion on Tipo_Habitacion_idTipo_Habitacion=idTipo_Habitacion inner join Imagen on Habitacion_habitacion = idHabitacion where Habitacion.Hotel_idHotel = '"+nombreH+"' and Imagen.Hotel_idHotel = 15");
            
            
            
            try {
                Jsonify jsonmaker = new Jsonify();
            json = jsonmaker.convert(rs2);
            System.out.println(json);
            
            pool.Disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        
    }   catch (JSONException ex) {
            Logger.getLogger(Pool.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return json.toString(); 
    }
    
    public ResultSet conultaReservaciones(){
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "pass123";
        int minConnections = 100;
        int maxConnections = 101;
        

        Pool pool = new Pool(driver, user, password, url, minConnections, maxConnections);
            
            
        pool.Connect();
        ResultSet rs2 =Consulta(pool,"select h.idHotel, hab.idHabitacion, u.Nombre,h.Nombre,th.Tipo_habitacioncol,r.CheckIn,r.CheckOut from reservacion r,usuario u,hotel h,tipo_habitacion th, habitacion_has_reservacion hr, habitacion hab where r.Usuario_idUsuario = u.idUsuario AND r.idReservacion = hr.Reservacion_idReservacion AND hab.idHabitacion = hr.Habitacion_idHabitacion AND hab.Tipo_habitacion_idTipo_habitacion = th.idTipo_habitacion AND hab.Hotel_idHotel = h.idHotel");
            
        
        //pool.Disconnect();
        return rs2;
    }
    
    
    public String consultaHabitacion(int id){
        
         String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "pass123";
        int minConnections = 100;
        int maxConnections = 101;
        JSONArray json = null;

        Pool pool = new Pool(driver, user, password, url, minConnections, maxConnections);
            
            
            pool.Connect();
            ResultSet rs2 =Consulta(pool,"Select * From Habitacion inner join Tipo_Habitacion on Tipo_Habitacion_idTipo_Habitacion=idTipo_Habitacion inner join Imagen on Habitacion_habitacion = idHabitacion where Imagen.Habitacion_habitacion = '"+id+"' and Imagen.Hotel_idHotel = 15");
            
            
            
            
            try {
                Jsonify jsonmaker = new Jsonify();
            json = jsonmaker.convert(rs2);
            System.out.println(json);
            
            pool.Disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        
    }   catch (JSONException ex) {
            Logger.getLogger(Pool.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return json.toString(); 
        
    }
    
    
    public String consultaHotel(int id){
        
        
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "pass123";
        int minConnections = 100;
        int maxConnections = 101;
        JSONArray json = null;

        Pool pool = new Pool(driver, user, password, url, minConnections, maxConnections);
            
            
            pool.Connect();
            ResultSet rs2 =Consulta(pool,"Select  *  from hotel inner join Direccion on Direccion_idDireccion = idDireccion inner join Imagen on idHotel = Hotel_idHotel where idHotel != 15 and idHotel = '"+id+"'");
            
            
            
            
            try {
                Jsonify jsonmaker = new Jsonify();
            json = jsonmaker.convert(rs2);
            System.out.println(json);
            
            pool.Disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        
    }   catch (JSONException ex) {
            Logger.getLogger(Pool.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return json.toString(); 
        
        
        
        
        
    }
    public String consultarHoteles(){
        
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "pass123";
        int minConnections = 100;
        int maxConnections = 101;
        JSONArray json = null;

        Pool pool = new Pool(driver, user, password, url, minConnections, maxConnections);
            
            
            pool.Connect();
            ResultSet rs2 =Consulta(pool,"Select  *  from hotel inner join Direccion on Direccion_idDireccion = idDireccion inner join Imagen on idHotel = Hotel_idHotel where idhotel != 15 ");
            
            
            
            try {
                Jsonify jsonmaker = new Jsonify();
            json = jsonmaker.convert(rs2);
            System.out.println(json);
            
            pool.Disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        
    }   catch (JSONException ex) {
            Logger.getLogger(Pool.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return json.toString(); 
        
        
        
    }
    
}
