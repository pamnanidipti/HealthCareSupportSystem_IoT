/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PharmacistRole;

import Business.Enterprise.Enterprise;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugInvWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pamnani
 */
public class ViewNotificationsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PharmacyOrganization organization;
    /**
     * Creates new form ViewNotificationsJPanel
     */
    public ViewNotificationsJPanel(JPanel userProcessContainer, UserAccount account, 
            PharmacyOrganization organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        populate();
    }
    
    public void populate()
    {
     DefaultTableModel model = (DefaultTableModel)notificationTable.getModel();
        
        model.setRowCount(0);
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList())
        {
            if(request instanceof DrugInvWorkRequest)
            {
              DrugInvWorkRequest drugReq = (DrugInvWorkRequest) request;
            Object[] row = new Object[2];
            row[0] = drugReq.getMessage();
            row[1] = drugReq.getRequestedTime();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notificationTable = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 3, 36)); // NOI18N
        jLabel1.setText("Notifications");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        notificationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Requested On"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        notificationTable.setGridColor(new java.awt.Color(255, 255, 255));
        notificationTable.setOpaque(false);
        notificationTable.setSelectionBackground(new java.awt.Color(51, 255, 204));
        jScrollPane1.setViewportView(notificationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 790, 210));

        backJButton.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/notifyPharm.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notificationTable;
    // End of variables declaration//GEN-END:variables
}