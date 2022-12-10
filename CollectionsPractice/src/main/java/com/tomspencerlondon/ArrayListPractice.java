package com.tomspencerlondon;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

  public static void main(String[] args) {
    System.out.println("array list");

    String[] array = new String[]{"bambi", "rambo", "casino", "shrek"};
    System.out.println(Arrays.toString(array));

    ArrayList<String> arrayList = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      arrayList.add(array[i]);
    }

    System.out.println(arrayList);
  }

}
