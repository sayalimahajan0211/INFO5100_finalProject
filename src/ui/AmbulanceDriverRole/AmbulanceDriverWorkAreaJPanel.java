/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AmbulanceDriverRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Driver.AmbulanceDriver;
import Business.Driver.PrivateDriver;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Patient;
import Business.Organization.AmbulanceDriverOrganization;
import Business.Organization.Organization;
import Business.Status;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.PatientCareStaffRole.*;

/**
 *
 * @author Yash
 */
public class AmbulanceDriverWorkAreaJPanel extends javax.swing.JPanel {

      private static EcoSystem system;
    private static DB4OUtil dB4OUtil;
    private static JPanel userProcessorcontainer;
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private Status status;
    private AmbulanceDriver ambulanceDriverLogin;
    /**
     * Creates new form AmbulanceDriverWorkAreaJPanel
     */
    

    public AmbulanceDriverWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AmbulanceDriverOrganization ambulanceDriverOrganization, Enterprise enterprise,AmbulanceDriver ambulanceDriverLogin) {
      initComponents();
         this.system = system;
        this.dB4OUtil = dB4OUtil;
        this.userProcessorcontainer = userProcessContainer;
    this.userProcessContainer=userProcessContainer;
    this.account=account;
    this.organization=organization;
    this.enterprise=enterprise;
    this.business=business;
    this.ambulanceDriverLogin=ambulanceDriverLogin;
    this.setSize(1680, 1050);
    populatePatientPickUpDetails();
    }

    public void populatePatientPickUpDetails(){
    
     DefaultTableModel model = (DefaultTableModel) patientjTable.getModel();
        model.setRowCount(0);

        for(Patient patient : system.getPatientDirectory().getPatientDirectory()){
            if(patient.getAmbulancedriver().getId()!=0 && patient.getAmbulancedriver().getId()==ambulanceDriverLogin.getId() && patient.getPatientstatus().equals(status.Allocated.getValue())){
                Object[] row=new Object[6];
                row[0]=patient.getPatientID();
                row[1]=patient.getLastname()+", "+patient.getFirstname();
                row[2]=""; //hospital details
                row[3]=patient.getStreetaddress()+", "+patient.getCity()+", "+patient.getZipcode();
                row[4]=patient.getPhonenumber();
                row[5]= patient.getPatientstatus();
                model.addRow(row);
            }
        }
        
          for(Patient patient : system.getPatientDirectory().getPatientDirectory()){
            if(patient.getAmbulancedriver().getId()!=0 && patient.getAmbulancedriver().getId()==ambulanceDriverLogin.getId() && patient.getPatientstatus().equals(status.Allocated.getValue())){
                Object[] row=new Object[6];
                row[0]=patient.getPatientID();
                row[1]=patient.getLastname()+", "+patient.getFirstname();
                row[2]=""; //hospital details
                row[3]=patient.getStreetaddress()+", "+patient.getCity()+", "+patient.getZipcode();
                row[4]=patient.getPhonenumber();
                row[5]= patient.getPatientstatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        patientjTable = new javax.swing.JTable();
        pickupButton = new javax.swing.JButton();
        dropButton = new javax.swing.JButton();

        patientjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Hospital Name", "Patient Address", "Phone Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientjTable);

        pickupButton.setText("Confirm PickUp");
        pickupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupButtonActionPerformed(evt);
            }
        });

        dropButton.setText("Confirm Drop");
        dropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(pickupButton)
                        .addGap(63, 63, 63)
                        .addComponent(dropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickupButton)
                    .addComponent(dropButton))
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pickupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupButtonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = patientjTable.getSelectedRow();
        if (patientjTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please select one patient to confirm pickup!!");
            return;
        }
        Patient selectedPatient=system.getPatientDirectory().getPatientByID(Integer.parseInt((String)patientjTable.getValueAt(selectedRowIndex, 0)));
         if(selectedPatient.getPatientstatus().equals(status.Allocated.getValue())){
         selectedPatient.setPatientstatus(status.PatientPickup.getValue());
         }
         else{
             JOptionPane.showMessageDialog(null, "Please select allocated patient to confirm pickup!!");
            return;
         }
         
    }//GEN-LAST:event_pickupButtonActionPerformed

    private void dropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropButtonActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = patientjTable.getSelectedRow();
        if (patientjTable.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Please select one patient to confirm drop!!");
            return;
        }
         Patient selectedPatient=system.getPatientDirectory().getPatientByID(Integer.parseInt((String)patientjTable.getValueAt(selectedRowIndex, 0)));
         if(selectedPatient.getPatientstatus().equals(status.PatientPickup.getValue())){
         selectedPatient.setPatientstatus(status.PatientDrop.getValue());
         }
         else {
             JOptionPane.showMessageDialog(null, "Please select patient with Confirm pickup to drop pickup successfully!!");
            return;
         }
    }//GEN-LAST:event_dropButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dropButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientjTable;
    private javax.swing.JButton pickupButton;
    // End of variables declaration//GEN-END:variables
}
