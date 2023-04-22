package com.company;

public class MainUF {

    public static void main(String[] args) {
        UF arr = new UF();
        arr.print();
        arr.connect(4,3);
        arr.connect(3,8);
        arr.connect(6,5);
        arr.connect(9,4);
        arr.print();
    }
}
