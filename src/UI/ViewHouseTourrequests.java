/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.AppointmentReq;
import Model.EmailUtility;
import Model.Requeststudent;
import Model.SQLconnection;
import Model.Studenthistory;
import java.io.FileOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.text.Document;
//import com.lowagie.text.Document;
//import com.lowagie.text.DocumentException;
//import com.lowagie.text.pdf.PdfPTable;
//import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sneghashree
 */
public class ViewHouseTourrequests extends javax.swing.JPanel {

    /**
     * Creates new form ViewHouseTourrequests
     */
      Studenthistory history = new Studenthistory();
    public ViewHouseTourrequests() {
        initComponents();
        this.setSize(1024, 768);
         history.getStudentHistory();
                 PopulateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnaccepttour = new javax.swing.JButton();
        btndenytour = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblviewstudent = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 153, 153));

        btnaccepttour.setText("Accept Tour");
        btnaccepttour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccepttourActionPerformed(evt);
            }
        });

        btndenytour.setText("Deny Tour");
        btndenytour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndenytourActionPerformed(evt);
            }
        });

        tblviewstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Contact Number", "Email ID", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(tblviewstudent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnaccepttour, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btndenytour, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaccepttour)
                    .addComponent(btndenytour))
                .addContainerGap(179, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaccepttourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccepttourActionPerformed
        // TODO add your handling code here:
        // Check if a row is selected
    int selectedRowIndex = tblviewstudent.getSelectedRow();

    if (selectedRowIndex < 0) {
        JOptionPane.showMessageDialog(this, "Please select a row to accept the tour.");
        return;
    }

    // Fetch data from the selected row
    DefaultTableModel model = (DefaultTableModel) tblviewstudent.getModel();
    String toEmail = model.getValueAt(selectedRowIndex, 3).toString(); // Email ID from the table
    String subject = "Appointment Accepted";
    String body = "Thank you for contacting us! We will contact you shortly. Your appointment has been successfully booked. This is an auto-generated email.";

    try {
        // Use the EmailUtility to send the email
        EmailUtility.sendEmail(toEmail, subject, body);
        JOptionPane.showMessageDialog(this, "Appointment accepted. Email sent successfully to: " + toEmail);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error while sending the email: " + ex.getMessage());
        ex.printStackTrace();
    }
 
    
    }//GEN-LAST:event_btnaccepttourActionPerformed

    private void btndenytourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndenytourActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Tour Cancelled");
    }//GEN-LAST:event_btndenytourActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccepttour;
    private javax.swing.JButton btndenytour;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblviewstudent;
    // End of variables declaration//GEN-END:variables
private void PopulateTable() {
        
        DefaultTableModel model= (DefaultTableModel) tblviewstudent.getModel();
        model.setRowCount(0);
        
        for (Requeststudent s : history.getHistory()){
        
        Object[] row = new Object[5];// was 5
            row[0] = s.getId();
            row[1] = s.getName();
            row[2] = s.getContactNumber();
            row[3] = s.getEmailId();
            row[4] = s;
           
            model.addRow(row);
        }
        
        }}
