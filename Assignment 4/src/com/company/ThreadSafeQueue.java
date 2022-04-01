package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class ThreadSafeQueue<T> {

    private Queue<T> queue;
    public Object object = new Object();

    /*Initializing queue*/
    public ThreadSafeQueue(){
        queue = new LinkedList<>();
    }

    /*Method to add data in queue*/
    public void add(T data){
        synchronized (object){
            queue.add(data);
        }
    }

    /*Method to remove data from queue*/
    public T remove(){
        synchronized (object){
           return queue.remove();
        }
    }

    /*Method to return head of queue*/
    public T peek(){
        synchronized (object){
            return queue.peek();
        }
    }

    /*Method to check queue is empty or not*/
    public boolean isEmpty(){
        synchronized (object){
            return queue.isEmpty();
        }
    }

}
