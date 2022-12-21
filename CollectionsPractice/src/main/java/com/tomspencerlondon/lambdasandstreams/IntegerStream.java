package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;

public class IntegerStream {

  public static void main(String[] args) {
    List<Integer> integers = Arrays.asList(2, 2, 2, 3);

    Integer reduced = integers.stream().reduce(1, (a, b) -> a * b);

    System.out.println("Reduced to one value by using multiply " + reduced);

    double product = 1;

    for (double i : integers) {
      product = product * i;
    }

    System.out.println("Reduced to one using multiply for loop: " + product);

    Integer reduce = integers.stream().reduce(0, (a, b) -> a + b);

    System.out.println("Reduced to one value using reduce addition: " + reduce);

    double sum = 0;

    for (double i : integers) {
      sum = sum + i;
    }

    System.out.println("Reduced to one value by using sum " + sum);

  }
}
