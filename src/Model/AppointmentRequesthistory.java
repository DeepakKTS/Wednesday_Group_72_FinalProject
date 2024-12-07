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

public class AppointmentRequesthistory {
    public List<BookingRequest> getBookingHistory() {
        List<BookingRequest> bookingList = new ArrayList<>();
        Connection con = SQLconnection.dbconnector();
        String query = "SELECT * FROM BookingRequest"; // Fetch data from BookingRequest

        try (Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                BookingRequest booking = new BookingRequest(
                        rs.getInt("ID"),
                        rs.getString("Name"),
                        rs.getString("ContactNo"),
                        rs.getString("EmailId")
                );
                bookingList.add(booking);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookingList;
    }
}

