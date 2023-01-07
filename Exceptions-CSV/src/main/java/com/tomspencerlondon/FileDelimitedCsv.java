package com.tomspencerlondon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDelimitedCsv {

  public static void main(String[] args) throws IOException {
    String filename = "src/main/resources/DataTradeClients.csv";
    String line;
    int count = 0;
    boolean b = true;
    Scanner inputFile = null;

    try {
      File file = new File(filename);
      inputFile = new Scanner(file);
      inputFile.useDelimiter("\n");
    } catch (Exception e) {
      System.out.println("File error " + e);
      b = false;
    }

    while (inputFile.hasNext() && b == true) {
      line = inputFile.next();
      System.out.println(line);
      count++;
    }

    if (b) { inputFile.close(); }
    System.out.println("Record Count on File " + count);
  }
}