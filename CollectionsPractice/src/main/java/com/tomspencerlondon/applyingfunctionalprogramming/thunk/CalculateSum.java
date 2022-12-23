package com.tomspencerlondon.applyingfunctionalprogramming.thunk;

import static com.tomspencerlondon.applyingfunctionalprogramming.thunk.ListUtils.head;
import static com.tomspencerlondon.applyingfunctionalprogramming.thunk.ListUtils.tail;
import static com.tomspencerlondon.applyingfunctionalprogramming.thunk.TailCall.done;
import static com.tomspencerlondon.applyingfunctionalprogramming.thunk.TailCall.suspend;

import java.util.ArrayList;
import java.util.List;

public class CalculateSum {
  public static void main(String args[]) {
    //List<Integer> list = Arrays.asList(2, 1, 3);
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < 10000; i++) {
      list.add(i+1);
    }

    System.out.println(list);
    int total = sum(list);
    System.out.println(total);
  }

  public static int sum(List<Integer> list) {
    return sumTail(list, 0).eval();
  }

  private static TailCall<Integer> sumTail(List<Integer> list, int acc) {
    return list.isEmpty()
        ? done(acc)
        : suspend(() -> sumTail(tail(list), acc + head(list)));
  }
}
