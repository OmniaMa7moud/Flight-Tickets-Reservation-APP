/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software2;

/**
 *
 * @author omnia
 */

import software2.Tickets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Account extends javax.swing.JFrame {

    /**
     * Creates new form Account
     */
    Connection con;
    public Account() {
        initComponents();
         try {
               con = DriverManager.getConnection("jdbc:derby://localhost:1527/Flight","omnia","1234");
               
         } 
             catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
         showFlightData();
         showTicketData();
    }

    
    private void showFlightData()
    {
         String query = "select * from FLIGHT";
      Connection con1;
       Statement st ;
        ResultSet rs;
         String flightCode = "";
         String flightCompany = "";
         String source = "";
         String distination = "";
         String takeOffDate = "";
         String numberOfSeats = "";
         String typeOfClass = "";
         
       try {
              con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/Flight","omnia","1234");
              st = con1.createStatement();
              rs = st.executeQuery(query);
              
              while(rs.next())
              {
                   flightCode = rs.getString("FLIGHTCODE");
                   flightCompany = rs.getString("FLIGHTCOMPANY");
                   source = rs.getString("SOURCE");
                   distination = rs.getString("DISTINATION");
                   takeOffDate = rs.getString("TAKEOFFDATE");
                   numberOfSeats = rs.getString("NUMBEROFSEATS");
                   typeOfClass = rs.getString("TYPEOFCLASS");}
             
              PassengerID.setText(flightCode);
              FlightCompany.setText(flightCompany);
              Source.setText(source);
              Distination.setText(distination);
              TakeOffDate.setText(takeOffDate);
              NumberOfSeats.setText(numberOfSeats);
              TypeOfClass.setText(typeOfClass);
                  
              
         } catch (SQLException ex) {
            //ex.printStackTrace();
         }
        
    }
    
     private void showTicketData()
    {
         String query = "select * from TICKETS";
      Connection con1;
       Statement st ;
        ResultSet rs;
         String ticketNum = "";
         String price = "";
         String paymentMethod = "";
         
       try {
              con1 = DriverManager.getConnection("jdbc:derby://localhost:1527/Flight","omnia","1234");
              st = con1.createStatement();
              rs = st.executeQuery(query);
              
              while(rs.next())
              {
                   ticketNum = rs.getString("TICKETNUMBER");
                   price = rs.getString("PRICE");
                   paymentMethod = rs.getString("PAYMENTMETHOD");
                  }
             
              TicketID.setText(ticketNum);
              Price.setText(price);
              PaymentMethod.setText(paymentMethod);
              
              
                  
              
         } catch (SQLException ex) {
            //ex.printStackTrace();
         }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PassengerID = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FlightCompany = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Source = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Distination = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TakeOffDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NumberOfSeats = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TypeOfClass = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TicketID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PaymentMethod = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Passenger ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 46, 116, 26));

        PassengerID.setFont(new java.awt.Font("12Candida**Roman05042", 1, 14)); // NOI18N
        PassengerID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(PassengerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 46, 129, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Flight Companey");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 104, 175, 25));

        FlightCompany.setFont(new java.awt.Font("12Candida**Roman05042", 1, 14)); // NOI18N
        FlightCompany.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(FlightCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 104, 129, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Source");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 158, 175, 26));

        Source.setFont(new java.awt.Font("12Candida**Roman05042", 1, 14)); // NOI18N
        Source.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Source, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 159, 129, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Distination");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 218, 175, -1));

        Distination.setFont(new java.awt.Font("12Candida**Roman05042", 1, 14)); // NOI18N
        Distination.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Distination, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 213, 129, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Take Off Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 260, 137, 30));

        TakeOffDate.setFont(new java.awt.Font("12Candida**Roman05042", 1, 14)); // NOI18N
        TakeOffDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TakeOffDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 262, 129, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Number Of Seats");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 321, 137, 26));

        NumberOfSeats.setFont(new java.awt.Font("12Candida**Roman05042", 1, 14)); // NOI18N
        NumberOfSeats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(NumberOfSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 321, 129, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Type Of Class");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 374, 137, 25));

        TypeOfClass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TypeOfClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TypeOfClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 372, 140, 28));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Ticket ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 121, 28));

        TicketID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TicketID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(TicketID, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 115, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Price");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, 121, 29));

        Price.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Price.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 210, 115, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Payment Method");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 121, 26));

        PaymentMethod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PaymentMethod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(PaymentMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, 115, 26));

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 230, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Your Account");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 13, 293, 55));

        jLabel12.setFont(new java.awt.Font("12Candida**Roman05042", 1, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software2/Passenger_Airplanes_Sky_493019.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.setVisible(false);
        Home home =new Home ();
        home.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Distination;
    private javax.swing.JLabel FlightCompany;
    private javax.swing.JLabel NumberOfSeats;
    private javax.swing.JLabel PassengerID;
    private javax.swing.JLabel PaymentMethod;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Source;
    private javax.swing.JLabel TakeOffDate;
    private javax.swing.JLabel TicketID;
    private javax.swing.JLabel TypeOfClass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
