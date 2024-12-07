/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Handles operations related to Apartment Booking history.
 */
public class ApartmentHistory {
    // Method to retrieve the apartment booking history
    public List<Requestapartment> getApartmentHistory() {
        List<Requestapartment> apartmentList = new ArrayList<>();
        Connection con = SQLconnection.dbconnector();

        try {
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM ApartmentBooking ORDER BY ApartmentName";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                // Corrected syntax for retrieving column values
                Requestapartment apartment = new Requestapartment(
                    rs.getString("ApartmentName"),      // Retrieve ApartmentName
                    rs.getString("ApartmentType"),      // Retrieve ApartmentType
                    rs.getString("Price"),              // Retrieve Price
                    rs.getString("LandlordName"),       // Retrieve LandlordName
                    rs.getInt("ApartmentID")            // Retrieve ApartmentID
                );
                apartmentList.add(apartment);
            }

            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return apartmentList;
    }
}

