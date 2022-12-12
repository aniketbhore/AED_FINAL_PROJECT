/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Pharmacy;

//import java.awt.CardLayout;

import Business_Model.Ecosystem;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import Business_Model.Ecosystem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


//import Business_Model.Ecosystem;
//import Business.Patient.Bills;
//import BusinessModel.Patient.Patient;
//import BusinessModel.UserAccount.User;
//import BusinessModel.Patient.Patient;
//import javax.swing.JPanel;
//import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JANVI
 */
public class PharmacyPastRequest extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyPastRequest
     */
    Patient p;
    JPanel userProcessContainer;
    User account;
    Ecosystem ecoSystem;




    public PharmacyPastRequest(JPanel userProcessContainer, User account, Patient p,Ecosystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecoSystem = ecoSystem;
        this.p = p;
        jLabel3.setText("Customer Name: "+p.getpFirstName()+" "+p.getpLastName());
        populateBillTable();
        
    }
    
        private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();



       model.setRowCount(0);



       for (PatientBills b : p.getpBills()) {



           Object[] row = new Object[7];
            row[0] = b.getName();
            row[1] = b.getOrgType();
            row[2] = b.getAmount();
            row[3] = b.getStatus();
            row[4] = b.getResult();
            



           if(b.getOrgType().equals("Pharmacy")&&b.getStatus().equals("Delivered")){



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
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 60, 1414, 40));

        BillTable.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        BillTable.setForeground(new java.awt.Color(255, 255, 255));
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Ammount", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BillTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 891, 244));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Delivered");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 170, 50));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 380, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        PharmacyWorkAreaJPanel bill = new PharmacyWorkAreaJPanel(userProcessContainer, account, ecoSystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
