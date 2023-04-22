package com.company;

public class Queue {
    int[] queue = new int[7];
    int index = 0;
    public void enqueue(int value) {
        queue[index] = value;
        index++;
    }
    public void dequeue() {
        for(int i=1; i < queue.length; i++) {
            queue[i-1] = queue[i];
            if(i == 6) {
                queue[i] = 0;
            }
        }
    }
}
