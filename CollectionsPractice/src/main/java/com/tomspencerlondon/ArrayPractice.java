package com.tomspencerlondon;

import java.util.ArrayList;
import java.util.Random;

public class ArrayPractice {

  public static void main(String[] args) {
    // win the lottery
    // generate random number
    // guess the number
    // if the guess was correct, win a movie ticket

    // collections: Lists, sets, Queue, Maps
    ArrayList<String> arrayList = new ArrayList<>();
    // variable length
    // list can grow or shrink in length

    String[] array = {"bambi", "rambo", "casino", "shrek"};

    printArray(array);

    String[] array2 = new String[3];

    Random r = new Random();

    Integer[] intArray = {1, 2, 3, 4, 5};
    Double[] doubleArray = {1.1, 2.1, 3.1, 4.1, 5.1};
    Character[] characterArray = {'a', 'b', 'c', 'd'};

    printArray(intArray);
    printArray(doubleArray);
    printArray(characterArray);

    printArrayAllDataTypes(intArray);
    printArrayAllDataTypes(doubleArray);
    printArrayAllDataTypes(characterArray);
  }

  public static void printArray(String[] array) {
    for (String element : array) {
      System.out.print(element);
    }
  }

  public static void printArray(Double[] array) {
    for (Double element : array) {
      System.out.print(element);
    }
  }

  public static void printArray(Integer[] array) {
    for (Integer element : array) {
      System.out.print(element);
    }
  }

  public static void printArray(Character[] array) {
    for (Character element : array) {
      System.out.print(element);
    }
  }

  public static <E> void printArrayAllDataTypes(E[] inputArray) {
    System.out.println("Generics");

    System.out.println(inputArray[0].getClass() + "\t");

    for (E element : inputArray) {
      System.out.println(element + ", ");
    }

    System.out.println();

    for (int i = 0; i < inputArray.length; i++) {
      System.out.print(i + ": " + inputArray[i] + ", ");
    }

    System.out.println();
  }
}