/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public class ViewDetailsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    /**
     * Creates new form ViewDetailsJPanel
     */
    public ViewDetailsJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
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
        weightJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bloodPressureJTextField = new javax.swing.JTextField();
        respiratoryRateJTextField = new javax.swing.JTextField();
        heartRateJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Patient Health Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/vitalSign.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 124, -1, -1));

        jLabel3.setText("Systolic blood pressure");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 158, -1, -1));

        jLabel4.setText("Weight in pounds");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 189, 110, -1));

        jLabel5.setText("Respiratory rate");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 98, 110, -1));

        jLabel6.setText("Heart rate");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 127, 110, -1));
        add(weightJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 186, 150, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vital Signs");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 63, 163, -1));
        add(bloodPressureJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 155, 150, -1));
        add(respiratoryRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 98, 150, -1));
        add(heartRateJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 124, 150, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bloodPressureJTextField;
    private javax.swing.JTextField heartRateJTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField respiratoryRateJTextField;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}