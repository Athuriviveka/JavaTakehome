/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class Mysql_connect {

   
   Connection conn=null;
   public static Connection connectDb(){
       try{
       Class.forName("com.mysql.jdbc.Driver");
       Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","");
       return(conn);
   }
       catch(Exception e){
           JOptionPane.showMessageDialog(null,e);
           return null;
       }
}
}
