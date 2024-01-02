package com.datastructures;

import java.util.PriorityQueue;
import java.util.Queue;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(2.1);
        queue.offer(3.4);
        queue.offer(3.7);
        queue.offer(2.2);
        queue.offer(1.8);
        queue.offer(1.4);
        queue.offer(4.0);
        queue.offer(1.1);

        // while queue is not empty, pull each element and display it.
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}

// Priority Queue: A data structure that serves elements with the
// highest priorities first, before elements with lower priority. It follows the
// First-In-First-Out (FIFO) principle.
