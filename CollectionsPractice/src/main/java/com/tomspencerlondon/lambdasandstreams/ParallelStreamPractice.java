package com.tomspencerlondon.lambdasandstreams;
//parallelStream is the alternative of stream for parallel processing.
//Normally any java code has one stream of processing,
///where it is executed sequentially.
//Whereas by using parallel streams, we can divide the code
//into multiple streams
//that are executed in parallel on separate cores
//and the final result is the
//combination of the individual outcomes.
//The order of execution, however, is not under our control.
//Take a look at the following code segment that prints a
///count of empty strings using parallelStream.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamPractice {

  public static void main(String[] args) {

    List<String> strings3 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//get count of empty string
    long count4 = strings3.parallelStream().filter(string3 -> string3.isEmpty()).count();
    strings3.stream();
    System.out.println(count4);
//It is very easy to switch between sequential and parallel streams.


// parallel processing ( instead of stream )
// breaks the stream into small subsets, run them in sequence in memory
// saving processing time
    int count = (int) strings3.parallelStream().filter(string -> string.isEmpty()).count();
    System.out.println("Empty Strings: " + count);


    Stream<String> ps = strings3.parallelStream();
    ps = ps.filter(string3 -> string3.isEmpty());


  }
}