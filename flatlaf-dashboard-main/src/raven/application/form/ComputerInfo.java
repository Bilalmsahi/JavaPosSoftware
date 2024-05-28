/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.application.form;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BilalSahi
 */
public class ComputerInfo {
       
    public static String getMotherboardSerialNumber() {
     String serialNumber = "";

        try {
            Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[] { "wmic", "baseboard", "get", "serialnumber" });
        } catch (IOException ex) {
            Logger.getLogger(ComputerInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
            java.util.Scanner sc = new java.util.Scanner(process.getInputStream());
            while (sc.hasNext()) {
                serialNumber = sc.next();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return serialNumber;
}
}
