package com.company;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int[][] arr2 = new int[4][3];
        int k = 0;
        for(int i=0; i<4; i++) {
            for(int j=0; j<3; j++) {
                k++;
                arr2[i][j] = k;
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
    }
}
