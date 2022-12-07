package com.tomspencerlondon.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbTemplate {

  public static void main(String[] args) {
    Connection con = null;
    Statement stmt = null;
//PreparedStatement stmtp = null; //1
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con= DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw"); // URL, Usercode, password
      stmt = con.createStatement();

      String sql = "Select productname, price from " +
          "products where productname = ? order by productname ;";

//stmt2 =con.prepareStatement(sql); //3
//stmt2.setString(1, s); //4
      con.close();
      stmt.close();
    } catch (Exception e) {
      System.out.println("Connection error");
    }
    System.out.println("The end ");
  }
}
