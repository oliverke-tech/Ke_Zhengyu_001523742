/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminRole;

import ui.Buyer.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Global;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Router;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AbstractQuestion;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
/**
 *
 * @author Ke
 */
public class SystemAdminWorkArea extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem business;
    private AbstractQuestion course;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public SystemAdminWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        this.setSize(1024, 768);       
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        nameLabel.setText(account.getUsername());
        populateTree();
    }
    
    public void populateTree(){
        DefaultTreeModel model=(DefaultTreeModel)jTree.getModel();
        ArrayList<Network> networkList=business.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        
        Network network;
        Enterprise enterprise;
        Organization organization;
        
        DefaultMutableTreeNode networks=new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root=(DefaultMutableTreeNode)model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);
        
        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            networkNode=new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);
            
            enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
            for(int j=0; j<enterpriseList.size();j++){
                enterprise=enterpriseList.get(j);
                enterpriseNode=new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);
                
                organizationList=enterprise.getOrganizationDirectory().getOrganizationList();
                /*for(int k=0;k<organizationList.size();k++){
                    organization=organizationList.get(i);
                    organizationNode=new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }*/
            }
        }
        model.reload();
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
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();

        setLayout(null);

        SideBar.setBackground(new java.awt.Color(51, 153, 255));
        SideBar.setPreferredSize(new java.awt.Dimension(160, 666));
        SideBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        backButton.setForeground(new java.awt.Color(51, 153, 255));
        backButton.setText("Logout");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        SideBar.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, 100, -1));
        SideBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 111, 235, 10));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 153, 255));
        jButton5.setText("Manage Enterprise");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        SideBar.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 255));
        jButton3.setText("Manage Network");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        SideBar.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 210, -1));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 153, 255));
        jButton7.setText("Manage User Admin");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        SideBar.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 210, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hello,");
        SideBar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 32, -1, -1));

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("name");
        SideBar.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 65, 207, 39));

        jSplitPane1.setLeftComponent(SideBar);

        jTree.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jTree.setForeground(new java.awt.Color(51, 153, 255));
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        jSplitPane1.setRightComponent(jScrollPane1);

        add(jSplitPane1);
        jSplitPane1.setBounds(0, 0, 1250, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        ManageNetwork manageNetworkJPanel=new ManageNetwork(userProcessContainer, account, business);
        Router.getInstance(null).go(manageNetworkJPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        ManageEnterprise manageEnterpriseJPanel=new ManageEnterprise(userProcessContainer, account, business);
        Router.getInstance(null).go(manageEnterpriseJPanel);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Global.getInstance().logout();
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        ManageUserAdmin manageUserAdminJPanel=new ManageUserAdmin(userProcessContainer, account, business);
        Router.getInstance(null).go(manageUserAdminJPanel);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        /*DefaultMutableTreeNode selectedNode= (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();
        if(selectedNode!=null){
            lblSelectedNode.setText(selectedNode.toString());
        }*/
    }//GEN-LAST:event_jTreeValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton backButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}