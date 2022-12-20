package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class NullsPractice {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("London", "Bath", " ", "", null, "Bristol");

    System.out.println("Prints all " + cities.stream().count() + " values");
    System.out.println("-----");
    cities.stream().filter(Objects::isNull)
        .forEach(System.out::println);
    cities.stream()
        .filter(Objects::nonNull)
        .forEach(System.out::println);

    System.out.println("-----");

    // convert to stream and back to list (removing nulls)
    cities = cities.stream().filter(Objects::nonNull).collect(Collectors.toList());

    System.out.println("Prints the filtered " + cities.size() + " values");
    System.out.println("Prints the filtered " + cities.stream().count() + " values");

    System.out.println(cities);

    System.out.println("---");

    cities = Arrays.asList("London", "Bath", " ", "", null, "Bristol");
    System.out.println("Print if null");

    cities.stream().filter(Objects::isNull)
        .forEach(System.out::println);

    System.out.println("Print if not null ");
    cities.stream().filter(Objects::nonNull)
        .forEach(System.out::println);

    System.out.println("Count elements which are just space or empty");

    System.out.println(
        cities.stream()
            .filter(Objects::nonNull)
            .filter(String::isBlank).count());
  }

}
