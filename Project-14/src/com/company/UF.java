package com.company;

import java.util.Arrays;

public class UF {

    int[] arr = {0,1,2,3,4,5,6,7,8,9};
    int parent = 0;

    int find(int i) {
        return arr[i];
    }

    boolean connected(int p, int q) {
        return (find(p) == find(q));
    }

    void union(int p, int q) {
        if(arr[p]!=arr[q]) {
            findParent(p,q);
            int temp = 0;
            if(p == parent) {
                temp = arr[q];
            }
            else if(q == parent) {
                temp = arr[p];
            }
            for(int i=0; i < arr.length; i++) {
                if(arr[i]==temp) {
                    arr[i] = arr[parent];
                }
            }
        }
    }

    void print() {
        for(int i=0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void findParent(int p, int q) {
        int parentP = 0;
        int parentQ = 0;
        for(int i=0; i < arr.length; i++) {
            if(arr[i] == arr[p]) {
                parentP++;
            }
            else if(arr[i] == arr[q]) {
                parentQ++;
            }
        }
        if(parentP >= parentQ) {
            parent = p;
        }
        else if(parentQ > parentP) {
            parent = q;
        }
    }

    void connect(int p, int q) {
        if(arr[p] != arr[q]) {
            findParent(p,q);
            System.out.println(Arrays.toString(arr));
            int temp = 0;
            if(p == parent) {
                temp = arr[q];
            }
            else if(q == parent) {
                temp = arr[p];
            }
            for(int i=0; i < arr.length; i++) {
                if(arr[i]==temp) {
                    arr[i] = arr[parent];
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        else {
            System.out.println("These are already connected!");
        }
    }
}
