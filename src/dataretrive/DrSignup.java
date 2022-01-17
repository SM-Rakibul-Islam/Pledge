package dataretrive;

import dataretrive.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DrSignup extends javax.swing.JFrame {
    
    String checkMail;

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public String mail;
    public String pass;
    
    public DrSignup() {
        initComponents();
        
        conn = DbConnect.DbConn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        registrationButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        signinButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        degree = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        description = new javax.swing.JTextField();
        confirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("First Name:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 88, -1, 25));

        firstName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 88, 133, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Last Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 122, -1, 26));

        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 355, 133, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Doctor Signup");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 16, 379, 38));

        registrationButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        registrationButton.setText("Registration");
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registrationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        getContentPane().add(resetButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 440, -1, -1));

        signinButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signinButton.setText("Have Account? Sign In instead!");
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 271, -1, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 186, -1, 30));

        address.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 190, 133, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Degree(s):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 252, -1, 30));

        phoneNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 225, 133, -1));

        degree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(degree, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 256, 133, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Department:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 294, -1, -1));

        department.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 291, 133, -1));

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 453, -1, -1));

        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 453, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 326, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Password:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 359, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Confirm Password:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 392, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Gender:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 157, -1, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 154, 133, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 323, 133, -1));

        lastName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 122, 133, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Schedule:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 92, -1, -1));

        description.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        description.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 88, 290, 89));

        confirmPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 389, 133, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed

    }//GEN-LAST:event_passwordActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed

        firstName.setText("");
        lastName.setText("");
        gender.setText("");
        address.setText("");
        phoneNumber.setText("");
        degree.setText("");
        department.setText("");
        email.setText("");
        password.setText("");
        confirmPassword.setText("");
        description.setText("");        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed

        String localFirstName = firstName.getText();
        String localLastName = lastName.getText();
        String localGender = gender.getText();
        String localAddress = address.getText();
        String localPhoneNumber = phoneNumber.getText();
        String localDegree = degree.getText();
        String localDepartment = department.getText();
        String localEmailSignup = email.getText();
        String localPasswordSignup = password.getText();
        String localConfirmPasswordSignup = confirmPassword.getText();
        String localDescription = description.getText();
        
        checkMail = email.getText();
        
        boolean bool1 = checkMail.contains("@");
        boolean bool2 = password.getText().equals(confirmPassword.getText());
        
        
        if(bool1 == false || bool2 == false)
        {
            if(bool1 == false)
            {
                email.setText("Invalid Mail");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Password didn't match!");
                password.setText("");
                confirmPassword.setText("");
            }
        }
        else{
        
        
        if( "Ratul".equals(localFirstName))
        {
        {
        try
        {
            String insertQuery1 ="Insert into Doctor1 (FirstName, LastName, Gender, Address,PhoneNumber, Degree, Department, Email, Password, ConfirmPassword, Description)Values('"+localFirstName+"','"+localLastName+"','"+localGender
                    +"','"+localAddress+"','"+localPhoneNumber+"','"+localDegree+"','"+localDepartment+"','"+localEmailSignup+"','"+localPasswordSignup+"','"+localConfirmPasswordSignup+"','"+localDescription+"')";
            String insertQuery2 ="Insert into commonDr (Name,Department,Degree,Address,Description)Values('"+localFirstName+"','"+localDepartment+"','"+localDegree+"','"+localAddress+"','"+localDescription+"')";
            
            Statement stat1 = conn.createStatement();
            Statement stat2 = conn.createStatement();
            
            int x = stat1.executeUpdate(insertQuery1);
            System.out.println(x);
            
            int y = stat2.executeUpdate(insertQuery2);
            System.out.println(y);
            
            mail = localEmailSignup;
            pass = localPasswordSignup;

           if(x==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
           else if(y==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    }//IF condition ends here
    else if("Setu".equals(localFirstName))
    {
       {
        try
        {
            String insertQuery1 ="Insert into Doctor2 (FirstName, LastName, Gender, Address,PhoneNumber, Degree, Department, Email, Password, ConfirmPassword, Description)Values('"+localFirstName+"','"+localLastName+"','"+localGender
                    +"','"+localAddress+"','"+localPhoneNumber+"','"+localDegree+"','"+localDepartment+"','"+localEmailSignup+"','"+localPasswordSignup+"','"+localConfirmPasswordSignup+"','"+localDescription+"')";
            String insertQuery2 ="Insert into commonDr (Name,Department,Degree,Address,Description)Values('"+localFirstName+"','"+localDepartment+"','"+localDegree+"','"+localAddress+"','"+localDescription+"')";
            
            Statement stat1 = conn.createStatement();
            Statement stat2 = conn.createStatement();
            
            int x = stat1.executeUpdate(insertQuery1);
            System.out.println(x);
            
            int y = stat2.executeUpdate(insertQuery2);
            System.out.println(y);
            
            mail = localEmailSignup;
            pass = localPasswordSignup;

           if(x==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
           else if(y==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    }//ELSE IF ends here
    else if("Shakib".equals(localFirstName))
    {
        {
        try
        {
            String insertQuery1 ="Insert into Doctor3 (FirstName, LastName, Gender, Address,PhoneNumber, Degree, Department, Email, Password, ConfirmPassword, Description)Values('"+localFirstName+"','"+localLastName+"','"+localGender
                    +"','"+localAddress+"','"+localPhoneNumber+"','"+localDegree+"','"+localDepartment+"','"+localEmailSignup+"','"+localPasswordSignup+"','"+localConfirmPasswordSignup+"','"+localDescription+"')";
            String insertQuery2 ="Insert into commonDr (Name,Department,Degree,Address,Description)Values('"+localFirstName+"','"+localDepartment+"','"+localDegree+"','"+localAddress+"','"+localDescription+"')";
            
            Statement stat1 = conn.createStatement();
            Statement stat2 = conn.createStatement();
            
            int x = stat1.executeUpdate(insertQuery1);
            System.out.println(x);
            
            int y = stat2.executeUpdate(insertQuery2);
            System.out.println(y);
            
            mail = localEmailSignup;
            pass = localPasswordSignup;

           if(x==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
           else if(y==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    }//ELSE IF ends here
    else if("Nabarun".equals(localFirstName))
    {
         {
        try
        {
            String insertQuery1 ="Insert into Doctor4 (FirstName, LastName, Gender, Address,PhoneNumber, Degree, Department, Email, Password, ConfirmPassword, Description)Values('"+localFirstName+"','"+localLastName+"','"+localGender
                    +"','"+localAddress+"','"+localPhoneNumber+"','"+localDegree+"','"+localDepartment+"','"+localEmailSignup+"','"+localPasswordSignup+"','"+localConfirmPasswordSignup+"','"+localDescription+"')";
            String insertQuery2 ="Insert into commonDr (Name,Department,Degree,Address,Description)Values('"+localFirstName+"','"+localDepartment+"','"+localDegree+"','"+localAddress+"','"+localDescription+"')";
            
            Statement stat1 = conn.createStatement();
            Statement stat2 = conn.createStatement();
            
            int x = stat1.executeUpdate(insertQuery1);
            System.out.println(x);
            
            int y = stat2.executeUpdate(insertQuery2);
            System.out.println(y);
            
            mail = localEmailSignup;
            pass = localPasswordSignup;

           if(x==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
           else if(y==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    }//ELSE IF ends here
    else{
        {
         {
        try
        {
            String insertQuery1 ="Insert into Doctor5 (FirstName, LastName, Gender, Address,PhoneNumber, Degree, Department, Email, Password, ConfirmPassword, Description)Values('"+localFirstName+"','"+localLastName+"','"+localGender
                    +"','"+localAddress+"','"+localPhoneNumber+"','"+localDegree+"','"+localDepartment+"','"+localEmailSignup+"','"+localPasswordSignup+"','"+localConfirmPasswordSignup+"','"+localDescription+"')";
            String insertQuery2 ="Insert into commonDr (Name,Department,Degree,Address,Description)Values('"+localFirstName+"','"+localDepartment+"','"+localDegree+"','"+localAddress+"','"+localDescription+"')";
            
            Statement stat1 = conn.createStatement();
            Statement stat2 = conn.createStatement();
            
            int x = stat1.executeUpdate(insertQuery1);
            System.out.println(x);
            
            int y = stat2.executeUpdate(insertQuery2);
            System.out.println(y);
            
            mail = localEmailSignup;
            pass = localPasswordSignup;

           if(x==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
           else if(y==1)
           {
               JOptionPane.showMessageDialog(null, "Registration Successful!");
           }
        }
        catch(Exception e){
            
            System.out.println(e);
        }
    }
    }//ELSE ends here
        }//final ELSE ends here 
        }
        
    }//GEN-LAST:event_registrationButtonActionPerformed
public String getEmail()
{
        return mail;
}
public String getPassword()
{
    return pass;
}
    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed

        dispose();
        DrLogin L = new DrLogin();
        L.setLocationRelativeTo(null);
        L.setVisible(true);   
    }//GEN-LAST:event_signinButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
         int choice= JOptionPane.showConfirmDialog(null, "Warning","Quit??",JOptionPane.YES_NO_OPTION);
       if(choice==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        DrLogin dl=new DrLogin();
        dl.setVisible(true);
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
            java.util.logging.Logger.getLogger(DrSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton backButton;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField degree;
    private javax.swing.JTextField department;
    private javax.swing.JTextField description;
    private javax.swing.JTextField email;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField gender;
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
    private javax.swing.JTextField lastName;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton registrationButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton signinButton;
    // End of variables declaration//GEN-END:variables
}
