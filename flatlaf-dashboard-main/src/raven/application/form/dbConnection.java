/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.application.form;

/**
 *
 * @author BilalSahi
 */
public class dbConnection {
    
           private static String DataBaseURL = "jdbc:ucanaccess://posproject1.accdb";
           private static String DataBaseUSER = "";
           private static String DataBasePASS = "";

   

    public static String getDataBaseURL() {
        return DataBaseURL;
    }

    public static String getDataBaseUSER() {
        return DataBaseUSER;
    }

    public static String getDataBasePASS() {
        return DataBasePASS;
    }

    
}
