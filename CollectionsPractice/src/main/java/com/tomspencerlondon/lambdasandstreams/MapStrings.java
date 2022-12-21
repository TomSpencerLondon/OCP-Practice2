package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;

public class MapStrings {

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("cat", "bat", "rat", "vat", "mat", "hat");

    strings.stream().map(String::toUpperCase)
        .forEach(System.out::println);

    strings.stream().map(String::toLowerCase)
        .forEach(System.out::println);

    strings.stream().map(e -> e.replace("at", "atty"))
        .forEach(System.out::println);

  }
}
