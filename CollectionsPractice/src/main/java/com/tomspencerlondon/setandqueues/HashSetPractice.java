package com.tomspencerlondon.setandqueues;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

  public static void main(String[] args) {
    // add, remove(Object o), contains(Object o), size(), clear(), isEmpty()
    Set<String> hashSet = new HashSet<>();

    hashSet.isEmpty();
    hashSet.add("Benjamin");
    hashSet.add("Jonathan");
    hashSet.add("Samson");
    hashSet.add("Samson");
    hashSet.add("Paul");
    hashSet.add("Peter");
    hashSet.add("Nigel");
    hashSet.add("Sam");

    System.out.println(hashSet);

    for (String s : hashSet) {
      System.out.println(s);
    }

    hashSet.remove("Sam");
    System.out.println(hashSet.contains("Sam"));
    System.out.println(hashSet.isEmpty());
    System.out.println(hashSet.size());
    hashSet.clear();
    System.out.println(hashSet.isEmpty());
    System.out.println(hashSet.size());
    System.out.println();
  }
}
