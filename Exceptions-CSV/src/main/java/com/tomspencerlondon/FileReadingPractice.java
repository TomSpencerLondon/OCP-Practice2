package com.tomspencerlondon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingPractice {

  public static void main(String[] args) {
    FileInputStream myfileIN = null;
    FileOutputStream myFileOUT = null;
    String filename = "src/main/resources/image.jpg";

    try {
      myfileIN = new FileInputStream(filename);
      myFileOUT = new FileOutputStream("src/main/resources/image-out.jpg");
      int c;
      while ((c = myfileIN.read()) != -1) {
        myFileOUT.write(c);
      }
      myfileIN.close();
      myFileOUT.close();
    } catch (Exception e) {
      System.out.println("Error " + e);
    }
  }
}
