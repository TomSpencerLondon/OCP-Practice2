package com.tomspencerlondon.streamsPractice;

import java.util.List;
import java.util.stream.IntStream;

public class Lecture2 {

  public static void main(String[] args) {
//    range();
//    rangeIteratingLists();
    intStreamIterate();
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

    IntStream.range(0, people.size())
        .forEach(i -> {
          Person person = people.get(i);
          System.out.println(person);
        });
  }

  public static void intStreamIterate() {
    IntStream.iterate(0, operand -> operand + 1)
        .limit(20)
        .forEach(System.out::println);
  }
}
