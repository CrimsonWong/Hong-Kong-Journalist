/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DataAnalystRole;

import Business.AccountPackage.Account;
import Business.ManagementEnterprise;
import Business.NetworkPackage.Network;
import Business.NewsGroupPackage.NewsGroup;
import Business.OrgPackage.DataAnalystOrganization;
import Business.Organization;
import Business.WorkPackage.DDWork;
import Business.WorkPackage.DPWork;
import Business.WorkPackage.EDWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferrari
 */
public class DataAnalystWorkPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    ManagementEnterprise enterprise;
    DDWork DDrequest;
    Account account;
    NewsGroup business;
    DataAnalystOrganization dataAnalystOrganization;
    List<DDWork> submitList;
    
    

    /**
     * Creates new form DataAnalystWorkPanel
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param business
     */
    public DataAnalystWorkPanel(JPanel userProcessContainer, Account account, Organization organization, NewsGroup business) {
        initComponents();
        this.setSize(970,620);
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.dataAnalystOrganization = (DataAnalystOrganization)organization;
        this.business = business;
        submitList = new ArrayList<>();
        initList();
        populateSelectworkTable();
    }

    private void initList() {
        dataAnalystOrganization.getWorkQueue().getWorkRequestList().stream().map((request) -> (DDWork) request).filter((r) -> (r.isApprove())).forEach((r) -> {
            submitList.add(r);
        });
        sortByLikes();
    }
    
    private void populateSelectworkTable(){
        DefaultTableModel model = (DefaultTableModel)selectworkTable.getModel();
        
        model.setRowCount(0);
        
        submitList.stream().map((request) -> {
            Object[] row = new Object[4];
            DDWork r = (DDWork) request;
            row[0] = r;
            row[1] = r.getEditorialTitle();
            row[2] = r.getLikes();
            row[3] = "Added".equals(r.getStatus()) ? "Waiting..." : r.getStatus();
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
        deleteBtn = new javax.swing.JButton();
        getStatisticsBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        selectworkTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        setOpaque(false);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Report title", "Editorial title", "Likes", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        getStatisticsBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        getStatisticsBtn.setText("Get Statistics");
        getStatisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStatisticsBtnActionPerformed(evt);
            }
        });

        selectworkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Report title", "Editorial title", "Likes", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(selectworkTable);

        addBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getStatisticsBtn)
                                .addGap(70, 70, 70)
                                .addComponent(addBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(submitButton)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getStatisticsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        Network nn = null;
        for(Network i : business.getNetworkList()){
                if(i.getType().equals("Management")){
                    nn = i;
                    break;
                }
            }
            for (ManagementEnterprise b : nn.getManagementDirectory().getEnterpriseList()){
                Organization org = null;
                for (Organization organization : b.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof DataAnalystOrganization){
                        org = organization;
                        break;
                    }
                }

                int selectedRow = workRequestJTable.getSelectedRow();
                if (selectedRow >= 0){
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(null, "All the information of this report would"
                        + " be deleted", "Warning", dialogButton);
                    if (dialogResult == JOptionPane.YES_NO_OPTION){
                        EDWork workselected = (EDWork) workRequestJTable.getValueAt(selectedRow, 0);
                        if (org!=null){
                            org.getWorkQueue().getWorkRequestList().remove(workselected);
                            account.getWorkQueue().getWorkRequestList().remove(workselected);
                            sortByLikes();
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Select one row", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void getStatisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStatisticsBtnActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0){
            DDWork dd = (DDWork)workRequestJTable.getValueAt(selectedRow, 0);
            if (dd.getLikes() == 0) {
                Random random = new Random();
                dd.setLikes(random.nextInt(1000)+1);
                dd.getEdWork().setStatus("Analyst");
                dd.setStatus("Analyst");
                sortByLikes();
                //populateTable();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Data already getten!");
            } 
       
        } 
        else {
            JOptionPane.showMessageDialog(null,"Select one row", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_getStatisticsBtnActionPerformed

    private void sortByLikes(){
        List<DDWork> ddworkList = new ArrayList<>();
        dataAnalystOrganization.getWorkQueue().getWorkRequestList().stream().map((work) -> (DDWork) work).forEach((ddwork) -> {
            ddworkList.add(ddwork);
        });
        Collections.sort(ddworkList, (DDWork w1, DDWork w2) -> w2.getLikes() > w1.getLikes() ? 1:-1);
        
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        model.setRowCount(0);
        ddworkList.stream().map((request) -> {
            Object[] row = new Object[4];
            DDWork r = (DDWork) request;
            row[0] = r;
            row[1] = r.getEditorialTitle();
            row[2] = r.getLikes();
            row[3] = r.getStatus() == null ? "Waiting..." : r.getStatus();
            return row;            
        }).forEach((row) -> {
            model.addRow(row);
        });
        
    }
    
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow >= 0){
            DDWork dd = (DDWork)workRequestJTable.getValueAt(selectedRow, 0);
            if (!submitList.contains(dd) && dd.getLikes() != 0){
                submitList.add(dd);
                dd.setApprove(true);
                dd.setStatus("Added");
                sortByLikes();
                //populateTable();
                populateSelectworkTable();
            }
            else if (submitList.contains(dd)) {
                JOptionPane.showMessageDialog(null, "Work already added!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Analyst data first!");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Select one row", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        if (submitList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No file will be sent!");
        }
        
        if (!submitList.isEmpty()) {
            for (DDWork dd : submitList) {
                if (dd.getStatus().equals("Completed and sent") ||
                    dd.getStatus().equals("Printed")) {
                    JOptionPane.showMessageDialog(null, "Work has already been submitted, do not repeat");
                    return;
                }
                dd.setStatus("Completed and sent");
            }
            
            DPWork dp = DPWork.getInstance();
            dp.setList(submitList);
                  
            
            
            JOptionPane.showMessageDialog(null, "Work submitted successfully!");
            sortByLikes();
            populateSelectworkTable();
        } 
        
    }//GEN-LAST:event_submitButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton getStatisticsBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable selectworkTable;
    private javax.swing.JButton submitButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
