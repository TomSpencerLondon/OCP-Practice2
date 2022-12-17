package com.tomspencerlondon.queueanddeque;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DequeExercise {

  public static void main(String[] args) {
    // create a method that will
    // ArrayList<Integer> add random number to the list
    // do the same for ArrayDeque

    // loop 20000 times
    // call the method for arraylist, measure the duration

    // repeat for array deque
    // measure the durations, compare the durations

    Stream<Double> generateForArrayList = Stream.generate(Math::random);
    Stream<Double> generateForArrayDeque = Stream.generate(Math::random);
    Stream<Double> generateForTreeMap = Stream.generate(Math::random);

    List<Double> arrayList = generateForArrayList
        .limit(20000000)
        .toList();
    ArrayDeque<Double> arrayDeque = generateForArrayDeque
        .limit(20000000)
        .collect(Collectors.toCollection(ArrayDeque::new));

    Map<Double, Double> map = generateForTreeMap
        .limit(20000000)
        .collect(Collectors.toMap(Function.identity(), n -> n));

    long start = System.currentTimeMillis();
    for (Double element : arrayList) {
    }
    long end = System.currentTimeMillis();
    long arrayListDuration = end - start;

    start = System.currentTimeMillis();
    for (Double element : arrayDeque) {
    }
    end = System.currentTimeMillis();
    long arrayDequeDuration = end - start;

    start = System.currentTimeMillis();
    for (Double element : map.values()) {
    }
    end = System.currentTimeMillis();
    long mapDuration = end - start;


    System.out.println(arrayListDuration);
    System.out.println(arrayDequeDuration);
    System.out.println(mapDuration);
  }
}
