/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DirectorRole;

import Business.AccountPackage.Account;
import Business.ManagementEnterprise;
import Business.NetworkPackage.Network;
import Business.NewsGroupPackage.NewsGroup;
import Business.OrgPackage.DataAnalystOrganization;
import Business.Organization;
import Business.WorkPackage.DDWork;
import Business.WorkPackage.EDWork;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sheldon
 */
public class ApproveWorkPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Account account;
    private EDWork request;
    private NewsGroup business;

    /**
     * Creates new form ApproveWorkPanel
     * @param userProcessContainer
     * @param account
     * @param request
     * @param business
     */
    public ApproveWorkPanel(JPanel userProcessContainer, Account account, EDWork request,NewsGroup business) {
        initComponents();
        this.setSize(970,620);
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.request = request;
        this.business = business;
        
        ReportTitleTextField.setText(request.getReportTitle());
        if (request.getReportContent() != null){
            try {
                ReportTextArea.read(new FileReader(request.getReportContent()), null);
            } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "problem accessing file");
            }
        } else {
        JOptionPane.showMessageDialog(null, "File access cancelled by user.");
        }
        
        EditorialTextField.setText(request.getEditorialTitle());
        if (request.getEditorialContent() != null){
            try {
                EditorialTextArea.read(new FileReader(request.getEditorialContent()), null);
            } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "problem accessing file");
            }
        } else {
        JOptionPane.showMessageDialog(null, "File access cancelled by user.");
        }
        ReportTitleTextField.setEnabled(false);
        ReportTextArea.setEnabled(false);
        EditorialTextField.setEnabled(false);
        EditorialTextArea.setEnabled(false);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approveButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ReportTitleTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EditorialTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReportTextArea = new javax.swing.JTextArea();
        EditorialTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        declineButton = new javax.swing.JButton();

        setOpaque(false);

        approveButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Editoral Title:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Report Title:");

        ReportTitleTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        EditorialTextArea.setColumns(20);
        EditorialTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        EditorialTextArea.setRows(5);
        jScrollPane1.setViewportView(EditorialTextArea);

        ReportTextArea.setColumns(20);
        ReportTextArea.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        ReportTextArea.setRows(5);
        jScrollPane2.setViewportView(ReportTextArea);

        EditorialTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        declineButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        declineButton.setText("Decline");
        declineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(declineButton)
                        .addGap(18, 18, 18)
                        .addComponent(approveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(ReportTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(EditorialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(EditorialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(ReportTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveButton)
                    .addComponent(declineButton)
                    .addComponent(backJButton))
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        request.setApprove(true);
        request.setStatus("Completed and sent");
        request.getJeWork().setApprove(true);
        
        DDWork DDrequest = new DDWork();
        DDrequest.setEdWork(request);
        DDrequest.setEditorialTitle(request.getEditorialTitle());
        DDrequest.setReportTitle(request.getReportTitle());
        DDrequest.setSender(request.getReceiver());
        
        Network nn = null;
        
            //for(Network i : NewsGroup.getInstance().getNetworkList()){
            for(Network i : business.getNetworkList()){
                if(i.getType().equals("Management")){
                    
                    nn = i;
                    break;
                }
            }
            for (ManagementEnterprise b : nn.getManagementDirectory().getEnterpriseList()){
                Organization org = null;
                for (Organization organization : b.getOrganizationDirectory().getOrganizationList()){
                //String s = organization.getName();//leak DirectorOrganization
                if (organization instanceof DataAnalystOrganization){
                    org = organization;
                    break;
                }
            }
                if (org!=null){
                    org.getWorkQueue().getWorkRequestList().add(DDrequest);
                    account.getWorkQueue().getWorkRequestList().add(DDrequest);
                    
                }
            }
            JOptionPane.showMessageDialog(null, "Work Approved!");
            approveButton.setEnabled(false);
            declineButton.setEnabled(false);
    }//GEN-LAST:event_approveButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DirectorWorkPanel dwjp = (DirectorWorkPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void declineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineButtonActionPerformed
        // TODO add your handling code here:
        request.setApprove(false);
        request.setStatus("Declined");
        request.getJeWork().setApprove(false);
        JOptionPane.showMessageDialog(null, "Work Declined!");
        approveButton.setEnabled(false);
        declineButton.setEnabled(false);
        
    }//GEN-LAST:event_declineButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea EditorialTextArea;
    private javax.swing.JTextField EditorialTextField;
    private javax.swing.JTextArea ReportTextArea;
    private javax.swing.JTextField ReportTitleTextField;
    private javax.swing.JButton approveButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton declineButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}