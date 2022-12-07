package com.tomspencerlondon.northwind;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class SelectData {

  public static void main(String[] args) {
//    printRecords();
//    selectBrackets();
//    selectDates();
//    selectProductsByCategoryView();
//    callableProductPrice();

//    callableUserInsertion();
//    callFunction();
//    callAvgPriceFunction(2);
    runAvgPrice();
  }

  public static void callFunction() {
    Connection con = null;
    CallableStatement stmt = null; //1

    try {
      con= DriverManager.getConnection("jdbc:mysql://localhost/sakila", "root", "my-secret-pw"); // URL, Usercode, password

      stmt = con.prepareCall("{? = call inventory_in_stock(?)}");

      stmt.registerOutParameter(1, Types.DECIMAL);
      stmt.setInt(2, 367);
      stmt.execute();

      System.out.println("Inventory in Stock: " + stmt.getInt(1));

      con.close();
      stmt.close();

      System.out.println("Successful print");
    } catch (Exception e) {
      System.out.println("printRecords: Connection or sql or close error" +e);
    }
  }

  public static void runAvgPrice() {
    // USE Java
    Connection con = null;
    java.sql.CallableStatement cstmt = null;
    PreparedStatement pstmt = null; //1
    try {
      con=DriverManager.getConnection("jdbc:mysql://localhost/northwind", "root", "my-secret-pw"); // URL, Usercode, password

      // find out how many categories there are
      int catCount= 0;
      String mySql = "select count(CategoryID) as catCount from Categories";
      pstmt =con.prepareStatement(mySql); //3
      ResultSet rs = pstmt.executeQuery();
      if(rs.next()) {
        catCount= rs.getInt("catCount");
      }
      System.out.println("catCount : " + catCount);

      String mySqlSelect = "select CategoryID"
          + " , CategoryName "
          + " , ? as AvgPrice  "
          + " from Categories "
          + " where CategoryID = ? ";
      for (int i = 1 ; i <= catCount; i++) {
        pstmt =con.prepareStatement(mySqlSelect); //3
        pstmt.setInt(1, i);  //4
        pstmt.setInt(2, i);  //4
        ResultSet rs2 = pstmt.executeQuery();
        if( rs2.next()) {
          String cat = rs2.getString("CategoryName");
          int ctid = rs2.getInt("CategoryId");
          cstmt = con.prepareCall("{? = call CalcAvgPrice(?)}");
          cstmt.registerOutParameter(1, Types.INTEGER);
          cstmt.setInt(2,ctid);
          cstmt.execute();
          double avgprice = cstmt.getInt(1);
          System.out.println(ctid+ " Category "+ cat + " " + avgprice);
        }
      }

      cstmt.close();
      pstmt.close();
      con.close();
      System.out.println("\nSuccess");

    } catch (Exception e) {
      System.out.println("error " +e);
    }

  }




  public static void callAvgPriceFunction(int catID) {
    Connection con = null;
    CallableStatement stmt = null; //1

    try {
      con= DriverManager.getConnection("jdbc:mysql://localhost/northwind", "root", "my-secret-pw");
      stmt = con.prepareCall("{? = call CalcAvgPrice(?)}");
      stmt.registerOutParameter(1, Types.INTEGER);
      stmt.setInt(2, catID);
      stmt.execute();

//      System.out.println("Category: " + catID + " Average price: " + stmt.getInt(1));

      String sql = "SELECT CategoryName, ? as AvgPrice " +
          "from Categories";

      PreparedStatement statement = con.prepareStatement(sql);
      statement.setInt(1, stmt.getInt(1));

      ResultSet rs = statement.executeQuery();

      if (rs.next()) {
        System.out.println("Category Name: " + rs.getString(1) + " Average Price: " + rs.getInt(2));
      }


      con.close();
      stmt.close();

    } catch (SQLException e) {
      System.out.println("error " + e);
    }

  }

  public static void selectDates() {
    Connection con = null;
    PreparedStatement stmt = null; //1

    String sql = "select " +
    "FirstName, " +
    "current_date() as Today, " +
    "DATE_FORMAT(BirthDate, '%c/%e/%Y') as BirthDate, " +
    "year (BirthDate) as Year, " +
    "month (BirthDate) as Month, " +
    "day (BirthDate) as Day, " +
    "monthname (BirthDate) as MonthName, " +
    "dayname (BirthDate) as DayName, " +
    "date(date_add(BirthDate, interval 67 year)) as Retire, " +
    "floor(datediff(current_date(), BirthDate) / 365) as Age " +
    "from Employees;";


    try {
      con= DriverManager.getConnection("jdbc:mysql://localhost/northwind", "root", "my-secret-pw"); // URL, Usercode, password

      stmt =con.prepareStatement(sql); //3

      ResultSet rs = stmt.executeQuery();

      while(rs.next()) {
        String firstName = rs.getString("FirstName");
        String birthDate = rs.getString("BirthDate");
        String age = rs.getString("Age");
        Date retire = rs.getDate("Retire");
        System.out.println(firstName + " " + birthDate + " " + age + " " + retire);
      }
      con.close();
      stmt.close();
      System.out.println("Successful print");
    } catch (Exception e) {
      System.out.println("printRecords: Connection or sql or close error" +e);
    }
  }

  public static void selectBrackets() {
    Connection con = null;
    PreparedStatement stmt = null; //1
    String sql = "select FirstName " +
    ", instr(Notes, '(') as PositionOfOpenBracket " +
    ", instr(Notes, ')') as PositionOfCloseBracket " +
    ", instr(Notes, ')') - instr(Notes, '(') " +
    ", substring(Notes, instr(Notes, '('), instr(Notes, ')') - instr(Notes, '(') + 1) as Subs " +
    ", Notes " +
    "from Employees " +
    "where instr(Notes, '(') > 0;";

    try {
      con= DriverManager.getConnection("jdbc:mysql://localhost/northwind", "root", "my-secret-pw"); // URL, Usercode, password

      stmt =con.prepareStatement(sql); //3

      ResultSet rs = stmt.executeQuery();

      while(rs.next()) {
        String firstName = rs.getString("FirstName");
        String subs = rs.getString("Subs");
        System.out.println(firstName + " " + subs);
      }
      con.close();
      stmt.close();
      System.out.println("Successful print");
    } catch (Exception e) {
      System.out.println("printRecords: Connection or sql or close error" +e);
    }

  }

  public static void selectProductsByCategoryView() {
    Connection con = null;
    PreparedStatement stmt = null; //1
//    String sql = "select CategoryName, ProductName " +
//    "FROM productsByCategory";

    String sql = "select CategoryName, count(ProductName) as CountProducts " +
    "FROM productsByCategory " +
    "group by CategoryName;";


    try {
      con= DriverManager.getConnection("jdbc:mysql://localhost/northwind", "root", "my-secret-pw"); // URL, Usercode, password

      stmt =con.prepareStatement(sql); //3

      ResultSet rs = stmt.executeQuery();

      while(rs.next()) {
        String categoryName = rs.getString("CategoryName");
        String productName = rs.getString("CountProducts");
        System.out.println(categoryName + " " + productName);
      }
      con.close();
      stmt.close();
      System.out.println("Successful print");
    } catch (Exception e) {
      System.out.println("printRecords: Connection or sql or close error" +e);
    }

  }

  public static void callableUserInsertion() {
    Connection con = null;
    CallableStatement stmt = null; //1

    try {
      con= DriverManager.getConnection("jdbc:mysql://localhost/java", "root", "my-secret-pw"); // URL, Usercode, password

      stmt =con.prepareCall("{call InsertUser(?, ?, ?, ?)}"); //3
      stmt.setString(1, "Coltrane");
      stmt.setString(2, "John");
      stmt.setString(3, "john@lovesupreme.com");
      stmt.setString(4, "password");
      stmt.execute();

      con.close();
      stmt.close();
      System.out.println("Successful print");
    } catch (Exception e) {
      System.out.println("printRecords: Connection or sql or close error" +e);
    }
  }


  public static void callableProductPrice() {
    Connection con = null;
    CallableStatement stmt = null; //1

    try {
      con= DriverManager.getConnection("jdbc:mysql://localhost/northwind", "root", "my-secret-pw"); // URL, Usercode, password

      stmt =con.prepareCall("{call GetProductPrice(?, ?)}"); //3
      stmt.registerOutParameter(2, Types.DECIMAL);
      stmt.setInt(1, 21);
      stmt.execute();
      BigDecimal result = stmt.getBigDecimal(2); // 2 is the index of the ?

      if (result != null) {
        System.out.println(result);
      }

      con.close();
      stmt.close();
      System.out.println("Successful print");
    } catch (Exception e) {
      System.out.println("printRecords: Connection or sql or close error" +e);
    }
  }

  public static void printRecords() {
    Connection con = null;
    PreparedStatement stmt = null; //1

    try {
// Class.forName("com.mysql.cj.jdbc.Driver");
      con= DriverManager.getConnection("jdbc:mysql://localhost/northwind", "root", "my-secret-pw"); // URL, Usercode, password

      String sql = "Select "
          + " right(ProductName, 4) as ProductName"
          + ", UnitPrice "
          + "from Products order by ProductName "; //2

      stmt =con.prepareStatement(sql); //3

      ResultSet rs = stmt.executeQuery();

      while(rs.next()) {
        String pn = rs.getString("ProductName");
        double price = rs.getDouble("UnitPrice");
        System.out.println(pn + " " + price);
      }
      con.close();
      stmt.close();
    } catch (Exception e) {
      System.out.println("printRecords: Connection or sql or close error" +e);
    }
    System.out.println("printRecords: Successfull print all records");
  }
}
