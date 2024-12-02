package com.linkedlist;

public class append_Last_N_Nodes_at_beginning { static Node head;
    static Node tail;

    static class Node{
        int data;
        Node next;

        public Node(int d){
            data  = d;
            next = null;
        }
    }

    public static void insert(int data){

        Node new_Node = new Node(data);

        if(head == null){
            head = new_Node;
            tail = new_Node;
        }
        else{
            tail.next = new_Node;
            tail = new_Node;
        }
    }

    public static void printList(append_Last_N_Nodes_at_beginning list){
        Node temp = head;
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }


    public static void append(int n){

        Node temp = head;
        int length = 0;

        if(head == null || n <= 0){
            System.out.println("List is Empty");
        }
        else{
            while(temp != null){
                length++;
                temp = temp.next;
            }
            if(n >= length){
                return;
            }
            temp = head;
            Node prev = null;
            int count = 0;

            while(count < length - n){
                prev = temp;
                temp = temp.next;
                count++;
            }
            if(prev != null){
                prev.next = null;
            }
            tail.next = head;
            head = temp;
        }
        while(tail.next != null){
            tail = tail.next;
        }
    }


    public static void main(String[] args) {

        append_Last_N_Nodes_at_beginning list = new append_Last_N_Nodes_at_beginning();

        insert(3);
        insert(4);
        insert(5);
        insert(6);
        insert(7);
        insert(0);
        insert(1);
        insert(2);
        printList(list);

        append(9);
        printList(list);
    }
}
