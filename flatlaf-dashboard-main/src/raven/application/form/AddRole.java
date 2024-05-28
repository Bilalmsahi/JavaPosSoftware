package raven.application.form;

import java.sql.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import raven.application.Application;
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */

public class AddRole extends javax.swing.JPanel {
    

    public AddRole() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Role");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Role", "Discription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();

            String sql1="SELECT Role, Discription FROM UserRole ";
            ResultSet rs =st.executeQuery(sql1);

            DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);

            while(rs.next()){

                //          tbm.setRowCount(0);
                tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});

            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel14.setText("Role Details");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel15.setText("Manage User Role");
        jLabel15.setPreferredSize(new java.awt.Dimension(64, 32));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Discription");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Role");

        jCheckBox1.setText("Customers and Vouchers & Discounts");

        jCheckBox2.setText("Staff, Expenses, Accounts Management");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("Inventory Management");

        jCheckBox4.setText("About, Properties and BackUp");

        jCheckBox5.setText("Supplier Management");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Users and Role Management");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Sales & Return");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jCheckBox8.setText("Reports");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jButton2.setText("ADD NEW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox4))
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jCheckBox6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jCheckBox8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jCheckBox7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addGap(317, 317, 317))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if("".equals(jTextField3.getText())){

                          Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please Enter Required Field");


}else{
        try {
            
            
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            String sql="INSERT INTO UserRole (Role, Discription, Reports, Inventory, Supplier, Userr, SandR, SEAM, CVD, APB) VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ptst =connection.prepareStatement(sql);
            ptst.setString(1, jTextField3.getText());
            ptst.setString(2, jTextArea1.getText());
            ptst.setInt(3, jCheckBox8.isSelected() ? 1 : 0);
            ptst.setInt(4, jCheckBox3.isSelected() ? 1 : 0);
            ptst.setInt(5, jCheckBox5.isSelected() ? 1 : 0);
            ptst.setInt(6, jCheckBox6.isSelected() ? 1 : 0);
            ptst.setInt(7, jCheckBox7.isSelected() ? 1 : 0);
            ptst.setInt(8, jCheckBox2.isSelected() ? 1 : 0);
            ptst.setInt(9, jCheckBox1.isSelected() ? 1 : 0);
            ptst.setInt(10, jCheckBox4.isSelected() ? 1 : 0);
  ptst.executeUpdate();
  Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Saved" );
  
            Application.showForm(new AddRole());
   connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddRole.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        
        // TODO add your handling code here:
              
        
        // TODO add your handling code here:
              
        
        // TODO add your handling code here:
              
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

         String ph = jTextField1.getText();
      try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement st= connection.createStatement();
        
            String sql1="SELECT Role, Discription FROM UserRole WHERE Role LIKE '%"+ph+"%'";
            
            ResultSet rs =st.executeQuery(sql1);
       
DefaultTableModel tbm =(DefaultTableModel)jTable1.getModel();
            tbm.setRowCount(0);
            while(rs.next()){
               
          
           tbm.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            
            }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddRole.class.getName()).log(Level.SEVERE, null, ex);
        }



        // TODO add your handling code here:



        // TODO add your handling code here:



        // TODO add your handling code here:



        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

String role=jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement st= connection.createStatement();
            
            String sql1="SELECT Role, Discription, Reports, Inventory, Supplier, Userr, SandR, SEAM, CVD, APB FROM UserRole WHERE Role='"+role+"'";
            ResultSet rs =st.executeQuery(sql1);
           

            
while(rs.next()){
               
jTextField3.setText(rs.getString(1));
jTextArea1.setText(rs.getString(2));

          jCheckBox8.setSelected((rs.getInt(3)==1));
          jCheckBox3.setSelected((rs.getInt(4)==1));
          jCheckBox5.setSelected((rs.getInt(5)==1));
          jCheckBox6.setSelected((rs.getInt(6)==1));
          jCheckBox7.setSelected((rs.getInt(7)==1));
          jCheckBox2.setSelected((rs.getInt(8)==1));
          jCheckBox1.setSelected((rs.getInt(9)==1));
          jCheckBox4.setSelected((rs.getInt(10)==1));
          
            }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }



        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if("".equals(jTextField3.getText())||"Properties".equals(jTextField3.getText())){

                          Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please Enter Required Field");


}else if(jTextField3.getText().equals("Owner")){

             Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "You cannot Update the role of Owner");


}else{
        
        
        try {
       String x= jTextField3.getText();
        Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            String sql="UPDATE UserRole  SET Role=?, Discription=?, Reports=?, Inventory=?, Supplier=?, Userr=?, SandR=?, SEAM=?, CVD=?, APB=? WHERE Role='"+x+"'";
            PreparedStatement ptst =connection.prepareStatement(sql);
            ptst.setString(1, jTextField3.getText());
            ptst.setString(2, jTextArea1.getText());
            ptst.setInt(3, jCheckBox8.isSelected() ? 1 : 0);
            ptst.setInt(4, jCheckBox3.isSelected() ? 1 : 0);
            ptst.setInt(5, jCheckBox5.isSelected() ? 1 : 0);
            ptst.setInt(6, jCheckBox6.isSelected() ? 1 : 0);
            ptst.setInt(7, jCheckBox7.isSelected() ? 1 : 0);
            ptst.setInt(8, jCheckBox2.isSelected() ? 1 : 0);
            ptst.setInt(9, jCheckBox1.isSelected() ? 1 : 0);
            ptst.setInt(10, jCheckBox4.isSelected() ? 1 : 0);
  ptst.executeUpdate();
 Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Successfully Updated" );
  
            Application.showForm(new AddRole());
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddRole.class.getName()).log(Level.SEVERE, null, ex);
        }


}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased

String role=jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

Statement st= connection.createStatement();
            
            String sql1="SELECT Role, Discription, Reports, Inventory, Supplier, Userr, SandR, SEAM, CVD, APB FROM UserRole WHERE Role='"+role+"'";
            ResultSet rs =st.executeQuery(sql1);
           

            
while(rs.next()){
               
jTextField3.setText(rs.getString(1));
jTextArea1.setText(rs.getString(2));

          jCheckBox8.setSelected((rs.getInt(3)==1));
          jCheckBox3.setSelected((rs.getInt(4)==1));
          jCheckBox5.setSelected((rs.getInt(5)==1));
          jCheckBox6.setSelected((rs.getInt(6)==1));
          jCheckBox7.setSelected((rs.getInt(7)==1));
          jCheckBox2.setSelected((rs.getInt(8)==1));
          jCheckBox1.setSelected((rs.getInt(9)==1));
          jCheckBox4.setSelected((rs.getInt(10)==1));
          
            }
             
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

if(jTextField3.getText().equals("Owner")||jTextField3.getText().equals("Properties")){

             Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "You cannot delete the role of Owner");


}else if("".equals(jTextField3.getText())){

                          Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please Enter Required Field");


}else{
try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

 String sql=" DELETE FROM UserRole  WHERE Role="+jTextField3.getText()+"";
                 PreparedStatement ptst =connection.prepareStatement(sql);
                 ptst.executeUpdate();
    connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

