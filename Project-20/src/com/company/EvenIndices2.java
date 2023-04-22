package com.company;

import java.util.Arrays;

public class EvenIndices2 {

    public static void main(String[] args) {
        String[] arr = {"T","S","X","R","P","S","O","E","M","H","L","L","L","E","E","A"};
        System.out.println(Arrays.toString(arr));
        for(int i = 2; i < 11; i += 4) {
            while(arr[i].compareToIgnoreCase(arr[i+4]) > 0) {
                String temp = arr[i];
                arr[i] = arr[i+4];
                arr[i+4] = temp;
                i -= 4;
                if(i < 2) {
                    i = 2;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
