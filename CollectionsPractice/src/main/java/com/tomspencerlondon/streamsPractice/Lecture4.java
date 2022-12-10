package com.tomspencerlondon.streamsPractice;

import com.google.common.collect.ImmutableList;
import java.util.Set;
import java.util.stream.Collectors;

public class Lecture4 {

  public static void main(String[] args) {
    distinct();
  }

  public static void distinct() {
    ImmutableList<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9);

    numbers.stream()
        .distinct()
        .toList()
        .forEach(System.out::println);
  }

  public static void distinctWithSet() {
    ImmutableList<Integer> numbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9);
    numbers
        .stream()
        .collect(Collectors.toSet())
        .forEach(System.out::println);
  }
}
