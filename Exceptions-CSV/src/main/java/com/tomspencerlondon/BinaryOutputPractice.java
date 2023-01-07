package com.tomspencerlondon;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class BinaryOutputPractice {

  public static void main(String[] args) {
    System.out.println("Start");

    String[] movies = {"CINDERELLA", "Casino", "Shrek", "Rambo", "Rocky"};
    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
    double[] prices = {10.50, 10.50, 10.50, 10.50, 10.50};
    String[] genre = {"fantasy", "crime", "fantasy", "crime", "drama"};

    ObjectOutputStream outputStream = null;
    FileOutputStream myFile = null;
    String filename = "src/main/resources/testOutBin.dat";

    try {
      myFile = new FileOutputStream(filename);
      outputStream = new ObjectOutputStream(myFile);

      for (int i = 0; i < movies.length; i++) {
        outputStream.writeUTF(movies[i]);
        outputStream.writeUTF(days[i]);
        outputStream.writeDouble(prices[i]);
        outputStream.writeUTF(genre[i]);
      }

      System.out.println("File written");
      outputStream.close();

    } catch (Exception e) {
      System.out.println("Exception " + e);
    }
  }
}
