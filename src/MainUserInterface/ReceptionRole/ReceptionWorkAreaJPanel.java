/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.ReceptionRole;
import Business_Model.Ecosystem;

import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import Business_Model.Ecosystem;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Ambulance.AmbulanceWorkAreaJPanel;
/**
 *
 * @author aniketbhore
 */
public class ReceptionWorkAreaJPanel extends javax.swing.JPanel {
private final JPanel userProcessContainer;

    private final Ecosystem ecoSystem;
    User userAccount;
    /**
     * Creates new form ReceptionWorkAreaJPanel
     */
    public ReceptionWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem system) {

        initComponents();
        System.out.println("inside Reception work area");
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        System.out.println("existing patients in the portal ---");
        for (Patient patient : ecoSystem.getPatientDirectory().getPatientList()) {
            System.out.println("patient---"+patient.getpFirstName());
        }
        populateNetworkTable();
    }

    private void populateNetworkTable() {
        
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();
        model.setRowCount(0);
        for (Patient patient : ecoSystem.getPatientDirectory().getPatientList()) {
            Object[] row = new Object[11];
            row[0] = patient.getpFirstName();
            row[1] = patient.getpLastName();
            row[2] = patient.getpHealthInsuranceID();
            row[3] = patient.getpAge(); 
            row[4] = patient.getpEmailAddress();
            row[5] = patient.getpStatus();
            row[6] = patient;
            if(!patient.getpStatus().equals("Discharged")){
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

        createPatBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        billPatBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        updateAmbulRecBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        createPatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        createPatBtn.setText("CREATE");
        createPatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPatBtnActionPerformed(evt);
            }
        });
        add(createPatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 250, 260, 42));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT MANAGEMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 45, 860, 80));

        patientTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Id", "Age", "Email Id", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 215, 920, 531));

        billPatBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        billPatBtn.setText("BILL");
        billPatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billPatBtnActionPerformed(evt);
            }
        });
        add(billPatBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 800, 260, 42));

        delBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        delBtn.setText("DELETE");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, 260, 42));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Current List");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 155, -1, 50));

        btnUpdate1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        btnUpdate1.setText("UPDATE");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 260, 42));

        jButton2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton2.setText("PAST STUDENTS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 800, 260, 42));

        updateAmbulRecBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        updateAmbulRecBtn.setText("SCHOOL-BUS");
        updateAmbulRecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAmbulRecBtnActionPerformed(evt);
            }
        });
        add(updateAmbulRecBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 800, 260, 42));

        jButton1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jButton1.setText("DISMISS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 800, 260, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void createPatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPatBtnActionPerformed
        // TODO add your handling code here:
        try{
            CreatePatientJPanel createPatient = new CreatePatientJPanel(userProcessContainer, ecoSystem, userAccount);
            userProcessContainer.add("Add Patient", createPatient);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }catch(Exception e){
            System.out.println("exception due to---"+e.getMessage());
        }

    }//GEN-LAST:event_createPatBtnActionPerformed

    private void billPatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billPatBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {

            Patient patient = (Patient) patientTable.getValueAt(selectedRow, 6);
            BillJPanel patientBillJPanel = new BillJPanel(userProcessContainer, patient,userAccount,ecoSystem);
            userProcessContainer.add("Patient Bill", patientBillJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
            populateNetworkTable();

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }
    }//GEN-LAST:event_billPatBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Delete User: " + "??", "Warning", selectionButton);
            if (selectionResult == JOptionPane.YES_OPTION) {

                Patient p = (Patient) patientTable.getValueAt(selectedRow, 6);
                //System.out.print(p.getGender());
                ecoSystem.getUserAccountDirectory().deleteUser(p.getpUserName());
                //UserAccount user = (UserAccount) networkJTable.getValueAt(selectedRow, 0);
                ecoSystem.getPatientDirectory().deletePatient(p);
                populateNetworkTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ReceptionDischarge receptionDischarge = new ReceptionDischarge(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Discharge", receptionDischarge);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PastRecords pastRecords = new PastRecords(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Past Records", pastRecords);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if (selectedRow >= 0) {

            Patient patient = (Patient) patientTable.getValueAt(selectedRow, 6);
            UpdatePatientJPanel ambulanceWorkAreaJPanel = new UpdatePatientJPanel(userProcessContainer, ecoSystem, userAccount, patient);
            userProcessContainer.add("Discharge", ambulanceWorkAreaJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Patient!");
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void updateAmbulRecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAmbulRecBtnActionPerformed
        // TODO add your handling code here:
        try{
            System.out.println("ambulance record button clicked");
            AmbulanceWorkAreaJPanel ambulanceWAJPanel = new AmbulanceWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            //AmbulanceWorkAreaJPanel ambulanceWorkAreaJPanel = new AmbulanceWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
            userProcessContainer.add("AmbulanceWorkArea", ambulanceWAJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        catch(Exception e){
            System.out.println("exception due to---"+e.getMessage());
        }

    }//GEN-LAST:event_updateAmbulRecBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton billPatBtn;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton createPatBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton updateAmbulRecBtn;
    // End of variables declaration//GEN-END:variables
}
