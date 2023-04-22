package com.company;

public class MainImproved {

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        int size = 100000;
        int s = (size/2)*(size+1);
        long t2 = System.nanoTime();
        System.out.println(s);
        System.out.println("The duration is: " + (t2-t1));
    }
}
