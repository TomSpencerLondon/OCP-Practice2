package com.tomspencerlondon.streamsPractice;

import java.util.List;
import java.util.stream.IntStream;

public class Lecture2 {

  public static void main(String[] args) {
    range();
  }

  public static void range() {
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    IntStream.range(0, 11)
        .forEach(System.out::println);

    IntStream.rangeClosed(0, 10)
        .forEach(System.out::println);
  }

  public static void rangeIteratingLists() {
    List<Person> people = MockData.getPeople();
  }

  public static void intStreamIterate() {

  }
}
