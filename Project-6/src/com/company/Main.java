package com.company;

public class Main {

    public static void main(String[] args) {
    long t1 = System.nanoTime();
    int count = 0;
    int sum = 0;
    while(count <= 100000) {
        sum += count;
        count++;
    }
    long t2 = System.nanoTime();
    System.out.println(sum);
    System.out.println("The duration is: " + (t2-t1));
    }
}
