package org.example;

public class Queue {

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int length;

    public Queue(int value){
        Node newnode = new Node(value);
        first = newnode;
        last = newnode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    //So, there are mainly two operations that we can perform on the Queue.
    //Operations : Enqueue and Dequeue

    //Enqueue operation: It is used to add the node into the Queue from the last

    public void Enqueue(int value){
        Node newnode = new Node(value);
        if(length == 0){
            first = newnode;
            last = newnode;
        }
        else {
            last.next = newnode;
            last = newnode;
            length++;
        }
    }

    //Dequeue operation: It is used to remove the node from the Queue from the first

    public Node Dequeue(){
        Node temp = first;
        if (length == 0){
            return null;
        }
        first = first.next;
        temp.next = null;
        length--;

        return temp;
    }
}
