package MainUserInterface.InsuranceAuthority;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
import Business_Model.Ecosystem;
import BusinessModel.Patient.PatientBills;
import BusinessModel.Patient.Patient;
import BusinessModel.UserAccount.User;
import MainUserInterface.InsuranceAuthority.InsuranceWorkAreaJPanel;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nehashende
 */
public class PastCustomerInfo extends javax.swing.JPanel {

    /**
     * Creates new form PastCustomerInfo
     */
        JPanel userProcessContainer;
    Patient patient;
    User user;
    Ecosystem ecoSystem;
    public PastCustomerInfo(JPanel userProcessContainer, Ecosystem business, Patient p, User account) {
        initComponents();
        this.ecoSystem = business;
        this.userProcessContainer = userProcessContainer;
        this.patient = p;
        this.user = account;
        txtpFirstName.setText(p.getpFirstName());
        txtpName.setText(p.getpLastName());
        txtpAddress.setText(p.getpAddress());
        txtpAge.setText(Integer.toString(p.getpAge()));
        txtpGender.setText(p.getpGender());
        txtpInsuranceID.setText(p.getpHealthInsuranceID());
        txtpNumber.setText(p.getpPhoneNo());
        txtInsStatus.setText(p.getpInsuranceStatus());
        populateBillTable();
    }
          private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) talbleForBilling.getModel();

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
        txtpFirstName = new javax.swing.JTextField();
        txtpName = new javax.swing.JTextField();
        txtpAddress = new javax.swing.JTextField();
        txtpInsuranceID = new javax.swing.JTextField();
        txtpAge = new javax.swing.JTextField();
        txtpGender = new javax.swing.JTextField();
        txtpNumber = new javax.swing.JTextField();
        txtInsStatus = new javax.swing.JTextField();
        lblInsStatus = new javax.swing.JLabel();
        lblPPhone = new javax.swing.JLabel();
        lblPGender = new javax.swing.JLabel();
        lblPAge = new javax.swing.JLabel();
        lblPInsuranceID = new javax.swing.JLabel();
        lblPAddress = new javax.swing.JLabel();
        lblPLastName = new javax.swing.JLabel();
        lblPFirstName = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        talbleForBilling = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 20, 1090, -1));

        txtpFirstName.setEditable(false);
        add(txtpFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 166, 150, 30));

        txtpName.setEditable(false);
        txtpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpNameActionPerformed(evt);
            }
        });
        add(txtpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, 30));

        txtpAddress.setEditable(false);
        txtpAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpAddressActionPerformed(evt);
            }
        });
        add(txtpAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 30));

        txtpInsuranceID.setEditable(false);
        txtpInsuranceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpInsuranceIDActionPerformed(evt);
            }
        });
        add(txtpInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 150, 30));

        txtpAge.setEditable(false);
        txtpAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpAgeActionPerformed(evt);
            }
        });
        add(txtpAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 150, 30));

        txtpGender.setEditable(false);
        txtpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpGenderActionPerformed(evt);
            }
        });
        add(txtpGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 150, 30));

        txtpNumber.setEditable(false);
        add(txtpNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 150, 30));

        txtInsStatus.setEditable(false);
        add(txtInsStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 150, 30));

        lblInsStatus.setBackground(new java.awt.Color(255, 255, 255));
        lblInsStatus.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblInsStatus.setForeground(new java.awt.Color(255, 255, 255));
        lblInsStatus.setText("Insurance Status");
        add(lblInsStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, -1, -1));

        lblPPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPPhone.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPPhone.setText("Phone Number");
        add(lblPPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        lblPGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPGender.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPGender.setForeground(new java.awt.Color(255, 255, 255));
        lblPGender.setText("Gender");
        add(lblPGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 70, -1));

        lblPAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPAge.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPAge.setForeground(new java.awt.Color(255, 255, 255));
        lblPAge.setText("Age");
        add(lblPAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 50, -1));

        lblPInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPInsuranceID.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPInsuranceID.setForeground(new java.awt.Color(255, 255, 255));
        lblPInsuranceID.setText("InsuranceID");
        add(lblPInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 106, -1));

        lblPAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPAddress.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblPAddress.setText("Address");
        add(lblPAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        lblPLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPLastName.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblPLastName.setText("Last Name");
        add(lblPLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 116, -1));

        lblPFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPFirstName.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        lblPFirstName.setForeground(new java.awt.Color(255, 255, 255));
        lblPFirstName.setText("First Name");
        add(lblPFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 116, -1));

        backBtn.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 153, 204));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 196, 47));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1295, 10));

        talbleForBilling.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        talbleForBilling.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(talbleForBilling);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 730, 380));
    }// </editor-fold>//GEN-END:initComponents

    private void txtpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpNameActionPerformed

    private void txtpAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpAddressActionPerformed

    private void txtpInsuranceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpInsuranceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpInsuranceIDActionPerformed

    private void txtpAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpAgeActionPerformed

    private void txtpGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpGenderActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        //patient.setInsuranceStatus("Approved");
        InsuranceWorkAreaJPanel bill = new InsuranceWorkAreaJPanel(userProcessContainer, user, ecoSystem);
        userProcessContainer.add("Insurance main", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblInsStatus;
    private javax.swing.JLabel lblPAddress;
    private javax.swing.JLabel lblPAge;
    private javax.swing.JLabel lblPFirstName;
    private javax.swing.JLabel lblPGender;
    private javax.swing.JLabel lblPInsuranceID;
    private javax.swing.JLabel lblPLastName;
    private javax.swing.JLabel lblPPhone;
    private javax.swing.JTable talbleForBilling;
    private javax.swing.JTextField txtInsStatus;
    private javax.swing.JTextField txtpAddress;
    private javax.swing.JTextField txtpAge;
    private javax.swing.JTextField txtpFirstName;
    private javax.swing.JTextField txtpGender;
    private javax.swing.JTextField txtpInsuranceID;
    private javax.swing.JTextField txtpName;
    private javax.swing.JTextField txtpNumber;
    // End of variables declaration//GEN-END:variables
}