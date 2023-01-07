package com.tomspencerlondon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamPractice {

  public static void main(String[] args) throws IOException {
    System.out.println("Start");
    String filename = "src/main/resources/testOut5.csv";

    FileInputStream in = null;
    FileOutputStream out = null;

    try {
      in = new FileInputStream("src/main/resources/testOut5.csv");
      out = new FileOutputStream("src/main/resources/outagain.txt");
      int c;

      while ((c = in.read())  != -1) {
        out.write(c);
        System.out.println(c + "\t" + (char) c);
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    } finally {
      if (in != null) {
        in.close();
      }

      if (out != null) {
        out.close();
      }
    }
  }
}
