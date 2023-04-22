package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Is " + num + " divisible by 5 and 6?");
        if (num % 5 == 0 && num % 6 == 0)
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("Is " + num + " divisible by 5 or 6?");
        if (num % 5 ==0 || num % 6 == 0)
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("Is " + num + " divisible by 5 or 6, but not both?");
        if (num % 5 == 0 && num % 6 != 0)
            System.out.println("True");
        else if (num % 5 != 0 && num % 6 == 0)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
