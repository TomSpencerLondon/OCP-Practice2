package com.tomspencerlondon;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterPractice {

  public static void main(String[] args) {
    System.out.println("Start");

    String[] movies = {"CINDERELLA", "Casino", "Shrek", "Rambo", "Rocky"};
    String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
    String[] prices = {"10.50", "10.50", "10.50", "10.50", "10.50"};
    String[] genre = {"fantasy", "crime", "fantasy", "crime", "drama"};
    String filename = "src/main/resources/testOut5.csv";

    try {
      FileWriter fileWriter = new FileWriter(filename);
      BufferedWriter buffer = new BufferedWriter(fileWriter);

      for (int i = 0; i < movies.length; i++) {
        buffer.write(movies[i] + "," + days[i] + "," + prices[i] + "," + genre[i] + "\n");
      }

      buffer.close();
      fileWriter.close();
    } catch (IOException e) {
      System.out.println("BufferedWriter error: " + e);
    }

    System.out.println("Finish");
  }
}
