/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Ambulance;
import BusinessModel.Ambulance.Ambulance;
import Business_Model.Ecosystem;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import MainUserInterface.ReceptionRole.UpdatePatientJPanel;

/**
 *
 * @author aniketbhore
 */
public class DisplayAmbulancePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayAmbulancePatientJPanel
     */
    private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    private User userAccount;

    public DisplayAmbulancePatientJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.ecoSystem = system;
        PopulateAmbulanceTable();
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
        btnCurrentPatient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AmbulanceTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 94, 218));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 1409, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1432, 10));

        btnCurrentPatient.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnCurrentPatient.setForeground(new java.awt.Color(204, 0, 0));
        btnCurrentPatient.setText("Current Student");
        btnCurrentPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCurrentPatientActionPerformed(evt);
            }
        });
        add(btnCurrentPatient, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 200, 40));

        AmbulanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Driver First Name", "Driver Last Name", "Age", "Vehicle Number", "Ambulance Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AmbulanceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 1390, 191));
    }// </editor-fold>//GEN-END:initComponents
private void PopulateAmbulanceTable() {
        DefaultTableModel model = (DefaultTableModel) AmbulanceTable.getModel();

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
    private void btnCurrentPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCurrentPatientActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = AmbulanceTable.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            Ambulance ambulance = (Ambulance) AmbulanceTable.getValueAt(selectedRowIndex, 0);
            if (ambulance.getStatus().toLowerCase().equals("busy")) {
                CurrentPatientDetailsJPanel currentPatientDetailsJPanel = new CurrentPatientDetailsJPanel(userProcessContainer, userAccount, ecoSystem, ambulance);
                userProcessContainer.add("Display Current Patient", currentPatientDetailsJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No Active Patients Assigned", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCurrentPatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AmbulanceTable;
    private javax.swing.JButton btnCurrentPatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
