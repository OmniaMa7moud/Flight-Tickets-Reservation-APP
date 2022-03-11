/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gehad
 */
public class AirLinePart {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection mycon=null;
        Statement mystate=null;
        ResultSet myres=null;
        String query= "Select * from OMNIA.SIGNUP";
        try
        {
          mycon= DriverManager.getConnection("jdbc:derby://localhost:1527/Flight","omnia","1234");
          mystate= mycon.createStatement();
          myres= mystate.executeQuery(query);
          
          while(myres.next())
          {
              String UserName= myres.getString("FNAME");
              String email= myres.getString("EMAIL");
              String address= myres.getString("ADDRESS");
              String gender= myres.getString("GENDER");
              String nationality= myres.getString("NATIONALITY");
              String passportNo= myres.getString("PASSPORTNUM");
              
              System.out.println(UserName +"\t"+ email+ "\t" + address + "\t" + gender +"\t"+ nationality +"\t"+ passportNo +"\t");
          }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
}
