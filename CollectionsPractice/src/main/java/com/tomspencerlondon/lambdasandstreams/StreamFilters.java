package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;

public class StreamFilters {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("animal", "cat", "rat", "bat");

    for (String m : list) {
      if (m.startsWith("a")) {
        System.out.println(m);
      }
    }

    System.out.println("Starts with a");
    list.stream().filter(m -> m.startsWith("a"))
        .forEach(System.out::println);

    System.out.println("Contains at");
    list.stream()
        .filter(e -> e.contains("at"))
        .forEach(System.out::println);

    System.out.println("Print length 3");
    list.stream()
        .filter(w -> w.length() == 3)
        .forEach(System.out::println);
  }
}
