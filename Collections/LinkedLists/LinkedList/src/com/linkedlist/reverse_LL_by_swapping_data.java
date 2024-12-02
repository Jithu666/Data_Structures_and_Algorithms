package com.linkedlist;//import com.linkedlist.reverseLL;

public class reverse_LL_by_swapping_data {
    static Node head;

    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // end of class Node


    // insert at beginning

    public static void insert_beg(reverse_LL_by_swapping_data ll, int data){

//        // insert at beginning
//        // creating a default parameter for the class com.linkedlist.Node
        Node new_Node = new Node(data);

//        // if the list is empty, insert the new node at the beginning of the list
        if(ll.head == null){
            ll.head = new_Node;
            System.out.println(data + " inserted at the beginning of the list");
        } // end of if condition

//        // if the list already has existing elements then insert at the beginning of the list
        else{
            new_Node.next = ll.head;
            ll.head = new_Node;
            System.out.println(data + " Inserted at the beginning of the list");
        } // end of else condition
    } // end of insert ()


    // display the list
    public static void display(reverse_LL_by_swapping_data LL){

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


    public static void reverse(reverse_LL_by_swapping_data ll){
        Node temp = head;

        Node prev = null;
        Node curr = null;

        while(temp != null){

            curr = temp;
            temp = temp.next;

            curr.next = prev;
            prev = curr;
            head = curr;
        }
    } // reverse_LL_by_changing_links() ends here


    // main method
    public static void main(String[] args) {
        reverse_LL_by_swapping_data ll = new reverse_LL_by_swapping_data();

        // insert function call
        insert_beg(ll, 0);
        insert_beg(ll, 2);
        insert_beg(ll, 4);
        insert_beg(ll, 6);
        insert_beg(ll, 8);
        System.out.println("Linked-List before reversal");
        display(ll);

        reverse(ll);
        System.out.println("Linked-List after reversal");
        display(ll);


    }
}
