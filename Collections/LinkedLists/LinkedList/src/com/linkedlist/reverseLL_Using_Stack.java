package com.linkedlist;

import java.util.Stack;

public class reverseLL_Using_Stack {
    static reverseLL.Node head;

    public static void reverse(reverseLL_Using_Stack list){
        Stack<Integer> st = new Stack<>();

        reverseLL.Node temp = head;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        } // end of while loop
        temp = head;

        while(temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }
    }


    // insert at beginning

    public static void insert_beg(reverseLL_Using_Stack LL, int data){
//
//        // insert at beginning
//        // creating a default parameter for the class com.linkedlist.Node
        reverseLL.Node new_Node = new reverseLL.Node(data);
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


    // display the list
    public static void display(reverseLL_Using_Stack LL){

        // check if the list is empty
        if(LL.head == null){
            System.out.println("List is empty");
        }
        else{
            reverseLL.Node temp = LL.head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    } // display () ends here


    // main method from here

    public static void main(String[] args) {

        reverseLL_Using_Stack LL = new reverseLL_Using_Stack();

        insert_beg(LL,0);
        insert_beg(LL,2);
        insert_beg(LL,4);
        insert_beg(LL,6);

        display(LL);
        reverse(LL);
        display(LL);
    }
}


// TC = O(2*N)
// SC = 0(N)