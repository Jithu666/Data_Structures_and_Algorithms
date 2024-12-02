package com.linkedlist;

public class DLL {


    static Node head;
    static Node tail;

    static class Node{

        int data;
        Node prev;
        Node next;

        public Node(int d){
            data = d;
            prev = null;
            next = null;
        }
    }

    // 1. Insert at the beginning of the list
    public static void insert_beg(int data){

        Node new_Node = new Node(data);
        Node temp = head;
        tail = head;
        if(head == null){
            head = new_Node;
            tail = new_Node;
        }
        else{
            tail.prev = new_Node;
            new_Node.next = temp;
            head = new_Node;
        }
        System.out.println(data + " inserted at the beginning of the list!");
    }


    // 2. insert at the end of the list

    public static void insert_end(int data){

        Node new_Node = new Node(data);
        tail = head;
        Node temp = head;
        if(head == null){
            head = new_Node;
            tail = new_Node;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            new_Node.prev = temp;
            new_Node.next = null;
            temp.next = new_Node;
            tail = new_Node;
        }
        System.out.println(data + " inserted at the end of the list");
    }


    // 3. insert at the given position

    public static void insert_pos(int data, int pos){

        Node new_Node = new Node(data);
        Node temp = head;
        Node prev = head;
        int count = 0;

        if(head == null && pos == count){
            head = new_Node;
        }
        else{
            while (temp != null && pos != count){
                prev = temp;
                temp = temp.next;
                count++;
            }
            new_Node.next = prev.next;
            new_Node.prev = prev;
            prev.next = new_Node;
            temp.prev = new_Node;
        }
        System.out.println(data + " inserted at position " + pos);
    }



    // 1. delete at beginning of the list

    public static void delete_beg(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else{
            System.out.println(head.data + " deleted from the beginning of the list");
            head = head.next;
        }
    }


    // 5. delete from the end of the list

    public static void delete_end(){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else{
            System.out.println(tail.data + " deleted from the end of the list");
            tail.prev.next = null;
        }
    }


    // 6. delete from given position

    public static void delete_pos(int pos){

        Node temp = head;
        Node prev = head;

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else{
            int count = 0;
            while(temp != null && pos == count){ // delete node from 1^st position
                head = temp.next;
            }

            // any other position apart from beginning and end
            while(temp != null && pos != count) {

                prev = temp;
                count++;
                temp = temp.next;
            }
            temp.next.prev = prev;
            prev.next = temp.next;

            if (temp.next == null || pos > count){
                System.out.println("Position does not exist in the list");
                return;
            }

            System.out.println(temp.data + " deleted form the given position " + pos);
        }
    }


    // 7. print list

    public static void printlist(){

        Node temp = head;

        if(temp == null){
            System.out.println("List is Empty");
            return;
        }
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        DLL list = new DLL();

        // insert at the beginning of the list
//        insert_beg(0);
//        insert_beg(1);
//        insert_beg(2);
//        printlist();
//        insert_beg(3);
//        insert_beg(4);
//        insert_beg(5);
//        printlist();
//        insert_beg(6);
//        printlist();


        // insert at the end of the list

        insert_end(1);
        insert_end(2);
        insert_end(3);
        insert_end(4);
        insert_end(5);
        insert_end(6);
        printlist();


        // insert at given position
//        insert_pos(2,2);
//        insert_pos(6,6);
//        printlist();



        // delete from beginning of the list
//        delete_beg();
//        printlist();
//        delete_beg();
//        printlist();


        // delete form the end of the list
//        delete_end();
//        printlist();


        // delete at given position
//        delete_pos(1);
//        printlist();
//        delete_pos(1);
//        printlist();
        delete_pos(4);
        printlist();
        delete_pos(2);
        printlist();


    }
}
