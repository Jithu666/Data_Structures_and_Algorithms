package com.linkedlist;

import java.util.Stack;

public class palindromeOrNot {
    static Node head;
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

    public static void printList(palindromeOrNot list){
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

    public static boolean isPalindrome(palindromeOrNot list){

        Node temp = head;

        Stack<Integer> st = new Stack<>();
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while(temp != null){
            if(temp.data != st.pop()){
                return false;
            }
            else{
                temp = temp.next;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        palindromeOrNot list = new palindromeOrNot();

        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(4);
        insert(3);
        insert(8);
        insert(1);
        printList(list);

        System.out.println(isPalindrome(list));
    }
}
