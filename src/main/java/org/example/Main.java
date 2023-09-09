package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Queue after Enqueue: ");
        Queue queue = new Queue(34);
        queue.Enqueue(45);
        queue.Enqueue(55);
        queue.Enqueue(75);
        queue.Enqueue(95);
        queue.Enqueue(34);

        queue.printQueue();

        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();

        System.out.println();

        System.out.println("Queue after Dequeue:");
        queue.printQueue();






    }
}