/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SellerRole;

import ui.BuyerRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SellerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Business.WorkQueue.AbstractQuestion;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.CustomerServiceRole.BuyerQuestionJPanel;
import ui.CustomerServiceRole.SellerQuestionJPanel;

/**
 *
 * @author Ke
 */
public class SellerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private SellerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public SellerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SellerOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Q&A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(280, 340, 447, 27);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 153, 255));
        jButton2.setText("I want to sell my car.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(280, 220, 450, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/3439d73c70642d1039f6fdc9345403a3.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(-5, -3, 1260, 810);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("QuestionJPanel", new SellerQuestionJPanel(userProcessContainer, userAccount, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VehicleInfoJPanel vehicleInfoJPanel = new VehicleInfoJPanel(userProcessContainer, business,userAccount);
        //splitPane.setRightComponent(vehicleInfoPanel);
        //ManageCustomerJPanel manageCustomerJPanel=new ManageCustomerJPanel(userProcessContainer, ecosystem, customerDirectory);
        userProcessContainer.add("vehicleInfoJPanel",vehicleInfoJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}