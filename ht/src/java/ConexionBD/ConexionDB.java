/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexionDB {
    Connection con;
    public ConexionDB(String usuario, String pass){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", usuario, pass);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: "+e);
        }
    }
    public static ResultSet Consulta(ConexionDB conex,String consulta){
        
        Statement st;
        ResultSet rs;
        ResultSet resultado = null;
        try {
            st = conex.con.createStatement();
            rs = st.executeQuery(consulta);
            
            resultado = rs;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
        
    }
    public static void Insert(ConexionDB conex,String consulta){
        
        Statement st;
        
        
        try {
            st = conex.con.createStatement();
            st.executeUpdate(consulta);
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static boolean Borrar(ConexionDB conex,String consulta){
        
        Statement st;
        boolean resultado = false;
        try {
            st = conex.con.createStatement();
            resultado = st.execute(consulta);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
        
    }
    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args){
        ConexionDB cn = new ConexionDB("root","pass123");
        String nombreH = "Oz Resort";
        ResultSet rs2 =Consulta(cn,"Select idHotel From hotel where nombre = '"+nombreH+"'");
        
        try {
            while(rs2.next()){
                System.out.println(rs2.getInt("idHotel"));
            }
            cn.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}