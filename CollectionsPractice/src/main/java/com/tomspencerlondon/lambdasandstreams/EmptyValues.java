package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;

public class EmptyValues {

  public static void main(String[] args) {
    List<String> cities = Arrays.asList("London", "Bath", " ", "", null, "Bristol");
    System.out.println("Prints all " + cities.stream().count() + " values");

    cities.stream()
        .forEach(System.out::println);

    System.out.println("-----");

    cities = Arrays.asList("London", "Bath", " ", "", null, "Bristol");

    System.out.println("Print if empty");

    cities.stream()
        .filter(string -> string != null && string.isEmpty())
        .forEach(System.out::println);

    System.out.println("Print if not empty");

    cities.stream()
        .filter(cs -> cs != null && Predicate.not(StringUtils::isBlank).test(cs))
        .forEach(System.out::println);

    System.out.println("-----");

    cities = Arrays.asList("London", "Bath", null, "Bristol");
    System.out.println("Print how many are not null" +
        cities.stream().filter(Objects::nonNull).count()
        );
    cities.stream().filter(Objects::nonNull)
        .forEach(System.out::println);

    System.out.println("Print how many are null " +
        cities.stream().filter(Objects::isNull).count()
    );

    cities = Arrays.asList("London", "Bath", " ", "", null, "Bristol");

    System.out.println("All the not null and the not empties");
    cities.stream()
        .filter(Objects::nonNull)
        .filter(e -> !e.isEmpty())
        .forEach(System.out::println);
  }

}
