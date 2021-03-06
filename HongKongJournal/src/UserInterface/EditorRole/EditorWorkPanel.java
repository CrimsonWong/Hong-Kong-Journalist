/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EditorRole;

import Business.AccountPackage.Account;
import Business.NewsGroupPackage.NewsGroup;
import Business.OrgPackage.EditorOrganization;
import Business.Organization;
import Business.RegionalNewsEnterprise;
import Business.Work;
import Business.WorkPackage.JEWork;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sheldon
 */
public class EditorWorkPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private NewsGroup business;
    private Account userAccount;
    private EditorOrganization editorOrganization;
    

    /**
     * Creates new form EditorWorkPanel
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param business
     * @param boardEnterprise
     */
    public EditorWorkPanel(JPanel userProcessContainer, Account account, Organization organization, NewsGroup business, RegionalNewsEnterprise boardEnterprise) {
        initComponents();
        this.setSize(970,620);
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.editorOrganization = (EditorOrganization)organization;
        
        populateTable();
    }

        public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        editorOrganization.getWorkQueue().getWorkRequestList().stream().map((request) -> {
            Object[] row = new Object[6];
            JEWork r = (JEWork) request;
            row[0] = r;
            row[1] = r.getSender().getEmployee().getName();
            row[2] = r.getReceiver() == null ? "Waiting..." : r.getReceiver().getEmployee().getName();
            row[3] = r.getEditorialTitle() == null ? "Waiting..." : r.getEditorialTitle();
            row[4] = r.getStatus();
            row[5] = r.isApprove();
            return row;            
        }).forEach((row) -> {
            model.addRow(row);
        });
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();

        setOpaque(false);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Report title", "Sender", "Receiver", "Editorial title", "Status", "Approve"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(assignJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                .addComponent(processJButton)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(177, 177, 177))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Pleas select one work to continue");
            return;
        }
       
        Work request = (Work)workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getReceiver() == null){
        request.setReceiver(userAccount);
        request.setStatus("Pending...");
        populateTable();
        } else JOptionPane.showMessageDialog(null,"This work has been assigned!");
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Pleas select one work to continue");
            return;
        }

        JEWork request = (JEWork)workRequestJTable.getValueAt(selectedRow, 0);
        switch (request.getStatus()) {
            case "Pending...":
            case "Processing...":
                request.setStatus("Processing...");
                EditoralWorkPanel editoralWorkPanel = new EditoralWorkPanel(userProcessContainer, userAccount, request, business);
                userProcessContainer.add("processWorkRequestJPanel", editoralWorkPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                break;
            case "Completed":
                JOptionPane.showMessageDialog(null,"This work is completed!");
                break;
            default:
                JOptionPane.showMessageDialog(null,"You should take over this work first!");
                break;
        }

    }//GEN-LAST:event_processJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
