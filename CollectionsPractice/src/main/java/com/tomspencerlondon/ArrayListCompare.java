package com.tomspencerlondon;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCompare {

  public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<>(asList("c", "a", "t"));
    ArrayList<String> dashes = new ArrayList<>(asList("c", "a", "t"));

    words.clear();
    words.addAll(dashes);

    if (words.equals(dashes)) {
      System.out.println("You win");
    } else {
      System.out.println("You hang");
    }
  }

}
