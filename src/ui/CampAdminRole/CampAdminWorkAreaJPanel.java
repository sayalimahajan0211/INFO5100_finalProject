/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CampAdminRole;

import Business.Driver.PrivateDriver;
import Business.EcoSystem;
import Business.Hospital.Patient;
import Business.Hospital.PatientCareStaff;
import Business.Status;
import Business.UserAccount.UserAccount;
import Business.Voluntary.CampAdmin;
import Business.Voluntary.HospitalNgoRequests;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;

/**
 *
 * @author aishwarya
 */
public class CampAdminWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem system;
    private CampAdmin ca;
    private Patient patient;

    /**
     * Creates new form CampAdminJPanel
     */
    public CampAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, CampAdmin ca) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.system = system;
        this.ca = ca;
        this.setSize(1680, 1050);
        populateRequestTable();
        populatePatientData();
        populateDrivers();
        populatePatientCareStaff();
        bedsAvailableText.setEnabled(false);
        patientReqTxt.setEnabled(false);
        bedsAvailableText.setText("" + ca.getAvailableBedCount());
        patientReqTxt.setText("" + system.getPatientDirectory().getPatientsRequestsByCamp(ca));
    }

    private void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) ngoReqTable.getModel();
        model.setRowCount(0);
        requestStatusComboBox.addItem(Status.Approved.getValue());
        for (HospitalNgoRequests requests : system.getnGODirectory().getHospitalNgoDirectory().getHospitalRequests()) {
            if (requests.getCampAdmin().getId() == ca.getId()) {
                Object[] row = new Object[7];
                row[0] = requests.getId();
                row[1] = requests.getHospital().getName();
                row[2] = requests.getNgo().getName();
                row[3] = requests.getRequiredBeds();
                row[4] = requests.getStatus().getValue();
                row[5] = requests.getHospital().getStreetaddress() + ", " + requests.getHospital().getCity() + ", " + requests.getHospital().getZipcode();
                row[6] = requests.getRequestTime();
                model.addRow(row);
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

        requestStatusComboBox = new javax.swing.JComboBox<>();
        patientComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngoReqTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        privateDriverTable = new javax.swing.JTable();
        campLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bedsAvailableText = new javax.swing.JTextField();
        patientReqTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientCareSTaffTable = new javax.swing.JTable();
        btncheckall = new javax.swing.JLabel();
        assignStaffBtn = new javax.swing.JLabel();
        acceptReqBtn = new javax.swing.JLabel();
        approvePatientBtn = new javax.swing.JLabel();
        assignPvtDriverBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        requestStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        patientComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jPanel1.setBackground(new java.awt.Color(255, 244, 244));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 609, -1, -1));

        ngoReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Hospital Name", "NGO Name", "Required Bed Count", "Request Status", "Location", "Request Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ngoReqTable);
        if (ngoReqTable.getColumnModel().getColumnCount() > 0) {
            ngoReqTable.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(requestStatusComboBox));
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 133, 965, 90));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("HELLO CAMP ADMIN!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 206, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("NGO Requests");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, -1, -1));

        campLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campLabel.setText("Patient Data ");
        jPanel1.add(campLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Phone Number", "Address", "Email ID", "Patient Request Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(patientTable);
        if (patientTable.getColumnModel().getColumnCount() > 0) {
            patientTable.getColumnModel().getColumn(0).setHeaderValue("Patient ID");
            patientTable.getColumnModel().getColumn(1).setHeaderValue("Patient Name");
            patientTable.getColumnModel().getColumn(2).setHeaderValue("Phone Number");
            patientTable.getColumnModel().getColumn(3).setHeaderValue("Address");
            patientTable.getColumnModel().getColumn(4).setHeaderValue("Email ID");
            patientTable.getColumnModel().getColumn(5).setHeaderValue("Patient Request Status");
            patientTable.getColumnModel().getColumn(5).setCellEditor(new DefaultCellEditor(patientComboBox));
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 965, 90));

        privateDriverTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Driver ID", "Driver Name", "Vehicle Number", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(privateDriverTable);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 965, 90));

        campLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        campLabel1.setText("Private Driver List");
        jPanel1.add(campLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Beds Available:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Patient Requests:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        bedsAvailableText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bedsAvailableText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedsAvailableTextActionPerformed(evt);
            }
        });
        jPanel1.add(bedsAvailableText, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 50, 50, -1));

        patientReqTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        patientReqTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientReqTxtActionPerformed(evt);
            }
        });
        jPanel1.add(patientReqTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, 50, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Patient Care Staff Data");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, -1, 22));

        patientCareSTaffTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Name", "Phone Number", "Email ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientCareSTaffTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 965, 90));

        btncheckall.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncheckall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncheckall.setText("Check Accepted Patients");
        btncheckall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btncheckall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncheckallMousePressed(evt);
            }
        });
        jPanel1.add(btncheckall, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, 30));

        assignStaffBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assignStaffBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignStaffBtn.setText("Assign Staff");
        assignStaffBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        assignStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assignStaffBtnMousePressed(evt);
            }
        });
        jPanel1.add(assignStaffBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 740, 120, 20));

        acceptReqBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        acceptReqBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acceptReqBtn.setText("Accept Request");
        acceptReqBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        acceptReqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acceptReqBtnMousePressed(evt);
            }
        });
        jPanel1.add(acceptReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 120, 20));

        approvePatientBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        approvePatientBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        approvePatientBtn.setText("Approve Patient");
        approvePatientBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        approvePatientBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                approvePatientBtnMousePressed(evt);
            }
        });
        jPanel1.add(approvePatientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 120, 20));

        assignPvtDriverBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assignPvtDriverBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        assignPvtDriverBtn.setText("Assign Private Driver");
        assignPvtDriverBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        assignPvtDriverBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                assignPvtDriverBtnMousePressed(evt);
            }
        });
        jPanel1.add(assignPvtDriverBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 140, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/building.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 510, 850));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/office-building.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populatePatientData() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        patientComboBox.addItem(Status.Approved.getValue());
        for (Patient p : system.getPatientDirectory().getPatientDirectory()) {
            if (p.getCampadmin() != null) {
                if (p.getCampadmin().getId() == ca.getId() && p.getPatientstatus().equals(Status.Allocation.getValue())) {
                    Object[] row = new Object[6];
                    row[0] = p.getPatientID();
                    row[1] = p.getFirstname() + " " + p.getLastname();
                    row[2] = p.getPhonenumber();
                    row[3] = p.getStreetaddress() + ", " + p.getCity() + ", " + p.getZipcode();
                    row[4] = p.getEmail();
                    row[5] = p.getPatientstatus();
                    model.addRow(row);
                }
            }
        }
    }

    private void populateDrivers() {
        DefaultTableModel model = (DefaultTableModel) privateDriverTable.getModel();
        model.setRowCount(0);
        for (PrivateDriver p : system.getPrivateDriverDirectory().getPrivateDriverDirectory()) {
            if (p.isIsAuthorized() && p.isIsAvailable()) {
                Object[] row = new Object[6];
                row[0] = p.getId();
                row[1] = p.getDriverFirstName() + " " + p.getDriverLastName();
                row[2] = p.getPrivateVehicleNumber();
                row[3] = p.getPhoneNumber();
                row[4] = p.isIsAvailable();
                model.addRow(row);
            }
        }
    }

    private void populatePatientCareStaff() {
        DefaultTableModel model = (DefaultTableModel) patientCareSTaffTable.getModel();
        model.setRowCount(0);
        for (PatientCareStaff p : system.getPatientCareStaffDirectory().getPatientCareStaffDirectory()) {
            if (p.getAvailability()) {
                Object[] row = new Object[6];
                row[0] = p.getPatientcarestaffID();
                row[1] = p.getFirstname() + " " + p.getLastname();
                row[2] = p.getPhonenumber();
                row[3] = p.getEmail();
                row[4] = p.getAvailability();
                model.addRow(row);
            }
        }
    }

    private void bedsAvailableTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedsAvailableTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_bedsAvailableTextActionPerformed

    private void patientReqTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientReqTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientReqTxtActionPerformed

    private void btncheckallMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncheckallMousePressed
        // TODO add your handling code here:

        CheckAllCampPatientStatusJPanel j = new CheckAllCampPatientStatusJPanel(userProcessContainer, account, system, ca);
        userProcessContainer.add("checkAllCampPatientStatusJPanel", j);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btncheckallMousePressed

    private void acceptReqBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptReqBtnMousePressed
        // TODO add your handling code here:
        if (ngoReqTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please select only one row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (ngoReqTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, There are no NGO Requests as of now.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) ngoReqTable.getModel();
        int selectedRowInd = ngoReqTable.getSelectedRow();
        String requestStatus = model.getValueAt(selectedRowInd, 4).toString();
        if (requestStatus.equals("In Progress")) {
            Integer requestId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
            HospitalNgoRequests requests = system.getnGODirectory().getHospitalNgoDirectory().findRequestByID(requestId);
            requests.setStatus(Status.Approved);
            ca.setHospital(requests.getHospital());
            ca.setNgo(requests.getNgo());
            ngoReqTable.setValueAt(Status.Approved.getValue(), selectedRowInd, 4);
        } else if (requestStatus.equals("Approved")) {
            JOptionPane.showMessageDialog(null, "You have already approved the request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        JOptionPane.showMessageDialog(null, "Accepted NGO request!");
    }//GEN-LAST:event_acceptReqBtnMousePressed

    private void approvePatientBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approvePatientBtnMousePressed
        // TODO add your handling code here:
        if (patientTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please select only one row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (patientTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, There are no Patient Requests as of now.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        int selectedRowInd = patientTable.getSelectedRow();
        Integer patientId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
        Patient p = system.getPatientDirectory().getPatientByID(patientId);
        if (p.getPatientstatus() != Status.Allocated.getValue()) {
            p.setPatientstatus(Status.Allocated.getValue());
            patientTable.setValueAt(Status.Allocated.getValue(), selectedRowInd, 5);
            this.patient = p;
            ca.assignPatientABed(p);
            JOptionPane.showMessageDialog(null, "Approved Patient!");
        } else {
            JOptionPane.showMessageDialog(null, "You have already approved the Patient!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_approvePatientBtnMousePressed

    private void assignPvtDriverBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignPvtDriverBtnMousePressed
        // TODO add your handling code here:
        if (privateDriverTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, There are no Private Drivers Available as of now.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (privateDriverTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) privateDriverTable.getModel();
        int selectedRowInd = privateDriverTable.getSelectedRow();
        Integer pvtDrivId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
        PrivateDriver pd = system.getPrivateDriverDirectory().getUserById(pvtDrivId);
        if (this.patient != null) {
            this.patient.setPrivatedriver(pd);
            pd.setIsAvailable(false);
            JOptionPane.showMessageDialog(null, "Private Driver Assigned to the Patient!");
            populateDrivers();
        } else if (this.patient == null) {
            JOptionPane.showMessageDialog(null, "Please approve a Patient to assign a Private Driver!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "You have already assigned the Private Driver to the Patient!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_assignPvtDriverBtnMousePressed

    private void assignStaffBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignStaffBtnMousePressed
        // TODO add your handling code here:

        if (patientCareSTaffTable.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, There are no Patient Care Staff available as of now.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (patientCareSTaffTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) patientCareSTaffTable.getModel();
        int selectedRowInd = patientCareSTaffTable.getSelectedRow();
        Integer staffId = Integer.parseInt(model.getValueAt(selectedRowInd, 0).toString());
        PatientCareStaff ps = system.getPatientCareStaffDirectory().getPatientcarestaffByID(staffId);
        if (this.patient != null) {
            this.patient.setPatientcarestaff(ps);
            ps.setAvailability(false);
            JOptionPane.showMessageDialog(null, "Patient Care Staff assigned to the Patient!");
            populatePatientCareStaff();
        } else if (this.patient == null) {
            JOptionPane.showMessageDialog(null, "Please approve a Patient to assign a Patient Care Staff!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "You have already assigned the Patient Care Staff to the Patient!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_assignStaffBtnMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceptReqBtn;
    private javax.swing.JLabel approvePatientBtn;
    private javax.swing.JLabel assignPvtDriverBtn;
    private javax.swing.JLabel assignStaffBtn;
    private javax.swing.JTextField bedsAvailableText;
    private javax.swing.JLabel btncheckall;
    private javax.swing.JLabel campLabel;
    private javax.swing.JLabel campLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable ngoReqTable;
    private javax.swing.JTable patientCareSTaffTable;
    private javax.swing.JComboBox<String> patientComboBox;
    private javax.swing.JTextField patientReqTxt;
    private javax.swing.JTable patientTable;
    private javax.swing.JTable privateDriverTable;
    private javax.swing.JComboBox<String> requestStatusComboBox;
    // End of variables declaration//GEN-END:variables
}
