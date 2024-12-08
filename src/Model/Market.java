/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author sneghashree
 */

public class Market {
    private String name;       // Product name
    private double price;      // Product price
    private String used;       // Used/Unused status
    private String image;      // Image file name or path

    // Constructor to initialize market object
    public Market(String name, double price, String used, String image) {
        this.name = name;
        this.price = price;
        this.used = used;
        this.image = image;
    }

    // Default constructor for flexibility
    public Market() {
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for Used Status
    public String getUsed() {
        return used;
    }

    public void setUsed(String used) {
        this.used = used;
    }

    // Getter and Setter for Image
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Market{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", used='" + used + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}