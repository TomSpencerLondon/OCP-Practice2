package com.tomspencerlondon.applyingfunctionalprogramming;

import java.util.function.Function;

public class FunctionalProgramming {
//  Stream API
//
//  Esteban Herrera - Applying Functional Techniques with Java
//  Java 8 - Method References
//  Functional Programming -> Referential Transparency
//  OOP -> Encapsulation

//  Referential transparency

  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);

    Function<Integer, Integer> f = x -> x * a;

//    Principles and techniques:
//        - Pure functions
//        - Currying and partial application
//        - How to abstract control structures
//        - Monads
//    => Know how to use functional programming

//    prerequisites
//          - Stream API
//          - Lambda Expressions
//          - Method References
//          - Generics

  }
}
