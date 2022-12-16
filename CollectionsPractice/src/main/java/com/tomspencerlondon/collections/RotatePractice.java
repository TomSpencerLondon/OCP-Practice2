package com.tomspencerlondon.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class RotatePractice {

  private static final int REVERSE_THRESHOLD = 18;

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    System.out.println(list);
    rotate(list, 1);
    System.out.println(list);
  }


  private static void rotate(List<?> list, int distance) {
    int size = list.size();
    if (size == 0) {
      return;
    }
    int mid = -distance % size;
    if (mid < 0) {
      mid += size;
    }
    if (mid == 0) {
      return;
    }

    reverse(list.subList(0, mid));
    reverse(list.subList(mid, size));
    reverse(list);
  }

  public static void reverse(List<?> list) {
    int size = list.size();
    ListIterator fwd = list.listIterator();
    ListIterator rev = list.listIterator(size);
    for (int i = 0, mid = list.size() >> 1; i < mid; i++) {
      Object tmp = fwd.next();
      fwd.set(rev.previous());
      rev.set(tmp);
    }
  }

  public static void swap(List<?> list, int i, int j) {
    // instead of using a raw type here, it's possible to capture
    // the wildcard but it will require a call to a supplementary
    // private method
    final List l = list;
    l.set(i, l.set(j, l.get(i)));
  }

}
