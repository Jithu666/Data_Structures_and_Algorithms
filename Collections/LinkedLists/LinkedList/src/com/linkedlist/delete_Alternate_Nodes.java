package com.linkedlist;

public class delete_Alternate_Nodes {

    static Node head;
    static class Node{

        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // class Node ends here

    public static void insert(delete_Alternate_Nodes list, int data){

        Node new_Node = new Node(data);
//        Node tail = list.head;
        Node temp = head;
        // check if the list is empty
        if(head == null){
            head = new_Node;
            System.out.println(data + " inserted at the beginning of the list");
//            tail = new_node;
        } // else insert at the end of the list
        else {
            // by using a tail pointer we take only constant time to insert at the end of the list
//            tail.next = new_node;
//            System.out.println(data + " inserted at the end of the list");

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_Node;
            System.out.println(data + " inserted at the end of the list");
        }
    } // end of insert ()


    // delete alternative nodes
    public static void delete(delete_Alternate_Nodes list){

        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            Node prev = head;
            Node temp = head;
            while (temp.next != null){
                prev = temp;
                temp = temp.next;
                prev.next = temp.next;
//                temp = prev;
            }
        }
    }


    // print the list
    public static void printList(delete_Alternate_Nodes list) {

        if(list.head == null)
            System.out.println("List is Empty");
        else
        {
            Node temp = list.head;
            System.out.println("LinkedList");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } // end of while loop
        System.out.println();
    } //  end of printList ()

    public static void main(String[] args) {

        delete_Alternate_Nodes list = new delete_Alternate_Nodes();

        insert(list, 2);
        insert(list, 4);
        insert(list, 6);
        insert(list, 8);
        insert(list, 10);
        insert(list, 12);
        insert(list, 14);
        insert(list, 16);
        insert(list, 18);

        printList(list);

        delete(list);
        printList(list);
    }
}
