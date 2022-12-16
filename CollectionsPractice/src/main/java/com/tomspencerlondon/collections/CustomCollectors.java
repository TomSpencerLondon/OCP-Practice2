package com.tomspencerlondon.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollectors {

  public static void main(String[] args) {
    List<Object> list = new ArrayList<>();
    list.add("a");
    list.add(null);
    list.add("b");
    list.add("c");

    System.out.println(list);
    List<String> newList = (List<String>) list.stream().collect(toNonNullList());
    System.out.println(newList);
  }

  public static <T, A, R> Collector<T, A, R> filtering(
      Predicate<? super T> filter, Collector<T, A, R> collector) {
    return Collector.of(
        collector.supplier(),
        (accumulator, input) -> {
          if (filter.test(input)) {
            collector.accumulator().accept(accumulator, input);
          }
        },
        collector.combiner(),
        collector.finisher()
    );
  }

  public static <T, A, R> Collector<T, A, R> toNonNullList() {
    return (Collector<T, A, R>) filtering(Objects::nonNull, Collectors.toList());
  }

}

