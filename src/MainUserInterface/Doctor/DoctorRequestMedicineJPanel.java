/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Doctor;

/**
 *
 * @author nehashende
 */
import Business_Model.Ecosystem;
import BusinessModel.Lab.Tests;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.Pharmacy.Medicine;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
public class DoctorRequestMedicineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRequestMedicineJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private User userAccount;
    private Patient patient;
    Medicine m;
    ArrayList<Medicine> items=new ArrayList<Medicine>();
    
    public DoctorRequestMedicineJPanel(JPanel userProcessContainer, User account, Ecosystem ecosystem, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = account;
        this.patient = patient;
        populatetableMedicine();
    }
    
    private void populatetableMedicine() {
        DefaultTableModel model = (DefaultTableModel) tableRequestMedicine1.getModel();

        model.setRowCount(0); 

        for (Medicine t : ecosystem.getPharmacy().getmedList()) {

            
               Object[] row = new Object[4];                
                row[0] = t;
                row[1] = t.getUsage();
                row[2] =t.getQuantity();
                row[3] = t.getPrice();
                model.addRow(row);
        }
    }
    public void populateCart(Medicine item){
        DefaultTableModel model = (DefaultTableModel) cartTableMedicines.getModel();
        model.setRowCount(0);
        
         items.add(item);
         Object[] row = new Object[4];
                for(Medicine t:items){
                     row[0] = t;
                row[1] = t.getUsage();
                row[2] =t.getQuantity();
                row[3] = t.getPrice();
                model.addRow(row);
                }  
     }
    private void populatePatientTable() {
        //DefaultTableModel model = (DefaultTableModel) tableAddedLabTest.getModel();

        //model.setRowCount(0);

        for (Patient patient : ecosystem.getPatientDirectory().getPatientList()) {

            Object[] row = new Object[7];
            row[0] = patient.getpUserName();
            row[1] = patient.getpHealthInsuranceID();
            row[2] = patient.getpFirstName();
            row[3] = patient.getpLastName();
            row[4] = patient.getpAge();
            row[5] = patient.getpAddress();
            row[6] = patient.getpEmailAddress();
            
          //  model.addRow(row);

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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRequestMedicine1 = new javax.swing.JTable();
        btnAddMedicine1 = new javax.swing.JButton();
        btnRemoveMedicine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTableMedicines = new javax.swing.JTable();
        Request1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Request = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Request ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 530, -1));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        tableRequestMedicine1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tableRequestMedicine1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meal Name", "Meal Specifics", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableRequestMedicine1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 720, 170));

        btnAddMedicine1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        btnAddMedicine1.setText("ADD");
        btnAddMedicine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMedicine1ActionPerformed(evt);
            }
        });
        add(btnAddMedicine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 90, 47));

        btnRemoveMedicine.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        btnRemoveMedicine.setText("REMOVE");
        btnRemoveMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveMedicineActionPerformed(evt);
            }
        });
        add(btnRemoveMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 120, 46));

        cartTableMedicines.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        cartTableMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Meal Name", "Meal Specifics", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTableMedicines);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 770, 170));

        Request1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Request1.setText("Back");
        Request1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Request1ActionPerformed(evt);
            }
        });
        add(Request1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 740, 110, 42));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Selected ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        Request.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Request.setText("Request");
        Request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestActionPerformed(evt);
            }
        });
        add(Request, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 560, 160, 42));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMedicine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMedicine1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableRequestMedicine1.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Medicine item=(Medicine)tableRequestMedicine1.getValueAt(selectedRow, 0);

            populateCart(item);

        }
    }//GEN-LAST:event_btnAddMedicine1ActionPerformed

    private void btnRemoveMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveMedicineActionPerformed
        // TODO add your handling code here:
        int selectedRow = cartTableMedicines.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            Medicine item=(Medicine)cartTableMedicines.getValueAt(selectedRow, 0);
            items.remove(item);
            DefaultTableModel model = (DefaultTableModel) cartTableMedicines.getModel();
            model.setRowCount(0);
            Object[] row = new Object[4];
            for(Medicine t:items){
                row[0] = t;
                row[1] = t.getUsage();
                row[2] =t.getQuantity();
                row[3] = t.getPrice();
                model.addRow(row);
            }
        }

    }//GEN-LAST:event_btnRemoveMedicineActionPerformed

    private void Request1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Request1ActionPerformed
        // TODO add your handling code here:
        DoctorVisitJPanel doctorVisit = new DoctorVisitJPanel(userProcessContainer, userAccount, ecosystem, patient);
        userProcessContainer.add("Visit Doctor", doctorVisit);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Request1ActionPerformed

    private void RequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestActionPerformed
        // TODO add your handling code here:
        if(items.size()==0){
            JOptionPane.showMessageDialog(null,"Please add test to the cart.","Warning",JOptionPane.WARNING_MESSAGE);

        }
        else{
            for(Medicine t:items){
                //String itemName,String organization1,float itemAmount, String result, String itemStatus

                PatientBills bill = new PatientBills(t.getMedName(), "Pharmacy", t.getPrice(),"","Requested");
                patient.addbill(bill);

                //ecosystem.AddTreatedPatientList(patient);
            }
            ecosystem.getPharmacy().AddpharmaRecordList(patient);
            patient.setpPharmaStatus("Requested");

            DoctorVisitJPanel doctorVisit = new DoctorVisitJPanel(userProcessContainer, userAccount, ecosystem, patient);
            userProcessContainer.add("Visit Doctor", doctorVisit);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_RequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Request;
    private javax.swing.JButton Request1;
    private javax.swing.JButton btnAddMedicine1;
    private javax.swing.JButton btnRemoveMedicine;
    private javax.swing.JTable cartTableMedicines;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableRequestMedicine1;
    // End of variables declaration//GEN-END:variables
}
