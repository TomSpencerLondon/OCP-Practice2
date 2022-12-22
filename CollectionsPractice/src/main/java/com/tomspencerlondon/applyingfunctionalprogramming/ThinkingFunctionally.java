package com.tomspencerlondon.applyingfunctionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.xml.validation.Validator;

public class ThinkingFunctionally {

  public static void main(String[] args) {
////    Java 8 - Lambda, Method references, streams
//    Not functional:
//    list.stream()
//        .filter(Validator::isValidOrThrowRuntimeException)
//        .map(State::addToState)
//        .forEach(System.out::println)

//    Functional programming - pure functions
//     - functions:
//          - do one thing
//          - don't depend on anything else but their arguments
//          - And always give us the same result
//    Java not necessarily to be used functionally
//    Way write code -> functional
//    Imperative -> functional paradigm
//    Learn to think in new language
//    practice is key
//    grammar of functional programming
//    Not Java 8 features but functional concepts
//    Loyalty Program - Wired Brain Coffee
//

    int n = 10;

    Function<Integer, Integer> g = x -> x;
    Function<Integer, Integer> f = x -> x + 1;

    for (int i = 0; i < n; i++) {
      g = g.compose(f);
    }

    System.out.println(g.apply(0));
  }

}
