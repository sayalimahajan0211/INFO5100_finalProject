/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.ValidationUtility;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aishwarya
 */
public class ManageAuthorizationAdminEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;

    /**
     * Creates new form ManageAuthorizationAdminEmployeeJPanel
     */
    public ManageAuthorizationAdminEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        addJButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 244, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("AUTHORIZATION ADMIN EMPLOYEE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 540, 35));

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 140, 204, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Organization:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, -1));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 209, 480, 100));

        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 210, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 80, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 210, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 50, -1));

        addJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addJButton.setText("Create Employee");
        addJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addJButtonMousePressed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 130, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unauthorized-person.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 250, 340, 320));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin (6).png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 140));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backMousePressed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 40, 40));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();
        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationEmpJComboBox.addItem(organization);
        }
    }
    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void addJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMousePressed
        // TODO add your handling code here:
        
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        String name = nameJTextField.getText();
        if (!ValidationUtility.isNameValid(name)) {
            JOptionPane.showMessageDialog(null, "Please provide proper Organization name!");
            return;
        }
        organization.getEmployeeDirectory().createEmployee(name);
        populateTable(organization);
    }//GEN-LAST:event_addJButtonMousePressed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void backMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMousePressed
        // TODO add your handling code here:
        
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backMousePressed

    private void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[2];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addJButton;
    private javax.swing.JLabel back;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
