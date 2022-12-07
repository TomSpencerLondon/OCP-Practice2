package com.tomspencerlondon.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertUser {

  public static void main(String[] args) {
    preparedStatementExample();
    statementExample();
  }

  private static void statementExample() {
    Connection con = null;
    Statement stmt = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw"); // URL, Usercode, password
      stmt = con.createStatement();

      String sql = "insert into Users(LastName, FirstName, UserNameEmail, PW) ";
      sql = sql + " values('Spencer','Tim', 'tim@gmail.com', 'password'); ";

      stmt.executeUpdate(sql); // insert, update, delete, create table
      con.close();
      stmt.close();
    } catch (Exception e) {
      System.out.println("Insert: Connection or sql or close error" +e);
    }

    System.out.println("Successful statement insert");
  }

  private static void preparedStatementExample() {
    Connection con = null;
    PreparedStatement stmt = null; //1
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw"); // URL, Usercode, password

      String sql = "insert into Users(LastName, FirstName, UserNameEmail, PW) ";
      sql = sql + " values( ?, ?, ?, ?); "; // 2

      stmt = con.prepareStatement(sql);// 3
      stmt.setString(1, "Spencer");
      stmt.setString(2, "Rob");
      stmt.setString(3, "rob@email.com");
      stmt.setString(4, "password");
      stmt.executeUpdate(); // 4
//executeUpdate (insert, delete, update, create table), executeQuery (select)
      System.out.println("insertUser: Successful PreparedStatement insert");

      con.close();
      stmt.close();
    } catch (SQLException e) {
      System.out.println("insertUser: SQLException Error (insert failed) " +e);
    } catch (Exception e) {
      System.out.println("insertUser: General Error " +e);
    }
  }
}
