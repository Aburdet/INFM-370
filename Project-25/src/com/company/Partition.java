package com.company;

import java.util.ArrayList;

public class Partition {

    public void partition(char[] arr) {
        // Declare arrays
        ArrayList<Character> leftArr = new ArrayList<>();
        ArrayList<Character> rightArr = new ArrayList<>();
        char[] partitionedArr = new char[arr.length];

        // Declare variables
        char pivot = arr[0];
        leftArr.add(pivot);

        int i;
        int j;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > pivot) {
                System.out.println("First left element: " + arr[i]);
                break;
            }
        }
        for (j = arr.length-1; j > i; j--) {
            if (arr[j] <= pivot) {
                System.out.println("First right element: " + arr[j]);
                break;
            }
        }

        while (i < j) {
            while (arr[i] <= pivot) {
                leftArr.add(arr[i]);
                i++;
            }
            while (arr[j] > pivot) {
                rightArr.add(arr[j]);
                j--;
            }

            System.out.println("Swap: " + arr[j] + " and " + arr[i]);
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }



        // Swaps pivot
        char temp = leftArr.get(leftArr.size()-1);
        leftArr.set(leftArr.size()-1, leftArr.get(0));
        leftArr.set(0, temp);


        for(i = 0; i < leftArr.size(); i++) {
            partitionedArr[i] = leftArr.get(i);
        }
        for(j = i; j < rightArr.size(); j++) {
            partitionedArr[i] = rightArr.get(j);
            i++;
        }
        System.out.println("Left: " + leftArr);
        System.out.println("Right: " + rightArr);
    }
}
