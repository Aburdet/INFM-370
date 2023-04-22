package com.company;

import java.util.Arrays;

public class MainQueue3 {

    public static void main(String[] args) {
        Queue3 queue = new Queue3();
        queue.enqueue(3);
        queue.enqueue(56);
        queue.enqueue(2);
        System.out.println(Arrays.toString(queue.queue));
    }
}
