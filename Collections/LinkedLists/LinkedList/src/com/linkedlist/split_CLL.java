package com.linkedlist;

public class split_CLL {

    static Node head;
    static Node tail;
    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void insert(int data){

        Node new_Node = new Node(data);

        if(head == null){
            head = new_Node;
            tail = new_Node;
            tail.next = head;
        }
        new_Node.next = head;
        tail.next = new_Node;
        tail = new_Node;

        System.out.println(data + " inserted into the list");
    }


    // split the linkedlist into two halves

    public static void split() {
        if (head == null || head.next == head) {
            System.out.println("List is too small to split");
            return;
        }

        Node slow = head;
        Node fast = head;

        // Find the midpoint using slow and fast pointers
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // For even number of nodes, adjust fast
        if (fast.next.next == head) {
            fast = fast.next;
        }

        // Set the heads of the two halves
        Node head1 = head;
        Node head2 = slow.next;

        // Split the list into two halves
        slow.next = head1;
        fast.next = head2;

        // Display the two halves
        System.out.println("First half of the list:");
        display(head1);

        System.out.println("Second half of the list:");
        display(head2);
    }

    public static void display(Node start) {
        Node temp = start;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != start);
        System.out.println();
    }


    public static void main(String[] args) {

        split_CLL list = new split_CLL();

        insert(6);
        insert(7);
        insert(8);
        insert(9);
        insert(10);
        insert(11);

        split();
    }
}