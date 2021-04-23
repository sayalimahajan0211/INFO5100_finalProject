package ui.AdministrativeRole;

import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  aishwarya
 */
public class HospitalAdminWorkAreaPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    /** Creates new form AdminWorkAreaJPanel */
    public HospitalAdminWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLabel.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JLabel();
        manageEmployeeJButton = new javax.swing.JLabel();
        userJButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 244, 244));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOSPITAL ADMIN WORKAREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 580, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 30));

        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 130, -1));

        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageOrganizationJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageOrganizationJButton.setText("Manage Organization");
        manageOrganizationJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageOrganizationJButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        manageOrganizationJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageOrganizationJButtonMousePressed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 150, 30));

        manageEmployeeJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        manageEmployeeJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageEmployeeJButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        manageEmployeeJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEmployeeJButtonMousePressed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 150, 30));

        userJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userJButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userJButton.setText("Manage User");
        userJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userJButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        userJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userJButtonMousePressed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin (4).png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 310, 400));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrator.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 130));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return-button.png"))); // NOI18N
        back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonMousePressed
        // TODO add your handling code here:
        
        ManageHospitalAdminOrganizationJPanel manageOrganizationJPanel = new ManageHospitalAdminOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonMousePressed

    private void manageEmployeeJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonMousePressed
        // TODO add your handling code here:
        
        ManageHospitalAdminEmployeeJPanel manageEmployeeJPanel = new ManageHospitalAdminEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonMousePressed

    private void userJButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userJButtonMousePressed
        // TODO add your handling code here:
        
        ManageHospitalAdminUserAccountJPanel muajp = new ManageHospitalAdminUserAccountJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonMousePressed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel manageEmployeeJButton;
    private javax.swing.JLabel manageOrganizationJButton;
    private javax.swing.JLabel userJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
