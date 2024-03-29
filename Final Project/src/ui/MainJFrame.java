/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AccountantRole;
import Business.Role.AirQualityInspectorRole;
import Business.Role.BuyerRole;
import Business.Role.BuyerServiceRole;
import Business.Role.InspectorRole;
import Business.Role.ReceptionistRole;
import Business.Role.SellerRole;
import Business.Role.SellerServiceRole;
import Business.Role.SystemAdminRole;
import Business.Role.UserAdminRole;
import Business.Router;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import ui.Accountant.AccountantHome;
import ui.AirQualityInspector.AirQualityInspectorHome;
import ui.Buyer.BuyerHome;
import ui.Buyer.BuyerRegister;
import ui.CustomerServiceRole.BuyerServiceHome;
import ui.CustomerServiceRole.SellerServiceHome;
import ui.ReceptionistRole.ReceptionistHome;
import ui.Seller.SellerWorkArea;
import ui.SystemAdminRole.SystemAdminWorkArea;
import ui.InspectorRole.InspectorHome;
import ui.Seller.SellerRegister;
import ui.UserAdminRole.UserAdminWorkArea;


/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        //this.setSize(1024, 768);
        this.setSize(1200, 850);
        Router.getInstance(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        LoginJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        btnBuyerRegister = new javax.swing.JButton();
        btnSellerRegister = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("Renting System");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        jPanel1.setLayout(null);

        LoginJPanel.setBackground(new java.awt.Color(51, 153, 255));
        LoginJPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        LoginJPanel.add(jLabel1);
        jLabel1.setBounds(20, 50, 90, 20);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        LoginJPanel.add(jLabel2);
        jLabel2.setBounds(20, 132, 80, 30);
        LoginJPanel.add(loginJLabel);
        loginJLabel.setBounds(132, 588, 0, 0);

        userNameJTextField.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        userNameJTextField.setForeground(new java.awt.Color(51, 153, 255));
        LoginJPanel.add(userNameJTextField);
        userNameJTextField.setBounds(10, 80, 135, 30);

        passwordField.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        passwordField.setForeground(new java.awt.Color(51, 153, 255));
        passwordField.setToolTipText("*");
        LoginJPanel.add(passwordField);
        passwordField.setBounds(10, 164, 135, 30);

        loginJButton.setBackground(new java.awt.Color(255, 255, 255));
        loginJButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(51, 153, 255));
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });
        LoginJPanel.add(loginJButton);
        loginJButton.setBounds(20, 260, 109, 38);

        btnBuyerRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnBuyerRegister.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnBuyerRegister.setForeground(new java.awt.Color(51, 153, 255));
        btnBuyerRegister.setText("New Buyer");
        btnBuyerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyerRegisterActionPerformed(evt);
            }
        });
        LoginJPanel.add(btnBuyerRegister);
        btnBuyerRegister.setBounds(20, 400, 109, 38);

        btnSellerRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnSellerRegister.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        btnSellerRegister.setForeground(new java.awt.Color(51, 153, 255));
        btnSellerRegister.setText("New Seller");
        btnSellerRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellerRegisterActionPerformed(evt);
            }
        });
        LoginJPanel.add(btnSellerRegister);
        btnSellerRegister.setBounds(20, 490, 111, 38);

        jPanel1.add(LoginJPanel);
        LoginJPanel.setBounds(0, 0, 200, 890);

        jSplitPane1.setLeftComponent(jPanel1);

        container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("            HousingBuy");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 270, 970, 120);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("@ Zhengyu Ke");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(770, 550, 140, 28);

        container.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        jSplitPane1.setRightComponent(jPanel2);
        jSplitPane1.setDividerLocation(150);
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        
        
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            if(userAccount.getRole() instanceof BuyerRole){
                BuyerHome home = new BuyerHome(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof SystemAdminRole){
                SystemAdminWorkArea home = new SystemAdminWorkArea(container, userAccount, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof UserAdminRole){
                UserAdminWorkArea home = new UserAdminWorkArea(container, system, userAccount,inEnterprise);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof SellerRole){
                SellerWorkArea home = new SellerWorkArea(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof InspectorRole){
                InspectorHome home = new InspectorHome(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof AirQualityInspectorRole){
                AirQualityInspectorHome home = new AirQualityInspectorHome(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof BuyerServiceRole){
                BuyerServiceHome home = new BuyerServiceHome(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof SellerServiceRole){
                SellerServiceHome home = new SellerServiceHome(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof ReceptionistRole){
                ReceptionistHome home = new ReceptionistHome(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else if(userAccount.getRole() instanceof AccountantRole){
                AccountantHome home = new AccountantHome(container, userAccount, inOrganization, inEnterprise, system);
                Router.getInstance(null).go(home);
            }
            else{
                CardLayout layout=(CardLayout)container.getLayout();
                container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
                layout.next(container);
            }
        }
        userNameJTextField.setText("");
        passwordField.setText("");
        
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void btnBuyerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyerRegisterActionPerformed
        BuyerRegister buyerRegister = new BuyerRegister(container, system);
        jSplitPane1.setRightComponent(buyerRegister);
        jSplitPane1.setDividerLocation(150);
    }//GEN-LAST:event_btnBuyerRegisterActionPerformed

    private void btnSellerRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellerRegisterActionPerformed
        SellerRegister sellerRegister = new SellerRegister(container, system);
        jSplitPane1.setRightComponent(sellerRegister);
        jSplitPane1.setDividerLocation(150);
    }//GEN-LAST:event_btnSellerRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginJPanel;
    private javax.swing.JButton btnBuyerRegister;
    private javax.swing.JButton btnSellerRegister;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
