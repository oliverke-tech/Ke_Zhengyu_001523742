/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author Administrator
 */
public class CreateAcJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateAcJPanel
     */
    Person person;
    
    public CreateAcJPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bntxt = new javax.swing.JTextField();
        brtxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        batxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        balancetxt = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        saveratio = new javax.swing.JRadioButton();
        checkratio = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        savebtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel13.setText("Bank Name:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel14.setText("Bank Routing Number:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        bntxt.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        add(bntxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 125, -1));

        brtxt.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        add(brtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 125, -1));

        jLabel15.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel15.setText("Bank Account Number:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        batxt.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        batxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batxtActionPerformed(evt);
            }
        });
        add(batxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 125, -1));

        jLabel16.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel16.setText("Account Balance:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, -1, -1));

        balancetxt.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        add(balancetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 125, -1));

        jLabel17.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel17.setText("Account Type:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, -1, -1));

        saveratio.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        saveratio.setText("Saving Account");
        saveratio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveratioActionPerformed(evt);
            }
        });
        add(saveratio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, -1, -1));

        checkratio.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        checkratio.setText("Checking Account");
        checkratio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkratioActionPerformed(evt);
            }
        });
        add(checkratio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("宋体", 0, 36)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 820, -1));

        savebtn.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 103, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void batxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batxtActionPerformed

    private void saveratioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveratioActionPerformed
        // TODO add your handling code here:
        checkratio.setSelected(false);
    }//GEN-LAST:event_saveratioActionPerformed

    private void checkratioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkratioActionPerformed
        // TODO add your handling code here:
        saveratio.setSelected(false);
    }//GEN-LAST:event_checkratioActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        person.setBankName(bntxt.getText());
        person.setBankRoutingNum(brtxt.getText());
        person.setBankAccountNum(batxt.getText());
        person.setBalance(balancetxt.getText());
        if (saveratio.isSelected())
            person.setType("Saving");        
        else if(saveratio.isSelected())       
            person.setType("Checking"); 
        else
            person.setType("none");
        JOptionPane.showMessageDialog(this,"Person Information Saved");
    }//GEN-LAST:event_savebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balancetxt;
    private javax.swing.JTextField batxt;
    private javax.swing.JTextField bntxt;
    private javax.swing.JTextField brtxt;
    private javax.swing.JRadioButton checkratio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JButton savebtn;
    private javax.swing.JRadioButton saveratio;
    // End of variables declaration//GEN-END:variables
}
