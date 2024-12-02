package com.linkedlist;

public class find_mid_of_list {

    static class Node{

        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

    public static void insert(find_mid_of_list list, int data){

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
    }


    public static void printlist(find_mid_of_list list){

        Node temp = head;
        if(head == null){
            System.out.println("List is Empty");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    // find middle element and return it
    public static int findMid(find_mid_of_list list){

        Node pointer1 = head;
        Node pointer2 = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            while(pointer2.next != null && pointer2.next.next != null){
                pointer1 = pointer1.next;
                pointer2 = pointer2.next.next;
            }
        }
        return pointer1.data;
    }

    public static void main(String[] args) {

        find_mid_of_list list  = new find_mid_of_list();

        insert(list, 2);
        insert(list, 4);
//        insert(list, 6);
        insert(list, 8);
        insert(list, 10);
        printlist(list);

        System.out.println(findMid(list));
    }


}

