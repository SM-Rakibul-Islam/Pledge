package dataretrive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class PatientSignup extends javax.swing.JFrame {

    String checkMail;
    public String Date;
    public String DoctorName;
    public String NAME;
    public String mail;
    public String pass;
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public PatientSignup() {
        initComponents();
        conn = DbConnect.DbConn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registrationButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        address = new javax.swing.JTextField();
        heightWeight = new javax.swing.JTextField();
        bloodGroup = new javax.swing.JTextField();
        medicalHistory = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        emailSignup = new javax.swing.JTextField();
        maritialStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ePhonenumber = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        doctorName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dateField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 89, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Place for Appoinment");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 400, -1));

        registrationButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrationButton.setText("Submit");
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registrationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, -1, -1));

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Maritial Status:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 165, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        gender.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 165, -1));

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 590, -1, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 590, -1, -1));

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 160, -1));

        heightWeight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        heightWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(heightWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 160, -1));

        bloodGroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bloodGroup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(bloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 160, -1));

        medicalHistory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        medicalHistory.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(medicalHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 160, -1));

        phoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 160, -1));

        emailSignup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailSignup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(emailSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 160, -1));

        maritialStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maritialStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(maritialStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Height & Weight:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Blood Group:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Phone Number:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Emergency Phone Number:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Email:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Address:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Medical History:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        ePhonenumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ePhonenumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ePhonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 160, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Gender:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Check the table, search for your desired doctor and put the name below:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, 50));

        doctorName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        doctorName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(doctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Doctor Name:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        dateField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(dateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed

        Name.setText("");
        gender.setText("");
        address.setText("");
        phoneNumber.setText("");
        maritialStatus.setText("");
        heightWeight.setText("");
        bloodGroup.setText(""); 
        ePhonenumber.setText("");
        emailSignup.setText("");
        medicalHistory.setText(""); 
    }//GEN-LAST:event_resetButtonActionPerformed

     
    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed

        String localName = Name.getText();
        String localGender = gender.getText();
        String localAddress = address.getText();
        String localPhonenumber = phoneNumber.getText();
        String localMaritialStatus = maritialStatus.getText();
        String localHeightWeight = heightWeight.getText();
        String localDateField = dateField.getText();
        String localBloodGroup = bloodGroup.getText(); 
        String localEphonenumber = ePhonenumber.getText();
        String localEmail = emailSignup.getText();
        String localMedicalHistory = medicalHistory.getText();
        
        checkMail = emailSignup.getText();
        
        Date = dateField.getText();
        DoctorName = doctorName.getText();
        NAME = Name.getText();
        
        boolean bool1 = checkMail.contains("@");
        
        if(bool1 == false)
        {
                emailSignup.setText("Invalid Mail");
           
        } //IF ends here
        else{
            
            mail();
        
        if("Ratul".equals(doctorName.getText()))
        {
            try
        {            
            String insertQuery="Insert into DoctorDashboard1 (Date, Name, Gender, MaritalStatus, HeightWeight, BloodGroup, PhoneNumber, Email, Address, EmergencyPhone, MedicalHistory)Values('"+localDateField+"','"+localName+"','"+localGender+"','"+localMaritialStatus+"','"+localHeightWeight+"','"+localBloodGroup+"','"+localPhonenumber+"','"+localEmail+"','"+localAddress+"','"+localEphonenumber+"','"+localMedicalHistory+"')";
            Statement stat=conn.createStatement();
            int x=stat.executeUpdate(insertQuery);
            System.out.println(x);
           
           if(x==1){
               JOptionPane.showMessageDialog(null, "Registration Successful! A confirmation mail has been sent!");
           }
           
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        } //IF ends here
        else if("Setu".equals(doctorName.getText()))
        {
            try
        {            
            String insertQuery="Insert into DoctorDashboard2 (Date, Name, Gender, MaritalStatus, HeightWeight, BloodGroup, PhoneNumber, Email, Address, EmergencyPhone, MedicalHistory)Values('"+localDateField+"','"+localName+"','"+localGender+"','"+localMaritialStatus+"','"+localHeightWeight+"','"+localBloodGroup+"','"+localPhonenumber+"','"+localEmail+"','"+localAddress+"','"+localEphonenumber+"','"+localMedicalHistory+"')";
            Statement stat=conn.createStatement();
            int x=stat.executeUpdate(insertQuery);
            System.out.println(x);
           
           if(x==1){
               JOptionPane.showMessageDialog(null, "Registration Successful! A confirmation mail has been sent!");
           }
           
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        }
        else if("Shakib".equals(doctorName))
        {
            try
        {
            String insertQuery="Insert into DoctorDashboard3(Date, Name, Gender, MaritalStatus, HeightWeight, BloodGroup, PhoneNumber, Email, Address, EmergencyPhone, MedicalHistory)Values('"+localDateField+"','"+localName+"','"+localGender+"','"+localMaritialStatus+"','"+localHeightWeight+"','"+localBloodGroup+"','"+localPhonenumber+"','"+localEmail+"','"+localAddress+"','"+localEphonenumber+"','"+localMedicalHistory+"')";
            Statement stat=conn.createStatement();
            int x=stat.executeUpdate(insertQuery);
            System.out.println(x);
           
           if(x==1){
               JOptionPane.showMessageDialog(null, "Registration Successful! A confirmation mail has been sent!");
           }
           
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        }
        else if("Nabarun".equals(doctorName))
        {
            try
        {            
            String insertQuery="Insert into DoctorDashboard4 (Date, Name, Gender, MaritalStatus, HeightWeight, BloodGroup, PhoneNumber, Email, Address, EmergencyPhone, MedicalHistory)Values('"+localDateField+"','"+localName+"','"+localGender+"','"+localMaritialStatus+"','"+localHeightWeight+"','"+localBloodGroup+"','"+localPhonenumber+"','"+localEmail+"','"+localAddress+"','"+localEphonenumber+"','"+localMedicalHistory+"')";
            Statement stat=conn.createStatement();
            int x=stat.executeUpdate(insertQuery);
            System.out.println(x);
           
           if(x==1){
               JOptionPane.showMessageDialog(null, "Registration Successful! A confirmation mail has been sent!");
           }
           
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        }
        else
        {
            try
        {            
            String insertQuery="Insert into DoctorDashboard5(Date, Name, Gender, MaritalStatus, HeightWeight, BloodGroup, PhoneNumber, Email, Address, EmergencyPhone, MedicalHistory)Values('"+localDateField+"','"+localName+"','"+localGender+"','"+localMaritialStatus+"','"+localHeightWeight+"','"+localBloodGroup+"','"+localPhonenumber+"','"+localEmail+"','"+localAddress+"','"+localEphonenumber+"','"+localMedicalHistory+"')";
            Statement stat=conn.createStatement();
            int x=stat.executeUpdate(insertQuery);
            System.out.println(x);
           
           if(x==1){
               JOptionPane.showMessageDialog(null, "Registration Successful! A confirmation mail has been sent!");
           }
           
        }
        catch(Exception e){
            
            System.out.println(e);
        }
        }
        }
    }//GEN-LAST:event_registrationButtonActionPerformed
void mail(){
        
        String from = "roket.cse@gmail.com";
        
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator()
        {
            protected PasswordAuthentication getPasswordAuthentication(){
                return  new PasswordAuthentication("roket.cse@gmail.com","R.ratul01");
            }
        });
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(checkMail));
            message.setSubject("PLEDGE: Appointment Confirmation");
            message.setText("Hello, "+NAME+". Your appoinment has been successfully set with "+"Dr. "+DoctorName+" on "+Date+". Thanks for using PLEDGE! ");
            Transport.send(message);
            System.out.println("Sent mail successfull!");
        }catch(MessagingException mex){
            mex.printStackTrace();
        }
}
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
         int choice= JOptionPane.showConfirmDialog(null, "Warning","Quit??",JOptionPane.YES_NO_OPTION);
       if(choice==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PatientSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextField address;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField bloodGroup;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField doctorName;
    private javax.swing.JTextField ePhonenumber;
    private javax.swing.JTextField emailSignup;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField heightWeight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField maritialStatus;
    private javax.swing.JTextField medicalHistory;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton registrationButton;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
