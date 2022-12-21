package com.tomspencerlondon.lambdasandstreams;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class FarhenheitAndCelsius {

  public static void main(String[] args) {
    List<Double> fahrenheit = Arrays.asList(75.0, 65.0, 50.0, 85.0);

    fahrenheit.stream()
        .map(e -> (new DecimalFormat("0.00")
            .format((e - 32)/ 1.8)))
        .forEach(System.out::println);
  }
}
