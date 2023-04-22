package com.company;

import java.util.Arrays;
import java.util.Random;

public class Challenge {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i=0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));

        int temp = 0;
        for (int i=1; i < arr.length; i++) {
            for(int j=0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
