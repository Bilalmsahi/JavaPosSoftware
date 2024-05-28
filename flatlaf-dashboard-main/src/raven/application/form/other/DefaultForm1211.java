package raven.application.form.other;

import com.formdev.flatlaf.FlatClientProperties;
import raven.application.Application;
import raven.application.form.About;
import raven.application.form.Dashboard;
import raven.application.form.LowStock;
import raven.application.form.PrinterName;
import raven.application.form.Properties;
import raven.application.form.Return;
import raven.application.form.Sales;
import raven.application.form.StockAvailable;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class DefaultForm1211 extends javax.swing.JPanel {

    public DefaultForm1211(String text) {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jButton22 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Stencil", 3, 80)); // NOI18N
        jLabel1.setText("WELCOME");

        jButton22.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jButton22.setText("Logout");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 226, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
Application.logout();    
Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Logout Successfully");Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Logout Info");Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Logout Warning");Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Logout Successfully");// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
