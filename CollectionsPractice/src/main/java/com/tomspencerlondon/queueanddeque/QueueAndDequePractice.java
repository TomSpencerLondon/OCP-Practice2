package com.tomspencerlondon.queueanddeque;

import java.util.PriorityQueue;

public class QueueAndDequePractice {

  public static void main(String[] args) {
    // Priority Queue
    // BlockingQueue
    // FIFO
    /*WHY QUEUE
* The Queue is used to insert elements at the end of the queue
* and removes from the beginning of the queue.
* It follows FIFO concept
*
* WHEN to use:
1) When a resource is shared among multiple consumers.
Examples include CPU scheduling, Disk Scheduling.
2) When data is transferred asynchronously (data not necessarily
received at same rate as sent) between two processes.
Examples include IO Buffers, pipes, file IO, etc.
3) In Operating systems:
a) Semaphores
b) FCFS ( first come first serve) scheduling, example: FIFO queue
c) Spooling in printers
d) Buffer for devices like keyboard
4) In Networks:
a) Queues in routers/ switches
b) Mail Queues
*/
    PriorityQueue<String> waitingCustomers = new PriorityQueue<>();

    waitingCustomers.add("Blue");
    waitingCustomers.add("Pink");
    waitingCustomers.add("Green");
    waitingCustomers.add("Green");
    waitingCustomers.add("Xanadu");

    System.out.println("waitingCustomers: " + waitingCustomers);

    System.out.println("peek " + waitingCustomers.peek());

    System.out.println("before poll " + waitingCustomers);

    waitingCustomers.remove("Pink");
    waitingCustomers.poll();
    waitingCustomers.add("Peter");
    System.out.println("After remove, poll and add " + waitingCustomers);

    System.out.println("Contains 2? " + waitingCustomers.contains(2));
    System.out.println("Contains Blue? " + waitingCustomers.contains("Blue"));
  }

}
