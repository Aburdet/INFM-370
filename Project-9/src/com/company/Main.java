package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] p1={17,50}; int[] p2={30,55}; int[] p3={3,7};
        ArrayList<Integer> connect = new ArrayList<>();
        int equivalenceCount = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < p1.length; j++) {
                if(!connect.contains(p1[j])) {
                    connect.add(p1[j]);
                }
                else if(!connect.contains(p2[j])) {
                    connect.add(p2[j]);
                }
                else if(!connect.contains(p3[j])) {
                    connect.add(p3[j]);
                }
            }
        }
        equivalenceCount = connect.size() / 2;
        System.out.println("Number of equivalence classes: " + equivalenceCount);
        System.out.println(connect);
    }
}
