package com.linkedlist;

class Node{

    int data;
    Node next;

    public Node(int d){
        data = d;
        next = null;
    } // end of constructor
} // end of class linked-list

public class SLL {
    Node head;

    // Insert into linked-list
   // 1) Insert at the beginning of the list
    public static void insert(SLL list, int data){

        // insert at beginning
        // creating a default parameter for the class com.linkedlist.Node
        Node new_Node  = new Node(data);

        // if the list is empty, insert the new node at the beginning of the list
        if(list.head == null){
            list.head = new_Node;
            System.out.println(data + " inserted at the beginning of the list");
        } // end of if condition

        // if the list already has existing elements then insert at the beginning of the list
        else{
            new_Node.next = list.head;
            list.head = new_Node;
            System.out.println(data + " Inserted at the beginning of the list");
        } // end of else condition
    } // end of insert ()


    // 2) insert at end

    public static void insert_end(SLL list, int data){

        Node new_node = new Node(data);
//        Node tail = list.head;
        Node temp = list.head;
        // check if the list is empty
        if(list.head == null){
            list.head = new_node;
            System.out.println(data + " inserted at the beginning of the list");
//            tail = new_node;
        } // else insert at the end of the list
        else{

            // by using a tail pointer we take only constant time to insert at the end of the list
//            tail.next = new_node;
//            System.out.println(data + " inserted at the end of the list");

            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
            System.out.println(data + " inserted at the end of the list");
        }
    } // end of insert_end ()



    // 3) Insert at n^th position
    public static void insert_pos(SLL list, int data, int pos){

        Node new_Node = new Node(data);
        Node temp = list.head;

        // check if the list is empty
        int counter = 0;
        if(list.head == null && pos == counter){
            list.head = new_Node;
            System.out.println(data + " inserted at the given position " + pos);
            counter += 1;
//            temp = temp.next;
            return;
        } // end of insert at given pos i.e (beginning)

        else{
            Node prev = list.head;
            // while the position exists in the list
            while(temp.next != null && counter < pos){
                counter += 1;
                prev = temp;
                temp = temp.next;
            } // end of while loop
            if(pos == counter){
                new_Node.next = prev.next;
                prev.next = new_Node;
                System.out.println(data + " inserted at the given position " + pos);
            } // end of insert at given pos,, end of if condition

            if(temp.next == null && pos != counter){
                System.out.println("Position does not exists in the list");
            }
        } // else condition ends here
    } // end of insert_pos ()



    // Delete a Node from LinkedList

    // 1) Delete the node from the linkedlist
    public static void delete(SLL list){

        // check if the list is empty
        if(list.head == null){
            System.out.println("List is Empty!");
            return;
        }
        // else delete the first node from the list
        else{
            System.out.println(list.head.data + " deleted from the beginning of the list");
            list.head = list.head.next;
        }
    }


    // 2) Delete the node from the end of the list

    public static void delete_end(SLL list){

        // check if the list is empty
        if(list.head == null){
            System.out.println("List is Empty!");
            return;
        }
        // else traverse to the end of the list and delete the last node from the list
        else{
            Node temp = list.head;
            while(temp.next.next != null){
                 temp = temp.next;
            }
            temp.next = null;
             System.out.println(temp.data + " deleted from the end of the list");
        }
    }


    // 3) delete a node from a given position
    public static void delete_pos(SLL list, int pos){

        Node temp = list.head;
        Node prev = list.head;// check if the list is empty
        if(list.head == null){
            System.out.println("List is Empty!");
            return;
        } // else traverse till the given position if the given position exists in the list and delete the node
        else {
            int counter = 0;
            // if the position to delete is at the beginning of the list
            if(temp != null && pos == counter){
                list.head = temp.next;
            }
            while(temp != null && pos != counter){
                prev = temp;
                counter += 1;
                temp = temp.next;
            } // prev node is one position behind the given position & temp node is at the given position
            if(temp != null && pos == counter){
                prev.next = temp.next;
                System.out.println(temp.data + " deleted from the given position " + pos);
            } // end of if condition
            else if (temp == null && pos != counter) {
                System.out.println("Position does not exist in the list");
            } // end of else if condition
        } // end of outer else condition
    } // end of delete_pos ()



    // 4) delete by value

    public static void delete_key(SLL list, int key){

        Node temp = list.head;
        Node prev = list.head;
        // check if the list is empty
        if(list.head == null){
            System.out.println("List is empty");
        } // end of if condition
        // else traverse the list and search for the given element
        else{
            // if the value to delete is in the beginning of the list
            if(temp != null && temp.data == key){
                list.head = temp.next;
                System.out.println(key + " deleted from the list");
            }

            while(temp != null && temp.data != key){
                    prev = temp;
                    temp = temp.next;
                if(temp != null && temp.data == key){
                    prev.next = temp.next;
                    System.out.println(key + " deleted from the list");
                } // if value exists in the list, then it has been deleted
                if(temp != null && temp.data != key){
                    System.out.println(key + " not found in the list");
                } // end of if condition
                if(temp == null){
                    System.out.println(key + " not found in the list");
                } // end of if condition
            } // end of while loop
        } // end of else condition
    } // end of delete_key ()






    public static void printList(SLL list) {

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
        SLL list = new SLL();

        // insert at beginning
//        insert(list,0);
//        printList(list);
//        insert(list,5);
//        insert(list,4);
//        printList(list);
//        printList(list);

        // insert at the end
//        insert_end(list, 2);
//        printList(list);
//        insert_end(list, 4);
//        printList(list);
//        insert_end(list, 6);
//        insert_end(list, 8);
//        insert_end(list, 10);
//        insert_end(list, 14);
//        printList(list);


        // insert at given pos
//        insert_pos(list, 0, 0);
//        printList(list);
//        insert_pos(list, 1, 1);
//        insert_pos(list, 3, 3);
//        insert_pos(list, 5, 5);
//        insert_pos(list, 7, 7);
//        insert_pos(list, 9, 9);
//        printList(list);


        // delete at beginning
//        delete(list);
//        delete(list);
//        delete(list);
//        delete(list);
//        printList(list);


        // delete at end of the list
//        delete_end(list);
//        delete_end(list);
//        delete_end(list);
//        delete_end(list);
//        delete_end(list);
//        printList(list);


        // delete from the given position
//        printList(list);
//        delete_pos(list, 0);
//        printList(list);
//        delete_pos(list, 1);
//        printList(list);
//        delete_pos(list, 2);
//        printList(list);
//        delete_pos(list, 3);
//        printList(list);
//        delete_pos(list, 4);
//        printList(list);


        // delete by key
//        delete_key(list, 0);
//        delete_key(list, 2);
//        printList(list);
//        delete_key(list, 4);
//        delete_key(list, 6);
//        printList(list);
//        delete_key(list, 10);
//        printList(list);
    } // end of main ()
} // end of class linkedlist
