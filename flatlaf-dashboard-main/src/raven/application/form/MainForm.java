package raven.application.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.util.UIScale;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import raven.application.Application;
import raven.application.form.other.DefaultForm;
import raven.application.form.other.DefaultForm1;
import raven.application.form.other.DefaultForm11;
import raven.application.form.other.DefaultForm12;
import raven.application.form.other.DefaultForm121;
import raven.application.form.other.DefaultForm1211;
import raven.menu.Menu;
import raven.menu.MenuAction;
import raven.toast.Notifications;

/**
 *
 * @author Raven
 */
public class MainForm extends JLayeredPane {

    public static String getRolee() {
        return rolee;
    }

    private static String rolee="";
    private static String UserofPos="";

    public static String getUserofPos() {
        return UserofPos;
    }

    public static void setUserofPos(String UserofPos) {
        MainForm.UserofPos = UserofPos;
    }
    

    public static void setRolee(String rolee) {
        MainForm.rolee = rolee;
    }
    
    
    
     public static void setvar() {
       
         
         
         try {
       String x= getRolee();
       Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
       Statement st= connection.createStatement();
        
            System.out.println("Successfully connected to data base");
            String sql1="SELECT Reports, Inventory, Supplier, Userr, SandR, SEAM, CVD, APB FROM UserRole WHERE Role='"+getRolee()+"'";
            ResultSet rs =st.executeQuery(sql1);
           

            
while(rs.next()){
               
Reports=rs.getString(1);
inventory=(rs.getString(2));
supplier=(rs.getString(3));
users=(rs.getString(4));
sales=(rs.getString(5));
staffexpenses=(rs.getString(6));
vouchers=(rs.getString(7));
about=(rs.getString(8));

          
          
            }
 
  
  
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AddRole.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
    }
    
    

    private static String Reports="";
    private static String inventory="";
    private static String supplier="";
    private static String sales="";
    private static String users="";
    private static String staffexpenses="";
    private static String vouchers="";
    private static String about="";

   
    public static String getReports() {
        return Reports;
    }

   

    public static String getInventory() {
        return inventory;
    }

  

    public static String getSupplier() {
        return supplier;
    }


    public static String getSales() {
        return sales;
    }


    public static String getUsers() {
        return users;
    }


    public static String getStaffexpenses() {
        return staffexpenses;
    }

   

    public static String getVouchers() {
        return vouchers;
    }

    

    public static String getAbout() {
        return about;
    }

   
    
    public MainForm() {
        init();
    }

    private void init() {
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new MainFormLayout());
        menu = new Menu();
        panelBody = new JPanel(new BorderLayout());
        menuButton = new JButton(new FlatSVGIcon("raven/icon/svg/menu_left.svg", 0.8f));
        menuButton.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Menu.button.background;"
                + "arc:999;"
                + "focusWidth:0;"
                + "borderWidth:0");
        menuButton.addActionListener((ActionEvent e) -> {
            setMenuFull(!menu.isMenuFull());
        });
        initMenuEvent();
        setLayer(menuButton, JLayeredPane.POPUP_LAYER);
        add(menuButton);
        add(menu);
        add(panelBody);
    }

    private void initMenuEvent() {
       
        menu.addMenuEvent((int index, int subIndex, MenuAction action) -> {
            
            if((about.equals("1"))&&(!(sales.equals("1")))&&(!(Reports.equals("1")))){
             Application.showForm(new DefaultForm121("Form : " ));
            }else if((!(about.equals("1"))&&((sales.equals("1")))&&(!(Reports.equals("1"))))){
                 Application.showForm(new DefaultForm1("Form : " ));
            }else if(((about.equals("1"))&&(!(sales.equals("1")))&&((Reports.equals("1"))))){
                 Application.showForm(new DefaultForm12("Form : " ));
            }else if(((about.equals("1"))&&((sales.equals("1")))&&((Reports.equals("1"))))){
                 Application.showForm(new DefaultForm("Form : " ));
            }else if((!(about.equals("1"))&&(!(sales.equals("1")))&&((Reports.equals("1"))))){
                 Application.showForm(new DefaultForm11("Form : " ));
            }else{
            Application.showForm(new DefaultForm1211("Form : " ));
            }
            
            
            if (index == 0) {
              
            } else if (index == 1) {
                System.out.println("Check 8 of them");
          System.out.println(Reports);
          System.out.println(inventory);
          System.out.println(supplier);
          System.out.println(users);
          System.out.println(sales);
          System.out.println(staffexpenses);
          System.out.println(vouchers);
          System.out.println(about);
                Application.showForm(new Dashboard());
                
            } else if (index == 2) {
                
                if(sales.equals("1")){
                    Application.showForm(new Sales());
                }
                   
            }else if (index == 3) {
                if(sales.equals("1")){
                    Application.showForm(new Return());
                }
            }else if (index == 4) {
                    if(vouchers.equals("1")){
                    Application.showForm(new Customers());
                    }
            }else if (index == 5) {
                if(vouchers.equals("1")){
                Application.showForm(new Voucher());
                }
            }else if (index == 6) {
                if(inventory.equals("1")){
                
                if (subIndex == 1) {
                     
                    Application.showForm(new StockAvailable());
                     
                }else if (subIndex == 2) {
                    Application.showForm(new AddNewStock());
            }else if (subIndex == 3) {
                    Application.showForm(new AddACategory());
            }else if (subIndex == 4) {
                    Application.showForm(new UpdateProduct());
            }else if (subIndex == 5) {
                    Application.showForm(new LowStock());
            }else if (subIndex == 6) {
                    Application.showForm(new ExpiredStock());
            } else {
                    action.cancel();
                }
            } }else if (index == 7) {
                if(staffexpenses.equals("1")){
                Application.showForm(new AddNewStaff1());
                }
            }else if (index == 8) {
                if(staffexpenses.equals("1")){ 
                  Application.showForm(new AddStoreExpenses());
                }
            }else if (index == 9) {
                if(users.equals("1")){
                    if (subIndex == 1) {
                  Application.showForm(new AddUpdateUser());
                }else if (subIndex == 2) {
                    Application.showForm(new AddRole());
            }else {
                    action.cancel();
                }
                }
                }else if (index == 10) {
                    if(staffexpenses.equals("1")){
                  Application.showForm(new ShopAccounts());
             
                }
                }else if (index == 11) {
                    if(supplier.equals("1")){
                if (subIndex == 1) {
                    Application.showForm(new SuppliersRecord());
                }else if (subIndex == 2) {
                    Application.showForm(new PaymentRecord());
            }else {
                    action.cancel();
                }
                    }
            }else if (index == 12) {
                if(supplier.equals("1")){
                
                if (subIndex == 1) {
                    Application.showForm(new OrderToSupplier());
                }else if (subIndex == 2) {
                    Application.showForm(new PendingOrders());
            }else if (subIndex == 3) {
                    Application.showForm(new PaymentHistory());
            }else if (subIndex == 4) {
                    Application.showForm(new PaymentRecord());
            }else {
                    action.cancel();
                }
                }
            }else if (index == 13) {
                if(supplier.equals("1")){
                    Application.showForm(new ReturnToSupplier());
                }
            }else if (index == 14) {
                if(Reports.equals("1")){
                if (subIndex == 1) {
                    Application.showForm(new StockAvailable());
                }else if (subIndex == 2) {
                    Application.showForm(new LowStock());
            }else if (subIndex == 3) {
                    Application.showForm(new ReportTotalSales());
            }else if (subIndex == 4) {
                    Application.showForm(new ShopAccounts());
            }else if (subIndex == 5) {
                    Application.showForm(new ReportTotalStockAdded());
            }else if (subIndex == 6) {
                    Application.showForm(new ReportTotalProductsSold());
            }else if (subIndex == 7) {
                    Application.showForm(new ReportTotalExpenses());
            }else if (subIndex == 8) {
                    Application.showForm(new ReportProductsReturned());
            }else if (subIndex == 9) {
                    Application.showForm(new ReportSupplierReturned());
            }else if (subIndex == 10) {
                    Application.showForm(new PaymentRecord());
            }else {
                    action.cancel();
                }
                }
            }else if (index == 15) {
                if(about.equals("1")){
                    Application.showForm(new BackUp());
                }
            }else if (index == 16) {
                Application.logout();
            }else if (index == 17) {
                if(about.equals("1")){
                 Application.showForm(new About());
                }
            }else if (index == 18) {
                if(about.equals("1")){
                 Application.showForm(new Properties());
                }
            } else {
                action.cancel();
            }
        });
   
            

}

    private void setMenuFull(boolean full) {
        String icon = full ? "menu_left.svg" : "menu_right.svg";
        menuButton.setIcon(new FlatSVGIcon("raven/icon/svg/" + icon, 0.8f));
        menu.setMenuFull(full);
        revalidate();
    }

    public void hideMenu() {
        menu.hideMenuItem();
    }

    public void showForm(Component component) {
        panelBody.removeAll();
        panelBody.add(component);
        panelBody.repaint();
        panelBody.revalidate();
    }

    public void setSelectedMenu(int index, int subIndex) {
        menu.setSelectedMenu(index, subIndex);
    }

    private Menu menu;
    private JPanel panelBody;
    private JButton menuButton;

    private class MainFormLayout implements LayoutManager {

        @Override
        public void addLayoutComponent(String name, Component comp) {
        }

        @Override
        public void removeLayoutComponent(Component comp) {
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(5, 5);
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0, 0);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                Insets insets = UIScale.scale(parent.getInsets());
                int x = insets.left;
                int y = insets.top;
                int width = parent.getWidth() - (insets.left + insets.right);
                int height = parent.getHeight() - (insets.top + insets.bottom);
                int menuWidth = UIScale.scale(menu.isMenuFull() ? menu.getMenuMaxWidth() : menu.getMenuMinWidth());
                menu.setBounds(x, y, menuWidth, height);
                int menuButtonWidth = menuButton.getPreferredSize().width;
                int menuButtonHeight = menuButton.getPreferredSize().height;
                int menuX = (int) (x + menuWidth - (menuButtonWidth * (menu.isMenuFull() ? 0.5f : 0.3f)));
                menuButton.setBounds(menuX, UIScale.scale(30), menuButtonWidth, menuButtonHeight);

                int gap = UIScale.scale(5);
                int bodyWidth = width - menuWidth - gap;
                int bodyHeight = height;
                int bodyx = x + menuWidth + gap;
                int bodyy = y;
                panelBody.setBounds(bodyx, bodyy, bodyWidth, bodyHeight);
            }
        }
    }
}
