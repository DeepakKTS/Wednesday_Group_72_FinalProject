/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author nsarv
 */
public class Requestapartment {
    private String apartmentName;
    private String apartmentType;
    private String price;
    private String landlordName;
    private int apartmentID;

    public Requestapartment(String apartmentName, String apartmentType, String price, String landlordName, int apartmentID) {
        this.apartmentName = apartmentName;
        this.apartmentType = apartmentType;
        this.price = price;
        this.landlordName = landlordName;
        this.apartmentID = apartmentID;
    }

    // Getters and Setters
    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getApartmentType() {
        return apartmentType;
    }

    public void setApartmentType(String apartmentType) {
        this.apartmentType = apartmentType;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLandlordName() {
        return landlordName;
    }

    public void setLandlordName(String landlordName) {
        this.landlordName = landlordName;
    }

    public int getApartmentID() {
        return apartmentID;
    }

    public void setApartmentID(int apartmentID) {
        this.apartmentID = apartmentID;
    }
    
    
}
