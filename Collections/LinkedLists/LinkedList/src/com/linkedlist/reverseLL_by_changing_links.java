package com.linkedlist;//import com.linkedlist.Node;

public class reverseLL_by_changing_links {
    static Node head;
    Node tail;


    public reverseLL_by_changing_links () {
        this.head = null;
        this.tail = null;
    }

    static class Node{
        int data;
        Node next;

        // parameterised constructor
        public Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // class Node ends here

    //  Insert at the beginning of the list
    public static void insert(reverseLL_by_changing_links list, int data){

        // insert at beginning
        // creating a default parameter for the class com.linkedlist.Node
        Node new_Node  = new Node(data);

        // if the list is empty, insert the new node at the beginning of the list
        if(head == null){
            head = new_Node;
            System.out.println(data + " inserted at the beginning of the list");
        } // end of if condition

        // if the list already has existing elements then insert at the beginning of the list
        else{
            new_Node.next = head;
            head = new_Node;
            System.out.println(data + " Inserted at the beginning of the list");
        } // end of else condition
    } // end of insert ()


    // print the LinkedList
    public static void printList(reverseLL_by_changing_links list) {

        if(head == null)
            System.out.println("List is Empty");
        else
        {
            Node temp = head;
            System.out.println("LinkedList");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        } // end of while loop
        System.out.println();
    } //  end of printList ()


    // reverse the linked-list by changing the links between the nodes.

    public static void reverse(reverseLL_by_changing_links  list){

        Node temp = list.head;
        Node curr = null;
        Node prev = null;

        if(temp == null){
//            System.out.println("List is Empty!");
            return;
        }else{
            while(temp != null){
                curr = temp.next;
                temp.next = prev;
                prev = temp;
                temp = curr;
            }
        }
        head = prev;
    }



    // main method
    public static void main(String[] args) {

        reverseLL_by_changing_links list = new reverseLL_by_changing_links();

        insert(list, 1);
        insert(list, 2);
        insert(list, 3);
        insert(list, 4);
        insert(list, 5);
        insert(list, 6);
        System.out.println("Linked-List before reversing the list : ");
        printList(list);

        reverse(list);
        System.out.println("Linked-List after reversing the list : ");
        printList(list);
    } // main () ends here
} // public class ends here
