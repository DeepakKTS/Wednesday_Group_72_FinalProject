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
public class StudentDirectory {
private ArrayList <Student> studentDirectory;

    public void setList(ArrayList<Student> list) {
        this.studentDirectory = list;
    }
      public ArrayList<Student> getList() {
        return studentDirectory;
    }
    
    public StudentDirectory(){
        this.studentDirectory = new ArrayList<Student>();
    }


    public void setStudentDirectory(ArrayList<Student> studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

}
