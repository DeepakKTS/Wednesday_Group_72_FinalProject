/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author nsarv
 */

public class Marketrequeststudenthistory {
    private List<Marketrequeststudent> marketRequests;

    // Constructor to fetch data when the object is created
    public Marketrequeststudenthistory() {
        marketRequests = new ArrayList<>();
        fetchStudentDataFromDatabase();
    }

    // Method to fetch data from the Student table
    private void fetchStudentDataFromDatabase() {
        String query = "SELECT Name, ContactNo, Email FROM Student"; // SQL query
        try (Connection con = SQLconnection.dbconnector();
             PreparedStatement pstmt = con.prepareStatement(query)) {

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    // Extract data from ResultSet
                    String name = rs.getString("Name");
                    String contactNo = rs.getString("ContactNo");
                    String email = rs.getString("Email");

                    // Add each student record to the marketRequests list
                    Marketrequeststudent student = new Marketrequeststudent(0, name, contactNo, email);
                    marketRequests.add(student);
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Handle exceptions
        }
    }

    // Method to return the history of market requests
    public List<Marketrequeststudent> getHistory() {
        return marketRequests;
    }
}