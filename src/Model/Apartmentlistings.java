/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Blob;

/**
 *
 * @author Evita Alice Paul
 */
public class Apartmentlistings {
    int ID;
    String Apartmenttype;
    String Landlordname;
    String Price;
    String Utilities;
    String Grocerystores;
    String Hospital;
    String MBTA;
    String BrokerName;
    String EmailID;
    String Apartmentname;
    String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(Blob blob) {
        this.photo = photo;
    }

    public String getApartmentname() {
        return Apartmentname;
    }

    public void setApartmentname(String Apartmentname) {
        this.Apartmentname = Apartmentname;
    }

    
 
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getApartmenttype() {
        return Apartmenttype;
    }

    public void setApartmenttype(String Apartmenttype) {
        this.Apartmenttype = Apartmenttype;
    }

    public String getLandlordname() {
        return Landlordname;
    }

    public void setLandlordname(String Landlordname) {
        this.Landlordname = Landlordname;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }

    public String getUtilities() {
        return Utilities;
    }

    public void setUtilities(String Utilities) {
        this.Utilities = Utilities;
    }

    public String getGrocerystores() {
        return Grocerystores;
    }

    public void setGrocerystores(String Grocerystores) {
        this.Grocerystores = Grocerystores;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

    public String getMBTA() {
        return MBTA;
    }

    public void setMBTA(String MBTA) {
        this.MBTA = MBTA;
    }

    public String getBrokerName() {
        return BrokerName;
    }

    public void setBrokerName(String BrokerName) {
        this.BrokerName = BrokerName;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String EmailID) {
        this.EmailID = EmailID;
    }

    void setphoto(Blob blob) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    
    
}
