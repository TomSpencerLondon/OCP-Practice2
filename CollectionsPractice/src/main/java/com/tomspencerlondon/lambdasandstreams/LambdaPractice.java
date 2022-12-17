package com.tomspencerlondon.lambdasandstreams;

public class LambdaPractice {

  interface MovieCalc {
    double movieprice(double x, double y);
  }

  public static void main(String[] args) {
    MovieCalc obj = (x, y) -> x * y;
    MovieCalc obj2 = (x, y) -> x + y;
    double tp = obj2.movieprice(5, 2);
    MovieCalc obj3 = (x, y) -> x / y;

    double other = obj3.movieprice(5, 2);
    System.out.println(tp);
    System.out.println(other);
  }
}
