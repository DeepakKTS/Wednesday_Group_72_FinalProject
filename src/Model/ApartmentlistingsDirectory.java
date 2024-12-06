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
    public void getApartmentlistingsDirectory()
    {
        try {
            Connection con=SQLconnection.dbconnector();
            
            PreparedStatement stmt=con.prepareStatement("SELECT * FROM Apartments");
          
            ResultSet rs=stmt.executeQuery();
           
             while(rs.next())
             {
                 
                 Apartmentlistings a=new Apartmentlistings();
                 a.setID(rs.getInt("ID"));
                 
                   a.setApartmentname(rs.getString("Apartment name"));
                  a.setLandlordname(rs.getString("Landlord name"));
                  a.setApartmenttype(rs.getString("Apartment type"));
                  a.setPrice(rs.getString("Price"));
                  a.setUtilities(rs.getString("Utilities"));
                  a.setGrocerystores(rs.getString("Grocerystores"));
                  a.setHospital(rs.getString("Hospitals"));
                 a.setMBTA(rs.getString("MBTA"));
                 a.setBrokerName(rs.getString("Broker Name"));
                 a.setEmailID(rs.getString("Email ID"));
                //a.setphoto(rs.getBlob("Pictures"));
                //java.sql.Blob blob = rs.getBlob(11);
   
                  list.add(a);
             
                  
             }
        } catch (SQLException ex) {
            Logger.getLogger(ApartmentlistingsDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return list;
        //return list;
    }
    
}

    

