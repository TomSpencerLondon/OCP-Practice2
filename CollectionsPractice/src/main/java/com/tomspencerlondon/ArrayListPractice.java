package com.tomspencerlondon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

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

    arrayList.add("John");
    arrayList.add("Peter");

    System.out.println("get(0) " + arrayList.get(0));
    System.out.println(arrayList.size());
    System.out.println(arrayList);

    boolean b = arrayList.contains("John");
    System.out.println("Boolean b: " + b);
    System.out.println("Index of : " + arrayList.indexOf("John"));
    arrayList.add("bambi");
    System.out.println("Last index of : " + arrayList.lastIndexOf("bambi"));

    // update: set
    arrayList.set(1, "a");
    System.out.println(arrayList);
    arrayList.remove(0); // remove / clear
    arrayList.remove("a");

    System.out.println(arrayList);

    Iterator<String> myIterator = arrayList.iterator();

    while (myIterator.hasNext()) {
      System.out.println(myIterator.next());
    }

    for (String temp : arrayList) {
      System.out.println(temp);
    }

    Collections.sort(arrayList);
    System.out.println(arrayList);

    Collections.reverse(arrayList);

    ArrayList<Double> list = new ArrayList<>();

    list.add(1.1);

    Double[] doubles = list.toArray(new Double[list.size()]);
    for (Double d : doubles) {
      System.out.print(d + ", ");
    }
    System.out.println();
  }

}
