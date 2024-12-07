package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author deepakzedler
 */
public class AppointmentReq {

    
    private int appointmentID;
    private int studentID;
    private String brokerName;
    private String contactNumber;
    private String emailID;
    private String timeSlot;
    private String status;

    public AppointmentReq(int appointmentID, int studentID, String brokerName, String contactNumber, String emailID, String timeSlot, String status) {
        this.appointmentID = appointmentID;
        this.studentID = studentID;
        this.brokerName = brokerName;
        this.contactNumber = contactNumber;
        this.emailID = emailID;
        this.timeSlot = timeSlot;
        this.status = status;
    }
     // Getters and setters for all attributes
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
