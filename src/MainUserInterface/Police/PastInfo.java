/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.Police;

import Business_Model.Ecosystem;
import Business_Model.Ecosystem;
import BusinessModel.Student.Student;
import BusinessModel.Student.Student;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author nehashende
 */
public class PastInfo extends javax.swing.JPanel {

    /**
     * Creates new form PastInfo
     */
    JPanel userProcessContainer;
    Student stud;
    Ecosystem ecoSystem;
    User account;
    public PastInfo(JPanel userProcessContainer, Ecosystem business, Student p,User account) {
        initComponents();
        this.ecoSystem = business;
        this.userProcessContainer = userProcessContainer;
        this.stud = p;
        this.account = account;
        txtFirstName.setText(p.getsFirstName());
        txtLastName.setText(p.getsLastName());
        txtAddress.setText(p.getsAddress());
        try{
        SimpleDateFormat input =new SimpleDateFormat("yyyy-MM-dd");
        txtAge.setText((input.format(p.getsdob())));
        }
        catch(Exception e){}
        txtGender.setText(p.getsGender());
        txtHealthInsuranceID.setText(p.getsFellowshipID());
        txtPhoneNumber.setText(p.getsPhoneNo());
        txtInsuranceStatus.setText(p.getsPickupLocation());
        txtPoliceVerification.setText(p.getsPoliceStatus());
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
        lblPatientFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblPatientLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPatientAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPatientHealthInsuranceID = new javax.swing.JLabel();
        txtHealthInsuranceID = new javax.swing.JTextField();
        lblPatientAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblPatientGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblPatientPhone = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblPatientHealthInsuranceID1 = new javax.swing.JLabel();
        txtInsuranceStatus = new javax.swing.JTextField();
        lblPatientPhone1 = new javax.swing.JLabel();
        txtPoliceVerification = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERSONAL INFORMATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1390, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1402, 10));
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 100, 100));

        lblPatientFirstName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientFirstName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientFirstName.setText("First Name");
        add(lblPatientFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 116, -1));

        txtFirstName.setEditable(false);
        add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 150, 31));

        lblPatientLastName.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientLastName.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientLastName.setText("Last Name");
        add(lblPatientLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 116, -1));

        txtLastName.setEditable(false);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 150, 31));

        lblPatientAddress.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAddress.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAddress.setText("Address");
        add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        txtAddress.setEditable(false);
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 150, 31));

        lblPatientHealthInsuranceID.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID.setText("ID");
        add(lblPatientHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 30, -1));

        txtHealthInsuranceID.setEditable(false);
        txtHealthInsuranceID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthInsuranceIDActionPerformed(evt);
            }
        });
        add(txtHealthInsuranceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 150, 31));

        lblPatientAge.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientAge.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientAge.setText("Date Of Birth");
        add(lblPatientAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 130, -1));

        txtAge.setEditable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 260, 150, 31));

        lblPatientGender.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientGender.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientGender.setText("Gender");
        add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 98, -1));

        txtGender.setEditable(false);
        add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 150, 31));

        lblPatientPhone.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone.setText("Phone Number");
        add(lblPatientPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        txtPhoneNumber.setEditable(false);
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, 150, 31));

        lblPatientHealthInsuranceID1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientHealthInsuranceID1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientHealthInsuranceID1.setText("Location");
        add(lblPatientHealthInsuranceID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        txtInsuranceStatus.setEditable(false);
        txtInsuranceStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInsuranceStatusActionPerformed(evt);
            }
        });
        add(txtInsuranceStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 420, 150, 31));

        lblPatientPhone1.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientPhone1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblPatientPhone1.setText("Police Verification");
        add(lblPatientPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        txtPoliceVerification.setEditable(false);
        add(txtPoliceVerification, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 150, 31));

        jButton1.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtHealthInsuranceIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthInsuranceIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthInsuranceIDActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtInsuranceStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInsuranceStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInsuranceStatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        PoliceWorkAreaJPanel bill = new PoliceWorkAreaJPanel(userProcessContainer,account,ecoSystem);
        userProcessContainer.add("Police Workarea", bill);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientHealthInsuranceID;
    private javax.swing.JLabel lblPatientHealthInsuranceID1;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPatientPhone;
    private javax.swing.JLabel lblPatientPhone1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtHealthInsuranceID;
    private javax.swing.JTextField txtInsuranceStatus;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPoliceVerification;
    // End of variables declaration//GEN-END:variables
}
