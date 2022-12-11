/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Police;

import Business_Model.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nehashende
 */

public class PoliceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceWorkAreaJPanel
     */
    JPanel userProcessContainer;
    User account;
    Ecosystem ecoSystem;
    
    public PoliceWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = business;
        this.account = account;
        populatePatientTable();
        populatePatientTable1();
    }

    private void populatePatientTable() {
        DefaultTableModel model = (DefaultTableModel) managePatientTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getPoliceRecords().getPoliceRecordsList()) {

            Object[] row = new Object[8];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();           
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge();
            row[4] = patient.getpAddress();
            row[5] = patient.getpEmailAddress();
            row[6] = patient.getpPoliceStatus();
            row[7] = patient;
            if(patient.getpPoliceStatus().equals("Verifying")){
            model.addRow(row);}

        }
    }
    
    private void populatePatientTable1() {
        DefaultTableModel model = (DefaultTableModel) managePatientTable1.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getPoliceRecords().getPoliceRecordsList()) {

            Object[] row = new Object[8];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge();
            row[4] = patient.getpAddress();
            row[5] = patient.getpEmailAddress();
            row[6] = patient.getpPoliceStatus();
            row[7] = patient;
            if(!patient.getpPoliceStatus().equals("Verifying")){
            model.addRow(row);}

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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        managePatientTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        managePatientTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("POLICE DEPATMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1260, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 84, 1260, 30));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 130, 120));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel2.setText("VERIFICATION REQUEST");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 334, 21));

        managePatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        managePatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "FellowshipId", "Age", "Address", "Email", "Police Verification", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(managePatientTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 1260, 140));

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton1.setText("View Details of Verification");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 316, 37));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel3.setText("PAST RECORDS");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 313, 21));

        managePatientTable1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        managePatientTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "FellowshipId", "Age", "Address", "Email", "Police Verification", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(managePatientTable1);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 1260, 191));

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jButton2.setText("View Details of Past Records");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 720, 310, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = managePatientTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            Patient d = (Patient) managePatientTable.getValueAt(selectedRow, 7);
            PersonInfo bill = new PersonInfo(userProcessContainer,ecoSystem, d,account);
            userProcessContainer.add("Police Person Info", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = managePatientTable1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table!","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            Patient d = (Patient) managePatientTable1.getValueAt(selectedRow, 7);
            //d.get
            PastInfo bill = new PastInfo(userProcessContainer,ecoSystem, d,account);
            userProcessContainer.add("Past Info", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable managePatientTable;
    private javax.swing.JTable managePatientTable1;
    // End of variables declaration//GEN-END:variables
}
