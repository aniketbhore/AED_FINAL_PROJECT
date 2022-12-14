/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.ReceptionRole;
import BusinessModel.Student.Student;
import BusinessModel.Student.StudentBills;
import BusinessModel.UserAccount.User;
//import BusinessUtil.Mail.SendMail;
import Business_Model.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.Transport.TransportWorkAreaJPanel;
import MainUserInterface.Transport.ReceptionTransportWorkAreaJPanel;
/**
 *
 * @author aniketbhore
 */
public class ReceptionGraduate extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionDischargeJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;

    public ReceptionGraduate(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        populateNetworkTable();
    }

    private void populateNetworkTable() {
         DefaultTableModel model = (DefaultTableModel) ManageCustomersTable.getModel();

        model.setRowCount(0);

        for (Student patient : ecoSystem.getStudentDirectory().getStudentList()) {

            Object[] row = new Object[10];
            row[0] = patient.getsFirstName();
            row[1] = patient.getsLastName();
            row[2] = patient.getsGender();
            row[3] = patient.getsFellowshipID();
            row[4] = patient.getsAge();
            row[5] = patient.getsEmailAddress();
            row[6] = patient.getsFellowshipStatus();
            row[7] = patient.getsStatus();
            row[8] = patient;
            if(patient.getsStatus().equals("Ready to Graduate")){
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageCustomersTable = new javax.swing.JTable();
        btnUpdateAmbulanceRecord = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();
        btnUpdateAmbulanceRecord1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GRADUATE STUDENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 640, 80));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 92, 1260, 10));

        ManageCustomersTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ManageCustomersTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ManageCustomersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "Gender", "Id", "Age", "Email", "Payment", " Status", "ob"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 1190, 216));

        btnUpdateAmbulanceRecord.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnUpdateAmbulanceRecord.setText("Graduate");
        btnUpdateAmbulanceRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAmbulanceRecordActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateAmbulanceRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 140, 40));

        btnUpdate1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnUpdate1.setText("Send to Fellowship Department");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 500, 350, 40));

        btnUpdateAmbulanceRecord1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        btnUpdateAmbulanceRecord1.setText("Back");
        btnUpdateAmbulanceRecord1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAmbulanceRecord1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateAmbulanceRecord1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateAmbulanceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAmbulanceRecordActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = ManageCustomersTable.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Student p = (Student) ManageCustomersTable.getValueAt(selectedRowIndex, 8);
            int totalAmount = 0;
            for (StudentBills b : p.getsBills()) {
                totalAmount += b.getAmount();
            }
            if(p.getsFellowshipStatus().equals("Verifying Fellowship")){
                JOptionPane.showMessageDialog(null, "Cannot graduate verifying fellowship.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(p.getsFellowshipStatus().equals("Cash")||p.getsFellowshipStatus().equals("Rejected")){
                p.setsStatus("Graduated");
                //SendMail.sendMail(patient.getpEmailAddress(), "Hello "+patient.getpFirstName()+", you have been discharged and your total bill amount is "+String.valueOf(totalAmount));
                JOptionPane.showMessageDialog(null, "Cash payment Received.Student has graduated.", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                p.setsStatus("Graduated");
                //SendMail.sendMail(patient.getpEmailAddress(), "Hello "+patient.getpFirstName()+", you have been discharged and your total bill amount is "+String.valueOf(totalAmount));
                JOptionPane.showMessageDialog(null, "Fellowship valid. Student has graduated.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
            
            populateNetworkTable();
            
        }
    }//GEN-LAST:event_btnUpdateAmbulanceRecordActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = ManageCustomersTable.getSelectedRow();
        if (selectedRowIndex < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row from the table!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            Student p = (Student) ManageCustomersTable.getValueAt(selectedRowIndex, 8);

            if(p.getsFellowshipStatus().equals("Verifying Insurance")||p.getsFellowshipStatus().equals("Rejected")||p.getsFellowshipStatus().equals("Approved")){
                JOptionPane.showMessageDialog(null, "Already Verifying or verified", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(p.getsFellowshipStatus().equals("Cash")){
                JOptionPane.showMessageDialog(null, "Cash payment method is not eligible.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                ecoSystem.getFellowshipDirectory().addServedCustomers(p);
                p.setsFellowshipStatus("Verifying Fellowship");
                p.setsPoliceStatus("Not Verified");
                try{
                   
                }
                catch(Exception e){}
                JOptionPane.showMessageDialog(null, "Sent to Fellowship Approval", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }
            
            populateNetworkTable();
            
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnUpdateAmbulanceRecord1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAmbulanceRecord1ActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Student Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdateAmbulanceRecord1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageCustomersTable;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdateAmbulanceRecord;
    private javax.swing.JButton btnUpdateAmbulanceRecord1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
