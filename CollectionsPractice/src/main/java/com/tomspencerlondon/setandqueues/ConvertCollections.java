package com.tomspencerlondon.setandqueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConvertCollections {
  // Arrays
  // collections: Set, List, // Queue, Dequeue
  public static void main(String[] args) {
    String[] array = new String[]{"bambi", "rambo", "casino", "shrek"};
    System.out.println(Arrays.toString(array));
    // from one collection to any other:

    List<String> arrayList = new ArrayList<>();
    Set<String> treeSet = new TreeSet<>();

    Collections.addAll(arrayList, array); // array to list
    System.out.println(arrayList);

    Collections.addAll(treeSet, array); // array to set
    System.out.println(treeSet);
  }
}
