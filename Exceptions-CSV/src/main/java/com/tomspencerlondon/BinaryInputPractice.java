package com.tomspencerlondon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class BinaryInputPractice {

  public static void main(String[] args) {
    Double[] prices = new Double[5];
    String[] genres = new String[5];
    String[] movies = new String[5];
    String[] days = new String[5];

    int count = 0;
    String filename = "src/main/resources/testOutBin.dat";
    FileInputStream myFile = null;
    ObjectInputStream inputStream = null;

    try {
      myFile = new FileInputStream(filename);
      inputStream = new ObjectInputStream(myFile);

      while ( inputStream != null) {
        try {
          movies[count] = inputStream.readUTF();
          days[count] = inputStream.readUTF();
          prices[count] = inputStream.readDouble();
          genres[count] = inputStream.readUTF();
        } catch (Exception e) {
          break;
        }
        count++;
      }
    } catch (Exception e) {
      System.out.println("Count " + count + " Close error");
    }

    System.out.println(Arrays.toString(movies));
    System.out.println(Arrays.toString(days));
    System.out.println(Arrays.toString(prices));
    System.out.println(Arrays.toString(genres));
  }

}
