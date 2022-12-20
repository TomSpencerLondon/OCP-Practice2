package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintingStream {

  public static void main(String[] args) {
    System.out.println("Printing a list");

    List<String> list = Arrays.asList("New York", "Tokyo", "New Delhi", "London");

    for (String val : list) {
      System.out.println(val);
    }

    Stream<String> stream = list.stream();

    stream.forEach(System.out::println);
  }

}
