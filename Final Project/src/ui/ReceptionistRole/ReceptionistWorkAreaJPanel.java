/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.ReceptionistRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.SellerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.BuyerRole.ViewVehicleConditionReportJPanel;
import ui.BuyerRole.ViewVehicleInfoJPanel;
import ui.BuyerRole.ViewVehicleValuationJPanel;

/**
 *
 * @author Ke
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;

    /**
     * Creates new form ReceptionistWorkArea
     */
    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);

        for (AbstractQuestion request : business.getWorkQueue().getWorkRequestList()){
            if(request.getPhone()!=null){
                Object[] row = new Object[5];
                row[0] = request.getDate();
                row[1] = request.getName();
                row[2] = request.getPhone();
                row[3] = request.getContact();
                row[4] = request;

                model.addRow(row);   
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 204));
        workRequestJTable.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        workRequestJTable.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "Name", "BuyerPhone", "SellerPhone", "Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(310, 120, 547, 224);

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 153, 255));
        jButton3.setText("View vehicle information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(450, 400, 270, 27);

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(102, 153, 255));
        jButton5.setText("View the vehicle condition report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(450, 460, 270, 27);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(102, 153, 255));
        jButton4.setText("View the vehicle valuation");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(450, 520, 270, 27);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/3439d73c70642d1039f6fdc9345403a3.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(10, -20, 1270, 840);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please choose a car!");
            return;
        }

        WorkRequest car =  (WorkRequest)workRequestJTable.getValueAt(selectedRow, 4);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("QuestionJPanel", new ViewVehicleInfoJPanel(userProcessContainer,business,car));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please choose a car!");
            return;
        }

        WorkRequest car =  (WorkRequest)workRequestJTable.getValueAt(selectedRow, 4);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("QuestionJPanel", new ViewVehicleConditionReportJPanel(userProcessContainer,business,car));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this,"Please choose a car!");
            return;
        }

        WorkRequest car =  (WorkRequest)workRequestJTable.getValueAt(selectedRow, 4);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("QuestionJPanel", new ViewVehicleValuationJPanel(userProcessContainer,business,car));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
