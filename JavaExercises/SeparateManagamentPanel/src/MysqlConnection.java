


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bilalsay
 */
public class MysqlConnection {
    
    private Connection conn = null;
    private String hostName = "localhost";
    private String port = "3306";
    private String dbName = "sparepart";
    private String userName = "root";
    private String password = "";

    
    public MysqlConnection() {     
         getConnection();
    }
    
    public Connection getConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://"+hostName+":"+port+"/"+dbName+"?useUnicode=yes&characterEncoding=UTF-8", userName, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public Statement state(){
        Statement st = null;
        try {
            st = conn.createStatement();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         return st;
    }
    
    public ResultSet exect(Statement st, String sql) {
        ResultSet result = null;
        try {
            result = st.executeQuery(sql);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
         return result;
    }
}
    

