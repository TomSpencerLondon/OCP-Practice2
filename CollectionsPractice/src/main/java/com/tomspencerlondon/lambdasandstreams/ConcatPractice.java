package com.tomspencerlondon.lambdasandstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatPractice {

  public static void main(String[] args) {
    List<String> strings1 = Arrays.asList("cat", "bat", "rat");

    System.out.println("List: " + strings1);

    Stream<String> mergedStream1 = strings1.stream();

    List<String> strings2 = Arrays.asList("lion", "tiger");
    System.out.println("List: " + strings2);
    Stream<String> mergedStream2 = strings2.stream();

    Stream<String> mergedStream3 = Stream.concat(mergedStream1, mergedStream2);
    mergedStream3
        .forEach(System.out::println);
  }
}
