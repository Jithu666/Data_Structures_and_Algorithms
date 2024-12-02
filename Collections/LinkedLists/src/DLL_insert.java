public class DLL_insert {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
            next = null;
            prev = null;
        } // end of constructor Node
    } // end of class Node

    // insert a Node at the beginning of the list
    public static DLL_insert insert_at_beginning(DLL_insert list, int data){
        Node new_Node = new Node(data);

        Node temp = list.head;

        // insert at beginning if the list is empty
        if(list.head == null) {
            list.head = new_Node;
            new_Node.next = null;
        }
        // insert at beginning if the list is not empty
        else {
            new_Node.next = list.head;
            temp.prev = new_Node;
            list.head = new_Node;
        }
        System.out.println(data + " inserted at the beginning of the list");
        return list;
    }

    // insert the Node at the end of the list
    public static DLL_insert insert_at_end(DLL_insert list, int data){

        Node new_Node = new Node(data);
        Node temp = list.head;

        // insert at the beginning of the list , if the list is empty
        if(list.head == null){
            list.head = new_Node;
            System.out.println(data + " inserted at the beginning of the list as the list was empty");
        }
        // if the list is not empty, insert at the end of the list
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            new_Node.prev = temp;
            temp.next = new_Node;
            new_Node.next = null;
            System.out.println(data + " inserted at the end of the list ");
        }
        return list;
    }

    // insert a Node at the given position of the list
    public static DLL_insert insert_at_given_posn(DLL_insert list, int data, int pos){
        Node new_Node = new Node(data);

        Node temp = list.head;
        Node prev = temp;

        int counter = 0;

        // if the list is empty insert at beginning
        if(list.head == null && pos == counter){
            list.head = new_Node;
            new_Node.prev = list.head;
            new_Node.next = null;
            System.out.println(data + " inserted at the beginning of the list ");
            return list;
        }

        // insert at the given position
        else{
            while (temp != null && pos != counter) {
                counter = counter + 1;
                prev = temp;
                temp = temp.next;
            } //  if the position exists
            new_Node.next = prev.next;
            new_Node.prev = temp.prev;
            temp.prev = new_Node;
            prev.next = new_Node;
            System.out.println(data + " inserted at the given position!");

            // if the position does not exist in the list
            if(temp  == null && pos != counter) {
                System.out.println("Position does not exists in the list, Invalid position Entered");
//                return list;
            }

            // if the position to insert is at the end of the list
            if(temp.next == null && pos == counter){
                temp.next = new_Node;
                new_Node.prev = temp;
                new_Node.next = null;
                System.out.println(data + " inserted at the end of the list ");
                return list;
            }
        }
        return list;
    }

    // return the length of the given list
    public static void length(DLL_insert list){
        Node temp = list.head;

        int length = 0;
        // if the list is empty
        if(list.head == null){
            System.out.println("List is empty");
        }
        // if the list is not empty
        else{
            while(temp != null){
                length = length + 1;
                temp = temp.next;
            }
        }
        System.out.println("length of the list is " + length);
    }

    // print the list
    public static void printList(DLL_insert list){

        Node temp = list.head;

        if(list.head == null){
            System.out.println("List is Empty");
        }else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }


    // search for the element in the doubly linkedlist

    public static int search(DLL_insert list, int key){
       int position = 0;

       Node temp = list.head;

       // check if the list is empty, & if the list is empty return -1 & print list is empty
        if(list.head == null){
            System.out.println(key + " Not found, list is empty");
            return position;
        } // list is not empty

        // element is found at the beginning of the list
        if(temp.data == key){
//            position += 1;
            System.out.println((key + " found at index " + position));
            return position;
        }

        // if element exists at any other position other than beginning
        while(temp != null && temp.data != key){
            position += 1;
            temp = temp.next;
        }
        // check if the data at current node is equal to key
        if(temp != null && temp.data == key){
            position += 1;
            System.out.println((key + " found at index " + position));
            return position;
        }

        // if the data at current node is not equal to key value
        if(temp != null && temp.data != key){
            System.out.println(key + " value not found in the list");
        }

        // you did not find the element even after traversing till the end of the list
        if(temp == null && temp.data != key){
            System.out.println(key + " value not found in the list");
        }
        return position;
    }

    public static void main(String[] args) {

        DLL_insert list = new DLL_insert();

//        list = insert_at_beginning(list, 30);
//        list = insert_at_beginning(list, 24);
//        list = insert_at_beginning(list, 18);
//        list = insert_at_beginning(list, 12);
        list = insert_at_beginning(list, 6);
        list = insert_at_beginning(list, 0);

//        printList(list);

//        list = insert_at_end(list, 0);
//        list = insert_at_end(list, 2);
//        list = insert_at_end(list, 4);
//        list = insert_at_end(list, 6);
        list = insert_at_end(list, 7);
        list = insert_at_end(list, 8);
        list.insert_at_end(list,9);

        printList(list);

//        list = insert_at_given_posn(list, 1, 0);
//        printList(list);
//        list = insert_at_given_posn(list, 2, 2);
//        list = insert_at_given_posn(list, 3, 3);
//        list = insert_at_given_posn(list, 4, 4);
//        list = insert_at_given_posn(list, 5, 5);
//        printList(list);
        System.out.println();
//        search(list, 6);

//        length(list);
    }
}
