/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Market;
import Model.Markethistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sneghashree
 */
public class ViewProducts extends javax.swing.JPanel {

    /**
     * Creates new form ViewProducts
     */
    Markethistory mh= new Markethistory();
    Market mp;
    public ViewProducts() {
        initComponents();
        this.setSize(1024, 768);
        mh.getMarketHistory();
        this.mp=mp;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblmarketplace = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblmarketplace.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product name", "Price", "Used/Unused", "Image"
            }
        ));
        jScrollPane1.setViewportView(tblmarketplace);
        if (tblmarketplace.getColumnModel().getColumnCount() > 0) {
            tblmarketplace.getColumnModel().getColumn(3).setMinWidth(0);
            tblmarketplace.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblmarketplace.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 160));

        jButton1.setFont(new java.awt.Font("Big Caslon", 1, 14)); // NOI18N
        jButton1.setText("Buy Product");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 166, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project Images/gradient (1).jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       JOptionPane.showMessageDialog(this ,"Request Sent");
       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblmarketplace;
    // End of variables declaration//GEN-END:variables
private void PopulateTable() {
        
       DefaultTableModel model= (DefaultTableModel) tblmarketplace.getModel();
        model.setRowCount(0);
        for (Market mp : mh.getList()){
        Object[] row = new Object[5];
            row[0] = mp.getName();
            row[1] = mp.getPrice();
            row[2] = mp.getUsed();
            row[3] = mp;
            model.addRow(row);
        }}
}
