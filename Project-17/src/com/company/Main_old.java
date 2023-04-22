package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main_old {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i=0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1000);
        }
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        int count = 1;
        for (int i=1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                count--;
                if(count < 0) {
                    count = 0;
                }
                i = count;
                System.out.println(Arrays.toString(arr));
            }
            else {
                count++;
            }
        }
    }
}
