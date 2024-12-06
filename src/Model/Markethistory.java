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
public class Markethistory {
    private ArrayList <Market> list;

    public void setList(ArrayList<Market> list) {
        this.list = list;
    }

    public ArrayList<Market> getList() {
        return list;
    }
    
    public Markethistory(){
        this.list = new ArrayList<Market>();
    }


    public void setMarketHistory(ArrayList<Market> history) {
        this.list = history;
    }
    public Market addNewMarket(){
       Market newMarket = new Market();
        list.add(newMarket);
        return newMarket;
    }
    public void deleteMarket(Market mp){
        list.remove(mp);
    }
     public void updateSelectedMarket(Market mp)
    {
        list.add(mp);
    }
    
           
    public void getMarketHistory()
    {
        try {
            Connection con=SQLconnection.dbconnector();
            
            PreparedStatement stmt=con.prepareStatement("SELECT * FROM Product");
          
            ResultSet rs=stmt.executeQuery();
           
             while(rs.next())
             {
                 Market mp=new Market();
                
                  mp.setPrice(rs.getInt("Price"));
                  mp.setName(rs.getString("Name"));
                  mp.setUsed(rs.getString("Used/Unused"));
                  mp.setImage(rs.getString("Images"));
                  
             
                  
                 
               
                  list.add(mp);
             
                  
             }
        } catch (SQLException ex) {
            Logger.getLogger(Markethistory.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
