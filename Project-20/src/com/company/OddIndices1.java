package com.company;

import java.util.Arrays;

public class OddIndices1 {

    public static void main(String[] args) {
        String[] arr = {"T","S","X","R","P","S","O","E","M","H","L","L","L","E","E","A"};
        System.out.println(Arrays.toString(arr));
        for(int i = 1; i < 13; i += 4) {
            while(arr[i].compareToIgnoreCase(arr[i+4]) > 0) {
                String temp = arr[i];
                arr[i] = arr[i+4];
                arr[i+4] = temp;
                i -= 4;
                if(i < 1) {
                    i = 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
