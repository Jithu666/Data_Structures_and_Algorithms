package com.linkedlist;

public class palindrome_Or_Not {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static boolean isPalindrome(Node head){

        if(head == null || head.next == null){
            return true;
        }

        Node pointer1 = head;
        Node pointer2 = head;

        while (pointer2 != null && pointer2.next != null){
            pointer1 = pointer1.next;
            pointer2 = pointer2.next.next;
        }

        Node secondHalf = reverse(pointer1);
        Node secondHalfCopy = secondHalf;

        Node firstHalf = head;
        while(secondHalf != null){
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        reverse(secondHalfCopy);
        return true;
    }

    public static Node reverse(Node head){
        Node prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        palindrome_Or_Not list = new palindrome_Or_Not();

        insert(6);
        insert(2);
        insert(3);
        insert(2);
        insert(1);
        printList();

        if (isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is not a palindrome.");
        }
    }

}
