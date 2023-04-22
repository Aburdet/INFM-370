package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Declaration of array
        char[] arr = {'S','O','R','T','E','X','A','M','P','L','E'};

        // Shuffles array
        Shuffle shuffle = new Shuffle();
        shuffle.shuffle(arr);
        System.out.println("Shuffled: " + Arrays.toString(arr));

        // Shows pivot
        Pivot pivot = new Pivot();
        pivot.pivot(arr);

        // Partitions array
        Partition partition = new Partition();
        partition.partition(arr);
        System.out.println("Partitioned: " + Arrays.toString(arr));

        // Sorts the array fully
        Sort sort = new Sort();
        sort.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}
