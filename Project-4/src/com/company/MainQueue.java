package com.company;

import java.util.Arrays;

public class MainQueue {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue(56);
        queue.enqueue(2);
        System.out.println(Arrays.toString(queue.queue));
        queue.dequeue();
        System.out.println(Arrays.toString(queue.queue));
    }
}
