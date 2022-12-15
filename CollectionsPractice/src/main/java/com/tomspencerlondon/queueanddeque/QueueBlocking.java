package com.tomspencerlondon.queueanddeque;

import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueBlocking {

  public static void main(String[] args) {
    BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(10);

    PriorityQueue<String> priorityQueue = new PriorityQueue<>();
    priorityQueue.add("Blue");
    priorityQueue.add("Pink");
    priorityQueue.add("Green");
    priorityQueue.add("Green");
    priorityQueue.add("Xanadu");

    blockingQueue.add("Blue");
    blockingQueue.add("Pink");
    blockingQueue.add("Green");
    blockingQueue.add("Green");
    blockingQueue.add("Xanadu");

    System.out.println("waiting customers: " + priorityQueue);
  }
}
