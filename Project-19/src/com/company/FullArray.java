package com.company;

import java.util.Arrays;

public class FullArray {

    // Declare arrays
    private static final int[] arr = {200, 35, 11, 4, 7, 88, 20, 10, 9, 6};

    // Checks if array is sorted and returns boolean
    private static boolean isSorted(int[] array) {
        for (int i=1; i < array.length; i++) {
            if(array[i] < array[i-1]) {
                return false;
            }
        }
        return true;
    }

    // Provide array name and indexes to swap
    private static void exch(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        // Print initial array
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted: " + isSorted(arr) + "\n");

        // Sort array
        for(int i=1; i < arr.length; i++) {

            // While any index is smaller than the previous, swap
            while(arr[i] < arr[i-1]) {
                exch(arr, i, i-1);
                i--;
                if(i < 1) {
                    i = 1;
                }
            }
        }

        // Print sorted array
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted: " + isSorted(arr));
    }
}
