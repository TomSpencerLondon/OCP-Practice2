package com.tomspencerlondon.lambdasandstreams;

public class LambdaPractice {

  interface MovieCalc {
    double movieprice(int x, int y);
  }

  public static void main(String[] args) {
    MovieCalc obj = (x, y) -> x * y;
    MovieCalc obj2 = (x, y) -> x + y;
    MovieCalc obj3 = (x, y) -> x / y;

    double tp = obj.movieprice(5, 2);
    System.out.println(tp);
  }
}
