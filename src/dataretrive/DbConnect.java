package dataretrive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DbConnect {
 
    Connection conn = null;
    Connection conn2 = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs=null;
    ResultSet rs2 = null;
    
    public static Connection DbConn(){
         try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection conn=DriverManager.getConnection("jdbc:ucanaccess://D:\\ProjectBeta.accdb");
           //JOptionPane.showMessageDialog(null, "Database Connect Successfully");   
            return conn;
         } 
           catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
           }
        }
    Connection obtainConnection()
    {
       return conn;
    }   
}
