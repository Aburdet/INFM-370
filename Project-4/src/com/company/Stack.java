package com.company;

public class Stack {
    int[] array = new int[4];
    int index = 0;
    public void push(int item) {
        array[index] = item;
        index++;
    }
    public void pop() {
        array[index] = 0;
        index--;
    }
    public int[] print() {
        return array;
    }
}
