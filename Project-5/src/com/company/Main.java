package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(8);
        queue.enqueue(123);
        queue.enqueue(67);
        queue.enqueue(21);
        for(int i: queue.display()) {
            System.out.print(i+" ");
        }
        System.out.println("\n"+queue.peek());
        queue.dequeue();
        queue.enqueue(44);
        for(int i: queue.display()) {
            System.out.print(i+" ");
        }
    }
}
