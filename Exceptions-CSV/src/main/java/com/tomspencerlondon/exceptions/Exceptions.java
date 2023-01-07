package com.tomspencerlondon.exceptions;

public class Exceptions {

  public static void main(String[] args) {
    int smaller = 0;
    int larger = 10;
    int result = 0;

    try {
      result = larger /smaller;
      System.out.println("Line 13 ");
    } catch (Exception e) {
      System.out.println("Error found " + e);
    }

    System.out.println("the end");
  }

}
