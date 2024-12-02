package com.linkedlist;

public class search {

    static Node head;

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
        }
        else{
            Node temp = head;
            while(temp != null){
                temp = temp.next;
            }
            temp = new_Node;
        }
    }

    public static void search(search s, int data){

        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        else{
            Node temp = head;
            while(temp != null){
                if(temp.data == data){
                    System.out.println(data + " found in the list");
                }
                else{
                    System.out.println(data + " not found in the list");
                }
                return;
            }
        }
    }


    public static void main(String[] args) {
        search s = new search();

        insert(0);
        insert(2);
        insert(4);
        insert(6);
        insert(8);

        search(s, 0);
    }
}
