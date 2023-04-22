package com.company;

import java.util.Arrays;

public class Main {
    private static final String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};

    private static boolean isSorted(String[] array) {
        for (int i=1; i < array.length; i++) {
            if(array[i].compareToIgnoreCase(array[i-1]) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted: " + isSorted(arr));
        for (int i=1; i < arr.length; i++) {
            if(arr[i].compareToIgnoreCase(arr[i-1]) < 0) {
                String temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                i = i - 2;
                if(i < 0) {
                    i = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sorted: " + isSorted(arr));
    }
}
