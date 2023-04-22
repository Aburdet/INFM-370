package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <String> a = new ArrayList<>();
        a.add(0, "23"); a.add(1, "7"); a.add(2, "100"); a.add(3, "79");
        System.out.println(a);
        a.set(1, "just");
        System.out.println(a);
    }
}
