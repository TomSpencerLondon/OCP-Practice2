package com.tomspencerlondon.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUser {

  public static void main(String[] args) {
//    statementPractice();
    preparedStatementPractice();
  }

  private static void preparedStatementPractice() {
    Connection con = null;
    PreparedStatement statement = null;

    try {
//      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw");
      String sql = " select FirstName, LastName, UserNameEmail, PW "
          + " from Users where UserNameEmail = ? AND PW = ?";

      statement = con.prepareStatement(sql);
      statement.setString(1, "tom@email.com");
      statement.setString(2, "password");

      ResultSet resultSet = statement.executeQuery();

      while (resultSet.next()) {
        String firstName = resultSet.getString("FirstName");
        String lastName = resultSet.getString("LastName");
        String userNameEmail = resultSet.getString("UserNameEmail");
        String password = resultSet.getString("PW");

        System.out.println(firstName + " " + lastName + " " + userNameEmail + " " + password);
      }
      resultSet.close();
      statement.close();
      con.close();
    } catch (Exception e) {
      System.out.println("Insert: Connection or sql or close error " + e);
    }
  }

  private static void statementPractice() {
    Connection con = null;
    Statement stmt = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw");

      String sql = " SELECT FirstName, LastName, UserNameEmail, PW" +
          " FROM Users";
      stmt = con.createStatement();
      ResultSet rs = stmt.executeQuery(sql);

      while (rs.next()) {
        String firstName = rs.getString("FirstName");
        String lastName = rs.getString("LastName");
        String userNameEmail = rs.getString("UserNameEmail");
        String password = rs.getString("PW");

        System.out.println(firstName + " " + lastName + " " + userNameEmail + " " + password);
      }

      con.close();
      stmt.close();
    } catch (Exception e) {
      System.out.println("Insert: Connection or sql or close error " + e);
    }
  }
}
