/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainUserInterface.BookStore;

import BusinessModel.BookStore.BookStore;
import Business_Model.Ecosystem;
import BusinessModel.Student.StudentBills;
import BusinessModel.Student.Student;
import BusinessModel.UserAccount.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aniketbhore
 */
public class BookStoreWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookStoreWorkAreaJPanel
     */
   private final JPanel userProcessContainer;
    private final Ecosystem ecoSystem;
    User userAccount;
    BookStore bookstore;
    Student billStudent;
    
    public BookStoreWorkAreaJPanel(JPanel userProcessContainer, User account, Ecosystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = system;
        this.userAccount = account;
        this.billStudent = null;
        BloodRequestStatusBox.addItem("Select Status");
        BloodRequestStatusBox.addItem("Book Delivered");
        BloodRequestStatusBox.addItem("Unavailable");
        populateStudentTable();
    }
     private void populateBillTable() {
        DefaultTableModel model = (DefaultTableModel) BillTable.getModel();

        model.setRowCount(0);

        for (StudentBills b : billStudent.getsBills()) {
            
                Object[] row = new Object[4];
                row[0] = b.getName();
                row[1] = b.getOrgType();
                row[2] = b.getAmount();
                row[3] = b;
                if(b.getOrgType().toLowerCase().equals("book store"))
                {
                    model.addRow(row);
                }
        }
    }

    private void populateStudentTable() {
        DefaultTableModel model = (DefaultTableModel) ManagePatientTable.getModel();

        model.setRowCount(0);

        for (Student stud : ecoSystem.getStudentDirectory().getStudentList()) {
            if (stud.getsBookStoreStatus().equals("Requested") || stud.getsBookStoreStatus().equals("Unavailable")) {
                Object[] row = new Object[10];
                row[0] = stud.getsFirstName();
                row[1] = stud.getsFellowshipID();
                row[2] = stud.getsUserName();
                row[3] = stud.getsLastName();
                row[4] = stud.getsAge();
                row[5] = stud.getsFellowshipStatus();
                row[6] = stud.getsEmailAddress();
                row[7] = stud.getsBookStoreStatus();
                row[8] = stud.getsBooksQuantity();
                row[9] = stud;
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        ManagePatientTable = new javax.swing.JTable();
        lblCommunity = new javax.swing.JLabel();
        BloodRequestStatusBox = new javax.swing.JComboBox<>();
        btnProcessRequest = new javax.swing.JButton();
        lblPatientBill = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        btnTreatedPatientList = new javax.swing.JButton();
        btnBloodBankInfo = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BOOKSTORE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1270, 80));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 10));

        ManagePatientTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ManagePatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User Name", "FellowshipId", "First", "Last", "Age", "Address", "Email", "Request Status", "Quantity", "ob"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(ManagePatientTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1150, 190));

        lblCommunity.setBackground(new java.awt.Color(255, 255, 255));
        lblCommunity.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblCommunity.setForeground(new java.awt.Color(255, 255, 255));
        lblCommunity.setText("Book Request Status");
        add(lblCommunity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 30));

        BloodRequestStatusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BloodRequestStatusBoxActionPerformed(evt);
            }
        });
        add(BloodRequestStatusBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 162, 30));

        btnProcessRequest.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });
        add(btnProcessRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 190, 40));

        lblPatientBill.setBackground(new java.awt.Color(255, 255, 255));
        lblPatientBill.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        lblPatientBill.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientBill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientBill.setText("BILLS");
        add(lblPatientBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 1270, 83));

        BillTable.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Organization", "Amount", "ob"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane2.setViewportView(BillTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 1160, 191));

        btnTreatedPatientList.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnTreatedPatientList.setText("Show List");
        btnTreatedPatientList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatedPatientListActionPerformed(evt);
            }
        });
        add(btnTreatedPatientList, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 800, 300, 40));

        btnBloodBankInfo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnBloodBankInfo.setText("Information");
        btnBloodBankInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloodBankInfoActionPerformed(evt);
            }
        });
        add(btnBloodBankInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 800, 270, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void BloodRequestStatusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BloodRequestStatusBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BloodRequestStatusBoxActionPerformed

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = ManagePatientTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            Student stud = (Student) ManagePatientTable.getValueAt(selectedRowIndex, 9);

            for (Student s : ecoSystem.getStudentDirectory().getStudentList()) {
                if (stud.getsUserName().equals(s.getsUserName())) {
                    if (!((String) BloodRequestStatusBox.getSelectedItem()).equals("Select Status")) {
                        s.setsBookStoreStatus((String) BloodRequestStatusBox.getSelectedItem());
                        billStudent = s;
                        if (s.getsBookStoreStatus().equals("Book Delivered")) {
                            for (int book = 0; book < Integer.parseInt(billStudent.getsBooksQuantity()); book++) {
                                ecoSystem.getStudentDirectory().AddBill(billStudent, "Book Charges", "Book Store", "");
                                ecoSystem.getBookStore().AddPastStudentsList(billStudent);
                            }
                        }
                        break;
                    }
                }
            }

            populateStudentTable();
            populateBillTable();

        }

    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void btnTreatedPatientListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatedPatientListActionPerformed
        // TODO add your handling code here:
        PastStudentsJPanel pastStudentsJPanel = new PastStudentsJPanel(userProcessContainer,userAccount,ecoSystem);
        userProcessContainer.add("Display Enrolled Students", pastStudentsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnTreatedPatientListActionPerformed

    private void btnBloodBankInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloodBankInfoActionPerformed
        // TODO add your handling code here:
        BookStoreInfoJPanel BookStoreInfoJPanel = new BookStoreInfoJPanel(userProcessContainer, userAccount, ecoSystem);
        userProcessContainer.add("Book Store Information", BookStoreInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBloodBankInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JComboBox<String> BloodRequestStatusBox;
    private javax.swing.JTable ManagePatientTable;
    private javax.swing.JButton btnBloodBankInfo;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JButton btnTreatedPatientList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblPatientBill;
    // End of variables declaration//GEN-END:variables
}
