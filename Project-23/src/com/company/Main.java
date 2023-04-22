package com.company;

public class Main {

    public static void main(String[] args) {

        // Declaration of arrays
        char[] left = {'E','E','G','M','O','R','R','S'};
        char[] right = {'A','E','E','L','M','P','T','X'};

        // declaration of variables
        int i=0;
        int j=0;

        while (i < left.length && j < left.length) {
            System.out.println(left[i] + " & " + right[j]);
            if (left[i] <= right[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        if (i == left.length) {
            for (j = j; j < right.length; j++) {
                System.out.print(right[j]);
            }
        }
        else {
            for (i = i; i < right.length; i++) {
                System.out.print(left[i]);
            }
        }
    }
}
