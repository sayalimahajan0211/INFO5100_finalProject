/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.HospitalAdminRole;

import Business.Driver.AmbulanceDriver;
import Business.Driver.PrivateDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Hospital.Patient;
import Business.Hospital.PatientCareStaff;
import Business.Organization.Organization;
import Business.Status;
import Business.UserAccount.UserAccount;
import Business.Voluntary.CampAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.RegisterJPanel;
import Business.Voluntary.HospitalNgoRequests;


/**
 *
 * @author Yash
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    private Patient patient;
    private Hospital hospital;
    private EcoSystem system;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private Status status;
    //DB4OUtil dB4OUtil;
    private JPanel userProcessorcontainer;
    private AmbulanceDriver ambulancedriver;
    private HospitalNgoRequests requests;
    private CampAdmin campadmin;
    
    
    /**
     * Creates new form HospitalAdminWorkAreaJPanel
     */
    //AmbulanceDriver ambulancedriver, HospitalNgoRequests requests, CampAdmin campadmin
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Patient patient, Hospital hospital) {
        initComponents();
        this.hospital = hospital;
        this.ambulancedriver = ambulancedriver;
        this.requests = requests;
        this.campadmin = campadmin;
        this.patient = patient;
        this.account=account;
        this.system = system;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userProcessorcontainer = userProcessContainer;
        this.setSize(1680, 1050);
        
        txtbeds.setEnabled(false);
        txtrequests.setEnabled(false);
        txtbeds.setText(String.valueOf(hospital.getBedcount()));
        txtrequests.setText(String.valueOf(hospital.getRequestcount()));
        //txtbedrequirement.setText(String.valueOf(requests.getRequiredBeds()));
        populatePatientTable();
        
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
        txtrequests = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpcs = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblpatient = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblambulance = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtbeds = new javax.swing.JTextField();
        txtbedrequirement = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btncheckall = new javax.swing.JLabel();
        btnrequestcamp = new javax.swing.JLabel();
        btnacceptpatient1 = new javax.swing.JLabel();
        btnassignambulance = new javax.swing.JLabel();
        btnassignstaff = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 244, 244));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Patient Care Staff Data");
        add(jLabel2);
        jLabel2.setBounds(440, 490, 138, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Beds Available:");
        add(jLabel3);
        jLabel3.setBounds(660, 40, 90, 22);

        txtrequests.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrequestsActionPerformed(evt);
            }
        });
        add(txtrequests);
        txtrequests.setBounds(780, 80, 44, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Patient Data");
        add(jLabel4);
        jLabel4.setBounds(480, 110, 85, 22);

        tblpcs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Staff ID", "Staff Name", "Phone Number", "Email ID", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblpcs);

        add(jScrollPane2);
        jScrollPane2.setBounds(170, 520, 723, 100);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ambulance Data");
        add(jLabel5);
        jLabel5.setBounds(470, 300, 103, 22);

        tblpatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Patient Name", "Phone Number", "Address", "Email ID", "Patient Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblpatient);

        add(jScrollPane3);
        jScrollPane3.setBounds(100, 140, 880, 100);

        tblambulance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "AmbulanceID", "Ambulance Number", "Driver Name", "Phone Number", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblambulance);

        add(jScrollPane4);
        jScrollPane4.setBounds(170, 330, 723, 100);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Patient Requests:");
        add(jLabel6);
        jLabel6.setBounds(650, 80, 110, 14);

        txtbeds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbedsActionPerformed(evt);
            }
        });
        add(txtbeds);
        txtbeds.setBounds(780, 40, 44, 20);

        txtbedrequirement.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbedrequirement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbedrequirementActionPerformed(evt);
            }
        });
        add(txtbedrequirement);
        txtbedrequirement.setBounds(890, 40, 50, 20);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("HELLO HOSPITAL ADMIN!");
        add(jLabel7);
        jLabel7.setBounds(390, 30, 240, 24);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital (3).png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(590, 60, 230, 630);

        btncheckall.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btncheckall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btncheckall.setText("Check Accepted Patients");
        btncheckall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btncheckall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncheckallMousePressed(evt);
            }
        });
        add(btncheckall);
        btncheckall.setBounds(160, 90, 160, 30);

        btnrequestcamp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnrequestcamp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnrequestcamp.setText("Request Camp");
        btnrequestcamp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnrequestcamp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnrequestcampMousePressed(evt);
            }
        });
        add(btnrequestcamp);
        btnrequestcamp.setBounds(870, 80, 100, 20);

        btnacceptpatient1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnacceptpatient1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnacceptpatient1.setText("Accept Patient");
        btnacceptpatient1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnacceptpatient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnacceptpatient1MousePressed(evt);
            }
        });
        add(btnacceptpatient1);
        btnacceptpatient1.setBounds(460, 250, 120, 20);

        btnassignambulance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnassignambulance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnassignambulance.setText("Assign Ambulance");
        btnassignambulance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnassignambulance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnassignambulanceMousePressed(evt);
            }
        });
        add(btnassignambulance);
        btnassignambulance.setBounds(440, 440, 140, 20);

        btnassignstaff.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnassignstaff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnassignstaff.setText("Assign Staff");
        btnassignstaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnassignstaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnassignstaffMousePressed(evt);
            }
        });
        add(btnassignstaff);
        btnassignstaff.setBounds(440, 630, 120, 20);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hospital (7).png"))); // NOI18N
        add(jLabel13);
        jLabel13.setBounds(10, 10, 130, 130);
    }// </editor-fold>//GEN-END:initComponents

    private void btnassignambulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignambulanceActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_btnassignambulanceActionPerformed

    private void btnacceptpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptpatientActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_btnacceptpatientActionPerformed

    private void btnassignstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignstaffActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnassignstaffActionPerformed

    private void txtrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrequestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrequestsActionPerformed

    private void txtbedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbedsActionPerformed
        // TODO add your handling code here:     
        
    }//GEN-LAST:event_txtbedsActionPerformed

    private void btncheckallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckallActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btncheckallActionPerformed

    private void btnrequestcamp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrequestcamp1ActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_btnrequestcamp1ActionPerformed

    private void txtbedrequirementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbedrequirementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbedrequirementActionPerformed

    private void btnshowcampsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowcampsActionPerformed
        // TODO add your handling code here:
  
         
    }//GEN-LAST:event_btnshowcampsActionPerformed

    private void btncheckallMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncheckallMousePressed
        // TODO add your handling code here:
       
         CheckAllPatientStatusJPanel checkallpatientstatuspanel = new CheckAllPatientStatusJPanel( userProcessorcontainer,  account,  system, hospital, patient);
        userProcessorcontainer.add("checkAllCampPatientStatusJPanel", checkallpatientstatuspanel);
        CardLayout layout = (CardLayout) userProcessorcontainer.getLayout();
        layout.next(userProcessorcontainer);
    
    }//GEN-LAST:event_btncheckallMousePressed

    private void btnrequestcampMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnrequestcampMousePressed
        // TODO add your handling code here:
        
        if(txtbedrequirement.getText()==null || txtbedrequirement.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Plewse fillout bed requirement details");
            return;
        }
        HospitalNgoRequests requests=new HospitalNgoRequests(this.hospital, status.New, Integer.parseInt(txtbedrequirement.getText()));
        system.getnGODirectory().getHospitalNgoDirectory().addHospitalRequests(requests);
        JOptionPane.showMessageDialog(null, "Camp Request Sent!");
    }//GEN-LAST:event_btnrequestcampMousePressed

    private void btnacceptpatient1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnacceptpatient1MousePressed
        // TODO add your handling code here:
        
         int selectedRow = tblpatient.getSelectedRow();
        
        if (tblpatient.getSelectedRowCount()!=1){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblpatient.getModel();
       
        Integer patientId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        Patient p = system.getPatientDirectory().getPatientByID(patientId);
        if(!p.getPatientstatus().equalsIgnoreCase(status.Allocation.getValue())){
            JOptionPane.showMessageDialog(null,"Patient is already Allocated to hospital");
           return;
        }
        p.setPatientstatus(Status.Allocated.getValue());
        tblpatient.setValueAt(Status.Allocated.getValue(), selectedRow, 5);
        this.patient = p;
        this.hospital.setBedcount(this.hospital.getBedcount()-1);
        this.hospital.setRequestcount(this.hospital.getRequestcount()-1);
        txtbeds.setText(String.valueOf(hospital.getBedcount()));
        txtrequests.setText(String.valueOf(hospital.getRequestcount()));
        hospital.addPatient(patient);
        JOptionPane.showMessageDialog(null, "Patient Approved!");
        populateAmbulanceTable();
        populatePatientCareStaffTable();
        
    }//GEN-LAST:event_btnacceptpatient1MousePressed

    private void btnassignambulanceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnassignambulanceMousePressed
        // TODO add your handling code here:
         if(this.patient==null)
        {
         JOptionPane.showMessageDialog(null,"Please first allocate patient");
            return;   
        }
        int selectedRow = tblambulance.getSelectedRow();
        
        if (tblambulance.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null,"Please select a Ambulance driver for patient");
            return;
        }
        
        
        DefaultTableModel model = (DefaultTableModel) tblambulance.getModel();
        
        Integer ambulanceID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        AmbulanceDriver ambulancedriver = system.getAmbulanceDriverDirectory().getUserById(ambulanceID);
        this.patient.setAmbulancedriver(ambulancedriver);
        ambulancedriver.setAvailability(false);
        
        tblambulance.setValueAt(false, selectedRow, 4);
        JOptionPane.showMessageDialog(null, "Ambulance Assigned to the Patient!");
      
        //patient.setAmbulancedriver(account.getEmployee().getName());
        
        
    }//GEN-LAST:event_btnassignambulanceMousePressed

    private void btnassignstaffMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnassignstaffMousePressed
        // TODO add your handling code here:
        if(this.patient==null)
        {
         JOptionPane.showMessageDialog(null,"Please first allocate patient");
            return;   
        }
        if(this.patient.getAmbulancedriver()==null){
            JOptionPane.showMessageDialog(null,"Please first select a Ambulance for patient");
            return; 
        }
        int selectedRow = tblpcs.getSelectedRow();
        
       if (tblpcs.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null,"Please select a Patientcare staff for patient");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblpcs.getModel();
       
        Integer pcsId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        PatientCareStaff patientcarestaff = system.getPatientCareStaffDirectory().getPatientcarestaffByID(pcsId);
        this.patient.setPatientcarestaff(patientcarestaff);
        patientcarestaff.setAvailability(false);
        tblpcs.setValueAt(false, selectedRow, 4);
        JOptionPane.showMessageDialog(null, "Patient Care Staff Assigned to the Patient!");
    }//GEN-LAST:event_btnassignstaffMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnacceptpatient1;
    private javax.swing.JLabel btnassignambulance;
    private javax.swing.JLabel btnassignstaff;
    private javax.swing.JLabel btncheckall;
    private javax.swing.JLabel btnrequestcamp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblambulance;
    private javax.swing.JTable tblpatient;
    private javax.swing.JTable tblpcs;
    private javax.swing.JTextField txtbedrequirement;
    private javax.swing.JTextField txtbeds;
    private javax.swing.JTextField txtrequests;
    // End of variables declaration//GEN-END:variables

    public void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) tblpatient.getModel();
        model.setRowCount(0);
        //patientComboBox.addItem(Status.Approved.getValue());
        for (Patient patient : system.getPatientDirectory().getPatientDirectory()) {
            if (patient.getHospital() != null) {
                if (patient.getHospital().getHospitalID() == hospital.getHospitalID() && patient.getPatientstatus().equals(Status.Allocation.getValue())) {
                    Object[] row = new Object[6];
                    row[0] = patient.getPatientID();
                    row[1] = patient.getFirstname() + patient.getLastname();
                    row[2] = patient.getPhonenumber();
                    row[3] = patient.getStreetaddress() + patient.getCity() + patient.getZipcode();
                    row[4] = patient.getEmail();
                    row[5] = patient.getPatientstatus();
                    model.addRow(row);
                }
            }
        }
    }

    public void populateAmbulanceTable() {
        DefaultTableModel model = (DefaultTableModel) tblambulance.getModel();
        model.setRowCount(0);
        for (AmbulanceDriver ambulancedriver : system.getAmbulanceDriverDirectory().getAmbulanceDriverDirectory()) {
            if(this.hospital.getHospitalID()==ambulancedriver.getHospital().getHospitalID())
            if (ambulancedriver.getAvailability()) {
                Object[] row = new Object[5];
                row[0] = ambulancedriver.getId();
                row[1] = ambulancedriver.getAmbulanceNumber();
                row[2] = ambulancedriver.getDriverFirstName() + ambulancedriver.getDriverLastName();
                row[3] = ambulancedriver.getPhoneNumber();
                row[4] = ambulancedriver.getAvailability();

                model.addRow(row);
            }
        }
    }
    
    public void populatePatientCareStaffTable() {
        DefaultTableModel model = (DefaultTableModel) tblpcs.getModel();
        model.setRowCount(0);
        for (PatientCareStaff patientcarestaff : system.getPatientCareStaffDirectory().getPatientCareStaffDirectory()) {
            if(this.hospital.getHospitalID()==patientcarestaff.getHospital().getHospitalID())
            if (patientcarestaff.getAvailability()) {
                Object[] row = new Object[5];
                row[0] = patientcarestaff.getPatientcarestaffID();
                row[1] = patientcarestaff.getFirstname() + patientcarestaff.getLastname();
                row[2] = patientcarestaff.getPhonenumber();
                row[3] = patientcarestaff.getEmail();
                row[4] = patientcarestaff.getAvailability();

                model.addRow(row);

            }
        }
    }
}
