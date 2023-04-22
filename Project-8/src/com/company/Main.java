package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        int index = 0;
        int a; int b;

        System.out.println("Enter the first element: ");
        arr[index] = scan.nextInt();
        index++;
        System.out.println("Enter the second element: ");
        arr[index] = scan.nextInt();
        index++;
        System.out.println("Enter the third element: ");
        arr[index] = scan.nextInt();

        int[] original = arr.clone();

        System.out.println("Enter the first index: ");
        a = scan.nextInt();
        System.out.println("Enter the second index: ");
        b = scan.nextInt();

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(arr));
    }
}
