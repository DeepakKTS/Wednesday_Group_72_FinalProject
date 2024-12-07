/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

public class BookingRequest {
    private int id;
    private String name;
    private String contactNo;
    private String emailId;

    public BookingRequest(int id, String name, String contactNo, String emailId) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.emailId = emailId;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getEmailId() {
        return emailId;
    }
}

