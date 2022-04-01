package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        /*Creating object of ThreadSafeQueue class*/
        ThreadSafeQueue threadSafeQueue = new ThreadSafeQueue<>();


        Thread thread = new Thread(new Runnable()
        {
            public void run()
            {
                for(int i=0; i<5; i++){
                    try {
                        /*Adds elements {0, 1, 2, 3, 4....}*/
                        threadSafeQueue.add(i);

                        /* To view the head of queue */
                        System.out.println(threadSafeQueue.peek());

                        Thread.sleep(200);

                        /* To remove elements from queue that is head of the queue*/
                        threadSafeQueue.remove();

                        /*Checking queue is empty or not*/
                        System.out.println(threadSafeQueue.isEmpty());
                        
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable()
        {
            public void run()
            {
                for(int j=10; j<15; j++){
                    try {
                        /*Adds elements {0, 1, 2, 3, 4....}*/
                        threadSafeQueue.add(j);

                        /* To view the head of queue */
                        System.out.println(threadSafeQueue.peek());

                        Thread.sleep(200);

                        /* To remove elements from queue that is head of the queue*/
                        threadSafeQueue.remove();

                        /* To view the head of queue after removing head */
                        System.out.println(threadSafeQueue.peek());

                        /*Checking queue is empty or not*/
                        System.out.println(threadSafeQueue.isEmpty());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
        thread2.start();


    }

}
