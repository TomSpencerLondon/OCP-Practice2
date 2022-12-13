package com.tomspencerlondon.setandqueues;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {

  public static void main(String[] args) {
    Set<String> treeSet = new TreeSet<>();

    treeSet.add("c");
    treeSet.add("b");
    treeSet.add("a");
    treeSet.add("a");

    treeSet.addAll(Arrays.asList("q", "w", "e"));
    treeSet.addAll(Arrays.asList("Z", "Y", "X"));

    for (String value : treeSet) {
      System.out.println(value);
    }

  }
}
