package com.company;

import java.util.Arrays;

public class Main {

    // Declaration of arrays
    private static final char[] arr = {'S','O','R','T','E','X','A','M','P','L','E'};

    private static int totalSwaps;

    // Checks if array is sorted
    private static boolean isSorted(char[] arr) {
        for (int i=1; i < arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }

    // Swap indexes
    private static void exch(int i, int j, char[] arr) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // One sorts array
    private static void sort(int h, char[] arr) {
        // Counts number of swaps
        int swaps = 0;

        // Current number of sorts
        int count = 0;
        
        while(count < h) {
            for(int i = count; i < arr.length; i += h) {
                for(int j=i+h; j < arr.length; j += h) {
                    if(arr[i] > arr[j]) {
                        exch(i,j,arr);
                        swaps++;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            count++;
        }
        System.out.println("Number of swaps for " + h + " sort: " + swaps);
        totalSwaps += swaps;
        System.out.println();
    }

    public static void main(String[] args) {

        // Prints original array
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // Calls sort
        sort(3, arr);
        sort(2, arr);
        sort(1, arr);

        // Prints total number of swaps to fully sort
        if(isSorted(arr)) {
            System.out.println("Total swaps to fully sort: " + totalSwaps);
        }
        else {
            System.out.println("Not fully sorted!\nNumber of total swaps: " + totalSwaps);
        }
    }
}
