package com.tomspencerlondon.lambdasandstreams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStream {

  public static void main(String[] args) {
    streamFromArray();

    List<String> myList = Arrays.asList("New York", "Tokyo", "New Delhi", "London");
    Stream<String> myStream2 = myList.stream();

    BlockingQueue<Integer> myQueue = new ArrayBlockingQueue<>(10);
    myQueue.add(10);
    Stream<Integer> myIntegerStream = myQueue.stream();

    ArrayList<String> list = new ArrayList<>();
    list.add("Cat");
    list.add("Cheetah");
    list.add("");
    list.add("");

    Stream<String> myStringStream = list.stream();

    // Stream back into a list

    List<String> cities = Arrays.asList("New York", "Tokyo", "New Delhi", "London");

    Stream<String> stream = cities.stream();

    System.out.println(stream);

    List<String> cities2 = stream.collect(Collectors.toList());

    System.out.println("List: " + cities2);
  }

  private static void streamFromArray() {
    String[] myArray = {"New York", "Tokyo", "New Delhi", "London"};

    System.out.println(Arrays.toString(myArray));

    Stream<String> myStream = Arrays.stream(myArray);

    myStream.forEach(System.out::println);
  }
}
