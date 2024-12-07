/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankEnterprise;

import bankEnterprise.bank.Model.bankresponse;
//import emergencyEnterprise.crimeReport;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;


/**
 *
 * @author akshtalati
 */
public class bankAction extends javax.swing.JFrame {

    /**
     * 
     */
    public bankAction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        accountTxt = new javax.swing.JTextField();
        operationTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        bankserviceTable = new javax.swing.JTable();
        amountTxt = new javax.swing.JTextField();
        employeeTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        actionTakenTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        policeTableD = new javax.swing.JTable();
        viewDBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();
        viewDBtn1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnStudLogout = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnReportCrime1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Employee Action");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 91, 181, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Employee:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 311, -1, -1));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Action Taken:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 352, -1, -1));
        jPanel3.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 144, 205, -1));
        jPanel3.add(accountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 185, 205, -1));
        jPanel3.add(operationTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 226, 205, -1));

        bankserviceTable.setBackground(new java.awt.Color(0, 102, 102));
        bankserviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Account Type", "Operation", "Amount"
            }
        ));
        bankserviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bankserviceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bankserviceTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 144, 425, 228));
        jPanel3.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 267, 205, -1));

        employeeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeTxtActionPerformed(evt);
            }
        });
        jPanel3.add(employeeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 308, 205, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("UserName:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 147, -1, -1));
        jPanel3.add(actionTakenTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 349, 205, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Account Type:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 188, -1, -1));

        viewBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel3.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Operation:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 229, -1, -1));

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel3.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 390, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Amount:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 270, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/(resized)Northeastern-University-Logo-1922.png"))); // NOI18N
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/(resized)360_F_57320294_h4BEO6momplKt9RcL4gpqaAzWzJYpmxM.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        jTabbedPane1.addTab("Bank Action", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        policeTableD.setBackground(new java.awt.Color(0, 102, 102));
        policeTableD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Age", "Phone", "Salary", "Designation"
            }
        ));
        policeTableD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                policeTableDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(policeTableD);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 79, 424, 337));

        viewDBtn.setBackground(new java.awt.Color(0, 102, 102));
        viewDBtn.setText("View");
        viewDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewDBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 434, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Police");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 52, 57, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Student");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 52, 77, -1));

        studentTable.setBackground(new java.awt.Color(0, 102, 102));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Email", "Age", "LoanAmount"
            }
        ));
        jScrollPane2.setViewportView(studentTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 79, 387, 337));

        viewDBtn1.setBackground(new java.awt.Color(0, 102, 102));
        viewDBtn1.setText("View");
        viewDBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(viewDBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 434, -1, -1));


        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/(resized)360_F_57320294_h4BEO6momplKt9RcL4gpqaAzWzJYpmxM.png"))); // NOI18N

        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        jTabbedPane1.addTab("Status", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStudLogout.setBackground(new java.awt.Color(0, 102, 102));
        btnStudLogout.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnStudLogout.setText("Logout");
        btnStudLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 279, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Report a crime to NUPD?");

        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));


        btnReportCrime1.setBackground(new java.awt.Color(0, 0, 0));
        btnReportCrime1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnReportCrime1.setForeground(new java.awt.Color(255, 255, 255));
        btnReportCrime1.setText("Report Crime");
        btnReportCrime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportCrime1ActionPerformed(evt);
            }
        });

        jPanel2.add(btnReportCrime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, -1, -1));


        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("End Current Session?");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));


        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/(resized)360_F_57320294_h4BEO6momplKt9RcL4gpqaAzWzJYpmxM.png"))); // NOI18N

        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accounting-watts-scaled.jpg"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        jTabbedPane1.addTab("Action", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bankserviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bankserviceTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)bankserviceTable.getModel();

        String tb1name = tb1Model.getValueAt(bankserviceTable.getSelectedRow(),0).toString();

        String tb1account = tb1Model.getValueAt(bankserviceTable.getSelectedRow(),1).toString();
        String tb1operation = tb1Model.getValueAt(bankserviceTable.getSelectedRow(),2).toString();
        String tb1amount = tb1Model.getValueAt(bankserviceTable.getSelectedRow(),3).toString();

        nameTxt.setText(tb1name);
        accountTxt.setText(tb1account);
        operationTxt.setText(tb1operation);
        amountTxt.setText(tb1amount);
    }//GEN-LAST:event_bankserviceTableMouseClicked

    private void employeeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeTxtActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)bankserviceTable.getModel();
        tb1Model.setRowCount(0);
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.bankservices";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String  name = studentData.getString("Name");
                String accountType = studentData.getString("AccountType");
                String operation = studentData.getString("Operation");
                String amount = studentData.getString("Amount");

                String tbData[] = {name, accountType,operation,amount};

                tb1Model.addRow(tbData);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    
    String currEmpName = "";
    String currRole = "";
    public void setRole(String role){
        currRole = role;
    }
    
    public void setName(String studentName){
        employeeTxt.setText(studentName);
//        lblUsername.setText("Welcome " + studentName);
        currEmpName = studentName;
    }
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String name = nameTxt.getText();

        String accountType = accountTxt.getText();
        String operation = operationTxt.getText();
        int amount = Integer.parseInt(amountTxt.getText());
        String employee = employeeTxt.getText();
        String action = actionTakenTxt.getText();

        if(amountTxt.getText().isEmpty()|| nameTxt.getText().isEmpty()||actionTakenTxt.getText().isEmpty()||employeeTxt.getText().isEmpty()           ){
            JOptionPane.showMessageDialog(null, "Plz Enter Details!");

        } else{

            // Community.CreateCommunity(house,person,community,city,hospital);
            // BankResponse.CreateBankResponse(name,accountType,operation,amount,employee,action);
            bankresponse response =  new bankresponse(name,accountType,operation,amount,employee,action,currRole);
            response.addResponse();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void policeTableDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_policeTableDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_policeTableDMouseClicked

    private void viewDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)policeTableD.getModel();
        tb1Model.setRowCount(0);
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.police";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String  name = studentData.getString("name");
                String gender = studentData.getString("gender");
                String phone = studentData.getString("phone");
                String age = studentData.getString("age");
                String salary = studentData.getString("salary");
                String designation = studentData.getString("designation");

                String tbData[] = {name, gender, phone,age,salary,designation};

                tb1Model.addRow(tbData);
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        }
    }//GEN-LAST:event_viewDBtnActionPerformed

    private void viewDBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDBtn1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)studentTable.getModel();
        tb1Model.setRowCount(0);
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.students";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String  name = studentData.getString("username");
                String email = studentData.getString("Email");

                String age = studentData.getString("Age");
                String loanamount = studentData.getString("Loanamount");


                
                String tbData[] = {name,email,age,loanamount};
                
                tb1Model.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }
    }//GEN-LAST:event_viewDBtn1ActionPerformed

    private void btnStudLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudLogoutActionPerformed
        // TODO add your handling code here:
//        financialLogin emergencyLoginObj = new financialLogin();
//        setVisible(false);
//        emergencyLoginObj.setVisible(true);
    }//GEN-LAST:event_btnStudLogoutActionPerformed

    private void btnReportCrime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportCrime1ActionPerformed
        // TODO add your handling code here:
//        crimeReport cr = new crimeReport();
//        cr.getUserData(currEmpName, "bankemployee");
//        setVisible(false);
//        cr.setVisible(true);
    }//GEN-LAST:event_btnReportCrime1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bankAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bankAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bankAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bankAction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bankAction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountTxt;
    private javax.swing.JTextField actionTakenTxt;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTable bankserviceTable;
    private javax.swing.JButton btnReportCrime1;
    private javax.swing.JButton btnStudLogout;
    private javax.swing.JTextField employeeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField operationTxt;
    private javax.swing.JTable policeTableD;
    private javax.swing.JTable studentTable;
    private javax.swing.JButton submitBtn;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewDBtn;
    private javax.swing.JButton viewDBtn1;
    // End of variables declaration//GEN-END:variables
}
