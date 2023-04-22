/*
Adam Burdett
Dr. Milad
INFM 370
2 December 2021
*/
package com.company;

import java.util.Arrays;
import java.util.Random;

public class Challenge {

    // Swaps 2 indexes in the array provided
    private static void exch(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Shuffles array
    private static void shuffle(char[] arr) {
        Random rand = new Random();

        // Swaps random indexes
        for (int i = 0; i < arr.length; i++) {
            int choice1 = rand.nextInt(arr.length);
            int choice2 = rand.nextInt(arr.length);
            if (choice1 != choice2) {
                char temp = arr[choice1];
                arr[choice1] = arr[choice2];
                arr[choice2] = temp;
            }
            else {
                i--;
                if (i < 0) {
                    i = 0;
                }
            }
        }
    }

    // Partitions array into Left and Right arrays
    private static void partition(char[] arr) {

        // Get pivot value
        char pivot = arr[0];
        System.out.println("Pivot: " + pivot);

        int leftSize = 0;
        int rightSize = 0;
        int i; int j; int k;

        // Gets the size needed to initialize Left and Right arrays
        for (i = 0; i < arr.length; i++) {
            if (arr[i] <= pivot) {
                leftSize++;
            }
            else if (arr[i] > pivot) {
                rightSize++;
            }
        }

        // Declares Left and Right arrays using the sizes above
        char[] leftArr = new char[leftSize];
        char[] rightArr = new char[rightSize];

        i = 0;
        j = arr.length - 1;
        k = 0;

        // Adds elements from shuffled array to Left and Right arrays
        while (i < j) {
            while (arr[i] <= pivot) {
                leftArr[i] = arr[i];
                i++;
                if (i > arr.length-1) {
                    break;
                }
            }
            while (arr[j] > pivot) {
                rightArr[k] = arr[j];
                k++;
                j--;
            }

            if (i < j) {
                System.out.println("Swap: " + arr[j] + " and " + arr[i]);
                exch(arr, i, j);
            }
        }

        // Swaps pivot and last element in Left array
        exch(leftArr, i - 1, 0);

        // Declares the Partitioned array
        char[] partitionedArr = new char[arr.length];

        // Combines Left and Right arrays into the Partitioned array
        for (i = 0; i < leftArr.length; i++) {
            partitionedArr[i] = leftArr[i];
        }
        for (j = 0; j < rightArr.length; j++) {
            partitionedArr[i] = rightArr[j];
            i++;
        }

        // Prints Left, Right, and Partitioned arrays
        System.out.println("Left: " + Arrays.toString(leftArr));
        System.out.println("Right: " + Arrays.toString(rightArr));
        System.out.println("Partitioned: " + Arrays.toString(partitionedArr));

        // Sorts the Partitioned array fully
        sort(partitionedArr);
        System.out.println("Sorted: " + Arrays.toString(partitionedArr));
    }

    // Sorts array
    private static void sort(char[] arr) {
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

    public static void main(String[] args) {

        // Declaration of original array
        char[] arr = {'S','O','R','T','E','X','A','M','P','L','E'};

        // Shuffles original array
        shuffle(arr);
        System.out.println("Shuffled: " + Arrays.toString(arr));

        // Partitions and sorts shuffled array
        partition(arr);
    }
}
