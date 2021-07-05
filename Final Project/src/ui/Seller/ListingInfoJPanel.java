/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Seller;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.IOException;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Ke
 */
public class ListingInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FileJPanel
     */
    public JPanel container;
    public EcoSystem system;
    private UserAccount userAccount;
    String path1 ="";
    String path2 ="";
    String path3 ="";
    
    public ListingInfoJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount) {
        initComponents();
        this.container = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtMake = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtVin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMileage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHorsepower = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        img2 = new javax.swing.JLabel();
        btnDashBoard = new javax.swing.JButton();
        img1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        btnFront = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtMake1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 148, 249));
        jLabel10.setText("Create a new listing");

        jLabel8.setText("—————————————————————————————————————————————————");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 153, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("State:");

        txtMake.setBackground(new java.awt.Color(255, 204, 204));

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 153, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Community:");

        txtModel.setBackground(new java.awt.Color(255, 204, 204));

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 153, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Address line1:");

        txtYear.setBackground(new java.awt.Color(255, 204, 204));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 153, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Address line2:");

        txtCategory.setBackground(new java.awt.Color(255, 204, 204));

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 153, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Expected rent:");

        txtState.setBackground(new java.awt.Color(255, 204, 204));

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 153, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Area:");

        txtCity.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name:");

        txtVin.setBackground(new java.awt.Color(255, 204, 204));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Time:");

        txtMileage.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Phone:");

        txtHorsepower.setBackground(new java.awt.Color(255, 204, 204));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDashBoard.setBackground(new java.awt.Color(255, 204, 204));
        btnDashBoard.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDashBoard.setForeground(new java.awt.Color(102, 153, 255));
        btnDashBoard.setText("Upload dash board view");
        btnDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashBoardActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 153, 255));
        btnBack.setText("Upload back view");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnFront.setBackground(new java.awt.Color(255, 204, 204));
        btnFront.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnFront.setForeground(new java.awt.Color(102, 153, 255));
        btnFront.setText("Upload front view");
        btnFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrontActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 153, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("City:");

        txtMake1.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365)
                        .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(backJButton)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtVin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMileage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtHorsepower, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72)
                                                .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMake1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFront, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDashBoard)
                                .addGap(82, 82, 82)
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(87, 87, 87)
                                            .addComponent(btnBack))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(105, 105, 105)
                                            .addComponent(img1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel22)
                                            .addComponent(txtMake1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel17)
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel18)
                                                .addGap(25, 25, 25)
                                                .addComponent(jLabel19))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19)
                                                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(40, 40, 40))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(backJButton)
                                .addComponent(btnFront)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel20)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1)
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel2)
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(txtVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtMileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(txtHorsepower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnDashBoard))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addComponent(btnSave)
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        /*container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);*/
        Router.getInstance(null).back(0);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        WorkRequest car = new WorkRequest();
        car.setMake(txtMake.getText());
        car.setModel(txtModel.getText());
        car.setYear(txtYear.getText());
        car.setCategory(txtCategory.getText());
        car.setState(txtState.getText());
        car.setCity(txtCity.getText());
        car.setVin(txtVin.getText());
        car.setMileage(txtMileage.getText());
        car.setHorsepower(txtHorsepower.getText());
        /*car.setInColor(txtInterColor.getText());
        car.setFuelType(txtFuelType.getText());
        car.setTransmission(txtTransmission.getText());
        car.setMpgCity(txtMpgCity.getText());
        car.setMpgHwy(txtMpgHwy.getText());
        car.setDrivetrain(txtDrivetrain.getText());
        car.setContact(jTextField1.getText());*/
        car.setFrontPicture(path1);
        car.setBackPicture(path2);
        car.setDashBoardPicture(path3);
        car.setPublisher(userAccount);
        system.getWorkQueue().getWorkRequestList().add(car);
        DB4OUtil.getInstance().storeSystem(system);
        JOptionPane.showMessageDialog(this, "Used car information saved.");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashBoardActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("please choose a pic","img","png");
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(new File("."));
        int result = chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        if(result==JFileChooser.APPROVE_OPTION){
            String name = chooser.getSelectedFile().getPath();
            if(name==""||name==null){
                return;
            }
            ImageIcon icon = new ImageIcon(name);
            Image image = icon.getImage();
            Image newImage = image.getScaledInstance(img2.getWidth(), img2.getHeight(), Image.SCALE_DEFAULT);
            System.out.println(img2.getWidth()+""+img2.getHeight());
            icon.setImage(newImage);
            img2.setIcon(icon);
            path3 = name;
        }
    }//GEN-LAST:event_btnDashBoardActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("please choose a pic","img","png");
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(new File("."));
        int result = chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        if(result==JFileChooser.APPROVE_OPTION){
            String name = chooser.getSelectedFile().getPath();
            if(name==""||name==null){
                return;
            }
            ImageIcon icon = new ImageIcon(name);
            Image image = icon.getImage();
            Image newImage = image.getScaledInstance(img1.getWidth(), img1.getHeight(), Image.SCALE_DEFAULT);
            System.out.println(img1.getWidth()+""+img1.getHeight());
            icon.setImage(newImage);
            img1.setIcon(icon);
            path2 = name;
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrontActionPerformed

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("please choose a zip","zip");
        chooser.setFileFilter(filter);
        chooser.setCurrentDirectory(new File("."));
        int result = chooser.showOpenDialog(null);
        File file=chooser.getSelectedFile();
        if(result==JFileChooser.APPROVE_OPTION){
            String path = ".\\src\\resource";
            File f = new File(path);
            if(!f.exists()){
                f.mkdirs();
            }
            String fileName = chooser.getSelectedFile().getName();
            File file1 = new File(path, fileName);
            if(!file1.exists()){
                try {
                    file1.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_btnFrontActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDashBoard;
    private javax.swing.JButton btnFront;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtHorsepower;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtMake1;
    private javax.swing.JTextField txtMileage;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtVin;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void copyFile(File f1, File f2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
