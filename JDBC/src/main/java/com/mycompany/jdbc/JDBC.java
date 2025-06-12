/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Date;
import java.time.LocalDate;
/**
 *
 * @author KIIT
 */
/*
JDBC
    */
/*saturation
   */
public class JDBC {

    public static void main(String[] args) throws Exception{
        String url="jdbc:mysql://localhost:3306/mydatabase?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String uname="root";
        String pass="Aniket@123";
        int id=2;
        String dept="TECH";
        String query="INSERT INTO DEPARTMENT() VALUES('"+dept+"',"+id+",'244566666','1999-08-12');";
       // Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uname,pass);
        Statement st = con.createStatement();
        PreparedStatement st1 = con.prepareStatement("INSERT INTO DEPARTMENT VALUES(?,?,?,?)");
        st1.setDate(4,Date.valueOf("2012-03-11"));
        st1.setInt(2,6);
        st1.setString(1,"MANAGEMENT");
        st1.setString(3,"7644534398");
        int flag2=st1.executeUpdate();
      //int flag=st.executeUpdate(query);
      //System.out.println(flag+" row(s) affected !");
        System.out.println(flag2+" row(s) affected !");
        ResultSet rs=st.executeQuery("SELECT *FROM DEPARTMENT;");
        String data=null;
        while(rs.next()){
        data="DNAME : "+rs.getString(1)+" DNUMBER : "+rs.getString(2)+" MGRSSN : "+rs.getString(3)+" MGRSTARTDATE : "+rs.getDate(4);
        System.out.println(data);
        }
        st.close();
        con.close();
    }
}
