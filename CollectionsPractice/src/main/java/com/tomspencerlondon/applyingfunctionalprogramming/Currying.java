package com.tomspencerlondon.applyingfunctionalprogramming;

import com.google.common.base.Function;

public class Currying {

  public static void main(String[] args) {
//    Creating Reusable Functions with Partial Application and Currying
//    How functional programming handles functions of multiple arguments

//    Closure
//      ability of a method to reference a variable or another method in
//      its enclosing context.
//
    Integer a = 2;

    Function<Integer, Integer> f = new Function<Integer, Integer>() {
      @Override
      public Integer apply(Integer x) {
        return x * a;
      }
    };

    // Effectively final - value never changed

    Integer b = 2;
    Function<Integer, Integer> o = x -> x * b;

//  NOT Equivalent to f(x) = x * 2

//    Correct way to express the function
//    f(x, a) = x * a;

//    Reusing effectively final is harder - depends on context
//    not only its argument

    int c = Integer.parseInt(args[0]);
    Function<Integer, Integer> x = v -> v * c;
//    Depends on context not only on its argument

//  Make two arguments

//  @FunctionalInterface
//    public interface BinaryOperator<T> extends BiFunction<T, T, T> {
//    }

//  Needs argument of two but not more
//  Need to define another functional interface:
//    @FunctionalInterface
//    public interface QuarterFunction<T, U, V, W, R> {
//      R apply(T t, U u, V v, W w);
//    }

//    Multiple arguments - Use Tuples
//
    Function<Tuple<Integer, Integer>, Integer> t =
      tuple -> tuple._1 + tuple._2;

    Integer i = t.apply(new Tuple<>(2, 1));

    System.out.println(i);

//    Cumbersome to create tuples (Haskell Curry)
//    Currying
//    Converting a function of multiple arguments to a
//    function of one argument each step at a time.
//

//    Partial application
//    Supplying fewer arguments than the ones required by the function

//    All currying is partial application, but not all partial application
//    is currying

//    Currying in Java
//    Function<Integer, Function<Integer, Integer>>
    Function<Integer, Function<Integer, Integer>> add =
        g -> h -> g + h;

    Function<Integer, Function<Integer, Integer>> add2 =
        new Function<Integer, Function<Integer, Integer>>() {
          @Override
          public Function<Integer, Integer> apply(Integer a) {
            return new Function<Integer, Integer>() {
              @Override
              public Integer apply(Integer b) {
                return a + b;
              }
            };
          }
        };

    Integer e = add.apply(1).apply(2);

    System.out.println(e);


  }
}

class Tuple<T, U> {
  public final T _1;
  public final U _2;

  public Tuple(T _1, U _2) {
    this._1 = _1;
    this._2 = _2;
  }
}
