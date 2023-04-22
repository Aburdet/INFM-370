package com.company;

public class MainUF {

    public static void main(String[] args) {
        UF arr = new UF();
        arr.print();
        arr.quickUnion(2,1);
        arr.print();
        arr.quickUnion(5,0);
        arr.print();
        arr.quickUnion(7,2);
        arr.print();
        arr.quickUnion(6,1);
        arr.print();
    }
}
