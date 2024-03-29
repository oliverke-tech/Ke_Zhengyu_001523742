/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Buyer;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Ke
 */
public class BookAppointment extends javax.swing.JPanel {
    public JPanel container;
    public EcoSystem business;
    private AbstractQuestion course;
    private UserAccount userAccount;

    /**
     * Creates new form BookAppointmentJPanel
     */
    public BookAppointment(JPanel userProcessContainer, EcoSystem business, UserAccount account,AbstractQuestion course) {
        initComponents();
        this.container = userProcessContainer;
        this.business = business;
        this.userAccount = account;
        this.course = course;
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
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reserve");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 100, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Book appointment");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 120));

        jLabel8.setText("—————————————————————————————————————————————————");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 100));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 153, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2020", "2019", "2018" }));
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, -1, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 153, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("year");
        add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(51, 153, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 153, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("month");
        add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jComboBox3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(51, 153, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 153, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("date");
        add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        course.setBookyear(jComboBox1.getSelectedItem().toString());
        course.setBookmonth(jComboBox2.getSelectedItem().toString());
        course.setBookdate(jComboBox3.getSelectedItem().toString());
        course.setBuyerphone(userAccount.getPhone());

        DB4OUtil.getInstance().storeSystem(business);
        JOptionPane.showMessageDialog(this, "Saved.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        if(jComboBox2.getSelectedItem().toString().equals("February")){
            jComboBox3.removeAllItems();
            jComboBox3.addItem("1");jComboBox3.addItem("2");jComboBox3.addItem("3");jComboBox3.addItem("4");jComboBox3.addItem("5");jComboBox3.addItem("6");
            jComboBox3.addItem("7");jComboBox3.addItem("8");jComboBox3.addItem("9");jComboBox3.addItem("10");jComboBox3.addItem("11");jComboBox3.addItem("12");
            jComboBox3.addItem("13");jComboBox3.addItem("14");jComboBox3.addItem("15");jComboBox3.addItem("16");jComboBox3.addItem("17");jComboBox3.addItem("18");
            jComboBox3.addItem("19");jComboBox3.addItem("20");jComboBox3.addItem("21");jComboBox3.addItem("22");jComboBox3.addItem("23");jComboBox3.addItem("24");
            jComboBox3.addItem("25");jComboBox3.addItem("26");jComboBox3.addItem("27");jComboBox3.addItem("28");
            if(jComboBox1.getSelectedItem().toString().equals("2020")){
                jComboBox3.addItem("29");
            }
        }
        else if(jComboBox2.getSelectedItem().toString().equals("April")||jComboBox2.getSelectedItem().toString().equals("June")||
            jComboBox2.getSelectedItem().toString().equals("August")||jComboBox2.getSelectedItem().toString().equals("October")||
            jComboBox2.getSelectedItem().toString().equals("December")){
            jComboBox3.removeAllItems();
            jComboBox3.addItem("1");jComboBox3.addItem("2");jComboBox3.addItem("3");jComboBox3.addItem("4");jComboBox3.addItem("5");jComboBox3.addItem("6");
            jComboBox3.addItem("7");jComboBox3.addItem("8");jComboBox3.addItem("9");jComboBox3.addItem("10");jComboBox3.addItem("11");jComboBox3.addItem("12");
            jComboBox3.addItem("13");jComboBox3.addItem("14");jComboBox3.addItem("15");jComboBox3.addItem("16");jComboBox3.addItem("17");jComboBox3.addItem("18");
            jComboBox3.addItem("19");jComboBox3.addItem("20");jComboBox3.addItem("21");jComboBox3.addItem("22");jComboBox3.addItem("23");jComboBox3.addItem("24");
            jComboBox3.addItem("25");jComboBox3.addItem("26");jComboBox3.addItem("27");jComboBox3.addItem("28");jComboBox3.addItem("29");jComboBox3.addItem("30");
        }
        else if(jComboBox2.getSelectedItem().toString().equals("January")||jComboBox2.getSelectedItem().toString().equals("March")||
            jComboBox2.getSelectedItem().toString().equals("May")||jComboBox2.getSelectedItem().toString().equals("July")||
            jComboBox2.getSelectedItem().toString().equals("September")||jComboBox2.getSelectedItem().toString().equals("November")){
            jComboBox3.removeAllItems();
            jComboBox3.addItem("1");jComboBox3.addItem("2");jComboBox3.addItem("3");jComboBox3.addItem("4");jComboBox3.addItem("5");jComboBox3.addItem("6");
            jComboBox3.addItem("7");jComboBox3.addItem("8");jComboBox3.addItem("9");jComboBox3.addItem("10");jComboBox3.addItem("11");jComboBox3.addItem("12");
            jComboBox3.addItem("13");jComboBox3.addItem("14");jComboBox3.addItem("15");jComboBox3.addItem("16");jComboBox3.addItem("17");jComboBox3.addItem("18");
            jComboBox3.addItem("19");jComboBox3.addItem("20");jComboBox3.addItem("21");jComboBox3.addItem("22");jComboBox3.addItem("23");jComboBox3.addItem("24");
            jComboBox3.addItem("25");jComboBox3.addItem("26");jComboBox3.addItem("27");jComboBox3.addItem("28");jComboBox3.addItem("29");jComboBox3.addItem("30");
            jComboBox3.addItem("31");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
