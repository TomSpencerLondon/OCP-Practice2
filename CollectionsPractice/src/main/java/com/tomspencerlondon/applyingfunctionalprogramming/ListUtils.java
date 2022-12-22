package com.tomspencerlondon.applyingfunctionalprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {

  public static void main(String[] args) {
    System.out.println(sum(Arrays.asList(1, 2, 3, 4)));
  }

  public static int sum(List<Integer> list) {
    return list.isEmpty()
        ? 0
        : head(list) + sum(tail(list));
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
