/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.ReceptionRole;
import Business_Model.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Ambulance.AmbulanceWorkAreaJPanel;
import MainUserInterface.Ambulance.ReceptionAmbulanceWorkAreaJPanel;
import MainUserInterface.Patient.PatientBillJPanel;

/**
 *
 * @author aniketbhore
 */
public class PastRecords extends javax.swing.JPanel {
private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    /**
     * Creates new form PastRecordsJPanel
     */
    public PastRecords(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        populateNetworkTable();
    }
private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) ManageCustomersTable.getModel();

        model.setRowCount(0);

        for (Patient patient : ecoSystem.getPatientDirectory().getPatientList()) {

            Object[] row = new Object[10];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpGender();
            row[3] = patient.getpHealthInsuranceID();
            row[4] = patient.getpAge();
            row[5] = patient.getpEmailAddress();
            row[6] = patient.getpInsuranceStatus();
            row[7] = patient.getpStatus();
            row[8] = patient;
            if(patient.getpStatus().equals("Discharged")){
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

        btnUpdateAmbulanceRecord1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnUpdateAmbulanceRecord = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageCustomersTable = new javax.swing.JTable();
        lblManageCustomers = new javax.swing.JLabel();

        btnUpdateAmbulanceRecord1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        btnUpdateAmbulanceRecord1.setForeground(new java.awt.Color(0, 153, 204));
        btnUpdateAmbulanceRecord1.setText("Back");
        btnUpdateAmbulanceRecord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAmbulanceRecord1ActionPerformed(evt);
            }
        });

        btnUpdateAmbulanceRecord.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        btnUpdateAmbulanceRecord.setForeground(new java.awt.Color(0, 204, 204));
        btnUpdateAmbulanceRecord.setText("Bill");
        btnUpdateAmbulanceRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAmbulanceRecordActionPerformed(evt);
            }
        });

        ManageCustomersTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ManageCustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "Gender", "Id", "Age", "Email", "Payment", " Status", "obj"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ManageCustomersTable);

        lblManageCustomers.setBackground(new java.awt.Color(119, 197, 147));
        lblManageCustomers.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        lblManageCustomers.setForeground(new java.awt.Color(255, 255, 255));
        lblManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblManageCustomers.setText("                      Manage Students");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(lblManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(75, 75, 75)
                            .addComponent(btnUpdateAmbulanceRecord1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(59, 59, 59)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(btnUpdateAmbulanceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblManageCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnUpdateAmbulanceRecord1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(53, 53, 53)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(86, 86, 86)
                    .addComponent(btnUpdateAmbulanceRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAmbulanceRecord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAmbulanceRecord1ActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateAmbulanceRecord1ActionPerformed

    private void btnUpdateAmbulanceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAmbulanceRecordActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = ManageCustomersTable.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Patient patient = (Patient) ManageCustomersTable.getValueAt(selectedRowIndex, 8);
            BillJPanel patientBillJPanel = new BillJPanel(userProcessContainer, patient,userAccount,ecoSystem);
            userProcessContainer.add("Patient Bill", patientBillJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            populateNetworkTable();
            //patient.setStatus("Insurance Verification");
            //populateNetworkTable();
            //ManageCustomersTable doctorRequestLabTestJPanel = new ManageCustomersTable(userProcessContainer, userAccount,patient);
            //userProcessContainer.add("Request Lab Tests", doctorRequestLabTestJPanel);
            //CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_btnUpdateAmbulanceRecordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageCustomersTable;
    private javax.swing.JButton btnUpdateAmbulanceRecord;
    private javax.swing.JButton btnUpdateAmbulanceRecord1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblManageCustomers;
    // End of variables declaration//GEN-END:variables
}
