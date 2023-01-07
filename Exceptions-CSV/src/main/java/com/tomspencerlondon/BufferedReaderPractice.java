package com.tomspencerlondon;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderPractice {

  public static void main(String[] args) {
    String line;
    String filename = "src/main/resources/DataTradeClients.csv";

    try {
      FileReader fr = new FileReader(filename);
      BufferedReader bufferedReader = new BufferedReader(fr);
      int count = 0;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
        count++;
      }

      bufferedReader.close();
      fr.close();
      System.out.println("Finish " + count);

    } catch (Exception e) {
      System.out.println(" error " + e);
    }
  }
}
