package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;

public class CountAndStreams {

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("cat", " ", "", "bat", "vat", "rat", "", "hat");

    long count = strings.stream().count();

    long countNotEmpty = strings.stream().filter(s -> !s.isEmpty()).count();
    long countEmpty = strings.stream().filter(s -> s.isEmpty()).count();
    long countA = strings.stream().filter(s -> s.startsWith("a")).count();
    long countB = strings.stream().filter(e -> e.contains("b")).count();
    long allBlanks = strings.stream().filter(String::isBlank).count();
    System.out.println(allBlanks);

    long countThree = strings.stream().filter(w -> w.length() == 3).count();

    System.out.println(countThree);
  }
}
