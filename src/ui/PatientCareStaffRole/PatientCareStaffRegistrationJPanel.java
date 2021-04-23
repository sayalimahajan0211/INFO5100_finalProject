/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientCareStaffRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Hospital.Hospital;
import Business.Hospital.Patient;
import Business.Hospital.PatientCareStaff;
import Business.Hospital.PatientCareStaffDirectory;
import Business.Role.PatientCareStaffRole;
import Business.UserAccount.UserAccount;
import Business.ValidationUtility;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ui.RegisterJPanel;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;

/**
 *
 * @author aishwarya
 */
public class PatientCareStaffRegistrationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Patient patient;
    private Hospital hospital;
    private ValidationUtility validation;
    private EcoSystem system;
    private static DB4OUtil dB4OUtil;
    private static JPanel userProcessorcontainer;
    private JPanel topPanel;

    /**
     * Creates new form AmbulanceDriverRegistrationJPanel
     */
    public PatientCareStaffRegistrationJPanel(JPanel container, JPanel topPanel, EcoSystem ecosystem, DB4OUtil dB4OUtil) {
        initComponents();
        this.system = ecosystem;
        this.dB4OUtil = dB4OUtil;
        this.topPanel=topPanel;
        this.userProcessContainer = container;
        populateNetworkComboBox();
        populateHospitalDetails();
        this.setSize(1680, 1050);
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
            if (Enterprise.EnterpriseType.Hospital.getValue().equals(enterprise.getEnterpriseType().getValue())) {
                enterpriseComboBox.addItem(enterprise);
            }
        }

    }

    public void popOrganizationComboBox(Enterprise enterprise) {
        orgComboBox.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (Organization.Type.PatientCareStaff.getValue().equals(organization.getType().getValue())) {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtemailid = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        passwordfield = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        combohospital = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox<>();
        enterpriseComboBox = new javax.swing.JComboBox<>();
        networkComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btnregister = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("First Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, 23));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phone number:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 90, 23));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Last Name:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, 23));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Email Address:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 90, 23));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("UserName:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, -1, 23));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Password:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 60, 23));

        txtfname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfnameActionPerformed(evt);
            }
        });
        add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 220, -1));

        txtlname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtlnameActionPerformed(evt);
            }
        });
        add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 220, -1));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 220, -1));

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 220, -1));

        txtemailid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailidActionPerformed(evt);
            }
        });
        add(txtemailid, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 220, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 31, 80, -1));

        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });
        add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, 220, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Hospital :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        combohospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combohospitalActionPerformed(evt);
            }
        });
        add(combohospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 220, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Network:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Enterprise:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Organization:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 220, -1));

        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 220, -1));

        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 220, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("PLEASE FILL THE FORM FOR REGISTRATION");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        btnregister.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnregister.setText("Submit");
        btnregister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnregisterMousePressed(evt);
            }
        });
        add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 550, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nurse.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 240, 310));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 40, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void txtfnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfnameActionPerformed

    private void txtlnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtlnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtlnameActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void txtemailidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailidActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RegisterJPanel Registerjpanel = (RegisterJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        topPanel.setVisible(true);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

    private void combohospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combohospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combohospitalActionPerformed

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

    private void btnregisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnregisterMousePressed
        // TODO add your handling code here:
        
        Organization org = (Organization) orgComboBox.getSelectedItem();
        PatientCareStaffDirectory dir = system.getPatientCareStaffDirectory();
        PatientCareStaff p = new PatientCareStaff(hospital, patient);
        char[] passwordCharArray = passwordfield.getPassword();
        String password = String.valueOf(passwordCharArray);

        if (txtfname.getText().isEmpty() || txtfname.getText().isEmpty() || txtusername.getText().isEmpty()
                || password.isEmpty() || txtemailid.getText().isEmpty()
                || txtphone.getText().isEmpty() || combohospital.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        boolean flagfname = validation.isNameValid(txtfname.getText());
        boolean flaglname = validation.isNameValid(txtlname.getText());

        if (flagfname == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have integer values!");
            return;
        } else {
            p.setFirstname(txtfname.getText());
        }

        if (flaglname == false) {
            JOptionPane.showMessageDialog(null, "Last name cannot have integer values!");
            return;
        } else {
            p.setLastname(txtlname.getText());
        }

        boolean flagusername = validation.isUserNameValid(txtusername.getText());

        if (flagusername == false) {
            JOptionPane.showMessageDialog(null, "Username must be unique!");
            return;
        } else {
            p.setUsername(txtusername.getText());
        }

        boolean flagpassword = validation.isPasswordValid(passwordfield.getText());

        if (flagpassword == false) {
            JOptionPane.showMessageDialog(null, "Password must have atleast a digit, a special symbol, uppercase and lowercase!");
            return;
        } else {
            p.setPassword(password);
        }

        boolean flagemailid = validation.isEmailAddressValid(txtemailid.getText());

        if (flagemailid == false) {
            JOptionPane.showMessageDialog(null, "Check email address format!");
            return;
        } else {
            p.setEmail(txtemailid.getText());
        }

        boolean flagphonenumber = validation.isPhoneNumberValid(txtphone.getText());

        if (flagphonenumber == false) {
            JOptionPane.showMessageDialog(null, "Zipcode must have 10 digits! Check the format!");
            return;
        } else {
            p.setPhonenumber(txtphone.getText());
        }

        Hospital selectedHospital = new Hospital();
        selectedHospital = system.getHospitalDirectory().getHospitalByName((String) combohospital.getSelectedItem());
        p.setHospital(selectedHospital);

        for (UserAccount account : org.getUserAccountDirectory().getUserAccountList()) {
            if (account.getUsername().equals(txtusername.getText())) {
                JOptionPane.showMessageDialog(null, "Username Already exists!");
                return;
            }
        }

        if (ValidationUtility.isUserNameValid(txtusername.getText())) {
            if (ValidationUtility.isPasswordValid(password)) {
                if (org.getUserAccountDirectory().checkIfUsernameIsUnique(txtusername.getText())) {
                    p.setUsername(txtusername.getText());
                    org.getUserAccountDirectory()
                            .createUserAccount(txtusername.getText(), password, org.getEmployeeDirectory().createEmployee(txtfname.getText()), new PatientCareStaffRole());
                } else {
                    JOptionPane.showMessageDialog(null, "UserName already in use. Please try something else!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please provide proper Password!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please provide proper User Name!");
        }

        dir.addPatientCareStaff(p);

        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Information Saved!");
    }//GEN-LAST:event_btnregisterMousePressed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        this.setVisible(false);
        userProcessContainer.setVisible(true);
    }//GEN-LAST:event_backMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnregister;
    private javax.swing.JComboBox<String> combohospital;
    private javax.swing.JComboBox<Object> enterpriseComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<Object> networkComboBox;
    private javax.swing.JComboBox<Object> orgComboBox;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField txtemailid;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalDetails() {
        if (system.getHospitalDirectory() != null) {
            for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
                {
                    combohospital.addItem(hospital.getName());
                }
            }
        }
    }
}
