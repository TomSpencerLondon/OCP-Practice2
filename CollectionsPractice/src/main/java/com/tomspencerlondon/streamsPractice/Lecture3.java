package com.tomspencerlondon.streamsPractice;

import com.google.common.collect.ImmutableList;
import java.util.Comparator;
import java.util.List;

public class Lecture3 {

  public static void main(String[] args) {
    max();
  }

  public static void min() {
    List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

    Integer min = numbers
        .stream()
        .min(Comparator.naturalOrder())
        .get();

    System.out.println(min);
  }

  public static void max() {
    List<Integer> numbers = ImmutableList.of(1, 2, 3, 100, 23, 93, 99);

    Integer max = numbers
        .stream()
        .max(Comparator.naturalOrder())
        .get();

    System.out.println(max);
  }
}
