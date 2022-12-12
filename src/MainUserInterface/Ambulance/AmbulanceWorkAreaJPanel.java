/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Ambulance;
import BusinessModel.Ambulance.Ambulance;
import Business_Model.Ecosystem;
import BusinessModel.UserAccount.User;
import BusinessModel.Patient.Patient;
import Business_Model.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.ReceptionRole.ReceptionWorkAreaJPanel;
/**
 *
 * @author aniketbhore
 */
public class AmbulanceWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceWorkAreaJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;

    public AmbulanceWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        System.out.println("inside amubulance work area");
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
        
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        System.out.println("inside amubulance network table");
        DefaultTableModel model = (DefaultTableModel) ManageAmbulanceTable.getModel();
        model.setRowCount(0);
        for (Ambulance ambulance : ecoSystem.getAmbulanceDirectory().getAmbulances()) {

            Object[] row = new Object[5];
            row[0] = ambulance;
            row[1] = ambulance.getDriverLastName();
            row[2] = ambulance.getDriverAge();
            row[3] = ambulance.getVehicleNo();
            row[4] = ambulance.getStatus();
            model.addRow(row);

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
        ManageAmbulanceTable = new javax.swing.JTable();
        btnCreateAmbulance = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnAssignPatient = new javax.swing.JButton();
        btnSubmit1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXISTING DRIVERS DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 950, 80));

        ManageAmbulanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Driver First Name", "Driver Last Name", "Age", "Vehicle Number", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ManageAmbulanceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 610, 410));

        btnCreateAmbulance.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnCreateAmbulance.setText("Create");
        btnCreateAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAmbulanceActionPerformed(evt);
            }
        });
        add(btnCreateAmbulance, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 46));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 127, 1280, 10));

        btnAssignPatient.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnAssignPatient.setText("Call ");
        btnAssignPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignPatientActionPerformed(evt);
            }
        });
        add(btnAssignPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 192, 46));

        btnSubmit1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnSubmit1.setText("Back");
        btnSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmit1ActionPerformed(evt);
            }
        });
        add(btnSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 770, 190, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAmbulanceActionPerformed
        // TODO add your handling code here:
        AmbulanceInformationJPanel ambulanceManipulationJPanel = new AmbulanceInformationJPanel(userProcessContainer, ecoSystem, userAccount);
        userProcessContainer.add("Add Patient", ambulanceManipulationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateAmbulanceActionPerformed

    private void btnAssignPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignPatientActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = ManageAmbulanceTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Ambulance ambulance = (Ambulance) ManageAmbulanceTable.getValueAt(selectedRowIndex, 0);
            if (!ambulance.getStatus().toLowerCase().equals("busy")) {
                ReceptionAmbulanceWorkAreaJPanel receptionAmbulanceWorkAreaJPanel = new ReceptionAmbulanceWorkAreaJPanel(userProcessContainer, ecoSystem, userAccount, ambulance);
                userProcessContainer.add("Add Patient", receptionAmbulanceWorkAreaJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Sorry! Ambulance Is Busy", "Warning", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnAssignPatientActionPerformed

    private void btnSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmit1ActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSubmit1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageAmbulanceTable;
    private javax.swing.JButton btnAssignPatient;
    private javax.swing.JButton btnCreateAmbulance;
    private javax.swing.JButton btnSubmit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}