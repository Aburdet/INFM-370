package com.company;

import java.util.Arrays;

public class SortExample {

    // Declaration of arrays
    private static final char[] arr = {'S','O','R','T','E','X','A','M','P','L','E'};

    // Swap indexes
    private static void exch(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        // Prints original array
        System.out.println(Arrays.toString(arr));

        // Current number of sorts
        int count = 0;

        // How many sorts and jumps between indexes you want
        int h = 3;

        while(count < h) {
            for(int i = count; i < arr.length; i += h) {
                for(int j=i+h; j < arr.length; j += h) {
                    if(arr[i] > arr[j]) {
                        exch(i,j,arr);
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            count++;
        }
    }
}
