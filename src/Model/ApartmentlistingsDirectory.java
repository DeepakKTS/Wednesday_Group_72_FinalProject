/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author deepakzedler
 */
public class ApartmentlistingsDirectory {
    private ArrayList <Apartmentlistings> list;

    public void setList(ArrayList<Apartmentlistings> list) {
        this.list = list;
    }

    public ArrayList<Apartmentlistings> getList() {
        return list;
    }
    
    public ApartmentlistingsDirectory(){
        this.list = new ArrayList<Apartmentlistings>();
    }


    public void setApartmentlistingsDirectory(ArrayList<Apartmentlistings> apartmentlistingsDirectory) {
        this.list = apartmentlistingsDirectory;
    }
    public Apartmentlistings addNewApartmentlistings(){
       Apartmentlistings newApartmentlistings = new Apartmentlistings();
        list.add(newApartmentlistings);
        return newApartmentlistings;
    }
    public void deleteApartmentlistings(Apartmentlistings newApartmentlistings){
        list.remove(newApartmentlistings);
    }
    public void getApartmentlistingsDirectory() {
    try {
        Connection con = SQLconnection.dbconnector(); // Establish database connection
        PreparedStatement stmt = con.prepareStatement("SELECT ID, ApartmentType, LandlordName, Price, BrokerName, ApartmentName FROM Apartments");
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Apartmentlistings a = new Apartmentlistings();
            a.setID(rs.getInt("ID"));
            a.setApartmenttype(rs.getString("ApartmentType"));
            a.setLandlordname(rs.getString("LandlordName"));
            a.setPrice(rs.getString("Price"));
            a.setBrokerName(rs.getString("BrokerName"));
            a.setApartmentname(rs.getString("ApartmentName"));
            list.add(a); // Add the record to the list
        }
    } catch (SQLException ex) {
        Logger.getLogger(ApartmentlistingsDirectory.class.getName()).log(Level.SEVERE, null, ex);
    }
  } 
}

    

