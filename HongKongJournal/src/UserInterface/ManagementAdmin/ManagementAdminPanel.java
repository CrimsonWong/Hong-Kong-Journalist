/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagementAdmin;

import Business.ManagementEnterprise;
import Business.NewsGroupPackage.NewsGroup;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sheldon
 */
public class ManagementAdminPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    ManagementEnterprise boardEnterprise;
    NewsGroup system;

    /**
     * Creates new form AdminWorkJPanel
     * @param userProcessContainer
     * @param boardEnterprise
     * @param system
     */
    public ManagementAdminPanel(JPanel userProcessContainer, ManagementEnterprise boardEnterprise, NewsGroup system) {
        initComponents();
        this.setSize(970,620);
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.boardEnterprise = boardEnterprise;
        valueLabel.setText(boardEnterprise.getName());
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
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("My Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageEmployeeJButton.setText("Manage Employee");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 220, 40));

        manageOrganizationJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        manageOrganizationJButton.setText("Manage Department");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, 30));

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed

        ManageEmployeePanel manageEmployeeJPanel = new ManageEmployeePanel(userProcessContainer, boardEnterprise.getOrganizationDirectory(), system);
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        ManageDepartmentPanel manageDepartmentPanel = new ManageDepartmentPanel(userProcessContainer, boardEnterprise.getOrganizationDirectory(), boardEnterprise.getManagementEnterpriseType().getValue());
        userProcessContainer.add("manageOrganizationJPanel", manageDepartmentPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}