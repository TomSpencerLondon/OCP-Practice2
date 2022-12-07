package com.tomspencerlondon.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UpdateUser {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement stmt = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con= DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw"); // URL, Usercode, password

      boolean found = false;
      String sql = "select UserNameEmail from Users"
          + " where UserNameEmail = ? ; ";
      stmt = con.prepareStatement(sql);// 3
      stmt.setString(1, "tim@gmail.com");
// stmt.executeQuery();
      ResultSet rs = stmt.executeQuery();
      if ( rs.next() ) { // if false, the resultset is empty
        found = true;
      }

      if (found) {
        String sql2 = "update Users "
            + " set PW = ? "
            + " where UserNameEmail = ? "
            + " and UserID = UserID ; ";
// userid = userid necessary for unsafe mode on mySQL workbench
        stmt = con.prepareStatement(sql2);// 3
        stmt.setString(1, "newpassword");
        stmt.setString(2, "tim@gmail.com");
        stmt.executeUpdate(); // executeUpdate : insert, update, delete // not found will just do nothing
        System.out.println("Password updated");
      } else {
        System.out.println("Username not found");
      }
      con.close();
      stmt.close();

    } catch (Exception e) {
      System.out.println("Update pw: Connection or sql or close error" +e);
    }
  }
}
