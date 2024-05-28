/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.application.form;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;



/**
 *
 * @author BilalSahi
 */
public class ProductKey {
    
    
     private static byte[] hexToBytes(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                    + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }
    
    
    
    
     private static long decryptAES(String encrypted) {
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            SecretKeySpec secretKey = new SecretKeySpec(("/753X5S2/CNCMK008BU0C9D/12345678").getBytes(), "AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] decryptedBytes = cipher.doFinal(hexToBytes(encrypted));
            return Long.parseLong(new String(decryptedBytes));
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }  
    
    
    
    


     
     
     
     

     
     
    public static String Datevalid(){
        
        LocalDate Start=null;
        LocalDate End=null;
        try{
            
Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
             String sql1="SELECT DateStart, DaysExtended FROM Additional WHERE Id=1";
            ResultSet rs =st.executeQuery(sql1);      
   
            while(rs.next()){
Start=rs.getDate(1).toLocalDate();
                End=Start.plusDays(rs.getInt(2));
                
            }
            
  connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        

        
        
     LocalDate currentDate = LocalDate.now();
                if ((currentDate.isBefore(End) || currentDate.isEqual(End))) {
                     return "yes";
                } else {
                    
                 
                    return "no";
                }
    }
    
    
    
    
    
    
    public static String ProductKey(String key1,String key2){
       
        long key =decryptAES(key1);
        long datekey =decryptAES(key2);
        
        long ProductNo=0;
        int SubscriptionNo=0;
        int SerialNo=0;
        
        
        
        
//        GETTING PRODUCT ID , SUBSCRIPTION NO, SERIAL NO
        
        try{
Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
             String sql1="SELECT ProductId FROM Additional WHERE Id=1";
            ResultSet rs =st.executeQuery(sql1);      
   long ProductId=0;
            while(rs.next()){
 ProductId=Long.parseLong(rs.getString(1));

            }   
ProductNo=ProductId;




String sql2="SELECT SerialNo, SubscriptionNo, UsedStatus FROM SubNo WHERE UsedStatus=0";
            ResultSet rss =st.executeQuery(sql2);      
   
            while(rss.next()){
                SerialNo=rss.getInt(1);
                  SubscriptionNo=rss.getInt(2);

            }
connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        long extractedProductNo=0;
        long extractedSubscriptionNo=0;
        long extractedSerialNo=0;
        
        extractedProductNo=((((((key+1)-SerialNo)-3129)-2415)+SubscriptionNo));
        extractedSubscriptionNo=((((((-key-1)+SerialNo)+3129)+2415)+ProductNo));
        extractedSerialNo=(((((SubscriptionNo-ProductNo)-3129)-2415)+1)+key);
        
        System.out.println("expro"+extractedProductNo);
        System.out.println("exsubs"+extractedSubscriptionNo);
        System.out.println("exserial"+extractedSerialNo);
        
        System.out.println("pro"+ProductNo);
        System.out.println("subs"+SubscriptionNo);
        System.out.println("serial"+SerialNo);
        if((extractedProductNo==ProductNo)&&(extractedSubscriptionNo==SubscriptionNo)&&(extractedSerialNo==SerialNo)){
            
             try {


 int preextenddays=0;
 long newExtendedDays=0;
 
 
 
 newExtendedDays=datekey-extractedProductNo-extractedSubscriptionNo-extractedSerialNo-2415-3129;
 
 
 
 
 
 
 
 
 
 
 
Connection connection=DriverManager.getConnection(dbConnection.getDataBaseURL());
      Statement st= connection.createStatement();
             String sql1="SELECT DaysExtended FROM Additional WHERE Id=1";
            ResultSet rs =st.executeQuery(sql1);      
   
            while(rs.next()){
 preextenddays=rs.getInt(1);
            }
            
            
         PreparedStatement ptst =connection.prepareStatement("UPDATE Additional  SET  DaysExtended=? WHERE Id=1");

      

String v =String.valueOf(newExtendedDays+preextenddays);
            ptst.setString(1, v);
            ptst.executeUpdate();
        
            
               
            
         
  connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(OrderToSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
       return "yes";
        }else{
      
        return "no";
        }
         
    }
    
     
    
    
    
    
    
    
    
    public static String validatee(){
        
        
    
                if (Datevalid().equals("yes")) {
                
                     return "yes";
                } else {
                    
                 
                    return "no";
                }
            
    
  
}
}