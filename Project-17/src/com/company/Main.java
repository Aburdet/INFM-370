package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    static int[] arr = new int[10];
    static int temp = 0;

    private static boolean less(int i, int j) {
        return i < j;
    }

    private static void exch(int i, int j) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        for (int i=0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));

        for (int i=1; i < arr.length; i++) {
            for(int j=0; j < arr.length; j++) {
                if(less(arr[i], arr[j])) {
                    exch(i,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
