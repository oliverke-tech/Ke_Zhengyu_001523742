/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.components;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.AirQualityInspectorRole;
import Business.Role.BuyerRole;
import Business.Role.InspectorRole;
import Business.Role.SellerRole;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import javax.swing.JPanel;
import ui.AirQualityInspector.AirQualityInspectorHome;
import ui.AirQualityInspector.AirQualityInspectorWorkArea;
import ui.Buyer.BuyerWorkArea;
import ui.CustomerServiceRole.Answer;
import ui.CustomerServiceRole.ViewAnswer;
import ui.InspectorRole.InspectorWorkArea;

/**
 *
 * @author yamato
 */
public class TagCell extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem business;
    /**
     * Creates new form CourseCell
     */
    public TagCell(JPanel userProcessContainer, UserAccount account, EcoSystem business,String s) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;

        titleLabel.setText(s);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                click(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 0, 204));
        titleLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleLabel.getAccessibleContext().setAccessibleName("titleLabel");
    }// </editor-fold>//GEN-END:initComponents

    private void click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_click
       //User user = Global.getInstance().getUser();

        /*if(userAccount.getRole() instanceof BuyerRole){
            Router.getInstance(null).go(new ViewAnswer(userProcessContainer,business,course));
        }
        else if(userAccount.getRole() instanceof SellerRole){
            Router.getInstance(null).go(new ViewAnswer(userProcessContainer,business,course));
        }
        else{
            Router.getInstance(null).go(new Answer(userProcessContainer,business,course));
        }*/
        
    }//GEN-LAST:event_click


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
