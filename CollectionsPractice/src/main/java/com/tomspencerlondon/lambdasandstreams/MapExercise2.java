package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExercise2 {

  public static void main(String[] args) {
    List<Double> doubles = Arrays.asList(3.0, 2.0, 2.0, 3.0, 7.0, 3.0, 5.0);

    System.out.println(doubles);

    doubles.stream().map(i -> i * 2)
        .forEach(System.out::println);

    List<Double> collect = doubles.stream().map(i -> (i * 3) / 2).collect(Collectors.toList());

    System.out.println("(i * 3) / 2: " + collect);

    List<Double> collect1 = doubles.stream().map(i -> i * i).distinct().collect(Collectors.toList());
    System.out.println(collect1);
  }
}
