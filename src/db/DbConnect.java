/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.*;
import javax.swing.JOptionPane;

public class DbConnect {
    public static  Connection c;
    public static Statement sta;
     static {
         try{
            Connection conn = DriverManager.getConnection("mysql://root:voohaYzyjciOZtYsNjlgoSJULhDQypoY@monorail.proxy.rlwy.net:18897/railway");
            sta = conn.createStatement();
            
         }
          catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
     }
}
