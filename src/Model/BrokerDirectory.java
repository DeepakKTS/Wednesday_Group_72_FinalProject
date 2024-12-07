/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sneghashree
 */
public class BrokerDirectory {
  
    private ArrayList <Broker> list;

    public void setList(ArrayList<Broker> list) {
        this.list = list;
    }

    public ArrayList<Broker> getList() {
        return list;
    }
    
    public BrokerDirectory(){
        this.list = new ArrayList<Broker>();
    }
    public void updateSelectedBroker(Broker broker) {
    try {
        Connection con = SQLconnection.dbconnector();
        // Update query for the Brokers table
        String query = "UPDATE Brokers SET name = ?, contactno = ?, brokerfee = ?, management = ?, EmailID = ? WHERE licenseno = ?";
        PreparedStatement stmt = con.prepareStatement(query);

        stmt.setString(1, broker.getName());
        stmt.setString(2, broker.getContactno());
        stmt.setInt(3, broker.getBrokerfee());
        stmt.setString(4, broker.getManagement());
        stmt.setString(5, broker.getEmail());
        stmt.setInt(6, broker.getLicenseno());

        stmt.executeUpdate(); // Execute the update query
        stmt.close();
        con.close();

        System.out.println("Broker updated successfully!");
    } catch (SQLException ex) {
        Logger.getLogger(BrokerDirectory.class.getName()).log(Level.SEVERE, null, ex);
    }
}


    public void setBrokerDirectory(ArrayList<Broker> brokerDirectory) {
        this.list = brokerDirectory;
    }
    public Broker addNewBroker(){
       Broker newBroker = new Broker();
        list.add(newBroker);
        return newBroker;
    }
    public void deleteBroker(Broker newBroker){
        list.remove(newBroker);
    }
    public void getBrokerDirectory()
    {
        try {
            Connection con=SQLconnection.dbconnector();
            
            PreparedStatement stmt=con.prepareStatement("SELECT * FROM Brokers");
          
            ResultSet rs=stmt.executeQuery();
           
             while(rs.next())
             {
                 Broker b=new Broker();
                 b.setLicenseno(rs.getInt("licenseno"));
                  b.setName(rs.getString("name"));
                  b.setContactno(rs.getString("contactno"));
                  b.setBrokerfee(rs.getInt("brokerfee"));
                  b.setManagement(rs.getString("management"));
               
                  list.add(b);
             
                  
             }
        } catch (SQLException ex) {
            Logger.getLogger(BrokerDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        //return list;
        //return list;
    }
    
}
