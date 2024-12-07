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
 * @author nsarv
 */
public class Marketrequeststudenthistory {
     private ArrayList<Marketrequeststudent>h;
    
    public Marketrequeststudenthistory(){
        this.h=new ArrayList<Marketrequeststudent>();
        
    }

    public ArrayList<Marketrequeststudent> getHistory() {
        return h;
    }

    public void setHistory(ArrayList<Marketrequeststudent> history) {
        this.h = h;
    }
    public Marketrequeststudent addNewEmp(){
        
        Marketrequeststudent newMarketrequeststudent= new Marketrequeststudent();
        h.add(newMarketrequeststudent);
        return newMarketrequeststudent;
    }
    public void deletetblMarketrequeststudent(Marketrequeststudent rs){
        h.remove(rs);
    }
    public void getMarketrequeststudentHistory()
    {
        try {
            Connection con=SQLconnection.dbconnector();
            
            PreparedStatement stmt=con.prepareStatement("SELECT * FROM BookingRequest");
          
            ResultSet rs=stmt.executeQuery();
           
             while(rs.next())
             {
                 Marketrequeststudent s=new Marketrequeststudent();
                
                  s.setId(rs.getInt("ID"));
                  s.setName(rs.getString("Name"));
                  s.setContactNumber(rs.getString("Contactno"));
                  
                  s.setEmailId(rs.getString("EmailId"));
             
                  
                 
               
                  h.add(s);
             
                  
             }
        } catch (SQLException ex) {
            Logger.getLogger(Marketrequeststudenthistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
