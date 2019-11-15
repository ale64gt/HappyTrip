/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import static ConexionBD.ConexionDB.Consulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Pool {

    private DataSource dataSource;
    private String driver,
            user,
            password,
            url;
    private int minConnections, maxConnections;
    Connection connection;
    public Statement command;

    public Pool(String driver, String user, String password, String url, int minConnections, int maxConnections) {
        this.driver = driver;
        this.user = user;
        this.password = password;
        this.url = url;
        this.minConnections = minConnections;
        this.maxConnections = maxConnections;
        initializePool(this.driver, this.user, this.password, this.url, this.minConnections, this.maxConnections);
    }

    private void initializePool(String driver, String user, String password, String url, int minConnections, int maxConnections) {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(driver);
        basicDataSource.setUsername(user);
        basicDataSource.setPassword(password);
        basicDataSource.setUrl(url);
        basicDataSource.setMinIdle(minConnections);
        basicDataSource.setMaxTotal(maxConnections);
        dataSource = basicDataSource;
    }

    public void Connect() {
        try {
            connection = dataSource.getConnection();
            command = connection.createStatement();
        } catch (Exception e) {
            System.err.println("conexion fallida: \n" + e);
        }
    }

    public void Disconnect() {
        try {
            command.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
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
    
    public static void main(String[] args) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "pass123";
        int minConnections = 100;
        int maxConnections = 101;

        Pool pool = new Pool(driver, user, password, url, minConnections, maxConnections);

        for (int x = 0; x < 15; x++) {
            pool.Connect();
            try {
                ResultSet rs = pool.command.executeQuery("Select * From tbltest");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + " || " + rs.getString(2));
                }
            } catch (SQLException ex) {
                System.err.println("Error    ::    " + ex);
            }finally{
                  pool.Disconnect();
            }
          
        }
    }
}