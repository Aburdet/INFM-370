package com.company;

import java.util.Arrays;

public class Equivalence4 {

    public static void main(String[] args) {
        //Input of pairs
        int[] p1={30,50}; int[] p2={30,55}; int[] p3={31,56};

        //Create Fi1 object
        Fi1 f = new Fi1();

        //Assign object and method to variable and pass the pairs to be evaluated
        int n1=f.f1(p1,p2);
        int n2=f.f2(p1, p2, p3);

        //If the number of equivalences is the same for 2 and 3 pairs, it is not valid
        if(n1==n2) {
            System.out.println("The new pair is not acceptable.");
        }

        //If the number of equivalences are not the same,
        // create the new repository containing pairs 1, 2, and 3, then print
        else {
            int[][] rep = {p1,p2,p3};
            System.out.println("The new repository is: "+ Arrays.deepToString(rep));
        }
    }
}
