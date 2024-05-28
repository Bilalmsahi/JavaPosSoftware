package raven.application.form;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import raven.application.Application;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class Properties extends javax.swing.JPanel {

     
    
    
    public Properties() {
        initComponents();
       
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        change = new javax.swing.JButton();
        Edit = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        change1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel14.setText("Properties");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT printerreports FROM Additional";
            ResultSet rs =st.executeQuery(sql1);

            while(rs.next()){
                jTextField1.setText(rs.getString(1));

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT printerinvoice FROM Additional";
            ResultSet rs =st.executeQuery(sql1);

            while(rs.next()){
                jTextField2.setText(rs.getString(1));

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Set Printer Name for Reports");

        jLabel5.setText("Set Printer Name for Invoices");

        change.setText("Change");
        change.setVisible(false);
        change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeActionPerformed(evt);
            }
        });

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        jLabel6.setText("Set Printer Name for Barcode Printing");

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT printerbarcode FROM Additional";
            ResultSet rs =st.executeQuery(sql1);

            while(rs.next()){
                jTextField3.setText(rs.getString(1));

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Set Printers Name");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Set Basic Information");

        jLabel9.setText("Shop Name");

        jTextField4.setEditable(true);
        jTextField4.setText("0");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel10.setText("Shop Address");

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT ShopName, Address, Ph1, Ph2, Policysales, Policyreturn, Policyordertosupp, Policyreturntosupp FROM Additional WHERE Id =1";
            ResultSet rs =st.executeQuery(sql1);

            while(rs.next()){
                jTextField5.setText(rs.getString(1));
                jTextArea4.setText(rs.getString(2));
                jTextField4.setText(rs.getString(3));
                jTextField7.setText(rs.getString(4));
                jTextArea2.setText(rs.getString(5));
                jTextArea3.setText(rs.getString(6));
                jTextArea6.setText(rs.getString(7));
                jTextArea5.setText(rs.getString(8));

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField5.setEditable(true);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel11.setText("Phone Number 1");

        jLabel12.setText("Phone Number 2");

        jTextField7.setEditable(true);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT Ph2 FROM Additional WHERE Id =1";
            ResultSet rs =st.executeQuery(sql1);

            while(rs.next()){
                jTextField7.setText(rs.getString(1));
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel13.setText("Sales Invoice");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Set Your Policy");

        jLabel16.setText("Customer Return Invoice");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jLabel17.setText("Order To Supplier Invoice");

        jLabel18.setText("Return to Supplier Invoice");

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jSeparator1.setForeground(new java.awt.Color(0, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(0, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(0, 255, 255));

        change1.setText("Set Info");
        change.setVisible(false);
        change1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change1ActionPerformed(evt);
            }
        });

        jButton2.setVisible(false);
        jButton2.setText("Prk");
        try{
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT DateStart, DaysExtended FROM Additional";
            ResultSet rs =st.executeQuery(sql1);

            String ss= jTextField6.getText();
            String s1= jTextField8.getText();
            while(rs.next()){

                LocalDate start=rs.getDate(1).toLocalDate();
                LocalDate End=start.plusDays(Integer.parseInt(rs.getString(2))-5);

                LocalDate currentDate = LocalDate.now();
                if ((currentDate.isAfter(End))) {
                    System.out.println(start);
                    System.out.println(End);
                    System.out.println(currentDate);

                    jButton2.setVisible(true);

                }
            }
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setVisible(false);

        jLabel2.setText("User Name");

        jLabel3.setText("Pass");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addComponent(jSeparator5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel8)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Edit)
                                        .addGap(18, 18, 18)
                                        .addComponent(change))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel15))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(change1))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 355, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Edit)
                            .addComponent(change))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(change1)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(661, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeActionPerformed

 try {
            
            String id = jTextField1.getText();
             String id1 = jTextField2.getText();
             String id2=jTextField3.getText();
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
            
            PreparedStatement ptst =connection.prepareStatement("UPDATE Additional SET printerreports=?, printerinvoice=? ,printerbarcode=? WHERE Id =1");
//      ptst.setString(1, jTextField2.getText());
      


            ptst.setString(1, String.valueOf(id));
            ptst.setString(2, String.valueOf(id1));
            ptst.setString(3, String.valueOf(id2));
            
            
            
      
      
      
                 
                         ptst.executeUpdate();
                         
              connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }

 
 
  
Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "PLEASE RESTART THE APPLICATION TO PROPERLY SAVE CHANGES");
  
 
 
   
       // TODO add your handling code here:
    }//GEN-LAST:event_changeActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed

if(Edit.isSelected()){
    jTextField1.setEditable(true);
    jTextField2.setEditable(true);
    jTextField3.setEditable(true);
change.setVisible(true);

}else{
    
    
    try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
                  
   
            String sql11="SELECT  printerreports, printerinvoice, printerbarcode FROM Additional WHERE Id=1";
            ResultSet rs =st.executeQuery(sql11);      
   
           
            while(rs.next()){
    jTextField1.setText(rs.getString(1));
    jTextField2.setText(rs.getString(2));
    jTextField3.setText(rs.getString(3));
                
            }
            
            
         
       
      
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Properties.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
     jTextField1.setEditable(false);
    jTextField2.setEditable(false);
    jTextField3.setEditable(false);
change.setVisible(false);

}
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
     
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void change1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change1ActionPerformed
int aas=JOptionPane.showConfirmDialog(this, "Are You Sure You Want To Set Or Change Information");   
        if(aas==JOptionPane.YES_OPTION){
 try {
            java.sql.Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
            
            PreparedStatement ptst =connection.prepareStatement("UPDATE Additional SET ShopName=?, Address=?, Ph1=?, Ph2=?, Policysales=?, Policyreturn=?, Policyordertosupp=?, Policyreturntosupp=? WHERE Id =1");
            
            ptst.setString(1, jTextField5.getText());
            ptst.setString(2, jTextArea4.getText());
            ptst.setString(3, jTextField4.getText());
            ptst.setString(4, jTextField7.getText());
            ptst.setString(5, jTextArea2.getText());
            ptst.setString(6, jTextArea3.getText());
            ptst.setString(7, jTextArea6.getText());
            ptst.setString(8, jTextArea5.getText());
            
            ptst.executeUpdate();
            
            
            
            
      Statement st= connection.createStatement();
             String sql1="SELECT ShopName, Address, Ph1, Ph2, Policysales, Policyreturn, Policyordertosupp, Policyreturntosupp FROM Additional WHERE Id =1";
            ResultSet rs =st.executeQuery(sql1);      
               

           
            while(rs.next()){
     jTextField5.setText(rs.getString(1));
           jTextArea4.setText(rs.getString(2));
            jTextField4.setText(rs.getString(3));
         jTextField7.setText(rs.getString(4));
      jTextArea2.setText(rs.getString(5));
           jTextArea3.setText(rs.getString(6));
          jTextArea6.setText(rs.getString(7));
           jTextArea5.setText(rs.getString(8));
            
            }
      
            Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "PLEASE RESTART THE APPLICATION TO PROPERLY SAVE CHANGES");

            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ShopInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_change1ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased

if(!numeric.isNumeric(jTextField4.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}else{
 if(jTextField4.getText()==null){
      jTextField4.setText("0");
      }
}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased


        if(!numeric.isNumeric(jTextField7.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}else{
 if(jTextField7.getText()==null){
      jTextField7.setText("0");
      }
} 

      
      
        


        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
jPanel2.setVisible(true);
 int za=JOptionPane.showConfirmDialog(this,jPanel2, "Enter UserName And Pass", JOptionPane.DEFAULT_OPTION);
            if(za==JOptionPane.OK_OPTION){
                try{
                   Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
             String sql1="SELECT UserName, Password, Role FROM POS_users_  ";
            ResultSet rs =st.executeQuery(sql1);      
   
              String ss= jTextField6.getText();
   String s1= jTextField8.getText();
            while(rs.next()){

                if((rs.getString(1).equals(ss))&&(rs.getString(2).equals(s1))&&(rs.getString(3).equals("Owner"))){
                    
                    System.out.println("insideproductpage");
        Application.showForm(new productkeypage());

             
                
            }
                
            }
                
              connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
            } 

jPanel2.setVisible(false);
jTextField8.setText("");
jTextField6.setText("");


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Edit;
    private javax.swing.JButton change;
    private javax.swing.JButton change1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
