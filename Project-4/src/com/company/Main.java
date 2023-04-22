package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(15);
        stack.push(18);
        stack.pop();
        stack.push(10);
        stack.push(19);
        stack.pop();
        stack.push(40);
        stack.push(23);
        for(int i:stack.print()) {
            System.out.print(i+" ");
        }
    }
}
