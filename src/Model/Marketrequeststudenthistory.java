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

    public Marketrequeststudenthistory() {
        marketRequests = new ArrayList<>();
        fetchStudentDataFromDatabase();
    }

    private void fetchStudentDataFromDatabase() {
        try (Connection con = SQLconnection.dbconnector();
             java.sql.Statement stmt = con.createStatement()) {
            String query = "SELECT Name, ContactNo, Email FROM Student";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("Name");
                String contactNo = rs.getString("ContactNo");
                String email = rs.getString("Email");

                Marketrequeststudent student = new Marketrequeststudent(name, contactNo, email);
                marketRequests.add(student);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Marketrequeststudent> getHistory() {
        return marketRequests;
    }
}
