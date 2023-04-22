package com.company;

import java.util.Arrays;

public class MainQueue2 {

    public static void main(String[] args) {
        Queue2 queue = new Queue2();
        queue.enqueue(3);
        queue.enqueue(56);
        queue.enqueue(2);
        System.out.println(Arrays.toString(queue.queue));
    }
}
