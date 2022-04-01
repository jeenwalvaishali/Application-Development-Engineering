package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        /*Creating object of ThreadSafeQueue class*/
        ThreadSafeQueue threadSafeQueue = new ThreadSafeQueue<>();

        /*Adds elements {0, 1, 2, 3, 4}*/
        threadSafeQueue.add(1);
        threadSafeQueue.add(2);
        threadSafeQueue.add(3);
        threadSafeQueue.add(4);

        /* To view the head of queue */
        System.out.println(threadSafeQueue.peek());

        /* To remove elements from queue that is head of the queue*/
        threadSafeQueue.remove();

        /* To view the head of queue after removing head */
        System.out.println(threadSafeQueue.peek());

        /*Checking queue is empty or not*/
        System.out.println(threadSafeQueue.isEmpty());

    }

}
