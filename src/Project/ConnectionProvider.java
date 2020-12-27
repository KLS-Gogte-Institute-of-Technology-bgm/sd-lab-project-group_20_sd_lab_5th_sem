/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Aksha
 */
public class ConnectionProvider {
    Connection con =null;
    public static Connection getCon()
    {
        
       
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:donor.db");
            System.out.println("Connection successful");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("Connection Failed"+e);
            return null;
        }
        
    
    }
}
