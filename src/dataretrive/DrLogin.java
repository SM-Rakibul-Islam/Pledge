package dataretrive;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DrLogin extends javax.swing.JFrame {
       
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public DrLogin() {
        initComponents();
        conn = DbConnect.DbConn();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        emailLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordLogin = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        signupButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Email:");

        emailLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password:");

        passwordLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passwordLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(" Doctor Login");

        loginButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        signupButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        signupButton.setText("No Account? Sign Up!");
        signupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resetButton))
                            .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(emailLogin)
                            .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(loginButton))
                .addGap(18, 18, 18)
                .addComponent(signupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(backButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLoginActionPerformed

    }//GEN-LAST:event_passwordLoginActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed

        emailLogin.setText("");
        passwordLogin.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed
      
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        String checkMail;
        checkMail = emailLogin.getText();
        
        boolean bool = checkMail.contains("@");
        
        if(bool == false)
        {
                emailLogin.setText("Invalid Mail");
            
        }
        if("rakibul@gmail.com".equals(emailLogin.getText()))
        {  
            try{
            String sql = "Select *from doctor1 where Email = '"+emailLogin.getText()+
                    "'and Password = '"+passwordLogin.getText()+"'";
            pst = conn.prepareStatement(sql); 
            rs = pst.executeQuery();  
            if(rs.next()){
             JOptionPane.showMessageDialog(null, "Login Successful!");
             DoctorDashboard1 DD=new DoctorDashboard1();
             DD.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Either the email or the password is incorrect!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }//IF ends here
        else if("setu@gmail.com".equals(emailLogin.getText()))
        {  
            try{
            String sql = ""
                    + "Select *from doctor2 where Email = '"+emailLogin.getText()+
                    "'and Password = '"+passwordLogin.getText()+"'";
            pst = conn.prepareStatement(sql); 
            rs = pst.executeQuery();  
            if(rs.next()){
             JOptionPane.showMessageDialog(null, "Login Successful!");
             DoctorDashboard2 DD=new DoctorDashboard2();
             DD.setVisible(true);   
            }
            else{
                JOptionPane.showMessageDialog(null, "Either the email or the password is incorrect!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        else if("shakib@gmail.com".equals(emailLogin.getText()))
        {  
            try{
            String sql = "Select *from doctor3 where Email = '"+emailLogin.getText()+
                    "'and Password = '"+passwordLogin.getText()+"'";
            pst = conn.prepareStatement(sql); 
            rs = pst.executeQuery();  
            if(rs.next()){
             JOptionPane.showMessageDialog(null, "Login Successful!");
             DoctorDashboard3 DD=new DoctorDashboard3();
             DD.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Either the email or the password is incorrect!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        else if("nabarun@gmail.com".equals(emailLogin.getText()))
        {  
            try{
            String sql = "Select *from doctor4 where Email = '"+emailLogin.getText()+
                    "'and Password = '"+passwordLogin.getText()+"'";
            pst = conn.prepareStatement(sql); 
            rs = pst.executeQuery();  
            if(rs.next()){
             JOptionPane.showMessageDialog(null, "Login Successful!");
             DoctorDashboard4 DD=new DoctorDashboard4();
             DD.setVisible(true);
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Either the email or the password is incorrect!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        else
        {  
            try{
            String sql = "Select *from doctor5 where Email = '"+emailLogin.getText()+
                    "'and Password = '"+passwordLogin.getText()+"'";
            pst = conn.prepareStatement(sql); 
            rs = pst.executeQuery();  
            if(rs.next()){
             JOptionPane.showMessageDialog(null, "Login Successful!");
             DoctorDashboard5 DD=new DoctorDashboard5();
             DD.setVisible(true);  
            }
            else{
                JOptionPane.showMessageDialog(null, "Either the email or the password is incorrect!");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
      
       
    }//GEN-LAST:event_loginButtonActionPerformed

    private void signupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupButtonActionPerformed

        dispose();
        DrSignup S = new DrSignup();
        S.setLocationRelativeTo(null);
        S.setVisible(true);   
    }//GEN-LAST:event_signupButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            
            Firstpage fp=new Firstpage();
            fp.setVisible(true);
            dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int choice= JOptionPane.showConfirmDialog(null, "Warning","Quit??",JOptionPane.YES_NO_OPTION);
       if(choice==JOptionPane.YES_OPTION)
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(DrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DrLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField emailLogin;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordLogin;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton signupButton;
    // End of variables declaration//GEN-END:variables
}
