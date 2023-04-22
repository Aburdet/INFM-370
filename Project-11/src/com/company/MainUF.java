package com.company;

public class MainUF {

    public static void main(String[] args) {
        UF arr = new UF();
        arr.print();
        System.out.println(arr.find(6));
        arr.connected(7,7);
        arr.connected(7,9);
    }
}
