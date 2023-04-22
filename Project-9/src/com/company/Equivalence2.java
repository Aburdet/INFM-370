package com.company;

public class Equivalence2 {

    public static void main(String[] args) {
        Fi f = new Fi();
        int[] p1={17,50}; int[] p2={30,55}; int[] p3={3,7};
        int n=3;
        n=n-f.f1(p1,p2);
        n=n-f.f1(p1,p3);
        if(n>1) {
            n=n-f.f1(p2,p3);
        }
        System.out.println("Number of equivalence classes: " + n);
    }
}
