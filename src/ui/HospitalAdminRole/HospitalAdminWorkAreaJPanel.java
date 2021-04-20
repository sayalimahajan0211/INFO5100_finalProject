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
        this.system = system;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userProcessorcontainer = userProcessContainer;
        
        
        txtbeds.setText(String.valueOf(hospital.getBedcount()));
        txtrequests.setText(String.valueOf(hospital.getRequestcount()));
        txtbedrequirement.setText(String.valueOf(requests.getRequiredBeds()));
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

        btnback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtrequests = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnassignambulance = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpcs = new javax.swing.JTable();
        btnacceptpatient = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblpatient = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblambulance = new javax.swing.JTable();
        btnassignstaff = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtbeds = new javax.swing.JTextField();
        btnshowcamps = new javax.swing.JButton();
        btncheckall = new javax.swing.JButton();
        btnrequestcamp1 = new javax.swing.JButton();
        txtbedrequirement = new javax.swing.JTextField();

        setLayout(null);

        btnback.setText("<<Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        add(btnback);
        btnback.setBounds(42, 27, 89, 29);

        jLabel1.setText("Hospital Admin Work Area");
        add(jLabel1);
        jLabel1.setBounds(320, 20, 166, 27);

        jLabel2.setText("Patient Care Staff Data");
        add(jLabel2);
        jLabel2.setBounds(390, 520, 138, 22);

        jLabel3.setText("Beds Available:");
        add(jLabel3);
        jLabel3.setBounds(567, 29, 80, 22);

        txtrequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrequestsActionPerformed(evt);
            }
        });
        add(txtrequests);
        txtrequests.setBounds(688, 70, 44, 26);

        jLabel4.setText("Patient Data");
        add(jLabel4);
        jLabel4.setBounds(407, 115, 85, 22);

        btnassignambulance.setText("Assign Ambulance");
        btnassignambulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignambulanceActionPerformed(evt);
            }
        });
        add(btnassignambulance);
        btnassignambulance.setBounds(390, 480, 138, 29);

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
        jScrollPane2.setBounds(90, 550, 723, 112);

        btnacceptpatient.setText("Accept Patient");
        btnacceptpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacceptpatientActionPerformed(evt);
            }
        });
        add(btnacceptpatient);
        btnacceptpatient.setBounds(400, 290, 133, 29);

        jLabel5.setText("Ambulance Data");
        add(jLabel5);
        jLabel5.setBounds(407, 336, 103, 22);

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
        jScrollPane3.setBounds(20, 160, 906, 119);

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
        jScrollPane4.setBounds(86, 364, 723, 112);

        btnassignstaff.setText("Assign Staff");
        btnassignstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignstaffActionPerformed(evt);
            }
        });
        add(btnassignstaff);
        btnassignstaff.setBounds(720, 510, 118, 29);

        jLabel6.setText("Patient Requests:");
        add(jLabel6);
        jLabel6.setBounds(567, 73, 122, 20);

        txtbeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbedsActionPerformed(evt);
            }
        });
        add(txtbeds);
        txtbeds.setBounds(688, 30, 44, 26);

        btnshowcamps.setText("Show Camps");
        btnshowcamps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowcampsActionPerformed(evt);
            }
        });
        add(btnshowcamps);
        btnshowcamps.setBounds(800, 90, 140, 29);

        btncheckall.setText("Check Accepted Patients");
        btncheckall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncheckallActionPerformed(evt);
            }
        });
        add(btncheckall);
        btncheckall.setBounds(120, 90, 160, 29);

        btnrequestcamp1.setText("Request Camp");
        btnrequestcamp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrequestcamp1ActionPerformed(evt);
            }
        });
        add(btnrequestcamp1);
        btnrequestcamp1.setBounds(800, 50, 140, 29);

        txtbedrequirement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbedrequirementActionPerformed(evt);
            }
        });
        add(txtbedrequirement);
        txtbedrequirement.setBounds(830, 20, 50, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        // TODO add your handling code here:
        userProcessorcontainer.remove(this);
        Component[] componentArray = userProcessorcontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RegisterJPanel Registerjpanel = (RegisterJPanel) component;
        CardLayout layout = (CardLayout) userProcessorcontainer.getLayout();
        layout.previous(userProcessorcontainer);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnassignambulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignambulanceActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblambulance.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
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
        
        

    }//GEN-LAST:event_btnassignambulanceActionPerformed

    private void btnacceptpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacceptpatientActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblpatient.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblpatient.getModel();
       
        Integer patientId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        Patient p = system.getPatientDirectory().getPatientByID(patientId);
        p.setStatus(Status.Allocated);
        tblpatient.setValueAt(Status.Allocated.getValue(), selectedRow, 5);
        this.patient = p;
        hospital.addPatient(patient);
        JOptionPane.showMessageDialog(null, "Patient Approved!");
        
        populateAmbulanceTable();
        populatePatientCareStaffTable();
        
    }//GEN-LAST:event_btnacceptpatientActionPerformed

    private void btnassignstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignstaffActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblambulance.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblpcs.getModel();
       
        Integer pcsId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        PatientCareStaff patientcarestaff = system.getPatientCareStaffDirectory().getPatientcarestaffByID(pcsId);
        this.patient.setPatientcarestaff(patientcarestaff);
        patientcarestaff.setAvailability(false);
        tblpcs.setValueAt(false, selectedRow, 4);
        JOptionPane.showMessageDialog(null, "Patient Care Staff Assigned to the Patient!");
    }//GEN-LAST:event_btnassignstaffActionPerformed

    private void txtrequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrequestsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrequestsActionPerformed

    private void txtbedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbedsActionPerformed
        // TODO add your handling code here:     
        
    }//GEN-LAST:event_txtbedsActionPerformed

    private void btncheckallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncheckallActionPerformed
        // TODO add your handling code here:
        CheckAllPatientStatusJPanel checkallpatientstatuspanel = new CheckAllPatientStatusJPanel( userProcessorcontainer,  account,  system, hospital, patient);
        userProcessorcontainer.add("checkAllCampPatientStatusJPanel", checkallpatientstatuspanel);
        CardLayout layout = (CardLayout) userProcessorcontainer.getLayout();
        layout.next(userProcessorcontainer);
    }//GEN-LAST:event_btncheckallActionPerformed

    private void btnrequestcamp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrequestcamp1ActionPerformed
        // TODO add your handling code here:
        if(txtbedrequirement.getText()==null || txtbedrequirement.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Plewse fillout bed requirement details");
            return;
        }
        HospitalNgoRequests requests=new HospitalNgoRequests(this.hospital, status.New, Integer.parseInt(txtbedrequirement.getText()));
//        requests.setHospital(this.hospital);  //hospital.getName();
//        requests.setStatus(status.New); //status.New.getValue();
//        requests.setRequiredBeds(Integer.parseInt(txtbedrequirement.getText()));
        //requests.setRequiredBeds();
        system.getnGODirectory().getHospitalNgoDirectory().addHospitalRequests(requests);
        JOptionPane.showMessageDialog(null, "Camp Request Sent!");

    }//GEN-LAST:event_btnrequestcamp1ActionPerformed

    private void txtbedrequirementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbedrequirementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbedrequirementActionPerformed

    private void btnshowcampsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowcampsActionPerformed
        // TODO add your handling code here:
        ShowCampsJPanel showcampspanel = new ShowCampsJPanel(userProcessorcontainer, account, system, hospital, campadmin);
        userProcessorcontainer.add("ShowCampsJPanel", showcampspanel);
        CardLayout layout = (CardLayout) userProcessorcontainer.getLayout();
        layout.next(userProcessorcontainer);
         
    }//GEN-LAST:event_btnshowcampsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceptpatient;
    private javax.swing.JButton btnassignambulance;
    private javax.swing.JButton btnassignstaff;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncheckall;
    private javax.swing.JButton btnrequestcamp1;
    private javax.swing.JButton btnshowcamps;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
