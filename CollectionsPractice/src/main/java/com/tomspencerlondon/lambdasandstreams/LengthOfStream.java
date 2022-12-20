package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LengthOfStream {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("New York", "Tokyo", "New Delhi", "London");

    System.out.println("How many in list: " + list.size());

    Stream<String> stream = list.stream();

    System.out.println("Count from stream: " + stream.count());
  }
}
