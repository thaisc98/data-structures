package datastructures.queue;

import datastructures.queue.Queue;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue(2);
        queue.enqueue(1);
        queue.getFirst();
        queue.getLast();
        queue.getLength();
       // queue.printQueue();
        // return 2 node
        System.out.println(queue.dequeue().value);
        // return 1 node
        System.out.println(queue.dequeue().value);
        // return null
        System.out.println(queue.dequeue());

    }
}
