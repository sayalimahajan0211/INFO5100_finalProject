/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author aishwarya
 */
public class AuthorizationAdminWorkAreaPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;

    /**
     * Creates new form AuthorizationAdminWorkAreaPanel
     */
    public AuthorizationAdminWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JLabel();
        userJButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AUTHORIZATION ADMIN WORKAREA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valueLabel.setText("<value>");
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 130, -1));

        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageOrganizationJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageOrganizationJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationJButtonMousePressed(evt);
            }
        });
        jPanel1.add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, 30));

        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageEmployeeJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageEmployeeJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeJButtonMousePressed(evt);
            }
        });
        jPanel1.add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 140, 30));

        userJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userJButton.setText("Manage User");
        userJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userJButtonMousePressed(evt);
            }
        });
        jPanel1.add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin (2).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 280, 420));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 81, 520, 481));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/authorize (1).png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 140));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonMousePressed
        // TODO add your handling code here:
        ManageAuthorizationAdminOrganizationJPanel manageOrganizationJPanel = new ManageAuthorizationAdminOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonMousePressed

    private void manageEmployeeJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonMousePressed
        // TODO add your handling code here:
        ManageAuthorizationAdminEmployeeJPanel manageEmployeeJPanel = new ManageAuthorizationAdminEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonMousePressed

    private void userJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJButtonMousePressed
        // TODO add your handling code here:
        ManageAuthorizationAdminUserAccountJPanel muajp = new ManageAuthorizationAdminUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel manageEmployeeJButton;
    private javax.swing.JLabel manageOrganizationJButton;
    private javax.swing.JLabel userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
