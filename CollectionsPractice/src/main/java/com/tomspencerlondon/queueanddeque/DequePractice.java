package com.tomspencerlondon.queueanddeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class DequePractice {

  public static void main(String[] args) {
    // add to end , push adds to the front
    // pop from end, remove(value), remove (from end)
    //
    Deque<Integer> numbersDeque = new ArrayDeque<>();
//    Deque<Integer> numbersDeque = new LinkedBlockingDeque<>(10);

    numbersDeque.add(20);
    numbersDeque.add(40);
    numbersDeque.add(30);
    numbersDeque.add(22);
    numbersDeque.add(50);
    numbersDeque.push(999); // adds to the front of the queue

    System.out.println(numbersDeque);
    numbersDeque.remove(22);
    System.out.println(numbersDeque);
    numbersDeque.removeLast();
    System.out.println(numbersDeque);

    numbersDeque.push(250);
    System.out.println(numbersDeque);
    numbersDeque.add(123);
    numbersDeque.add(123);
    numbersDeque.add(123);
    numbersDeque.add(123);
    numbersDeque.add(123);
    numbersDeque.add(123);
    numbersDeque.add(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    numbersDeque.addFirst(123);
    System.out.println(numbersDeque);
  }
}
