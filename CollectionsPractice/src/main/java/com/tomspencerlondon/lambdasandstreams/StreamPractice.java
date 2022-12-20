package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

  public static void main(String[] args) {
    Stream<String> stringStream = Stream.of("New York", "Tokyo", "New Delhi");

    String[] arr = {"New York", "Tokyo", "New Delhi"};

    Stream<String> stream = Arrays.stream(arr);

    List<String> cities = Arrays.asList("New York", "Tokyo", "New Delhi");
    Stream<String> cityStream = cities.stream();

    List<String> cityList = stream.toList();

    System.out.println("List: " + cityList);

    System.out.println("Printing a stream -------------");
//Stream<String> stream = listToStream(cities);
    Stream<String> newCityStream = cities.stream();
    newCityStream.forEach(System.out::println);

    List<String> strings = Arrays.asList("animal", "cat", "rat", "bat");
    System.out.println();
    strings.stream().filter(m -> m.startsWith("a"))
        .forEach(System.out::println);
    System.out.println();
    strings.stream()
        .filter(e -> e.contains("at"))
        .forEach(System.out::println);

    System.out.println();

    strings.stream()
        .filter(w -> w.length() == 3)
        .forEach(System.out::println);

    List<String> duplicates = Arrays.asList("cat", "cat", "rat");
    duplicates.stream()
        .distinct()
        .forEach(System.out::println);

    List<Integer> duplicateNumbers = Arrays.asList(2, 2, 3, 3, 7);
    duplicateNumbers.stream().filter(i -> i == 3)
        .forEach(System.out::println);
    System.out.println();
    duplicateNumbers.stream().filter(i -> i > 3)
        .forEach(System.out::println);
  }
}
