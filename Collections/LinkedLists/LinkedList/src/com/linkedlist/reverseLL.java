package com.linkedlist;

//
public class reverseLL {
    static Node head = null;
//    Node tail = null;
//
    static class Node{
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }
//
//    // size of the list
//    public static void size(reverseLL LL){
//
//        // check if the list is empty
//        if(LL.head == null){
//            System.out.println("List is empty");
//        }
//
//        int size = 0;
//        Node temp = LL.head;
//        while(temp != null){
//            size++;
//            temp = temp.next;
//        }
//        System.out.println(size);
//    }
//
//    // display the list
    public static void display(reverseLL LL){

        // check if the list is empty
        if(LL.head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = LL.head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    } // display () ends here
//
//    // insert at beginning
//
    public static void insert_beg(reverseLL LL, int data){
//
//        // insert at beginning
//        // creating a default parameter for the class com.linkedlist.Node
        Node new_Node = new Node(data);
//
//        // if the list is empty, insert the new node at the beginning of the list
        if(LL.head == null){
            LL.head = new_Node;
            System.out.println(data + " inserted at the beginning of the list");
        } // end of if condition
//
//        // if the list already has existing elements then insert at the beginning of the list
        else{
            new_Node.next = LL.head;
            LL.head = new_Node;
            System.out.println(data + " Inserted at the beginning of the list");
        } // end of else condition
    } // end of insert ()


    // function to reverse the linkedlist.
    public static void reverse(reverseLL LL){
        Node pointer = head;
        Node prev = null;
        Node curr = null;

        while(pointer != null){
            curr = pointer;
            pointer = pointer.next;

            // reverse the link
            curr.next = prev;
            prev = curr;
            head = curr;
        }
    } // end of reverse ()


    public static void main(String[] args) {
        reverseLL LL = new reverseLL();

//        size(LL);
        insert_beg(LL, 0);
        insert_beg(LL, 2);
        insert_beg(LL, 4);
        insert_beg(LL, 6);
        display(LL);

        reverse(LL);
        display(LL);
    }
//}


    // using stack ds



}
