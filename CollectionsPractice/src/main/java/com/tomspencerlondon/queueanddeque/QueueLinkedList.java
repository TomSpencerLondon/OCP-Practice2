package com.tomspencerlondon.queueanddeque;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

  public static void main(String[] args) {
    Queue<Object> waitingPeople = new LinkedList<>();

    waitingPeople.add("Blue");
    waitingPeople.add("Pink");
    waitingPeople.add("Green");
    waitingPeople.add("Green");
    waitingPeople.add("Xanadu");
    System.out.println(waitingPeople.peek());
    System.out.println(waitingPeople.poll());
    System.out.println(waitingPeople.peek());
    System.out.println("Waiting customers: " + waitingPeople);
  }
}
