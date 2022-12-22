package com.tomspencerlondon.applyingfunctionalprogramming;

import com.google.gson.internal.bind.util.ISO8601Utils;
import java.util.function.Function;

public class CurryingTaxEample {


  public static void main(String[] args) {
    Function<Double, Function<Double, Double>> calculateTax =
        rate -> amount -> amount * rate;

    Function<Double, Double> calculateNationalTax = calculateTax.apply(0.2);
    Function<Double, Double> calculateInternationalTax = calculateTax.apply(0.3);

    System.out.println(calculateNationalTax.apply(100.0));
    System.out.println(calculateInternationalTax.apply(100.0));

    Function<Short, Function<Integer, Function<Long, Long>>> f =
        s -> i -> l -> s + i + l;
    Long result = f.apply((short) 1).apply(1).apply((long) 1);

    System.out.println(result);

//  In curried functions order matters
  }
}

class Tax {
  private double rate;
  public Tax(Double rate) {
    this.rate = rate;
  }

  public double apply(double amount) {
    return rate * amount;
  }

  public static void main(String[] args) {
    Tax nationalTax = new Tax(0.2);
    Tax internationalTax = new Tax(0.3);

    System.out.println(nationalTax.apply(100));
    System.out.println(internationalTax.apply(100));
  }
}