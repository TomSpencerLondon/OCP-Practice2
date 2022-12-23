package com.tomspencerlondon.applyingfunctionalprogramming;

import com.tomspencerlondon.applyingfunctionalprogramming.TailCall.Suspend;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Thunk {
// Thunk
//  A function that is returned by another function to delay a computation
  public static void main(String[] args) {
//    @FunctionalInterface
//    public interface Supplier<T> {
//      T get();
//    }


//    int recursiveMethod(int i) {
//    // ...
//    return () -> recursiveMethod(i)
//    }
//    while (f == 'function') {
//      f = f();
//    return f;

    System.out.println(sumTail(Arrays.asList(1, 2, 3, 4)));
  }

  private static int sumTail(List<Integer> list) {
    return sumTail(list, 0).eval();
  }

  private static TailCall<Integer> sumTail(List<Integer> list, int acc) {
    return list.isEmpty()
        ? TailCall.Suspend.done(acc)
        : Suspend.suspend(() -> sumTail(tail(list), head(list) + acc));
  }

  public static <T> T head(List<T> list) {
    return list.get(0);
  }

  public static <T> List<T> tail(List<T> list) {
    List<T> newList = new ArrayList<>(list);
    newList.remove(0);

    return newList;
  }
}

abstract class TailCall<T> {
  public abstract boolean isComplete();
  public abstract TailCall<T> next();
  public abstract T eval();

  private static class Done<T> extends TailCall<T> {
    private final T t;

    private Done(T t) {
      this.t = t;
    }

    @Override
    public boolean isComplete() {
      return true;
    }

    @Override
    public TailCall<T> next() {
      throw new IllegalStateException("There is no next");
    }

    @Override
    public T eval() {
      return t;
    }
  }

  static class Suspend<T> extends TailCall<T> {
    private final Supplier<TailCall<T>> thunk;

    public Suspend(Supplier<TailCall<T>> thunk) {
      this.thunk = thunk;
    }

    @Override
    public boolean isComplete() {
      return false;
    }

    @Override
    public TailCall<T> next() {
      return thunk.get();
    }

//    Trampoline loop that calls a function
//    until the function returns a value
//    until it is complete

    @Override
    public T eval() {
//      TailCall<T> tailRec = this;
//      while(!tailRec.isComplete()) {
//        tailRec = tailRec.next();
//      }
//      return tailRec.eval();

      return Stream.iterate((TailCall<T>)this, TailCall::next)
          .filter(TailCall::isComplete)
          .findFirst()
          .get()
          .eval();
    }

    public static <T> Done<T> done(T t) {
      return new Done<>(t);
    }

    public static <T> Suspend<T> suspend(Supplier<TailCall<T>> s) {
      return new Suspend<>(s);
    }
  }
}