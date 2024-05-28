package raven.application.form;

import java.awt.AWTException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import raven.application.Application;
import raven.toast.Notifications;
/**
 *
 * @author Raven
 */
public class ReturnToSupplier extends javax.swing.JPanel {

    
    
    public class ReportData {

        


        public ReportData(String productid, String productname, String quantity, String costitem, String supplier, String reason, String tamount) {
            this.productid = productid;
            this.productname = productname;
            this.quantity = quantity;
            this.costitem = costitem;
            this.supplier = supplier;
            this.reason = reason;
            this.tamount = tamount;
        }
        private String productid;
private String productname;
private String quantity;
private String costitem;
private String supplier;
private String reason;
private String tamount;

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getCostitem() {
            return costitem;
        }

        public void setCostitem(String costitem) {
            this.costitem = costitem;
        }

        public String getSupplier() {
            return supplier;
        }

        public void setSupplier(String supplier) {
            this.supplier = supplier;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }

        public String getTamount() {
            return tamount;
        }

        public void setTamount(String tamount) {
            this.tamount = tamount;
        }


    
    }
     
     
   private static PrintService findPrintService(String printerName) {
        PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null);
        for (PrintService service : printServices) {
            if (service.getName().equalsIgnoreCase(printerName)) {
                return service;
            }
        }
        return null;
    }
    
    

    public static int counttable6(TableModel c){
        int total=0;
        for(int i=0;i<c.getRowCount();i++){
        total+=Integer.parseInt(c.getValueAt(i, 6).toString());
        
        }
        
    return total;
    }
    
    
    public ReturnToSupplier() {
        initComponents();
       LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jTextField11 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 51));
        jLabel11.setText("*");

        setPreferredSize(new java.awt.Dimension(907, 650));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("RETURN and PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel14.setText("Return To Supplier");
        jLabel14.setPreferredSize(new java.awt.Dimension(64, 32));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT supplier_name FROM SuppliersRecord";
            ResultSet rs =st.executeQuery(sql1);
            jComboBox1.setModel(new DefaultComboBoxModel());
            while(rs.next()){
                jComboBox1.addItem(rs.getString(1));
            } connection.close();} catch (SQLException ex) {
            Logger.getLogger(AddNewStock.class.getName()).log(Level.SEVERE, null, ex);
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Cost");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Supplier");

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Product Id.");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Name");

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField5.setText("0");
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel17.setText("Reason / Comment");

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("P-Category");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Qty");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Total");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField9KeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("*");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("*");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 51, 51));
        jLabel18.setText("*");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 51, 51));
        jLabel20.setText("*");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel15))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel18))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Select Products");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product-Id", "Product-Name", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jTable5.setColumnSelectionAllowed(true);
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jTable5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable5KeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);
        jTable5.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        {try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT P_Id, P_Name, P_Cost FROM Stock ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable5.getModel();
            tbm.setRowCount(0);
            while(rs.next()){
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }}

        jLabel1.setText("Product Name");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Return Amount");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product-Id", "Product-Name", "Cost", "Category", "Reason", "Quantity", "Total Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable6.setColumnSelectionAllowed(true);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jTable6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable6KeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTable6);
        jTable6.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        {try {

            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());

            Statement st= connection.createStatement();
            String sql1="SELECT P_Id, P_Name, P_Cost FROM Stock ";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable5.getModel();
            tbm.setRowCount(0);
            while(rs.next()){
                tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }}

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton4)
                                        .addGap(35, 35, 35))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jButton4)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
if(((jTable6.getRowCount()==0))||("".equals(jTextField11.getText()))){


          Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please Add Any Product");



}else{
        
        
        
        
        
     
 try {

        
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
            Statement s = connection.createStatement();
//            Getting Auto number
 PreparedStatement pts=connection.prepareStatement("INSERT INTO AutoNumbers (hi) VALUES ( ? ) ");
   pts.setString(1, "fromReturn");
            pts.executeUpdate();ResultSet rss = s.executeQuery("SELECT OrderNumber FROM AutoNumbers ORDER BY OrderNumber DESC LIMIT 1");
            

            
            
            String o_No=null;
            while(rss.next()){
            o_No=rss.getString(1);
            }
            
            
            
            


            
            
            
             PreparedStatement ptp=connection.prepareStatement("INSERT INTO PaymentHistory1 (Process, InvoiceNo, Supplier, AmountRecived, TotalAmount ,Remaining_Amount) VALUES ( ?,?,?,?,?,? ) ");
        ptp.setString(1,"Return");
        ptp.setString(2, o_No);
        ptp.setString(3, jComboBox1.getSelectedItem().toString());
        ptp.setString(4, jTextField11.getText());
        ptp.setString(5, jTextField11.getText());
        ptp.setString(6, "0");
        ptp.executeUpdate();
            
            
            for(int i=0;i<jTable6.getRowCount();i++){
            PreparedStatement pt=connection.prepareStatement("INSERT INTO ReturnToSupplier (P_Id, P_Name, Qty, Supplier, Cost, Return_Amount, Reason, R_Invoice_Id) VALUES ( ?,?,?,?,?,?,?,? ) ");
        pt.setInt(1, Integer.parseInt(jTable6.getValueAt(i, 0).toString()));
        pt.setString(2, jTable6.getValueAt(i, 1).toString());
        pt.setString(3, jTable6.getValueAt(i, 5).toString());
        pt.setString(4, jComboBox1.getSelectedItem().toString());
        pt.setString(5, jTable6.getValueAt(i, 2).toString());
        pt.setString(6, jTable6.getValueAt(i, 6).toString());
        pt.setString(7, jTable6.getValueAt(i, 4).toString());
        pt.setString(8, o_No);
        pt.executeUpdate();
        
       
        
        
        Statement st=connection.createStatement();
        ResultSet rst=st.executeQuery("SELECT P_Quantity FROM Stock WHERE P_Id ='"+Integer.valueOf(jTable6.getValueAt(i, 0).toString())+"'");
      int qq=Integer.parseInt(jTable6.getValueAt(i, 5).toString());
      int qq1=0;
        while(rst.next()){
        qq1=rst.getInt(1);
        }
                    PreparedStatement pt1=connection.prepareStatement("UPDATE Stock SET P_Quantity = '"+(qq1-qq)+"' WHERE P_Id = '"+Integer.valueOf(jTable6.getValueAt(i, 0).toString())+"' ");
pt1.executeUpdate();
            }
   connection.close();
   
   
   
   
   
   
 try {System.out.println("ooooooooo");

            // Load and compile the Jasper report
String relativePath =  reports.getUrl()+"returntosupplierinvoice.jrxml";

JasperReport jasperReport = JasperCompileManager.compileReport(relativePath); System.out.println("innnnnnnnn");
            // Set parameters
//        public ReportData(String productid, String productname, String quantity, String costitem, String supplier, String reason, String tamount) {

Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateTimeString = dateFormat.format(currentDate);
         // Create a list of ReportData objects
            List<ReturnToSupplier.ReportData> reportDataList = new ArrayList<>();
            for(int i=0;i<jTable6.getRowCount();i++){
            reportDataList.add(new ReturnToSupplier.ReportData( (jTable6.getValueAt(i, 0).toString()), jTable6.getValueAt(i, 1).toString(), jTable6.getValueAt(i, 5).toString(),jTable6.getValueAt(i, 2).toString(),jComboBox1.getSelectedItem().toString(),jTable6.getValueAt(i, 4).toString(),jTable6.getValueAt(i, 6).toString() ));
            }
//            // ... add more data objects
// System.out.println("dobaraaaaaaaa");
// for (ReportData data : reportDataList) {
//    System.out.println("ProductId: " + data.name);
//    System.out.println("Quantity: " + data.invoiceno);
//    System.out.println("Price: " + data.total);
//    System.out.println("Price: " + data.discount);
//}

             JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(reportDataList);

Map<String, Object> parameters = new HashMap<>();
            parameters.put("totalam", jTextField11.getText());
            parameters.put("dataset", dataSource);
            parameters.put("invoiceno", o_No);
            parameters.put("curdatetime", (currentDateTimeString));
            parameters.put("shopname", (ShopInfo.getShopName()));
            parameters.put("address", (ShopInfo.getShopAddress()));
            parameters.put("phoneno", ((ShopInfo.getPh1()+" , "+ShopInfo.getPh2())));
            parameters.put("policy", (ShopInfo.getPolicyReturnToSuppluer()));
            parameters.put("userr", (MainForm.getUserofPos()));
//             Create a JRBeanCollectionDataSource
            


System.out.println("sourceeeeeeee");
            // Fill the Jasper report with parameters and data source
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, new JREmptyDataSource());
System.out.println("dataaaaaaaaaaaaa");
            JRViewer viewer = new JRViewer(jasperPrint);
viewer.setVisible(true);
 System.out.println("idhrrrrrrrr");
           

            
             String printerName = PrinterName.getReportPrinterName(); // Change to your printer name
            
            PrintService printService = findPrintService(printerName);
 System.out.println("sunnnnnnn");
 JasperViewer.viewReport(jasperPrint,false);
            if (printService != null) {
                
                
                 System.out.println("not nulllllll");
                DocPrintJob printJob = printService.createPrintJob();
                JasperPrintManager.printReport(jasperPrint, false);
                System.out.println("Report printed to printer: " + printerName);
            } else {
                 System.out.println("nulllllllll");
                System.out.println("Printer not found.");
            }
            
            
        } catch (JRException e) {
            e.printStackTrace();
        }
        
   
   
   
   
   
   
        } catch (SQLException ex) { 
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }     
        
        
 
 
 
 
 
 
 
 
 
 
 
 
        Application.showForm(new ReturnToSupplier());
        
        
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable5KeyReleased
            String s1s=jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString();
        jTextField3.setText(s1s);
        
      try {

    
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
    Statement st= connection.createStatement();
    String sql1="SELECT P_Name, P_Cost, P_Category FROM Stock WHERE P_Id = '"+s1s+"'";
    ResultSet rs =st.executeQuery(sql1);
          String name="";      
    String cost="";      
    String Category="";      
    
    while(rs.next()){
          name=(rs.getString(1));
          cost=(rs.getString(2));
         Category=(rs.getString(3));
          }
          jTextField4.setText(name);
          jTextField5.setText(cost);
          jTextField10.setText(Category);
           
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }     
      
      
      jSpinner1.setValue(0);
      jTextField9.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5KeyReleased

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
   String s1s=jTable5.getValueAt(jTable5.getSelectedRow(), 0).toString();
        jTextField3.setText(s1s);
        
      try {

    
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
    Statement st= connection.createStatement();
    String sql1="SELECT P_Name, P_Cost, P_Category FROM Stock WHERE P_Id = '"+s1s+"'";
    ResultSet rs =st.executeQuery(sql1);
          String name="";      
    String cost="";      
    String Category="";      
    
    while(rs.next()){
          name=(rs.getString(1));
          cost=(rs.getString(2));
         Category=(rs.getString(3));
          }
          jTextField4.setText(name);
          jTextField5.setText(cost);
          jTextField10.setText(Category);
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }     
      jSpinner1.setValue(0);
      jTextField9.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable5MouseClicked

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased

        if(!numeric.isNumeric(jTextField3.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
        
        String ss = jTextField3.getText();
      try {

    
            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
    Statement st= connection.createStatement();
    String sql1="SELECT P_Name, P_Cost, P_Category FROM Stock WHERE P_Id = '"+ss+"'";
    ResultSet rs =st.executeQuery(sql1);
    String name="";      
    String cost="";      
    String Category="";      
    
    while(rs.next()){
          name=(rs.getString(1));
          cost=(rs.getString(2));
         Category=(rs.getString(3));
          }
    System.out.println("hiiii iam her");
          jTextField4.setText(name);
          jTextField5.setText(cost);
          jTextField10.setText(Category);
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }     
      
jSpinner1.setValue(0);
      jTextField9.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
      
        String returnx=String.valueOf((Integer.parseInt(jTextField5.getText()))*(Integer.parseInt(jSpinner1.getValue().toString())));
        jTextField9.setText(returnx);        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased

        if(!numeric.isNumeric(jTextField5.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        int cost = Integer.parseInt(jTextField5.getText());
       int q=Integer.parseInt(jSpinner1.getValue().toString()) ;
int tota=q*cost;
jTextField9.setText(String.valueOf(tota));

        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyReleased

if(!numeric.isNumeric(jTextField9.getText())){
    try {
        new java.awt.Robot().keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
          Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "You can not enter any Alphabet here.");
    } catch (AWTException ex) {
        Logger.getLogger(AddNewStaff1.class.getName()).log(Level.SEVERE, null, ex);
    }
}


        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9KeyReleased

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
{try {


            Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
            
Statement st= connection.createStatement();
             String sql1="SELECT P_Id, P_Name, P_Cost FROM Stock WHERE P_Name LIKE '%"+jTextField1.getText()+"%'";
            ResultSet rs =st.executeQuery(sql1);
            DefaultTableModel tbm =(DefaultTableModel)jTable5.getModel();
            tbm.setRowCount(0);
           while(rs.next()){
            tbm.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
           }
           
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }}        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(("".equals(jTextField3.getText()))||("".equals(jTextField5.getText()))){
                  Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please Enter Required Field");

        
        }else{
        
        String Cost= jTextField5.getText();
        String id=jTextField3.getText();
        String Discription=jTextArea2.getText();
        String qt=jSpinner1.getValue().toString();
                String tma=jTextField9.getText();
                
        Connection connection;
        try {
            connection = DriverManager.getConnection(dbConnection.getDataBaseURL());
       
             Statement st=connection.createStatement();
        ResultSet rst=st.executeQuery("SELECT P_Quantity FROM Stock WHERE P_Id ='"+Integer.valueOf(jTextField3.getText())+"'");
     
         int tq=0;
   while(rst.next()){
   tq+=Integer.parseInt(rst.getString(1));
   
   }
                
                
                if(tq<Integer.parseInt(jSpinner1.getValue().toString())){
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "You can enter quantity more than Availabel Quantity of This Product");

  
  }else{
     

          



                
                
for(int i=0;i<jTable6.getRowCount();i++){
       

    int iid=Integer.parseInt(jTable6.getValueAt(i, 0).toString());
    int idi=Integer.parseInt(id);
    System.out.println(iid);
    System.out.println(idi);
if(idi==iid){
   
   jTable6.setValueAt(tma, i, 6);
   jTable6.setValueAt(Cost, i, 2);
   jTable6.setValueAt(qt, i, 5);
   jTable6.setValueAt(Discription, i, 4);

}


}
DefaultTableModel tbm =(DefaultTableModel)jTable6.getModel();
jTextField11.setText(String.valueOf(counttable6(tbm)));
 
                }
                } catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }

jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("0");
jTextField10.setText("");
jTextArea2.setText("");
jSpinner1.setValue(0);
jTextField3.setText("");
jTextField9.setText("");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

           DefaultTableModel tbm =(DefaultTableModel)jTable6.getModel();
        
        tbm.removeRow(jTable6.getSelectedRow());
       
jTextField11.setText(String.valueOf(counttable6(tbm)));
        
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("0");
jTextField10.setText("");
jTextArea2.setText("");

jTextField3.setText("");
jTextField9.setText("");
jSpinner1.setValue(0);

// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked

 jTextField3.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString());
    jTextField4.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString());
    jTextField5.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 2).toString());
    jTextField10.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 3).toString());
    jTextArea2.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 4).toString());
    jSpinner1.setValue(Integer.valueOf(jTable6.getValueAt(jTable6.getSelectedRow(), 5).toString()));
    jTextField9.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 6).toString());

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable6MouseClicked

    private void jTable6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable6KeyReleased
    jTextField3.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 0).toString());
    jTextField4.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 1).toString());
    jTextField5.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 2).toString());
    jTextField10.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 3).toString());
    jTextArea2.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 4).toString());
  jSpinner1.setValue(Integer.valueOf(jTable6.getValueAt(jTable6.getSelectedRow(), 5).toString()));
  jTextField9.setText(jTable6.getValueAt(jTable6.getSelectedRow(), 6).toString());



        // TODO add your handling code here:
    }//GEN-LAST:event_jTable6KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if(("".equals(jTextField3.getText()))||("".equals(jTextField5.getText()))){
                  Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Please Enter Required Field");

        
        }else{
        
        
        
        
        DefaultTableModel tbm =(DefaultTableModel)jTable6.getModel();
String id=jTextField3.getText();
String name=jTextField4.getText();
String costt=jTextField5.getText();
String cate=jTextField10.getText();
String Discription=jTextArea2.getText();
String qty=jSpinner1.getValue().toString();
String Totall=jTextField9.getText();
String exist="";
for(int i=0; i<jTable6.getRowCount();i++){
if(id.equals(jTable6.getValueAt(i, 0))){
    exist ="yes";
}
}


//Checking the available quqntity
 Connection connection;
        try {
            connection = DriverManager.getConnection(dbConnection.getDataBaseURL());
             Statement st=connection.createStatement();
        ResultSet rst=st.executeQuery("SELECT P_Quantity FROM Stock WHERE P_Id ='"+Integer.valueOf(jTextField3.getText())+"'");
     
         int tq=0;
   while(rst.next()){
   tq+=Integer.parseInt(rst.getString(1));
   
   }

  

if(exist.equals("yes")){
    
    
    
    
    for(int i=0; i<jTable6.getRowCount();i++){
if(id.equals(jTable6.getValueAt(i, 0))){
   int qtt= Integer.parseInt(jTable6.getValueAt(i, 5).toString());
   int q=Integer.parseInt(qty);
   int cst=Integer.parseInt(costt);
  
   
   
  if(tq<(qtt+q)){
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "You can enter quantity more than Available Quantity of This Product");

  
  }else{
   jTable6.setValueAt(cst, i, 2);
   jTable6.setValueAt((qtt+q), i, 5);
   jTable6.setValueAt(((qtt+q)*cst), i, 6);
  }    
   break;
}
}
    
    
  
}else{
if(tq<Integer.parseInt(jSpinner1.getValue().toString())){
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "You can enter quantity more than Availabel Quantity of This Product");

  
  }else{
     tbm.addRow(new Object[]{id, name, costt, cate, Discription, qty, Totall});
}
          

}



} catch (SQLException ex) {
            Logger.getLogger(ReturnToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
jTextField11.setText(String.valueOf(counttable6(tbm)));
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("0");
jTextField10.setText("");
jTextArea2.setText("");

jTextField3.setText("");
jTextField9.setText("");
jSpinner1.setValue(0);
// TODO add your handling code here:
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11KeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
