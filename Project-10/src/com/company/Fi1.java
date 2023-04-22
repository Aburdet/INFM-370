package com.company;

public class Fi1 {

    //Main calculation/algorithm
    public static int f(int[] p1, int[] p2) {
        int n=0;
        //If pairs have anything that matches, increment and return n
        outer: for(int i:p1) {
            for(int j:p2) {
                if(i==j) {
                    n++;
                    break outer;
                }
            }
        }
        return n;
    }
    //Checks 2 pairs, counts equivalences
    public int f1(int[] p1, int[] p2) {
        int n=2;
        // Compare pairs 1 and 2, if f finds a match, n will no longer be 2
        n=n-f(p1,p2);
        return n;
    }
    //Checks 3 pairs, counts equivalences
    public int f2(int[] p1, int[] p2, int[] p3) {
        int n=3;
        //Compare pairs 1 to 2 and 1 to 3, if f finds a match, n will no longer be 3
        n=n-f(p1,p2);
        n=n-f(p1,p3);
        //If n is more than 1 (only one match found), compare pair 2 to 3
        if(n>1) {
            n=n-f(p2,p3);
        }
        return n;
    }
}
