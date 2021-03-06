/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SysAdmin;

import Business.NetworkPackage.Network;
import Business.NewsGroupPackage.NewsGroup;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sheldon
 */
public class ManageNetworkPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    NewsGroup system;

    /**
     * Creates new form ManageNetworkPanel
     * @param userProcessContainer
     * @param system
     */
    public ManageNetworkPanel(JPanel userProcessContainer,NewsGroup system) {
        initComponents();
        this.setSize(970,620);
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
    }
    
        private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        system.getNetworkList().stream().map((network) -> {
            Object[] row = new Object[1];
            row[0] = network.getName();
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

        jLabel1 = new javax.swing.JLabel();
        submitJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        networkJTable = new javax.swing.JTable();
        typeComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        submitJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        submitJButton.setText("Create");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        nameJTextField.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        backJButton.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Network Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        networkJTable.setOpaque(false);
        jScrollPane1.setViewportView(networkJTable);

        typeComboBox.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "RegionalNews", "Management" }));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitJButton)
                .addGap(127, 127, 127))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameJTextField))))
                .addGap(347, 347, 347))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backJButton)
                    .addComponent(submitJButton))
                .addGap(76, 76, 76))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        String name = nameJTextField.getText();
        String tpye = typeComboBox.getSelectedItem().toString();
        
        if(tpye.equals("Management")){
            for(Network n : system.getNetworkList()){
                if(n.getType().equals("Management")){
                    JOptionPane.showMessageDialog(null, "Only one management network can be created!");
                    return;
                }
            }
        }
        
        for(Network n : system.getNetworkList()){
            if(n.getName().equals(name)){
                JOptionPane.showMessageDialog(null, "This name is occupied!");
                return;
            }
        }
        Network network = system.createAndAddNetwork();
        network.setName(name);
        network.setType(tpye);
        JOptionPane.showMessageDialog(null, "A new network has been created");

        populateNetworkTable();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SysAdminPanel sysAdminwjp = (SysAdminPanel) component;
        //sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTable networkJTable;
    private javax.swing.JButton submitJButton;
    private javax.swing.JComboBox typeComboBox;
    // End of variables declaration//GEN-END:variables
}
