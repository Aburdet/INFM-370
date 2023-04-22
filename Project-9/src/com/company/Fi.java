package com.company;

public class Fi {
    public int f1(int[] p1, int[] p2) {
        int n = 0;
        outer:for(int i:p1) {
            for(int j:p2) {
                if(i==j) {
                    n++;
                    break outer;
                }
            }
        }
        return n;
    }
}
