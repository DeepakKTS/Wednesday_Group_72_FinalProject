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
public class Studenthistory {
    private ArrayList<Requeststudent>history;
    
    public Studenthistory(){
        this.history=new ArrayList<Requeststudent>();
        
    }

    public ArrayList<Requeststudent> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Requeststudent> history) {
        this.history = history;
    }
    public Requeststudent addNewEmp(){
        
        Requeststudent newRequeststudent= new Requeststudent();
        history.add(newRequeststudent);
        return newRequeststudent;
    }
    public void deletetblRequeststudent(Requeststudent rs){
        history.remove(rs);
    }
    public void getStudentHistory()
    {
        try {
            Connection con=SQLconnection.dbconnector();
            
            PreparedStatement stmt=con.prepareStatement("SELECT * FROM BookingRequest");
          
            ResultSet rs=stmt.executeQuery();
           
             while(rs.next())
             {
                 Requeststudent s=new Requeststudent();
                
                  s.setId(rs.getInt("ID"));
                  s.setName(rs.getString("Name"));
                  s.setContactNumber(rs.getString("Contactno"));
                  
                  s.setEmailId(rs.getString("EmailId"));
             
                  
                 
               
                  history.add(s);
             
                  
             }
        } catch (SQLException ex) {
            Logger.getLogger(BrokerDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
