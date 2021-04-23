/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.NGORole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Role.NGORole;
import Business.ValidationUtility;
import Business.Voluntary.NGO;
import Business.Voluntary.NGODirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.SendEmail;
import java.awt.CardLayout;
import java.awt.Component;
import ui.RegisterJPanel;

/**
 *
 * @author aishwarya
 */
public class NGORegistrationJPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private JPanel jPanel;
    private DB4OUtil dB4OUtil;
    private JPanel topPanel;

    /**
     * Creates new form NGORegistrationJPanel
     */
    public NGORegistrationJPanel(JPanel mainContainer,JPanel topPanel , EcoSystem system,DB4OUtil dB4OUtil) {
        initComponents();
        this.system = system;
        this.topPanel= topPanel;
        this.jPanel = mainContainer;
        this.dB4OUtil = dB4OUtil;
        this.setSize(1680, 1050);
        populateNetworkComboBox();
    }

    private void populateNetworkComboBox() {
        networkComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            networkComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (Enterprise.EnterpriseType.Voluntary.getValue().equals(enterprise.getEnterpriseType().getValue())) {
                enterpriseComboBox.addItem(enterprise);
            }
        }

    }

    public void popOrganizationComboBox(Enterprise enterprise) {
        orgComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (Organization.Type.NGOAdmin.getValue().equals(organization.getType().getValue())) {
                orgComboBox.addItem(organization);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ngoName = new javax.swing.JTextField();
        managerNameText = new javax.swing.JTextField();
        cityText = new javax.swing.JTextField();
        zipCode = new javax.swing.JTextField();
        phoneNmbr = new javax.swing.JTextField();
        emailAddrText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox<>();
        enterpriseComboBox = new javax.swing.JComboBox<>();
        networkComboBox = new javax.swing.JComboBox<>();
        addressTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 244, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NGO Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Manager Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Address Line:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("City:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Zip Code:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Contact Number:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Email Address:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 541, -1, -1));

        ngoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngoNameActionPerformed(evt);
            }
        });
        add(ngoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 176, -1));
        add(managerNameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 176, -1));
        add(cityText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 176, -1));
        add(zipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 176, -1));
        add(phoneNmbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 176, -1));
        add(emailAddrText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 176, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("User Name:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Password:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, -1, -1));

        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 176, -1));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 176, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Network:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Enterprise:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Organization:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 173, -1));

        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 173, -1));

        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 170, -1));
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 180, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/badge.png"))); // NOI18N
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 310, 350));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("PLEASE FILL THE FORM FOR REGISTRATION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsubmit.setText("Submit");
        btnsubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsubmitMousePressed(evt);
            }
        });
        add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 600, 90, 30));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void ngoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngoNameActionPerformed

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void enterpriseComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseComboBoxActionPerformed
        // TODO add your handling code here:
        Enterprise e = (Enterprise) enterpriseComboBox.getSelectedItem();
        if (e != null) {
            popOrganizationComboBox(e);
        }
    }//GEN-LAST:event_enterpriseComboBoxActionPerformed

    private void networkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkComboBoxActionPerformed

    private void btnsubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubmitMousePressed
        // TODO add your handling code here:
        
         Organization org = (Organization) orgComboBox.getSelectedItem();
        NGODirectory dir = system.getnGODirectory();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        if (ngoName.getText().isEmpty() || managerNameText.getText().isEmpty() || cityText.getText().isEmpty()
                || zipCode.getText().isEmpty() || phoneNmbr.getText().isEmpty() || emailAddrText.getText().isEmpty()
                || userNameTxt.getText().isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please provide all the fields!");
            return;
        }

        if (!ValidationUtility.isNameValid(ngoName.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide proper Name!");
            return;
        }
        if (!ValidationUtility.isNameValid(managerNameText.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide proper Name!");
            return;
        }

        if (!ValidationUtility.isNameValid(cityText.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide proper City!");
            return;
        }

        if (!ValidationUtility.isZipCodeValid(zipCode.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide proper Zipcode!");
            return;
        }

        if (!ValidationUtility.isPhoneNumberValid(phoneNmbr.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide proper Phone Number!");
            return;
        }

        if (!ValidationUtility.isEmailAddressValid(emailAddrText.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide proper Email Address!");
            return;
        }

        if (!ValidationUtility.isUserNameValid(userNameTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide proper User Name!");
            return;
        }
        if (!ValidationUtility.isPasswordValid(password)) {
            JOptionPane.showMessageDialog(null, "Please provide proper Password!");
            return;
        }
        if (org.getUserAccountDirectory().checkIfUsernameIsUnique(userNameTxt.getText())) {
            org.getUserAccountDirectory()
                    .createUserAccount(userNameTxt.getText(), password, org.getEmployeeDirectory().createEmployee(ngoName.getText()), new NGORole());
        } else {
            JOptionPane.showMessageDialog(null, "UserName already in use. Please try something else!");
            return;
        }

        NGO ngo = new NGO();
        ngo.setName(ngoName.getText());
        ngo.setAdminName(managerNameText.getText());
        ngo.setCity(cityText.getText());
        ngo.setZipCode(zipCode.getText());
        ngo.setPhoneNumber(phoneNmbr.getText());
        ngo.setEmailId(emailAddrText.getText());
        ngo.setStreet(addressTxt.getText());
        ngo.setUserName(userNameTxt.getText());
        dir.addNGO(ngo);
        JOptionPane.showMessageDialog(null, "Information Saved!");
        dB4OUtil.storeSystem(system);
        SendEmail.sendEmailMessage(emailAddrText.getText(),"Welcome to Covid Bed Distribution System", "Hello "+ngoName.getText()+","+"\n \nCongratulations!! You have been successfully registered! \n \nProtectThePack! \n\nStay Safe.  \n \nWarm Regards,\n \nTeam Covid Bed Distribution");
    }//GEN-LAST:event_btnsubmitMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        
        jPanel.remove(this);
        Component[] componentArray = jPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RegisterJPanel Registerjpanel = (RegisterJPanel) component;
        CardLayout layout = (CardLayout) jPanel.getLayout();
        layout.previous(jPanel);
        topPanel.setVisible(true);
    }//GEN-LAST:event_backMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JLabel back;
    private javax.swing.JLabel btnsubmit;
    private javax.swing.JTextField cityText;
    private javax.swing.JTextField emailAddrText;
    private javax.swing.JComboBox<Object> enterpriseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField managerNameText;
    private javax.swing.JComboBox<Object> networkComboBox;
    private javax.swing.JTextField ngoName;
    private javax.swing.JComboBox<Object> orgComboBox;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneNmbr;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JTextField zipCode;
    // End of variables declaration//GEN-END:variables
}
