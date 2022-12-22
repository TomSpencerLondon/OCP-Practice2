package com.tomspencerlondon.applyingfunctionalprogramming;

import java.util.function.Function;

public class ArgumentOrderExample {

  public static void main(String[] args) {
    Function<Double,
        Function<Integer,
            Function<Double, Double>>> applyReward =
        pointValue -> numberOfPoints -> total -> total - (pointValue * numberOfPoints);

    Function<Integer, Function<Double, Double>> applyNormalReward = (Function<Integer, Function<Double, Double>>) applyReward.apply(1.00);
    Function<Integer, Function<Double, Double>> applyVIPReward = applyReward.apply(2.00);

    System.out.println(applyNormalReward.apply(5).apply(10.00));
    System.out.println(applyVIPReward.apply(5).apply(10.00));


//    Closures
//       - Using them as if they were implicit parameters of a function
//        is not recommended
//    There are no functions with several arguments

//    Functions that appear to have several arguments
//      are either
//          - Functions of tuples
//          - Functions returning functions
//    Order arguments from most specific to the least specific

  }

}
