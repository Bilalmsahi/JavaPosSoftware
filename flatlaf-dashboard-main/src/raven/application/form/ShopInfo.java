/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.application.form;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BilalSahi
 */
public class ShopInfo {
    
    
    public static String getFromDb(String a){
    
        
          java.sql.Connection connection;
        try {
            connection = DriverManager.getConnection(dbConnection.getDataBaseURL());
       
            
            Statement st= connection.createStatement();
             String sql1="SELECT ShopName, Address, Ph1, Ph2, Policysales, Policyreturn, Policyordertosupp, Policyreturntosupp FROM Additional WHERE Id =1";
            ResultSet rs =st.executeQuery(sql1);      
               

           
            while(rs.next()){
    
        
        
        
       if(a.equals("ShopName")){
       return rs.getString(1);
       }else if(a.equals("PolicyOrderToSupplier")){
       return rs.getString(7);
       }else if(a.equals("ShopAddress")){
       return rs.getString(2);
       }else if(a.equals("Ph1")){
       return rs.getString(3);
       }else if(a.equals("Ph2")){
       return rs.getString(4);
       }else if(a.equals("policySalesInvoice")){
       return rs.getString(5);
       }else if(a.equals("PolicyCustomerReturnInvoice")){
       return rs.getString(6);
       }else if(a.equals("PolicyReturnToSuppluer")){
       return rs.getString(8);
       }
    
    
   
            }
            
            
           
            
            
             } catch (SQLException ex) {
            Logger.getLogger(ShopInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       return ("Void");      
    }
    
    
    
    
        
    private static String ShopName=getFromDb("ShopName");
    private static String ShopAddress=getFromDb("ShopAddress");
    private static String Ph1=getFromDb("Ph1");
    private static String Ph2=getFromDb("Ph2");
    private static String policySalesInvoice=getFromDb("policySalesInvoice");
    private static String PolicyCustomerReturnInvoice=getFromDb("PolicyCustomerReturnInvoice");
    private static String PolicyReturnToSuppluer=getFromDb("PolicyReturnToSuppluer");
    private static String PolicyOrderToSupplier=getFromDb("PolicyOrderToSupplier");

    public static String getShopName() {
        return ShopName;
    }

    public void setShopName(String ShopName) {
        this.ShopName = ShopName;
    }

    public static String getShopAddress() {
        return ShopAddress;
    }

    public void setShopAddress(String ShopAddress) {
        this.ShopAddress = ShopAddress;
    }

    public static String getPh1() {
        return Ph1;
    }

    public void setPh1(String Ph1) {
        this.Ph1 = Ph1;
    }

    public static String getPh2() {
        return Ph2;
    }

    public void setPh2(String Ph2) {
        this.Ph2 = Ph2;
    }

    public static String getPolicySalesInvoice() {
        return policySalesInvoice;
    }

    public void setPolicySalesInvoice(String policySalesInvoice) {
        this.policySalesInvoice = policySalesInvoice;
    }

    public static String getPolicyCustomerReturnInvoice() {
        return PolicyCustomerReturnInvoice;
    }

    public void setPolicyCustomerReturnInvoice(String PolicyCustomerReturnInvoice) {
        this.PolicyCustomerReturnInvoice = PolicyCustomerReturnInvoice;
    }

    public static String getPolicyReturnToSuppluer() {
        return PolicyReturnToSuppluer;
    }

    public void setPolicyReturnToSuppluer(String PolicyReturnToSuppluer) {
        this.PolicyReturnToSuppluer = PolicyReturnToSuppluer;
    }

    public static String getPolicyOrderToSupplier() {
        return PolicyOrderToSupplier;
    }

    public void setPolicyOrderToSupplier(String PolicyOrderToSupplier) {
        this.PolicyOrderToSupplier = PolicyOrderToSupplier;
    }
    
}
