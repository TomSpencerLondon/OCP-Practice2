package com.tomspencerlondon.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteUser {

  public static void main(String[] args) {
    Connection con = null;
    PreparedStatement statement = null;

    try {
      // This is deprecated since Java 6
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw");

      String sql = "delete from Users " +
          "where UserNameEmail = ?; ";

      statement = con.prepareStatement(sql);
      statement.setString(1, "tim@gmail.com");
      statement.executeUpdate();

      System.out.println("Successful delete ");

      con.close();
      statement.close();
    } catch (Exception e) {
      System.out.println("Delete: connection or sql or close error " + e);
    }
  }
}
