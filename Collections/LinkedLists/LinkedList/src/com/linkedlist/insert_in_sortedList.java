package com.linkedlist;

public class insert_in_sortedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    public static void insert(insert_in_sortedList list, int data){
        Node new_node = new Node(data);
        Node temp = head;

        if(head == null){
            head = new_node;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public static void insert_sort(int data){
        Node new_Node = new Node(data);
        Node temp = head;

        if(head == null || head.data >= new_Node.data){
            new_Node.next = head;
            head = new_Node;
        }
        else{
            while(temp.next != null && temp.next.data < new_Node.data){
                temp = temp.next;
            }
            new_Node.next = temp.next;
            temp.next = new_Node;
        }
    }

    public static void display(insert_in_sortedList ll){

        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else{
            System.out.println("LinkedList");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        insert_in_sortedList list = new insert_in_sortedList();

        insert(list, 0);
        insert(list, 2);
        insert(list, 4);
        insert(list, 8);
        System.out.println("Before insertion sort");
        display(list);

        System.out.println("After insertion sort");
        insert_sort(6);
        display(list);

    }
}
