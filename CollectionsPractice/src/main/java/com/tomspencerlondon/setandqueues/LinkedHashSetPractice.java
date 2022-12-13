package com.tomspencerlondon.setandqueues;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {

  public static void main(String[] args) {
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    linkedHashSet.add("Samson");
    linkedHashSet.add("Benjamin");
    linkedHashSet.add("Jonathan");
    linkedHashSet.add("Samson");
    linkedHashSet.add("Samson");
    linkedHashSet.add("Paul");
    linkedHashSet.add("Peter");
    linkedHashSet.add("Nigel");
    linkedHashSet.add("Sam");

    System.out.println("-------");
    Iterator<String> iterator = linkedHashSet.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    for (String s : linkedHashSet) {
      System.out.println(s);
    }

    linkedHashSet.contains("a");
    System.out.println(linkedHashSet.size());
    linkedHashSet.remove(1);
    System.out.println(linkedHashSet.size());
    linkedHashSet.clear();
    System.out.println(linkedHashSet.size());

  }
}
