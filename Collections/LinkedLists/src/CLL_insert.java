public class CLL_insert{
        static Node head;
        static Node tail;
    static class Node{

        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        } // end of Constructor Node
    } // end of class Node


    // Insert into Circular Linked List "Default Insert Operation"
    public static CLL_insert insert(CLL_insert list, int data){

        Node temp = list.head;
        Node new_Node  = new Node(data);

        // check if the list is empty and if list is empty insert at the beginning of the list.
        if(list.head == null){
            list.head = new_Node;
            new_Node.next = list.head;
            tail = new_Node;
            System.out.println(data + " inserted at the beginning of the list"); // element inserted at the given position
            return list; // after inserting the node, return to the calling function
        } // end of if condition
        // if the list is not empty then insert the node at the end of the list.
        else{
            tail.next = new_Node;
            new_Node.next = list.head;
            tail = new_Node;
            System.out.println(data + " inserted at the end of the list"); // element inserted at the given position
        } // end of else condition
        return list; // after inserting the node, return to the calling function.
    } // end of default insert method


    // Insert into Circular Linked List at the beginning of the list
    public static CLL_insert insert_at_beginning(CLL_insert list, int data){
        Node new_Node = new Node(data);

        // check if the list is empty and if list is empty insert at the beginning of the list.
        if(list.head == null){
            list.head = new_Node;
            new_Node.next = list.head;
            tail = new_Node;
            System.out.println(data + " inserted at the beginning of the list"); // element inserted at the given position
            return list; // after inserting the node, return to the calling function
        } // end of if condition
        // if list is not empty and the list contains elements then insert the node at the beginning of the list
        else{
            new_Node.next = list.head;
            list.head = new_Node;
            System.out.println(data + " inserted at the beginning of the list!"); // element inserted at the given position
        } // end of else condition
        return list; // after inserting the node, return to the calling function.
    } // end of insert at beginning method


    // Insert a node at the end of the list

    public static CLL_insert insert_at_end(CLL_insert list, int data){

        Node new_Node = new Node(data);

        // check if the list is empty and if list is empty insert at the beginning of the list.
        if(list.head == null){
            list.head = new_Node;
            new_Node.next = list.head;
            tail = new_Node;
            System.out.println(data + " inserted at the beginning of the list"); // element inserted at the given position
            return list; // after inserting the node, return to the calling function
        } // end of if condition
        // if list is not empty and the list contains elements then insert the node at the beginning of the list
        else {
            tail.next = new_Node;
            new_Node.next = list.head;
            tail = new_Node;
            System.out.println(data + " inserted at the end of the list"); // element inserted at the given position
        }
        return list; // after inserting the node, return to the calling function.
    } //  end of insert at end method


    // Insert a Node at a given position
    public static CLL_insert insert_at_given_posn(CLL_insert list, int data, int posn){
        Node temp = list.head;
        Node prev = null;

        Node new_Node = new Node(data);

        // initialize variable "counter" to "0"
        int counter = 0;

        // check if the list is empty and if list is empty, and the position to insert is at the beginning of the list.
        if(list.head == null && posn == counter){
            list.head = new_Node;
            new_Node.next = list.head;
            tail = new_Node;
            System.out.println(data + " inserted at the given position " + posn + "in the list!"); // element inserted at the given position
            return list; // after inserting the node, return to the calling function
        } // end of if condition
        // if the position to insert is at any other position apart from beginning of the list
        // traverse to the given position and insert the node at the given position
        else {
            while(temp != null && posn != counter){
                counter += 1;
                prev = temp;
                temp = temp.next;
            } // end of while loop,
            // when temp variable is not null and the position == counter and the temp variable is not at the last position in the list
            if(temp != null && posn == counter && temp.next != list.head){
                new_Node.next = prev.next;
                prev.next = new_Node;
                System.out.println(data + " inserted at the given position " + posn + " in the list!"); // element inserted at the given position
            } // end of if condition when the position is met.
            // if the position to insert is at the end of the list
            else if (temp != null && temp.next == list.head && posn == counter) {
                tail.next = new_Node;
                new_Node.next = list.head;
                tail = new_Node;
                System.out.println(data + " inserted at the given position " + posn + " in the list!"); // element inserted at the given position
            } // end of else if condition
            // if the position to insert does not exist in the given list
            else{
                System.out.println("Position not Reachable from the list!");
                return list;
            } // end of inner else condition
        } // end of outer else condition
        return list;
    } // end of insert at given position method


    // print the list
    public static void printList(CLL_insert list){

        Node temp = list.head;

        // check if the list is empty and if list is empty insert at the beginning of the list.
        if(list.head == null){
            System.out.println("List is Empty !");
        } // else traverse and print the elements from the list
        else{
            System.out.print("Linked List-> ");
            while(temp.next != tail.next){
                System.out.print(temp.data + " ");
                temp = temp.next;
            } // end of while loop
            System.out.print(temp.data);
        } // end of else condition
        System.out.println();
    } // end of printlist method



    // return the length of the circular linkedlist

    public static void length(CLL_insert list){
        Node temp = list.head;
        int length = 0;

        // if the list is empty return the length as 0
        if(list.head == null){
            System.out.println("List is Empty");
        } // else return the length of the list
        else{
            while(temp.next != list.head){
                length += 1;
                temp = temp.next;
            } // end of while loop
        } // end of else condition
        length += 1;
        System.out.println("Length is " + length);
    } // end of length function


    // search for an element in the list

    public static void search(CLL_insert list, int data){

        Node temp = list.head;
        
        // check if the list is empty
        if(list.head == null){
            System.out.println("List is Empty, Element not found!");
        } // if the list is not empty, then search for the element passed as argument from the method
        // search if the target element is present at the list
        else if (temp.data == data){
            System.out.println(data + " found at the beginning of the list");
        } // end of else if condition
        // search if the target element is present at the end of the list
        else if(tail.data == data){
            System.out.println(data + " found at the end of the list");
        } // end of else if condition
        else if (temp != tail){
            while(temp.data != data){
                temp = temp.next;
            } // end of while loop
            if(temp.data == data){
                System.out.println(data + " found in the list");
            } // end of inner if condition
            else if (temp.data != data){
                System.out.println(data + " not found in the list");
            } // end of else if condition
        } // end of else if condition
    } // end of search method


    // reverse the given circular linked list

    public static void reverse(CLL_insert list) {
        if (list.head == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node prev = null;
        Node curr = list.head;
        Node next = null;
        Node tail = list.head;  // To keep track of the new tail

        do {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } while (curr != list.head);

        // Complete the circle
        list.head.next = prev;
        list.head = prev;

        // Update the tail
        list.tail = tail;

        list.printList(list);
    }


    // Delete a node from the beginning of the list

    public static void delete(CLL_insert list){

        Node temp = list.head;
        // if the list is empty return,
        if(list.head == null){
            System.out.println("List is empty");
        } // end of if condition
        else {
            list.head = head.next;
            tail.next = head;
            System.out.println(head.data + " deleted from the list");
//            if(head == tail){
//                head = null;
//                tail = null;
//            }
        }
    } // end of delete from beginning()


    // delete a node from the end of the list

    public static void delete_end(CLL_insert list){

        Node temp = head;
        if (temp == null){
            System.out.println("List is Empty!");
        }
        //  only one node exists in the list
        else if(tail == temp){
            System.out.println(temp.data + " deleted from the beginning of the list");
            head = null;
        } else{
            while(temp.next != tail){
                temp = temp.next;
            }
            System.out.println(tail.data + " deleted from the end of the list!");
            temp.next = head;
            tail = temp;
        }
    }


    // Delete a node by key

    public static CLL_insert delete_key(CLL_insert list, int key){

        Node temp = list.head;

        // check if the list is empty and return, to the calling function
        if(temp == null){
            System.out.println("List is Empty!");
        } // end of if condition

        // if the key is found in the beginning of the list
        else if (temp.data == key){
            head = temp.next;
            System.out.println(key + " found and deleted from the beginning of the list!");
        } // end of else if condition

        // if the key to delete is found at the end of the list
        else if (tail.data == key){
            while(temp.next != tail){
                temp = temp.next;
            } // reached one position behind tail
            // now update the next pointer pointing to tail, now next of temp points to head
            temp.next = head;
            System.out.println(tail.data + " deleted from the end of the list");
        } // end of else if condition

        // if the key to delete is found at any other position in the list
        else{
            Node prev = head;
            while(temp.data != key){
                prev = temp;
                temp = temp.next;
            } // reaches one position behind the target element in the list, if the key exists in the list.
            // now update the pointers. if the data exists in the list!
            if(temp.data == key){
                prev.next = temp.next;
                System.out.println(key + " deleted from the list!");
            } // end of if condition

            // if the list does not contain the given key
            if(temp.data != key){
                System.out.println(key + " not found in the list");
            } // end of if condition
        } // end of else condition
        return list;
    } // end of delete by key ()


    // Delete the node at the given position

    public static void delete_posn(CLL_insert list, int posn){
        Node temp = list.head;

        // if the list is empty return to the calling function.
        if(temp == null){
            System.out.println("List is Empty");
        } // end of if condition
        // while the list is not empty,
        else{
            int counter = 0;
            Node prev = null;
            // if the position to delete is at the beginning of the list.
            if(temp != null && posn == counter){
                list.head = temp.next;
                System.out.println(temp.data + " deleted from the given position " + posn);
            } // end of if condition

            // if the position to delete is any other position other than beginning.
            else {
                do{
                    prev = temp;
                    temp = temp.next;
                    counter += 1;
                }
                while(temp != tail && posn != counter); // end of do-while loop.
                // now the temp variable has reached the given position, and prev is one position behind temp(Given node)

                // if the position to delete is any position other than beginning and end of the list
                if (temp.next != head && posn == counter){
                    prev.next = temp.next;
                    System.out.println(temp.data + " deleted from the given position " + posn);
                } // end of if condition

                // if the given position is at the end of the list
                if (temp == tail && posn == counter){
                    prev.next = head;
                    tail = prev;
                    System.out.println(temp.data + " deleted from the given position " + posn);
                } // end of if condition
            } // end of inner else condition
        } // end of outer else condition
    } // end of delete_posn ()


    // main method
    public static void main(String[] args) {
        CLL_insert list = new CLL_insert();

        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 4);
        list = insert(list, 6);
        printList(list);

//        list = insert_at_beginning(list, 0);
//        printList(list);
//        list = insert_at_beginning(list, 1);
//        list = insert_at_beginning(list, 2);
//        list = insert_at_beginning(list, 3);
//        list = insert_at_beginning(list, 4);
//        list = insert_at_beginning(list, 5);
//        list = insert_at_beginning(list, 6);
//        printList(list);
//        System.out.println(tail.data);

//        list = insert_at_end(list, 7);
//        list = insert_at_end(list, 8);
//        printList(list);

//        list = insert_at_given_posn(list, 3, 3);
//        printList(list);
//        list = insert_at_given_posn(list, 5, 5);
//        list = insert_at_given_posn(list, 9, 8);
//        printList(list);

//        length(list);

//        search(list,4);
//        search(list,6);
//        search(list,8);
//        search(list,12);

//        reverse(list);

//        delete(list);
//        delete(list);
//        printList(list);
//        delete(list);
//        printList(list);


//        delete_end(list);
//        delete_end(list);
//        delete_end(list);
//        delete_end(list);
//        printList(list);

//        list = delete_key(list, 1);
//        printList(list);
//        list = delete_key(list, 2);
//        printList(list);
//        list = delete_key(list, 4);
//        printList(list);
//        list = delete_key(list, 6);
//        printList(list);

//        delete_posn(list, 0);
//        printList(list);
//        delete_posn(list, 1);
//        printList(list);
//        delete_posn(list, 2);
//        printList(list);
//        delete_posn(list, 3);
//        printList(list);


    } // end of main method
} // end of class CLL_insert