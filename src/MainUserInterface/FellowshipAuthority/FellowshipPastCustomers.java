/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.FellowshipAuthority;

import Business_Model.Ecosystem;
import BusinessModel.Student.Student;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehashende
 */
public class FellowshipPastCustomers extends javax.swing.JPanel {

    /**
     * Creates new form FellowshipPastCustomers
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    
    public FellowshipPastCustomers(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        
        populatePatientTable1();
    }
    private void populatePatientTable1() {
        DefaultTableModel model = (DefaultTableModel) patientTable.getModel();

        model.setRowCount(0);

        for (Student stud : ecoSystem.getFellowshipDirectory().getFellowshipRecord()) {

            Object[] row = new Object[7];
            row[0] = stud;
            row[1] = stud.getsLastName();
            row[2] = Float.toString(ecoSystem.getStudentDirectory().billTotal(stud));
            row[3] = stud.getsFellowshipID();
            row[6] = stud.getsFellowshipStatus();
            row[5] = stud.getsPoliceStatus();
            row[4] = stud.getsEmailAddress();
            if(!stud.getsFellowshipStatus().equals("Verifying Fellowship")){
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        viewDtlsBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 153, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FELLOWSHIP DEPARTMENT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 30, 1400, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1400, 10));

        viewDtlsBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        viewDtlsBtn.setForeground(new java.awt.Color(204, 0, 0));
        viewDtlsBtn.setText("View Details");
        viewDtlsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDtlsBtnActionPerformed(evt);
            }
        });
        add(viewDtlsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, 170, 60));

        backBtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(204, 0, 0));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, 160, 60));

        patientTable.getTableHeader().setFont(new java.awt.Font("Trebuchet MS", 1, 16));
        patientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Last", "Total Charges", "FellowshipID", "Email", "Police Verification", "Fellowship Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(patientTable);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 990, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void viewDtlsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDtlsBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{

            Student d = (Student) patientTable.getValueAt(selectedRow, 0);
            //d.get
            PastCustomerInfo bill = new PastCustomerInfo(userProcessContainer,ecoSystem, d, userAccount);
            userProcessContainer.add("Past Student", bill);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_viewDtlsBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        FellowshipWorkAreaJPanel bill = new FellowshipWorkAreaJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton viewDtlsBtn;
    // End of variables declaration//GEN-END:variables
}
