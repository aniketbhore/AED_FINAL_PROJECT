/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Patient;

import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nehashende
 */
public class PatientBillJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientBillJPanel
     */
    JPanel userProcessContainer;
    Patient patient;
    
    public PatientBillJPanel(JPanel userProcessContainer, Patient p) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = p;
        lblPatientName.setText(patient.getpFirstName() + " " + patient.getpLastName());
        populateBillTable();
    }

    private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTalble.getModel();

        model.setRowCount(0);

        for (PatientBills b : patient.getpBills()) {

            Object[] row = new Object[7];
            row[0] = b.getName();
            row[1] = b.getOrgType();
            row[2] = b.getAmount();
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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BillTalble = new javax.swing.JTable();
        lblPatientName = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILL");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 1300, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1300, 10));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 1450, 420));

        BillTalble.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BillTalble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount"
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
        jScrollPane1.setViewportView(BillTalble);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 640, 1294, 180));

        lblPatientName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 311, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTalble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPatientName;
    // End of variables declaration//GEN-END:variables
}