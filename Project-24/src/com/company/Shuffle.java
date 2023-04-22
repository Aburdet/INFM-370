package com.company;

import java.util.Arrays;
import java.util.Random;

public class Shuffle {

    // Declaration of array
    private static final char[] arr = {'S','O','R','T','E','X','A','M','P','L','E'};

    // Shuffles array
    private static void shuffle() {
        Random rand = new Random();

        // Swaps random indexes
        for (int i=0; i < arr.length; i++) {
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

    public static void main(String[] args) {
        shuffle();
        System.out.println(Arrays.toString(arr));
    }
}
