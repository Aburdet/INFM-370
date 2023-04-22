package com.company;

public class MainBag {

    public static void main(String[] args) {
        Bag bag = new Bag();
        bag.isEmpty();
        bag.size();
        bag.add(5);
        bag.add(0);
        bag.add(10);
        bag.add(15);
        bag.add(20);
        bag.isEmpty();
        bag.size();
        bag.display();
    }
}
