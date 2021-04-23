/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.PatientRole;

import Business.DB4OUtil.DB4OUtil;
import Business.Driver.AmbulanceDriver;
import Business.EcoSystem;
import Business.call.EmergencyCall;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Hospital.Patient;
import Business.Organization.Organization;
import Business.Status;
import Business.UserAccount.UserAccount;
import java.awt.Image;
import java.io.File;
import static java.time.Clock.system;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    private Patient patient;
    private Hospital hospital;
    private EcoSystem system;
    private Organization organization;
    private Enterprise enterprise;
    private Status status;
    //DB4OUtil dB4OUtil;
    private JPanel userProcessorcontainer; 
    private UserAccount account;
    private String path = "null";
    private Patient loggedInPatient;
    /**
     * Creates new form PatientWorkAreaJPanel
     */
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Patient patient, Hospital hospital) {
        initComponents();
        this.hospital = hospital;
        this.system = system;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userProcessorcontainer = userProcessContainer;
        this.account = account;
        this.loggedInPatient= system.getPatientDirectory().getPatientByUsername(account.getUsername());
         this.setSize(1680, 1050);
         
        lblpatientstatus.setText(loggedInPatient.getPatientstatus());
        if (patient.getPath() != null && !patient.getPath().isEmpty()) {
            lblreport.setIcon(reportsubmit(patient.getPath()));
        }
    }

    
    public ImageIcon reportsubmit(String imgpath)
    {
        if(imgpath.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please upload Covid report first", "Warning", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        ImageIcon MyImage = new ImageIcon(imgpath);
        Image reportimg = MyImage.getImage();
        Image newimg = reportimg.getScaledInstance(lblreport.getWidth(), lblreport.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon Image = new ImageIcon(newimg);
        return Image;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        hospitaltable = new javax.swing.JTable();
        lblreport = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblpatientstatus = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnemergency = new javax.swing.JLabel();
        btnupload = new javax.swing.JLabel();
        btnsubmit = new javax.swing.JLabel();
        btnfindbeds = new javax.swing.JLabel();
        btnproceed = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Upload report here:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, 23));

        hospitaltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Hospital Name", "Street", "Zipcode", "City", "Phone Number", "Email ID", "Bed Count"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(hospitaltable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 794, 170));

        lblreport.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        lblreport.setSize(new java.awt.Dimension(190, 72));
        add(lblreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 170, 190, 72));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Patient Status:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 100, 30));

        lblpatientstatus.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));
        add(lblpatientstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 190, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("HELLO PATIENT!");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        btnemergency.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnemergency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnemergency.setText("Emergency");
        btnemergency.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnemergency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnemergencyMousePressed(evt);
            }
        });
        add(btnemergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 120, 30));

        btnupload.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnupload.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnupload.setText("Upload Report");
        btnupload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnupload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnuploadMousePressed(evt);
            }
        });
        add(btnupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 100, 20));

        btnsubmit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnsubmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnsubmit.setText("Submit");
        btnsubmit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsubmitMousePressed(evt);
            }
        });
        add(btnsubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 100, 20));

        btnfindbeds.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnfindbeds.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnfindbeds.setText("Find Beds");
        btnfindbeds.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnfindbeds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnfindbedsMousePressed(evt);
            }
        });
        add(btnfindbeds, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 110, 20));

        btnproceed.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnproceed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnproceed.setText("Proceed");
        btnproceed.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnproceed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnproceedMousePressed(evt);
            }
        });
        add(btnproceed, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient (5).png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, -20, 260, 470));
    }// </editor-fold>//GEN-END:initComponents

    private void btnemergencyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnemergencyMousePressed
        // TODO add your handling code here:
        
        EmergencyCall ecall=new EmergencyCall();
        Patient p= system.getPatientDirectory().getPatientByUsername(account.getUsername());
         String[] number=new String[2];
        if(p.getEmergencycontact().contains("-"))
        number=p.getEmergencycontact().split("-");
        if(p.getEmergencycontact().contains("."))
        number=p.getEmergencycontact().split(".");
        String emergencyNumber="+1"+number[0]+number[1]+number[2];
        //ecall.Calling("+18574984878");
        ecall.Calling(emergencyNumber);
    }//GEN-LAST:event_btnemergencyMousePressed

    private void btnuploadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnuploadMousePressed
        // TODO add your handling code here: 
        if(!loggedInPatient.getPatientstatus().equalsIgnoreCase(status.New.getValue())){
            return;
        }
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int resultimg= file.showSaveDialog(null);
        
        if(resultimg == JFileChooser.APPROVE_OPTION){
            File SelectedFile = file.getSelectedFile();
            path = SelectedFile.getAbsolutePath();
            lblreport.setIcon(reportsubmit(path));
            if(lblreport.getIcon()!=null)
            {
                 this.loggedInPatient.setPath(path); 
                  JOptionPane.showMessageDialog(null, "Report uploaded successfully, Please submit the report for verification", "Warning", JOptionPane.WARNING_MESSAGE);
            }
      
            
        }
        if(resultimg == JFileChooser.CANCEL_OPTION){
            System.out.println("NO FILE CHOSEN");
        }
    }//GEN-LAST:event_btnuploadMousePressed

    private void btnfindbedsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfindbedsMousePressed
        // TODO add your handling code here:
        if(loggedInPatient.getPatientstatus().equalsIgnoreCase(status.New.getValue())){
             JOptionPane.showMessageDialog(null, "Please Submit Covid report first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(loggedInPatient.getPatientstatus().equalsIgnoreCase(status.Pending.getValue())){
             JOptionPane.showMessageDialog(null, "Your report authorization process is in progress.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!loggedInPatient.getPatientstatus().equalsIgnoreCase(status.Approved.getValue())){
             JOptionPane.showMessageDialog(null, "Your request is already in progress.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         populateTable();
    }//GEN-LAST:event_btnfindbedsMousePressed

    private void btnproceedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnproceedMousePressed
        // TODO add your handling code here:
        if(loggedInPatient.getPatientstatus().equalsIgnoreCase(status.New.getValue())){
             JOptionPane.showMessageDialog(null, "Please Submit Covid report first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(loggedInPatient.getPatientstatus().equalsIgnoreCase(status.Pending.getValue())){
             JOptionPane.showMessageDialog(null, "Your report authorization process is in progress.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!loggedInPatient.getPatientstatus().equalsIgnoreCase(status.Approved.getValue())){
             JOptionPane.showMessageDialog(null, "Your request is already in progress.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         if (hospitaltable.getSelectedRowCount()!=1) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (loggedInPatient.getPatientstatus().equalsIgnoreCase(status.Approved.getValue())) {
            DefaultTableModel model = (DefaultTableModel) hospitaltable.getModel();
            int selectedRow = hospitaltable.getSelectedRow();

            Integer ID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
            Hospital hospital = system.getHospitalDirectory().getHospitalByID(ID);
            loggedInPatient.setPatientstatus(status.Allocation.getValue());
            loggedInPatient.setHospital(hospital);
            hospital.setRequestcount(hospital.getRequestcount()+1);
            JOptionPane.showMessageDialog(null, "Your allocation request has sent successfully.", "Warning", JOptionPane.WARNING_MESSAGE); 
            lblpatientstatus.setText(this.loggedInPatient.getPatientstatus());
        } else if (patient.getPatientstatus().equalsIgnoreCase(status.New.getValue()) || patient.getPatientstatus().equalsIgnoreCase(status.Pending.getValue())) {
            JOptionPane.showMessageDialog(null, "You dont have approved request from patient authorization", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "You have already allocated bed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnproceedMousePressed

    private void btnsubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsubmitMousePressed
        // TODO add your handling code here:
        if(!loggedInPatient.getPatientstatus().equalsIgnoreCase(status.New.getValue())){
            return;
        }

        if(this.loggedInPatient.getPath()==null)
        {
            JOptionPane.showMessageDialog(null, "Please upload scanned report first !", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        this.loggedInPatient.setPatientstatus(status.Pending.getValue());
        lblpatientstatus.setText(this.loggedInPatient.getPatientstatus());
        JOptionPane.showMessageDialog(null, "Report has been successfully uploaded. ", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnsubmitMousePressed

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) hospitaltable.getModel();
        model.setRowCount(0);
        for (Hospital hospital : system.getHospitalDirectory().getHospitalDirectory()) {
          
                Object[] row = new Object[8];
                row[0] = hospital.getHospitalID();
                row[1] = hospital.getName();
                row[2] = hospital.getStreetaddress();
                row[3] = hospital.getZipcode();
                row[4] = hospital.getCity();
                row[5] = hospital.getPhonenumber();
                row[6] = hospital.getEmail();
                row[7] = hospital.getBedcount();
                model.addRow(row);
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnemergency;
    private javax.swing.JLabel btnfindbeds;
    private javax.swing.JLabel btnproceed;
    private javax.swing.JLabel btnsubmit;
    private javax.swing.JLabel btnupload;
    private javax.swing.JTable hospitaltable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblpatientstatus;
    private javax.swing.JLabel lblreport;
    // End of variables declaration//GEN-END:variables
}
