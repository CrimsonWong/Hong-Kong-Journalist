/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.AccountPackage.Account;
import Business.ManagementEnterprise;
import Business.NetworkPackage.Network;
import Business.NewsGroupPackage.NewsGroup;
import Business.Organization;
import Business.RegionalNewsEnterprise;
import Business.WorkPackage.DDWork;
import Business.WorkPackage.DPWork;
import java.awt.CardLayout;
import static java.awt.Image.SCALE_DEFAULT;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferrari
 */
public class LoginPanel extends javax.swing.JPanel {
    private NewsGroup system;
    private JPanel container;
    private JLabel picture;

    /**
     * Creates new form LoginPanel
     * @param system
     * @param container
     * @param picture
     */
    public LoginPanel(NewsGroup system, JPanel container, JLabel picture) {
        this.system = system;
        this.container = container;
        this.picture = picture;
        initComponents();
        this.setSize(970,620);
        populateTable();
        
        
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        model.setRowCount(0);
        //sysadmin
        system.getUserAccountDirectory().getAccountList().stream().map((a) -> {
            Object[] row = new Object[4];
            row[0] = a;
            row[1] = a.getRole().toString();
            return row;
        }).forEach((row) -> {
            model.addRow(row);
        });
        //employee
        system.getNetworkList().stream().forEach((network) -> {
            //Step 2.a: check against each enterprise
            network.getManagementDirectory().getEnterpriseList().stream().forEach((enterprise) -> {
                //Step 3:check against each organization for each enterprise
                enterprise.getOrganizationDirectory().getOrganizationList().stream().forEach((organization) -> {
                    organization.getUserAccountDirectory().getAccountList().stream().map((a) -> {
                        Object[] row = new Object[4];
                        row[0] = a;
                        row[1] = a.getRole().toString();
                        return row;
                    }).forEach((row) -> {
                        model.addRow(row);
                    });
                });
            });
        });
        //employee
        system.getNetworkList().stream().forEach((network) -> {
            //Step 2.a: check against each enterprise
            network.getRegionalNewsDirectory().getEnterpriseList().stream().forEach((enterprise) -> {
                //Step 3:check against each organization for each enterprise
                enterprise.getOrganizationDirectory().getOrganizationList().stream().forEach((organization) -> {
                    organization.getUserAccountDirectory().getAccountList().stream().map((a) -> {
                        Object[] row = new Object[4];
                        row[0] = a;
                        row[1] = a.getRole().toString();
                        return row;
                    }).forEach((row) -> {
                        model.addRow(row);
                    });
                });
            });
        });
        
        //admin regional news
        system.getNetworkList().stream().forEach((network) -> {
            //Step 2.a: check against each enterprise
            network.getRegionalNewsDirectory().getEnterpriseList().stream().forEach((enterprise) -> {
                //Step 3:check against each organization for each enterprise
                enterprise.getUserAccountDirectory().getAccountList().stream().map((a) -> {
                    Object[] row = new Object[4];
                    row[0] = a;
                    row[1] = a.getRole().toString();
                    return row;
                }).forEach((row) -> {
                    model.addRow(row);
                });
            });
        });
        
        //admin manage
        system.getNetworkList().stream().forEach((network) -> {
            //Step 2.a: check against each enterprise
            network.getManagementDirectory().getEnterpriseList().stream().forEach((enterprise) -> {
                //Step 3:check against each organization for each enterprise
                enterprise.getUserAccountDirectory().getAccountList().stream().map((a) -> {
                    Object[] row = new Object[4];
                    row[0] = a;
                    row[1] = a.getRole().toString();
                    return row;
                }).forEach((row) -> {
                    model.addRow(row);
                });
            });
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

        jLabel1 = new javax.swing.JLabel();
        userNameJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("User Name");

        userNameJTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        loginJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        loginJButton.setText("Login");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "UserName", "UserRole"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(passwordField)
                                .addComponent(userNameJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGap(86, 86, 86)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginJButton)
                    .addComponent(deleteBtn))
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        Account userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

        RegionalNewsEnterprise inEnterprise = null;
        ManagementEnterprise boardEnterprise = null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(RegionalNewsEnterprise enterprise:network.getRegionalNewsDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(ManagementEnterprise enterprise:network.getManagementDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                boardEnterprise = enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        boardEnterprise = enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)container.getLayout(); //inEnterprise = newsEnterprise
            if (boardEnterprise == null) {

                container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
                layout.next(container);
                ImageIcon p = new ImageIcon(userAccount.getPicture());
                p.setImage(p.getImage().getScaledInstance(150, 145, SCALE_DEFAULT));
                picture.setIcon(p);
                        
            }
            else if (inEnterprise == null) {
                container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, boardEnterprise, system));
                layout.next(container);
                ImageIcon p = new ImageIcon(userAccount.getPicture());
                p.setImage(p.getImage().getScaledInstance(150, 145, SCALE_DEFAULT));
                picture.setIcon(p);
            }
        }

        loginJButton.setEnabled(false);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "All the information of this report would"
                + " be deleted", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_NO_OPTION){
                Account accountselected = (Account) jTable1.getValueAt(selectedRow, 0);//Wrong

                Organization org = null;
                Account temp = null;
//                for (int i = 0; i < enterprise.getOrganizationDirectory().getOrganizationList().size(); i++){
//                    org = enterprise.getOrganizationDirectory().getOrganizationList().get(i);
//                    for(int j = 0; j < org.getUserAccountDirectory().getAccountList().size(); j++){
//                        temp = org.getUserAccountDirectory().getAccountList().get(j);
//                        if(temp.getUsername() == accountselected.getUsername()){
//                            org.getUserAccountDirectory().getAccountList().remove(temp);
//                            org.getEmployeeDirectory().getEmployeeList().remove(temp.getEmployee());
//                        }
//                    }
//                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Select one row", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        

    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
