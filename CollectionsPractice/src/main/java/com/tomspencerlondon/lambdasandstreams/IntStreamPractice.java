package com.tomspencerlondon.lambdasandstreams;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamPractice {

  public static void main(String[] args) {

    Random random = new Random();

    IntStream stream = random.ints().limit(10);

    System.out.println("Sum: ----");
    System.out.println(stream.summaryStatistics());
  }
}
