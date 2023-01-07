package com.tomspencerlondon.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

  public static void main(String[] args) {
    int smaller = 0;
    int larger = 10;
    int result = 0;
    Scanner s = new Scanner(System.in);

    try {
      System.out.println("Enter a number ");
      smaller = s.nextInt();
      result = larger /smaller;
      System.out.println("Line 13 ");
    } catch(ArithmeticException e) {
      System.out.println("Arithmetic found " + e);
    } catch(InputMismatchException e) {
      System.out.println("InputMismatchException " + e);
    } catch (Exception e) {
      System.out.println("Error found " + e);
    }

    System.out.println("the end");
    s.close();
  }

}
