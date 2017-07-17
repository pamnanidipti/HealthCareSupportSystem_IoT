/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacistRole;

import Business.Enterprise.Enterprise;
import Business.Organization.PharmacyOrganization;
import Business.Pharmacy.Drug;
import Business.UserAccount.UserAccount;
import Business.Utils.MyIntegerVerifier;
import Business.Utils.MyStringVerifier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pamnani
 */
public class AddNewDrugsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PharmacyOrganization organization;
    /**
     * Creates new form AddNewDrugsJPanel
     */
    public AddNewDrugsJPanel(JPanel userProcessContainer, UserAccount account, 
            PharmacyOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        MyStringVerifier myStringVerifier= new MyStringVerifier();
        drugNameTxtField.setInputVerifier(myStringVerifier);
        
        MyIntegerVerifier myintegerVerifier= new MyIntegerVerifier();
        availabilityTxtField.setInputVerifier(myintegerVerifier);
        
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
        drugNameTxtField = new javax.swing.JTextField();
        availabilityTxtField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Add New Drug to Store");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/addDrug.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 54, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Drug Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 86, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Availability:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 127, -1, -1));

        drugNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugNameTxtFieldActionPerformed(evt);
            }
        });
        add(drugNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 83, 103, -1));
        add(availabilityTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 124, 105, -1));

        addJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 162, 74, -1));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 311, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void drugNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugNameTxtFieldActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        if(drugNameTxtField.getText().trim().length()==0 || 
                availabilityTxtField.getText().length()==0 )
        {
            JOptionPane.showMessageDialog(this, "Please enter all the values.","Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String drugName=drugNameTxtField.getText();
        int quantity=Integer.parseInt(availabilityTxtField.getText());
        
          Drug drug=organization.getDrugCatalog().addDrug(drugName,quantity);
          JOptionPane.showMessageDialog(null,"Drug successfully added","Information",JOptionPane.INFORMATION_MESSAGE);
          drugNameTxtField.setText("");
          availabilityTxtField.setText("");
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout= (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JTextField availabilityTxtField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField drugNameTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}