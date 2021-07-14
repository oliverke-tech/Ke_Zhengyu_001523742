/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Seller;

import ui.Buyer.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Global;
import Business.Listings;
import Business.ListingsDirectory;
import Business.Organization.Organization;
import Business.Organization.SellerOrganization;
import Business.Role.BuyerRole;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.AbstractQuestion;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ke
 */
public class SellerWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public SellerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.setSize(1024, 768);
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        //initCourses(/*business.getListingsDirectory()*/);
    }
    
    /*private void initCourses(ListingsDirectory courseDir){

        for (Listings course : courseDir){
            ListingsCell cell = new ListingsCell(course);
            jPanel1.add(cell);
            cell.setPreferredSize(new Dimension(jPanel1.getWidth(), cell_H));
        }

        scrollPanel.setSize(contentPanel.getWidth(), cell_H * courseDir.getList().size() / 2 + 1);

        jPanel1.setSize(jPanel1.getWidth(), cell_H * courseDir.getList().size() / 2 + 1);

        jPanel1.setPreferredSize(new Dimension(jPanel1.getWidth(), cell_H * courseDir.getList().size() / 2 + 1));
        updateUI();
    }*/
    

    
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
        nameLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setMaximumSize(new java.awt.Dimension(1500, 1000));
        setMinimumSize(new java.awt.Dimension(1500, 1000));
        setLayout(null);

        SideBar.setBackground(new java.awt.Color(33, 135, 251));
        SideBar.setPreferredSize(new java.awt.Dimension(160, 666));

        nameLabel.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("name");

        jButton2.setText("Q&A");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("New Listing");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jButton1)
                .addGap(110, 110, 110)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jSplitPane1.setLeftComponent(SideBar);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);
        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1);
        jSplitPane1.setBounds(0, 0, 1360, 810);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SellerQuestion question = new SellerQuestion(userProcessContainer, userAccount, organization, enterprise, business);
        Router.getInstance(null).go(question);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HousingInfo listingInfoJPanel = new HousingInfo(userProcessContainer, business,userAccount);
        jSplitPane1.setRightComponent(listingInfoJPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        Global.getInstance().logout();
    }//GEN-LAST:event_logoutButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
