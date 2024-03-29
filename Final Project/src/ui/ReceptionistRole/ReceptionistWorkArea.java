/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ReceptionistRole;

import ui.Buyer.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
/**
 *
 * @author Ke
 */
public class ReceptionistWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private AbstractQuestion course;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public ReceptionistWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, AbstractQuestion course) {
        initComponents();
        this.setSize(1024, 768);       
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        this.course = course;
        nameLabel.setText(account.getUsername());
        jLabel5.setText(course.getBuyerphone());
        jLabel3.setText(course.getSellerphone());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        SideBar = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(null);

        SideBar.setBackground(new java.awt.Color(51, 153, 255));
        SideBar.setPreferredSize(new java.awt.Dimension(160, 666));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 153, 255));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        SideBar.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 725, -1, -1));
        SideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 235, 10));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 153, 255));
        jButton6.setText("Seal the Deal");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        SideBar.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, 210, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 153, 255));
        jButton5.setText("View Housing Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        SideBar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 255));
        jButton3.setText("View Housing Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        SideBar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 153, 255));
        jButton7.setText("View Air Quality Report");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        SideBar.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 210, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seller phone:");
        SideBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("name");
        SideBar.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 65, 207, 39));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 153, 255));
        jButton8.setText("Contract");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        SideBar.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 210, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello,");
        SideBar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 32, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("phone");
        SideBar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 260, 210, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Buyer phone:");
        SideBar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("phone");
        SideBar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 170, 210, -1));

        jSplitPane1.setLeftComponent(SideBar);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("            HousingBuy");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 300, 970, 120);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1);
        jSplitPane1.setBounds(0, 0, 1250, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ViewHousingInfo report = new ViewHousingInfo(userProcessContainer,business,userAccount,course);
        jSplitPane1.setRightComponent(report);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        ViewHousingReport report = new ViewHousingReport(userProcessContainer,business,userAccount,course);
        jSplitPane1.setRightComponent(report);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        Deal report = new Deal(userProcessContainer,business,userAccount,course);
        jSplitPane1.setRightComponent(report);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ReceptionistHome home = new ReceptionistHome(userProcessContainer, userAccount, organization, enterprise, business);
        Router.getInstance(null).go(home);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ViewAirQualityReport report = new ViewAirQualityReport(userProcessContainer,business,userAccount,course);
        jSplitPane1.setRightComponent(report);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        File file = new File("src\\resource\\Home Sales Contract.pdf");
        try {
            java.awt.Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(ReceptionistWorkArea.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
