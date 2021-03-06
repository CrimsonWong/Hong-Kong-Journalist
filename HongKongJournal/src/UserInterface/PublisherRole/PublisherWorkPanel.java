/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PublisherRole;

import Business.AccountPackage.Account;
import Business.NewsGroupPackage.NewsGroup;
import Business.OrgPackage.PublisherOrganization;
import Business.Organization;
import Business.Work;
import Business.WorkPackage.DDWork;
import Business.WorkPackage.DPWork;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sheldon
 */
public class PublisherWorkPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Account account;
    PublisherOrganization organization;
    NewsGroup business;
    List<DDWork> list;
    
    /**
     * Creates new form PublisherWorkPanel
     * @param userProcessContainer
     * @param account
     * @param organization
     * @param business
     */
    public PublisherWorkPanel(JPanel userProcessContainer, Account account, Organization organization, NewsGroup business) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = (PublisherOrganization) organization;
        this.business = business;
        this.list = new ArrayList<DDWork>();
        initComponents();
        this.setSize(970,620);
        initList();
        populateTable();
    }
    
    private void initList() {
        //DPWork.getInstance();
        list.clear();
        DPWork.getInstance().getList().stream().map((request) -> (DDWork) request).forEach((r) -> {
            list.add(r);
        });
    }
    
    private void populateTable() {
        
        
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        model.setRowCount(0);
        
        list.stream().map((request) -> {
            Object[] row = new Object[3];
            DDWork r = (DDWork) request;
            row[0] = r;
            row[1] = r.getEditorialTitle();
            row[2] = "Completed and sent".equals(r.getStatus()) ? "Waiting..." : r.getStatus();
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
        publishBtn = new javax.swing.JButton();

        setOpaque(false);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Report title", "Editorial title", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        publishBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        publishBtn.setText("Publish");
        publishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(publishBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(publishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void publishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishBtnActionPerformed
        // TODO add your handling code here:
        list.stream().map((request) -> (DDWork) request).forEach((r) -> {
            r.setStatus("Printed");
        });
        JOptionPane.showMessageDialog(null, "Well done! Today's work has been printed");
        populateTable();
    }//GEN-LAST:event_publishBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton publishBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
