/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Sneghashree
 */
public class Marketrequeststudent {
 private int id;
    private String name;
    private String contactNumber;
    private String emailId;

    public Marketrequeststudent(int id, String name, String contactNumber, String emailId) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }
}
