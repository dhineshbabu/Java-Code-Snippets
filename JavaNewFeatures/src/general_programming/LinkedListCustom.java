package general_programming;

import java.util.LinkedList;

public class LinkedListCustom {
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            this.value = d;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListCustom linkedList = new LinkedListCustom();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        second.next = third;


        System.out.println("Current Linked List is: ");
        while(linkedList.head != null) {
            System.out.print(linkedList.head.value + " -> ");
            linkedList.head = linkedList.head.next;
        }
    }
}
