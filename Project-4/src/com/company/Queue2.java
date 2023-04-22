package com.company;

public class Queue2 {
    int[] queue = new int[7];
    int index = 6;
    public void enqueue(int value) {
        queue[index] = value;
        index--;
    }
}
