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
    try {
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
}

}