package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;

public class NumberFilters {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

    System.out.println("all == 3");
    numbers.stream()
        .filter(i -> i == 3)
        .forEach(System.out::println);

    System.out.println("All bigger than 3");
    numbers.stream()
        .filter(i -> i > 3)
        .forEach(System.out::println);
  }
}
