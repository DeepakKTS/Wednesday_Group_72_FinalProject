/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author deepakzedler
 */
public class SQLconnection {
    Connection con=null;
  PreparedStatement stmt= null;
  ResultSet rs = null;

public static Connection dbconnector() {
    /*try {
        // Load the SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Absolute path to the database file
        String dbPath = "/Users/deepakzedler/Documents/StudentHousingApplication.db";
        Connection con = DriverManager.getConnection("jdbc:sqlite:" + dbPath);

        System.out.println("Connection Successful");
        return con;

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}*/
     Connection con = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Replace these with your MySQL database credentials
            String url = "jdbc:mysql://localhost:3306/StudentHousing"; // Database name is "StudentHousing"
            String username = "root"; // Default XAMPP username
            String password = "";    // Leave blank for XAMPP default

            // Establish the connection
            con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Successful!");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Connection Failed: " + e.getMessage());
        }
        return con;

}
}