package com.company;

public class Sort {

    // Provide array name and indexes to swap
    private static void exch(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void sort(char[] arr) {
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
    }
}
