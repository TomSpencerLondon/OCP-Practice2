package com.tomspencerlondon.lambdasandstreams;

import java.util.Random;

public class RandomPractice {

  public static void main(String[] args) {
    Random random = new Random();

    random.ints(1, 100)
        .limit(10)
        .forEach(System.out::println);
  }
}
