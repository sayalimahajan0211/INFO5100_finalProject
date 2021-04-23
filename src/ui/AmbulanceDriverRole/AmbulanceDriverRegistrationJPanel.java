/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AmbulanceDriverRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Driver.AmbulanceDriver;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AmbulanceDriverRole;
import Business.SendSMS;
import Business.UserAccount.UserAccount;
import Business.ValidationUtility;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.RegisterJPanel;

/**
 *
 * @author aishwarya
 */
public class AmbulanceDriverRegistrationJPanel extends javax.swing.JPanel {

    private static EcoSystem system;
    private static DB4OUtil dB4OUtil;
    private static JPanel userProcessorcontainer;
    private String randomCode;
    private JPanel topPanel;

    /**
     * Creates new form AmbulanceDriverRegistrationJPanel
     */

    public AmbulanceDriverRegistrationJPanel(JPanel container,JPanel topPanel, EcoSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.system = system;
        this.topPanel=topPanel;
        this.dB4OUtil = dB4OUtil;
        this.userProcessorcontainer = container;
        
        this.setSize(1680, 1050);
        populateHospitalDetails();
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
            if (Enterprise.EnterpriseType.Transportation.getValue().equals(enterprise.getEnterpriseType().getValue())) {
                enterpriseComboBox.addItem(enterprise);
            }
        }

    }

    public void popOrganizationComboBox(Enterprise enterprise) {
        orgComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (Organization.Type.AmbulanceDriver.getValue().equals(organization.getType().getValue())) {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        hospitaljComboBox = new javax.swing.JComboBox<>();
        lastNameTxt = new javax.swing.JTextField();
        ambulanceNumberTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        userNameTxt = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JLabel();
        usernameText = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox<>();
        enterpriseComboBox = new javax.swing.JComboBox<>();
        networkComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        RegisterjButton = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("First Name :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Last Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phone Number :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Age :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ambulance Number :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Hospital :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        hospitaljComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitaljComboBoxActionPerformed(evt);
            }
        });
        add(hospitaljComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 168, -1));

        lastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTxtActionPerformed(evt);
            }
        });
        add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 168, -1));

        ambulanceNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceNumberTxtActionPerformed(evt);
            }
        });
        add(ambulanceNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 168, -1));

        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 430, 168, -1));

        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });
        add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 168, -1));

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });
        add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 168, -1));

        userNameTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userNameTxt.setText("UserName :");
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 70, -1));

        passwordTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passwordTxt.setText("Password :");
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));
        add(usernameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 168, -1));
        add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 168, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Network:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Enterprise:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Organization:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 168, -1));

        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 168, -1));

        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 168, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("PLEASE FILL THE FORM FOR REGISTRATION");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 80, -1));

        RegisterjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RegisterjButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterjButton.setText("Submit");
        RegisterjButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegisterjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterjButtonMousePressed(evt);
            }
        });
        add(RegisterjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 590, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ambulance (2).png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 260, 440));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void hospitaljComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitaljComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitaljComboBoxActionPerformed

    private void lastNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTxtActionPerformed

    private void ambulanceNumberTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambulanceNumberTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ambulanceNumberTxtActionPerformed

    private void ageTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTxtActionPerformed

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    private void phoneTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTxtActionPerformed

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

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessorcontainer.remove(this);
        Component[] componentArray = userProcessorcontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RegisterJPanel Registerjpanel = (RegisterJPanel) component;
        CardLayout layout = (CardLayout) userProcessorcontainer.getLayout();
        layout.previous(userProcessorcontainer);
        topPanel.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void RegisterjButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterjButtonMousePressed
        // TODO add your handling code here:
        
         Organization org = (Organization) orgComboBox.getSelectedItem();
        
        char[] passwordCharArray = jPasswordField2.getPassword();
        String password = String.valueOf(passwordCharArray);
        if (hospitaljComboBox.getSelectedIndex() == -1 || firstNameTxt.getText().isEmpty() || lastNameTxt.getText().isEmpty() || phoneTxt.getText().isEmpty() || ageTxt.getText().isEmpty() || ambulanceNumberTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields..");
            return;
        }
//        if(!randomCode.equalsIgnoreCase(verificationCodeTxt.getText())){
//            JOptionPane.showMessageDialog(null, "Verification Code is incorrect please enter correct code or click on verify to resend new code");  
//            return;
//        }
        if (!org.getUserAccountDirectory().checkIfUsernameIsUnique(usernameText.getText())) {
            JOptionPane.showMessageDialog(null, "User with this username already exist! Please try another UserName");
            return;
        }
        if (!system.isPasswordValid(password)) {
            JOptionPane.showMessageDialog(null, "Password must be between 3-20 characters. "
                    + "Lower case, upper case, digit and a special character should occur once.");
            return;
        }

        if (!system.checkIfUserIsUnique(usernameText.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter all fields..");
            return;
        }

        if (!ValidationUtility.isPhoneNumberValid(phoneTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide Contact number in format 123-456-7890 OR 123.456.7890 OR 123 456 7890");
            return;
        }
        Hospital selectedHospital = new Hospital();
        selectedHospital = system.getHospitalDirectory().getHospitalByName((String) hospitaljComboBox.getSelectedItem());

        //create ambulance criver object
        AmbulanceDriver ambDriver = new AmbulanceDriver();
        ambDriver.setDriverFirstName(firstNameTxt.getText());
        ambDriver.setDriverLastName(lastNameTxt.getText());
        ambDriver.setHospital(selectedHospital);
        ambDriver.setAge(Integer.parseInt(ageTxt.getText()));
        ambDriver.setPhoneNumber(phoneTxt.getText());
        ambDriver.setAmbulanceNumber(ambulanceNumberTxt.getText());
        ambDriver.setUserName(usernameText.getText());
        ambDriver.setId(system.getAmbulanceDriverDirectory().generateId());
        //save to db04
        Employee employee = org.getEmployeeDirectory().createEmployee(ambDriver.getDriverLastName() + ", " + ambDriver.getDriverFirstName());
        system.getAmbulanceDriverDirectory().add(ambDriver);
        UserAccount account = org.getUserAccountDirectory().createUserAccount(usernameText.getText(), password, employee, new AmbulanceDriverRole());
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Information Saved!");
    }//GEN-LAST:event_RegisterjButtonMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        
         userProcessorcontainer.remove(this);
        Component[] componentArray = userProcessorcontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RegisterJPanel Registerjpanel = (RegisterJPanel) component;
        CardLayout layout = (CardLayout) userProcessorcontainer.getLayout();
        layout.previous(userProcessorcontainer);
        topPanel.setVisible(true); 
    }//GEN-LAST:event_backMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisterjButton;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField ambulanceNumberTxt;
    private javax.swing.JLabel back;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<Object> enterpriseComboBox;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JComboBox<String> hospitaljComboBox;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JComboBox<Object> networkComboBox;
    private javax.swing.JComboBox<Object> orgComboBox;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel userNameTxt;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalDetails() {
        if (system.getHospitalDirectory() != null) {
            for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
                {
                    hospitaljComboBox.addItem(hospital.getName());
                }
            }
        }
    }
}
