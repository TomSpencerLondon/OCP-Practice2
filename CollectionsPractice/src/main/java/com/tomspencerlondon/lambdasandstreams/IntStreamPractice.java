package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamPractice {

  public static void main(String[] args) {

    Random random = new Random();

    IntStream stream = random.ints().limit(10);

    System.out.println("Sum: ----");
    System.out.println(stream.summaryStatistics());
//    System.out.println(stream.sum());

    int[] ints = new Random().ints(52, 1, 10).toArray();

    System.out.println(Arrays.toString(ints));

  }
}
