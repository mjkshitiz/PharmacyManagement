/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Kshitiz
 */
public class DBConnection1 {
    public static Statement statementObject(){
      try{
         Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver Connected Successfully");
      }catch(Exception e){
          System.out.println("Drive Didn't load successfully");
      }
         Connection con=null;
         try{
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacymanagement","root","");
             System.out.println("Database connected successfully");
      }catch( Exception e){
             System.out.println("Database failed to connect");
      }
    Statement st=null;
            try{
            st=con.createStatement();
            
            }catch(Exception e){
                System.out.println("Sql Not executed");
             }
            return st;
    }
    
}
