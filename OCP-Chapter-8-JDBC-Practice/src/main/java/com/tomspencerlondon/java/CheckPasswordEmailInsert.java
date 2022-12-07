package com.tomspencerlondon.java;

import com.tomspencerlondon.password.Library;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckPasswordEmailInsert {

  public static void main(String[] args) {
    // check if email is there
    // if so cannot insert, send message to the user
    // if email not present, then check password + insert

    String password = "Password123!";
    String email = "johnq@email.com";
    if(userExistsWithEmail(email)) {
      System.out.println("You are already on the database");
    } else {
      boolean pw = passwordIsValid(password);
      if (pw) {
        insertUser("Q", "John", email, password);
      }
      System.out.println("Password " + pw);
    }
  }

  private static boolean passwordIsValid(String password) {
    Library library = new Library();
    boolean hasEightCharacters = false;
    boolean hasOneLowerCaseLetter = false;
    boolean hasOneUpperCaseLetter = false;
    boolean hasOneSpecialCharacter = false;
    boolean hasOneDigit = false;

    hasEightCharacters = library.hasEightCharacters(password);
    hasOneLowerCaseLetter = library.hasOneLowerCaseLetter(password);
    hasOneUpperCaseLetter = library.hasOneUpperCaseLetter(password);
    hasOneSpecialCharacter = library.hasOneSpecialCharacter(password);
    hasOneDigit = library.hasOnedigit(password);

    if (hasEightCharacters &&
        hasOneLowerCaseLetter &&
        hasOneUpperCaseLetter &&
        hasOneSpecialCharacter &&
        hasOneDigit) {
      System.out.println("Valid Password");
      return true;
    } else {
      library.reportOnInvalid(hasEightCharacters, hasOneLowerCaseLetter, hasOneUpperCaseLetter, hasOneSpecialCharacter, hasOneDigit);
      return false;
    }
  }

  private static boolean userExistsWithEmail(String email) {
    boolean found = false;
    Connection con = null;
    PreparedStatement statement = null;

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw");
      String sql = " select FirstName, LastName, UserNameEmail, PW "
          + " from Users where UserNameEmail = ? AND PW = ?";

      statement = con.prepareStatement(sql);
      statement.setString(1, email);
      statement.setString(2, "password");

      ResultSet resultSet = statement.executeQuery();

      while (resultSet.next()) {
        found = true;
      }
      resultSet.close();
      statement.close();
      con.close();
    } catch (Exception e) {
      System.out.println("Insert: Connection or sql or close error " + e);
    }

    return found;
  }


  private static void insertUser(String lastName, String firstName, String userNameEmail, String password) {
    Connection con = null;
    PreparedStatement stmt = null; //1
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw"); // URL, Usercode, password

      String sql = "insert into Users(LastName, FirstName, UserNameEmail, PW) ";
      sql = sql + " values( ?, ?, ?, ?); "; // 2

      stmt = con.prepareStatement(sql);// 3
      stmt.setString(1, lastName);
      stmt.setString(2, firstName);
      stmt.setString(3, userNameEmail);
      stmt.setString(4, password);
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
