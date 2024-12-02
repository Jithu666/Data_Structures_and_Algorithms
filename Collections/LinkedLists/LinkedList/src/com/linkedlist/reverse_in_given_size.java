package com.linkedlist;

public class reverse_in_given_size {

    static Node head;

    static class Node{

        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // end of class linkedlist


    public static void insert(reverse_in_given_size list, int data){

        Node new_node = new Node(data);
//        Node tail = list.head;
        Node temp = head;
        // check if the list is empty
        if(head == null){
            head = new_node;
            System.out.println(data + " inserted at the beginning of the list");
//            tail = new_node;
        } // else insert at the end of the list
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
            System.out.println(data + " inserted at the end of the list");
        }
    } // end of insert ()


    public static Node reverse(Node head, int size) {

        if (head == null) {
            System.out.println("List is empty");
        }
        int count = 0;
        Node temp = head;
        Node prev = null;
        Node next = null;
        while (temp != null && count < size) {
            count++;
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        if(next != null){
            head.next = reverse(next, size);
        }
        return prev;
    }

    public static void printList(reverse_in_given_size list) {

        if(head == null)
            System.out.println("List is Empty");
        else
        {
            Node temp = head;
            System.out.println("LinkedList");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } // end of while loop
        System.out.println();
    } //  end of printList ()


    public static void main(String[] args) {

        reverse_in_given_size list = new reverse_in_given_size();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        printList(list);

        head = reverse(head, 3);
        printList(list);
    }

}
