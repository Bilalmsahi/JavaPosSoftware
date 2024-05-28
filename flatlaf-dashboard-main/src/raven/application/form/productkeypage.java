package raven.application.form;

import java.awt.AWTException;
import java.sql.*;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.util.Arrays;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import raven.application.Application;
import static raven.application.form.ProductKey.ProductKey;
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */
public class productkeypage extends javax.swing.JPanel {

     private static int generateRandomNumber(int min, int max) {
        // Create a random number generator
        Random random = new Random();

        // Generate a random number between min (inclusive) and max (exclusive)
        return random.nextInt(max - min + 1) + min;
    }
    
    
    
    public productkeypage() {
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
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(907, 650));

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Product Key 1");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("*");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("D Product Key 2");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("*");

        jButton1.setText("Enter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField5.setEditable(false);
        try{
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            Statement st= connection.createStatement();
            String sql1="SELECT ProductId FROM Additional WHERE Id=1";
            ResultSet rs =st.executeQuery(sql1);
            long ProductId=0;
            while(rs.next()){
                ProductId=Long.parseLong(rs.getString(1));

            }
            jTextField5.setText(String.valueOf(ProductId));
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Product No.");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");

        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField6KeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Serial No");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("*");

        jButton2.setText("Enter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField7KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Subscription No.");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel4))
                                .addComponent(jTextField3)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 833, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(138, 138, 138))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased

    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        
        
        
        
        
        
        
//        check if there are subno used status 0 more than 1 then delete all of them except 1
        
        String valid=ProductKey.ProductKey(jTextField3.getText(),jTextField4.getText());
if(valid.equals("yes")){
    
    System.out.println("Done Product key");
 try {
            
            String id = jTextField3.getText();
            
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            System.out.println("Successfully connected to data base");
            
            PreparedStatement ptst =connection.prepareStatement("UPDATE SubNo SET UsedStatus=? WHERE UsedStatus =0");
      
            ptst.setString(1, "1");
            ptst.executeUpdate();
         connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
            
          jTextField3.setText("");
          jTextField4.setText("");
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Upgraded your Subscription Successfully");

    
}else{

    System.out.println("not done");

}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
 try{
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
             String sql1="SELECT UsedStatus FROM SubNo WHERE UsedStatus=0";
            ResultSet rs =st.executeQuery(sql1);      
   int a =0;
            while(rs.next()){
a++;
            }
            
                
   
            
     switch (a) {
         case 0 ->              {
                 System.out.println("in 0 uper");
                 int serial =0;
                 // Generate random subscription between 1001 and 9989
                 int subscription =0;
                 int i;
                 
                 do{
                      i=0;
                serial = generateRandomNumber(112, 998);
                 // Generate random subscription between 1001 and 9989
                subscription = generateRandomNumber(1001, 9989);
                    
                  String sq1="SELECT SerialNo, SubscriptionNo FROM SubNo";
            ResultSet rs3 =st.executeQuery(sq1);      
   
            while(rs3.next()){
                if((serial==rs3.getInt(1))||(subscription==rs3.getInt(2))){
                i=1;
                }
                
            }
            serial++;
            subscription++;
            if(i==1){
            System.out.println("exists");
            }
               }while(i==1);
                 
                 String sql="INSERT INTO SubNo ( SerialNo, SubscriptionNo, UsedStatus ) VALUES ( ?, ?, ?)";
                 PreparedStatement ptst =connection.prepareStatement(sql);
                 ptst.setInt(1, serial);
                 ptst.setInt(2, subscription);
                 ptst.setInt(3, 0);
                 ptst.executeUpdate();
                 //  Now displaying
                 System.out.println("in 0 end");
//      generateand store it as used status 0
                 
                 
             }
         case 1 -> {
             System.out.println("in 1");
         }
         default ->              {
             System.out.println("in msny top");
                 String sql=" DELETE  FROM SubNo  WHERE UsedStatus=0";
                 PreparedStatement ptst =connection.prepareStatement(sql);
                 ptst.executeUpdate();
                 int serial =0;
                 // Generate random subscription between 1001 and 9989
                 int subscription =0;
                 int i=0;
                 
                 while(i!=1){
                serial = generateRandomNumber(112, 998);
                 // Generate random subscription between 1001 and 9989
                subscription = generateRandomNumber(1001, 9989);
                     
                  String sq1="SELECT SerialNo, SubscriptionNo FROM SubNo";
            ResultSet rs3 =st.executeQuery(sq1);      
   
            while(rs3.next()){
                if((serial==rs3.getInt(1))||(subscription==rs3.getInt(2))){
                i=1;
                }
                
            }
               }
                 String sql2="INSERT INTO SubNo ( SerialNo, SubscriptionNo, UsedStatus ) VALUES ( ?, ?, ?)";
                 PreparedStatement pts2 =connection.prepareStatement(sql2);
                 pts2.setInt(1, serial);
                 pts2.setInt(2, subscription);
                 pts2.setInt(3, 0);
                 pts2.executeUpdate();
                 System.out.println("in msny end");
// Delete ll of them just leave one and display that reamaining one
                 
             }
     }
      System.out.println("Displaying");
      
       String sqr1="SELECT SerialNo, SubscriptionNo, UsedStatus FROM SubNo WHERE UsedStatus=0";
            ResultSet rse =st.executeQuery(sqr1);   
      while(rse.next()){
                     if(rse.getString(3).equals("0")){
                        
                         jTextField6.setText(rse.getString(1));
                         jTextField7.setText(rse.getString(2));
                     }
//      just display that one
                 }
      
  connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
// check if there is are rows with status 0 then delete  them just leave one of it and display thet one 
//if there is only one row then do not generate it just display it;
// if there is no row then generrate and display 


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
