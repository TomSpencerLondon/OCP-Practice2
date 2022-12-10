package com.tomspencerlondon;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice {

  public static void main(String[] args) {
    LinkedList<String> linkedList1 = new LinkedList<>();
    linkedList1.add("apple");
    linkedList1.add("pear");
    linkedList1.addLast("grapes");
    System.out.println(linkedList1);

    linkedList1.addFirst("pomegranite");
    linkedList1.addLast("grapes");

    System.out.println(linkedList1);

    LinkedList<String> linkList2 = new LinkedList<>();
    linkList2.add("apple");
    linkList2.add("kiwi");
    linkList2.add("orange");
    System.out.println(linkList2);

    ListIterator<String> listIterator = linkedList1.listIterator();

    System.out.println();
    while(listIterator.hasNext()) {
      System.out.print(listIterator.next() + ", ");
    }

    System.out.println();

    while(listIterator.hasPrevious()) {
      System.out.print(listIterator.previous() + ", ");
    }
  }
}
