package com.linkedlist;

public class value_Of_K_th_Node_From_End {

    static Node head;

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
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_Node;
        }
    }

    public static int printList(value_Of_K_th_Node_From_End list){

        Node temp = head;
        int count = 0;
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            while(temp != null){
//                System.out.print(temp.data + " ");
                temp = temp.next;
                count++;
            }
        }
        return count;
    }

    public static void value(value_Of_K_th_Node_From_End list, int k){

        int len = printList(list);
        int size = len - k;

        Node temp = head;
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            int count = 0;
            while(count != size){
                temp = temp.next;
                count++;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {

        value_Of_K_th_Node_From_End list = new value_Of_K_th_Node_From_End();

        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        insert(33);
        insert(7);
        insert(8);
        printList(list);

        value(list, 3);
    }

}
