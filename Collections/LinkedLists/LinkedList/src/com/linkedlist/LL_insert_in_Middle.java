package com.linkedlist;

public class LL_insert_in_Middle {

    static class Node{

        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        } // Node ends here
    } // class Node ends here


    static Node head;

    public static void insert(LL_insert_in_Middle ll, int data){

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
    } // end of insert function.

    public static void insert_middle(LL_insert_in_Middle ll, int data){

        Node new_Node = new Node(data);
        if(head == null){
            head = new_Node;
            return;
        }

        int size = findSize(ll);
        int count = size/2;
        Node temp = head;

        for(int i = 0; i < count-1; i++) {
            temp = temp.next;
        }
        new_Node.next = temp.next;
        temp.next = new_Node;
    } // insert_middle function ends here


    // find the size of the linkedlist
    public static int findSize(LL_insert_in_Middle ll){
        int count = 0;

        if(head == null){
            return 0;
        }
        else{
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
        }
        return count;
    }
    public static void printList(LL_insert_in_Middle ll){

        // check if the list is empty
        int count = 0;
        if(head == null){
            System.out.println("List is Emmpty");
        }
        else{
            Node temp = head;
            System.out.println("LinkedList");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LL_insert_in_Middle ll = new LL_insert_in_Middle();

        insert(ll, 0);
        insert(ll, 2);
        insert(ll, 4);
        insert(ll, 8);
        insert(ll, 10);
        insert(ll, 12);
        insert(ll, 14);
        printList(ll);

        insert_middle(ll, 6);
        printList(ll);

    }



} // public class ends here
