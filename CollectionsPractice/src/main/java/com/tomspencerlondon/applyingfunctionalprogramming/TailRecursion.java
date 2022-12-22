package com.tomspencerlondon.applyingfunctionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TailRecursion {

  public static void main(String[] args) {
//    System.out.println(sum(Arrays.asList(1, 2, 3, 4)));
    System.out.println(sumTail(Arrays.asList(1, 2, 3, 4), 0));
  }

  private static int sumTail(List<Integer> list, int acc) {
    return list.isEmpty()
        ? acc
        : sumTail(tail(list), head(list) + acc);
  }

  public static int sum(List<Integer> list) {
    if (list.isEmpty()) {
      return 0;
    } else {
      int x = head(list);
      int y = sum(tail(list));
      int total = x + y;
      return total;
    }
  }

  public static <T> T head(List<T> list) {
    return list.get(0);
  }

  public static <T> List<T> tail(List<T> list) {
    List<T> newList = new ArrayList<>(list);
    newList.remove(0);

    return newList;
  }

}
