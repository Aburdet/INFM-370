package com.company;

import java.util.Random;

public class Shuffle {

    // Shuffles array
    public void shuffle(char[] arr) {
        Random rand = new Random();

        // Swaps random indexes
        for (int i = 0; i < arr.length; i++) {
            int choice1 = rand.nextInt(arr.length);
            int choice2 = rand.nextInt(arr.length);
            if (choice1 != choice2) {
                char temp = arr[choice1];
                arr[choice1] = arr[choice2];
                arr[choice2] = temp;
            } else {
                i--;
                if (i < 0) {
                    i = 0;
                }
            }
        }
    }
}
