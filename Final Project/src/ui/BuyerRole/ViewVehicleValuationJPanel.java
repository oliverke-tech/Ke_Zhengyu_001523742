/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.BuyerRole;

import Business.EcoSystem;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import ui.SystemAdminRole.SystemAdminWorkAreaJPanel;


public class ViewVehicleValuationJPanel extends javax.swing.JPanel {
    public JPanel container;
    public EcoSystem business;
    WorkRequest car;

    /**
     * Creates new form ViewVehicleValuationJPanel
     */
    public ViewVehicleValuationJPanel(JPanel userProcessContainer, EcoSystem business, WorkRequest car) {
        initComponents();
        this.container = userProcessContainer;
        this.business = business;
        this.car = car;
        jTextField1.setText(car.getValuation());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);
        add(jTextField1);
        jTextField1.setBounds(350, 270, 81, 24);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("USD");
        add(jLabel1);
        jLabel1.setBounds(510, 270, 30, 19);

        backJButton.setBackground(new java.awt.Color(255, 204, 204));
        backJButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 153, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(30, 30, 83, 27);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/3439d73c70642d1039f6fdc9345403a3.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(-5, -4, 1070, 810);
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
