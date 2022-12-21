package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinPractice {

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("cat", "hat", "vat", "bat", "rat", "cats");

    System.out.println("List: " + strings);

    String collect = strings.stream().collect(Collectors.joining(", "));
    System.out.println(collect);
    String catsCollected = strings.stream().filter(m -> m.startsWith("c")).collect(Collectors.joining(", "));
    System.out.println(catsCollected);
  }
}
