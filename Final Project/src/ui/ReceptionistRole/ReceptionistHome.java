/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ReceptionistRole;

import ui.CustomerServiceRole.*;
import ui.Buyer.*;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.BuyerRole;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import Business.WorkQueue.WorkRequest;
import java.awt.GridLayout;
import javax.swing.JPanel;
import ui.components.AppointmentCell;
import ui.components.QuestionCell;


/**
 *
 * @author Ke
 */
public class ReceptionistHome extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    public ReceptionistHome(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        initFiles(/*course.getFileDirectory()*/);
    }

    private void initFiles(/*FileDirectory fileDir*/){

        /*contentPanel.setLayout(new GridLayout(0,2));

        int cell_H = contentPanel.getWidth() * 4 / 3;

        for (File file : fileDir){
            FileCell cell = new FileCell(file);
            contentPanel.add(cell);
            cell.setPreferredSize(new Dimension(contentPanel.getWidth(),contentPanel.getWidth() * 4 / 3));
        }

        scrollPanel.setSize(contentPanel.getWidth(), cell_H * fileDir.getList().size() / 2 + 1);

        contentPanel.setSize(contentPanel.getWidth(), cell_H * fileDir.getList().size() / 2 + 1);

        contentPanel.setPreferredSize(new Dimension(contentPanel.getWidth(), cell_H * fileDir.getList().size() / 2 + 1));
        updateUI();*/
        contentPanel.setLayout(new GridLayout(0,2));

        for (AbstractQuestion request : business.getWorkQueue().getWorkRequestList()){
            if(request.getDate() != null){
                AppointmentCell cell = new AppointmentCell(userProcessContainer,userAccount,organization,enterprise,business,request);
                contentPanel.add(cell);    
            }
        }
        updateUI();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPanel = new javax.swing.JScrollPane();
        contentPanel = new javax.swing.JPanel();
        backJButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1996, Short.MAX_VALUE)
        );

        scrollPanel.setViewportView(contentPanel);

        backJButton2.setBackground(new java.awt.Color(255, 204, 204));
        backJButton2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backJButton2.setForeground(new java.awt.Color(102, 153, 255));
        backJButton2.setText("<< Back");
        backJButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 148, 249));
        jLabel10.setText("Pending appointment");

        jLabel8.setText("—————————————————————————————————————————————————");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(backJButton2)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1298, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton2ActionPerformed
        Router.getInstance(null).back(0);
    }//GEN-LAST:event_backJButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton2;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane scrollPanel;
    // End of variables declaration//GEN-END:variables
}