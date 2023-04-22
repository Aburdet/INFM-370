package com.company;

public class UF {

    int[] arr = {0,1,2,3,4,5,6,7,8,9};

    int find(int i) {
        return arr[i];
    }

    boolean connected(int p, int q) {

        if (find(p) == find(q)) {
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }

    }

    void print() {
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
