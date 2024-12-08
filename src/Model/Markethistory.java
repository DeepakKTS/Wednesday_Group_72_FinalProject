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

/**
 *
 * @author sneghashree
 */


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Markethistory {
    private ArrayList<Market> list;

    // Constructor to initialize the prepopulated data
    public Markethistory() {
        this.list = new ArrayList<>();
        prepopulateData(); // Add prepopulated data
    }

    // Getter for the list of markets
    public ArrayList<Market> getMarketHistory() {
        return this.list;
    }
    public ArrayList<Market> getList() {
        return this.list;
    }
    // Add a new market item to the list
    public Market addNewMarket() {
        Market newMarket = new Market();
        list.add(newMarket);
        return newMarket;
    }

    // Delete a market item from the list
    public void deleteMarket(Market mp) {
        list.remove(mp);
    }

    // Update a selected market item
    public void updateSelectedMarket(Market mp) {
        int index = list.indexOf(mp);
        if (index >= 0) {
            list.set(index, mp);
        }
    }

    // Prepopulate the market list with data
    private void prepopulateData() {
        list.clear(); // Clear any existing data in case this is called multiple times

        // Add prepopulated data
        list.add(new Market("Laptop", 999.99, "Unused", "laptop.jpg"));
        list.add(new Market("Smartphone", 499.99, "Used", "smartphone.jpg"));
        list.add(new Market("Desk Chair", 129.99, "Unused", "chair.jpg"));
        list.add(new Market("Tablet", 500.00, "Unused", "image3.jpg"));
        list.add(new Market("Headphones", 200.00, "Used", "image4.jpg"));
        list.add(new Market("Smartwatch", 250.00, "Unused", "image5.jpg"));
        // Add more products as needed
    }
}