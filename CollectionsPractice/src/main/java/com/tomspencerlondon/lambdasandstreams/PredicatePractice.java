package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePractice {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("New York","Tokyo","New Delhi");

    System.out.println("Example 3-------------");
    Predicate<String> predicate = new Predicate<String>() { // create the predicate
      @Override
      public boolean test(String s) {
// filter cities that start with "N"
        return s.startsWith("N"); // RETURNS A BOOLEAN
      }
    };

    // create the predicate
    Predicate<String> predicate2 = s -> {
// filter cities that start with "N"
      return s.startsWith("N"); // RETURNS A BOOLEAN
    };
    cities.stream().filter(predicate).forEach(System.out::println); // use the predicate
  }
}
