package com.company;

public class MainUF {

    public static void main(String[] args) {
        UF arr = new UF();
        arr.print();
        arr.union(4,3);
        arr.print();
        arr.union(3,8);
        arr.print();
        arr.union(6,5);
        arr.print();
        arr.union(9,4);
        arr.print();
        arr.union(2,1);
        arr.print();
        arr.union(8,9);
        arr.print();
        arr.union(5,0);
        arr.print();
        arr.union(7,2);
        arr.print();
        arr.union(6,1);
        arr.print();
        arr.union(1,0);
        arr.print();
        arr.union(6,7);
        arr.print();
    }
}
