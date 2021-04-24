/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Hospital.Patient;
import Business.Status;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author sayalimahajan
 */
public class PatientStatusBarChart extends javax.swing.JPanel {
JPanel userProcessContainer;
    EcoSystem system;
     JFreeChart barChart;
     private Status status;
    /**
     * Creates new form PatientStatusBarChart
     */

    PatientStatusBarChart(JPanel rightjPanel, EcoSystem ecosystem) {
 initComponents();
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = ecosystem;
        populateBarGraph();
         this.setSize(1680, 1050);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 244, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 770, 460));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BAR CHART");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 151, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/graph-bar (4).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 120, 130));

        jLabel3.setBackground(new java.awt.Color(255, 244, 244));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profits.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 190, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void populateBarGraph() {
        
        barChart = ChartFactory.createBarChart(
                "Sample",
                "Patient Status",
                "Work Request Count",
                createDataResult(),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        jPanel1.removeAll();
        jPanel1.add(chartPanel, BorderLayout.CENTER);
        jPanel1.validate();
        
    }

    private CategoryDataset createDataResult() {
       
    final String New = "New"; int newCount=0;
    final String Pending = "Pending"; int PendingCount=0;
    final String Approved = "Approved"; int ApprovedCount=0;
    final String Allocation = "Allocation"; int AllocationCount=0;
    final String Allocated = "Allocated"; int AllocatedCount=0;
    final String PickedUp = "Patient Pickup"; int PickedUpCount=0;
    final String Dropped = "Patient Drop"; int DroppedCount=0;
    final String Completed = "Completed"; int CompletedCount=0;
        
    for(Patient patient : system.getPatientDirectory().getPatientDirectory())
    {
        if(patient.getPatientstatus().equalsIgnoreCase(status.New.getValue()))
                newCount++;
        if(patient.getPatientstatus().equalsIgnoreCase(status.Pending.getValue()))
                PendingCount++;
        if(patient.getPatientstatus().equalsIgnoreCase(status.Approved.getValue()))
                ApprovedCount++;
        if(patient.getPatientstatus().equalsIgnoreCase(status.Allocation.getValue()))
                AllocationCount++;
        if(patient.getPatientstatus().equalsIgnoreCase(status.Allocated.getValue()))
                AllocatedCount++;
        if(patient.getPatientstatus().equalsIgnoreCase(status.PatientPickup.getValue()))
                PickedUpCount++;
        if(patient.getPatientstatus().equalsIgnoreCase(status.PatientDrop.getValue()))
                DroppedCount++;
        if(patient.getPatientstatus().equalsIgnoreCase(status.Completed.getValue()))
                CompletedCount++;
    }
         final DefaultCategoryDataset resultList = new DefaultCategoryDataset();
         resultList.addValue(newCount,"Patient",New);
         resultList.addValue(PendingCount,"Patient",Pending);
         resultList.addValue(ApprovedCount,"Patient",Approved);
         resultList.addValue(AllocationCount,"Patient",Allocation);
         resultList.addValue(AllocatedCount,"Patient",Allocated);
         resultList.addValue(PickedUpCount,"Patient",PickedUp);
         resultList.addValue(DroppedCount,"Patient",Dropped);
         resultList.addValue(CompletedCount,"Patient",Completed);
         return resultList;
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
