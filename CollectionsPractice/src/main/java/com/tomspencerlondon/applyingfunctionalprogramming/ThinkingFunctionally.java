package com.tomspencerlondon.applyingfunctionalprogramming;

import java.util.Arrays;
import java.util.Collections;
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
//
//    for (int i = 0; i < n; i++) {
//      g = g.compose(f);
//    }
//
//    System.out.println(g.apply(0));

    g = Collections.nCopies(n, f)
        .stream()
        .reduce(g, Function::compose);

    System.out.println(g.apply(0));

//    Function becomes a high order function when
//          - It takes a function as its input or argument
//          - It returns a function as its output
//          - It does both
//    High-order functions promote:
//          - Abstraction
//          - Composition
//          - Reusing of behaviour
//    Composition
//          - Nesting functions, passing the result of one as the input of the next
//          - Composed functions are applied in inverse order
//    Associative property
//          - A mathematical principle that proves that the grouping of values
//            does not affect the result

//    java.util.function.Function interface
//        - compose
//     Function compose(Function before) {
//        return t -> apply(before.apply(t));
//    }
//    java.util.Function interface
//        - andThen
//    Function andThen(Function after) {
//       return t -> after.apply(apply(t));
//    }
//    f.compose(g) is same as g.andThen(f)
//    java.util.function.Function interface
//          - Identity
//    Function identity() {
//      return t -> t;
//    }
//    Predicate
//        - T -> Boolean
//    Compose predicates
//        - and()
//        - or()
  }

}
