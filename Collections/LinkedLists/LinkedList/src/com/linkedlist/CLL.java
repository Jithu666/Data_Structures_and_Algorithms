package com.linkedlist;

public class CLL {

    static class Node{

        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        }
    }

    static Node head;
    static Node tail;

    // 1. insert at beginning of the list
    public static void insert(int data){

        Node new_Node = new Node(data);

        if(head == null){
            head = new_Node;
            tail = new_Node;
            tail.next = head;
        }
        else{
            new_Node.next = head;
            head = new_Node;
            tail.next = new_Node;
        }
        System.out.println(data + " inserted at the beginning of the list");
    }


    // 2. insert at the end of the list

    public static void insert_end(int data){

        Node new_Node = new Node(data);

        // check if the list is empty and if list is empty insert at the beginning of the list.
        if(head == null){
            head = new_Node;
            new_Node.next = head;
            tail = new_Node;
            System.out.println(data + " inserted at the beginning of the list"); // element inserted at the given position
            return ; // after inserting the node, return to the calling function
        } // end of if condition
        // if list is not empty and the list contains elements then insert the node at the beginning of the list
        else {
            tail.next = new_Node;
            new_Node.next = head;
            tail = new_Node;
            System.out.println(data + " inserted at the end of the list"); // element inserted at the end of the list
        }
    }


    // 3. insert at given position

    public static void insert_pos(int data, int pos){

        Node new_Node = new Node(data);
        Node temp = head;
        int count = 0;
        Node prev = head;
        if(head == null && pos == count){
            head = new_Node;
            new_Node.next = head;
            tail = new_Node;
        }
        while(temp != null && pos != count){
            prev = temp;
            temp = temp.next;
            count++;
        }
        new_Node.next = prev.next;
        prev.next = new_Node;

        if(temp == null && pos == count){
            temp = new_Node;
            new_Node = tail;
            tail.next = head;
        }

        System.out.println(data + " inserted at position " + pos);
    }

    // 4. insert into sorted circular linked list

    public static void insert_sort(int data){

        Node new_Node = new Node(data);

        // if the list is empty
        if(head == null){
            head = new_Node;
            new_Node.next = head;
            tail = new_Node;
        }

        // if the list has only one element
        if(head.data > new_Node.data && head.next == head){
            new_Node.next = head;
            head = new_Node;
            tail = new_Node.next;
            tail.next = head;
        }

        // insert a new Node into a sorted list
        Node temp = head;
        Node prev = head;

        while(temp.next != head && new_Node.data > temp.data){
            prev = temp;
            temp = temp.next;
        }
        // check if the position to insert is at the end of the list
        if(temp.next == head){
            new_Node.next = head;
            temp.next = new_Node;
            tail = new_Node;
//           tail.next = head;
        }

        new_Node.next = prev.next;
        prev.next = new_Node;

        System.out.println(data + " inserted in its correct position");
    }


    // 5. insert in middle

    public static void insert_middle(int data){

        Node new_Node = new Node(data);

        if(head == null){
            head = new_Node;
            new_Node.next = head;
            tail = new_Node;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }

        new_Node.next = slow.next;
        slow.next = new_Node;

        System.out.println(data + " inserted in the middle of the list");
    }

    // 6. delete from beginning

    public static void delete_begin() {

        if (head == null) {
            System.out.println("List is Empty");
        }
        else{
            System.out.println(head.data + " deleted from the beginning of the list");
            head = head.next;
            tail.next = head;
        }
    }


    // 7. delete from end of the list

    public static void delete_end() {

        Node temp = head;
        Node prev = head;
        if (head == null) {
            System.out.println("List is Empty");
        }
        else{
            while(temp.next != head){
                prev = temp;
                temp = temp.next;
            }
            prev.next = tail.next;
            tail = prev;
            System.out.println(temp.data + " deleted from the end of the list");
        }
    }


    // 8. delete from given position

    public static void delete_pos(int pos) {

        Node temp = head;
        Node prev = head;
        int count = 0;

        if (head == null) {
            System.out.println("List is Empty");
        }
        else {
            while (temp.next != head && pos != count) {
                prev = temp;
                temp = temp.next;
                count++;
            }
            prev.next = temp.next;

            if(temp.next == head && pos == count){
                prev.next = temp.next;
                tail = prev;
                tail.next = head;
            }
        }
        System.out.println(temp.data + " deleted from the given position " + pos);
    }


    public static int printlist() {

        Node temp = head;
        int count  = 0;
        if(head == null){
            System.out.println("List is Empty !");
        } // else traverse and print the elements from the list
        else{
            System.out.print("Linked List-> ");
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
                count++;
            }
            while(temp.next != tail.next); // end of while loop
//            System.out.println(temp.data);
        } // end of else condition
        return count + 1;
    }


    public static void main(String[] args) {

        CLL list = new CLL();

        // insert at beginning
//        insert(6);
//        insert(5);
//        insert(4);
//        printlist();
//        insert(3);
//        insert(2);
//        insert(1);
//        insert(0);
//        printlist();


        // insert at end
//        insert_end(1);
//        insert_end(2);
//        insert_end(3);
//        insert_end(6);
//        insert_end(7);
//        insert_end(8);
//        printlist();

        // insert at given position
//        insert_pos(6,1);
//        insert_pos(7,2);
//        int length = printlist();

        // insert sort
//        insert_sort(6);
//        insert_sort(4);

        // insert in middle
        insert_middle(4);
        insert_middle(5);

        // delete from beginning
//        delete_begin();
        printlist();
//        delete_begin();
//        printlist();


        // delete end
//        delete_end();
//        delete_end();
//        printlist();


        // delete pos
//        delete_pos(1);
//        delete_pos(1);
//        printlist();


    } // main () ends here
} // class cll ends here
