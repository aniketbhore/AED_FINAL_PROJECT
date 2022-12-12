/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.ReceptionRole;

import Business_Model.Ecosystem;
import MainUserInterface.Patient.*;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aniketbhore
 */
public class BillJPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form BillJPanel
     */
    JPanel userProcessContainer;
    Patient patient;
    User account;
    Ecosystem system;
    public BillJPanel(JPanel userProcessContainer, Patient p,User account,Ecosystem system) {
        initComponents();
        this.account = account;
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        this.patient = p;
        lblPatientName.setText(patient.getpFirstName() + " " + patient.getpLastName());
        populateBillTable();
    }

    private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) talble.getModel();
        model.setRowCount(0);
        int totalAmount = 0;
        for (PatientBills b : patient.getpBills()) {
            Object[] row = new Object[7];
            row[0] = b.getName();
            row[1] = b.getOrgType();
            row[2] = b.getAmount();
            totalAmount += b.getAmount();
            model.addRow(row);
        }
        this.totalAmounttxt.setText(String.valueOf(totalAmount));
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        bckBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        talble = new javax.swing.JTable();
        textBill = new javax.swing.JLabel();
        totalAmounttxt = new javax.swing.JTextField();
        lblPatientName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BILLING INFORMATION");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 437, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 1915, 10));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 437, -1));

        bckBtn.setFont(new java.awt.Font("Microsoft JhengHei", 1, 18)); // NOI18N
        bckBtn.setText(" Back");
        bckBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bckBtnActionPerformed(evt);
            }
        });
        add(bckBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 640, 120, 40));

        talble.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        talble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Charged for", "Organization", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(talble);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 550, 251));

        textBill.setBackground(new java.awt.Color(255, 255, 255));
        textBill.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        textBill.setForeground(new java.awt.Color(255, 255, 255));
        textBill.setText("Total bill :");
        add(textBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, -1, 30));
        add(totalAmounttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 570, 120, 30));

        lblPatientName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientName.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 24)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 347, 44));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1255, 406, 481, 387));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MainUserInterface/Images/istockphoto-1089688182-612x612.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, 580, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void bckBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bckBtnActionPerformed
        // TODO add your handling code here:
        ReceptionWorkAreaJPanel patientBillJPanel = new ReceptionWorkAreaJPanel(userProcessContainer,account,system);
        userProcessContainer.add("Patient Bill", patientBillJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_bckBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bckBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTable talble;
    private javax.swing.JLabel textBill;
    private javax.swing.JTextField totalAmounttxt;
    // End of variables declaration//GEN-END:variables
}
