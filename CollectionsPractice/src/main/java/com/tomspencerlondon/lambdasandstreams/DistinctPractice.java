package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctPractice {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("cat", "cat", "rat");

    Stream<String> stream = list.stream();

    stream.distinct()
        .forEach(System.out::println);

    System.out.println("------");

    List<Integer> numbers = Arrays.asList(2, 2, 3, 3, 3);

    numbers.stream()
        .distinct()
        .forEach(System.out::println);
  }
}
