/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PrivateDriverRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Driver.PrivateDriver;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.PrivateDriverRole;
import Business.UserAccount.UserAccount;
import Business.Voluntary.CampAdmin;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Component;
import ui.RegisterJPanel;

/**
 *
 * @author aishwarya
 */
public class PrivateDriverRegistrationJPanel extends javax.swing.JPanel {

    private static EcoSystem system;
    private static DB4OUtil dB4OUtil;
    private static JPanel userProcessorcontainer;
    private byte[] dlImageArray;
    private JPanel topPanel;
    /**
     * Creates new form AmbulanceDriverRegistrationJPanel
     */

    public PrivateDriverRegistrationJPanel(JPanel container,JPanel topPanel, EcoSystem system, DB4OUtil dB4OUtil) {
        initComponents();
        this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.topPanel=topPanel;
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
            if (Organization.Type.PrivateDriver.getValue().equals(organization.getType().getValue())) {
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
        lastNameTxt = new javax.swing.JTextField();
        ambulanceNumberTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        phoneTxt = new javax.swing.JTextField();
        userNamelbl = new javax.swing.JLabel();
        passwordlbl = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        campjComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        emailTxt1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        uploadsuccessLabel = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        orgComboBox = new javax.swing.JComboBox<>();
        enterpriseComboBox = new javax.swing.JComboBox<>();
        networkComboBox = new javax.swing.JComboBox<>();
        RegisterjButton = new javax.swing.JLabel();
        uploadjButton = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("First Name :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Last Name :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phone Number :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Age :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ambulance Number :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("CampSite :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        lastNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTxtActionPerformed(evt);
            }
        });
        add(lastNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 168, -1));

        ambulanceNumberTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambulanceNumberTxtActionPerformed(evt);
            }
        });
        add(ambulanceNumberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 530, 168, -1));

        ageTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTxtActionPerformed(evt);
            }
        });
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 168, -1));

        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });
        add(firstNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 170, -1));

        phoneTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTxtActionPerformed(evt);
            }
        });
        add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 168, -1));

        userNamelbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userNamelbl.setText("UserName :");
        add(userNamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        passwordlbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passwordlbl.setText("Password :");
        add(passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));
        add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 170, -1));

        add(campjComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 170, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel9.setText("upload driving license photo (.jpeg or .png)");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, -1, 16));
        add(emailTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Driving License Number: ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, -1, -1));
        add(uploadsuccessLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 180, 19));
        add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 170, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Network:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Enterprise:");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Organization:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        add(orgComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 170, -1));

        enterpriseComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseComboBoxActionPerformed(evt);
            }
        });
        add(enterpriseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 170, -1));

        networkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboBoxActionPerformed(evt);
            }
        });
        add(networkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 170, -1));

        RegisterjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RegisterjButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterjButton.setText("Submit");
        RegisterjButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RegisterjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterjButtonMousePressed(evt);
            }
        });
        add(RegisterjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 780, 100, 30));

        uploadjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        uploadjButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        uploadjButton.setText("Upload");
        uploadjButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uploadjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                uploadjButtonMousePressed(evt);
            }
        });
        add(uploadjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 700, 80, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("PLEASE FILL THE FORM FOR REGISTRATION");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/driver.png"))); // NOI18N
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 270, 340));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 50));

        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CampsitejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampsitejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampsitejComboBoxActionPerformed

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

    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else {
            return "";
        }
    }


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

    private void RegisterjButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterjButtonMousePressed
        // TODO add your handling code here:
        
        Organization org = (Organization) orgComboBox.getSelectedItem();
        char[] passwordCharArray = passwordTxt.getPassword();
        String password = String.valueOf(passwordCharArray);
        if (campjComboBox.getSelectedIndex() == -1 || firstNameTxt.getText().isEmpty() || lastNameTxt.getText().isEmpty() || phoneTxt.getText().isEmpty() || ageTxt.getText().isEmpty() || ambulanceNumberTxt.getText().isEmpty() || usernameTxt.getText().isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields..");
            return;
        }
//        if(!randomCode.equalsIgnoreCase(verificationCodeTxt.getText())){
//            JOptionPane.showMessageDialog(null, "Verification Code is incorrect please enter correct code or click on verify to resend new code");  
//            return;
//        }
        if (!org.getUserAccountDirectory().checkIfUsernameIsUnique(usernameTxt.getText())) {
            JOptionPane.showMessageDialog(null, "User with this username already exist! Please try another UserName");
            return;
        }
        if (!system.isPasswordValid(password)) {
            JOptionPane.showMessageDialog(null, "Password muct be between 3-20 characters. "
                    + "Lower case, upper case, digit and a special character should occur once.");
            return;
        }

        if (!this.system.isPhoneNumberValid(phoneTxt.getText())) {
            JOptionPane.showMessageDialog(null, "Please provide Contact number in format 123-456-7890 OR 123.456.7890 OR 123 456 7890");
            return;
        }
        CampAdmin selectedCamp = new CampAdmin();
        selectedCamp = system.getCampAdminDirectory().getCampAdminByName((String) campjComboBox.getSelectedItem());

        //create Private Driver object
        PrivateDriver privateDriver = new PrivateDriver();
        privateDriver.setDriverFirstName(firstNameTxt.getText());
        privateDriver.setDriverLastName(lastNameTxt.getText());
        privateDriver.setAssociatedCampAdmin(selectedCamp);
        privateDriver.setAge(Integer.parseInt(ageTxt.getText()));
        privateDriver.setPhoneNumber(phoneTxt.getText());
        privateDriver.setPrivateVehicleNumber(ambulanceNumberTxt.getText());
        privateDriver.setIsAuthorized(false);
        privateDriver.setLicImage(dlImageArray);
        privateDriver.setUserName(usernameTxt.getText());
        privateDriver.setId(system.getPatientDirectory().generateID());
        //save to db04
        Employee employee = org.getEmployeeDirectory().createEmployee(privateDriver.getDriverLastName() + ", " + privateDriver.getDriverFirstName());
        system.getPrivateDriverDirectory().add(privateDriver);
        system.getPrivateDriverDirectory().getPrivateDriverDirectory().add(privateDriver);
        UserAccount account = org.getUserAccountDirectory().createUserAccount(usernameTxt.getText(), password, employee, new PrivateDriverRole());
        dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Information saved successfully");

    }//GEN-LAST:event_RegisterjButtonMousePressed

    private void uploadjButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadjButtonMousePressed
        // TODO add your handling code here:
        
        JFileChooser uploadImage = new JFileChooser();
        uploadImage.showOpenDialog(null);
        File f = uploadImage.getSelectedFile();
        String fileExt = getFileExtension(f);
        if (!(fileExt.toLowerCase().equals("png") || fileExt.toLowerCase().equals("jpeg"))) {
            JOptionPane.showMessageDialog(null, "Please upload only Jpeg or png file");
            return;
        }
        //additional code
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(f.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileName = f.getAbsolutePath();
        uploadsuccessLabel.setText("file Uploaded Successfully");

        try {

            File imageFile = new File(fileName);
            FileInputStream fis = new FileInputStream(imageFile);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] writetoArray = new byte[1024];
            for (int read; (read = fis.read(writetoArray)) != -1;) {
                bos.write(writetoArray, 0, read);
            }
            dlImageArray = bos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_uploadjButtonMousePressed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel RegisterjButton;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JTextField ambulanceNumberTxt;
    private javax.swing.JLabel back;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox<String> campjComboBox;
    private javax.swing.JTextField emailTxt1;
    private javax.swing.JComboBox<Object> enterpriseComboBox;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JComboBox<Object> networkComboBox;
    private javax.swing.JComboBox<Object> orgComboBox;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JLabel uploadjButton;
    private javax.swing.JLabel uploadsuccessLabel;
    private javax.swing.JLabel userNamelbl;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables

    private void populateHospitalDetails() {
        if (system.getCampAdminDirectory().getCampadminList()!=null) {
            for (CampAdmin camp : system.getCampAdminDirectory().getCampadminList()) {
                {
                    campjComboBox.addItem(camp.getName());
                }
            }
        }
    }
}
