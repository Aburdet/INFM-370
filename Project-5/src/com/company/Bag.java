package com.company;

public class Bag {
    int[] bag = new int[10];
    int index = 0;
    public void add(int item) {
        bag[index] = item;
        index++;
    }
    public void isEmpty() {
        if(index == 0) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public void size() {
        System.out.println(index);
    }
    public void display() {
        for(int i = 0; i < index; i++) {
            System.out.print(bag[i]+" ");
        }
    }
}
