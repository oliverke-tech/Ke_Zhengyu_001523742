/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SellerRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Role.SellerRole;
import Business.Router;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Zhe Li
 */
public class SellerRegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SellerRegisterJPanel
     */
    
    JPanel container;
    private EcoSystem system;
    /*
    public SellerRegisterJPanel() {
        initComponents();
    }
    */
    
    //也是自动加的，还没改→已改
    public SellerRegisterJPanel(JPanel container, EcoSystem system) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        initComponents();
        this.system = system;
        this.container = container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRePassword = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoneNum = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        lblRePassword.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRePassword.setForeground(new java.awt.Color(102, 153, 255));
        lblRePassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRePassword.setText("Re_Password:");
        add(lblRePassword);
        lblRePassword.setBounds(380, 320, 110, 19);

        txtRePassword.setBackground(new java.awt.Color(255, 204, 204));
        add(txtRePassword);
        txtRePassword.setBounds(550, 320, 124, 24);

        lblEmail.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(102, 153, 255));
        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email:");
        add(lblEmail);
        lblEmail.setBounds(430, 370, 50, 19);

        txtEmail.setBackground(new java.awt.Color(255, 204, 204));
        add(txtEmail);
        txtEmail.setBounds(550, 360, 124, 24);

        lblPhoneNum.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPhoneNum.setForeground(new java.awt.Color(102, 153, 255));
        lblPhoneNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneNum.setText("Phone Number:");
        add(lblPhoneNum);
        lblPhoneNum.setBounds(380, 410, 110, 19);

        txtPhoneNum.setBackground(new java.awt.Color(255, 204, 204));
        add(txtPhoneNum);
        txtPhoneNum.setBounds(550, 400, 124, 24);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create new seller here");
        add(jLabel1);
        jLabel1.setBounds(290, 139, 470, 60);

        btnRegister.setBackground(new java.awt.Color(255, 204, 204));
        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(102, 153, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister);
        btnRegister.setBounds(490, 470, 85, 27);

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(102, 153, 255));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsername.setText("Username:");
        add(lblUsername);
        lblUsername.setBounds(410, 230, 80, 19);

        txtUsername.setBackground(new java.awt.Color(255, 204, 204));
        add(txtUsername);
        txtUsername.setBounds(550, 230, 124, 24);

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(102, 153, 255));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");
        add(lblPassword);
        lblPassword.setBounds(410, 280, 80, 19);

        txtPassword.setBackground(new java.awt.Color(255, 204, 204));
        add(txtPassword);
        txtPassword.setBounds(550, 270, 124, 24);

        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton);
        backButton.setBounds(330, 470, 89, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/6905b594d7eab2eafa12cd1d1022f3cd.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 0, 1240, 780);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        // Get user name
        String userName = txtUsername.getText();
        // Get Password
        /*
        char[] passwordCharArray = txtPassword.getPassword();
        char[] repasswordCharArray = txtRePassword.getPassword();
        String repassword = String.valueOf(repasswordCharArray);
        String password = String.valueOf(passwordCharArray);
        */
        String password =  txtPassword.getText();
        String repassword = txtRePassword.getText();

        String email = txtEmail.getText();
        String phoneNum = txtPhoneNum.getText();

        if(userName.isEmpty() || password.isEmpty() || repassword.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please input username or password!");
            return;
        }
        if(email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input your email!");
            return;
        }

        /*
        if(!ecoSystem.checkIfUserIsUnique(userName)){
            JOptionPane.showMessageDialog(null, "User name has existed!");
            return;
        }
        */

        if(!repassword.equals(password))
        {
            JOptionPane.showMessageDialog(null, "Password and Re_Password are not same, Please Check!");
            return;
        }

        //UserAccount customerAccount = deliveryService.addCustomer(userName, password);

        system.getUserAccountDirectory().createUserAccount(userName, password, new SellerRole());
        DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(null, "Register Seller Successfully!");

        //buyer.setEmail(email);
        //customerAccount.setAddress(address);
        //JOptionPane.showMessageDialog(null, "Register Customer Successfully!");
        //populate();
        txtUsername.setText("");
        txtPassword.setText("");
        txtRePassword.setText("");
        txtEmail.setText("");
        txtPhoneNum.setText("");

    }//GEN-LAST:event_btnRegisterActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Router.getInstance(null).back(0);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNum;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtRePassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
