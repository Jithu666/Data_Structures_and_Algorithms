public class DLL_delete {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int d){
            data = d;
            next = null;
            prev = null;
        } // end of constructor
    } // end of class Node


    // Insert into DLL
    public static DLL_delete insert(DLL_delete list, int data){
        Node new_Node = new Node(data);
        Node temp = list.head;
//        Node prev = temp;

        // if the list is empty insert at beginning
        if(list.head == null){
            list.head = new_Node;
            new_Node.next = null;
            System.out.println(data + " inserted at the beginning of the list");
        }
        else{
            while(temp.next != null){
//                prev = temp;
                temp = temp.next;
            }
            new_Node.prev = temp;
            temp.next = new_Node;
            new_Node.next = null;
            System.out.println(data + " inserted at the end of the list");
        }
        return list;
    }

    // DELETE ELEMENT BY KEY

    public static DLL_delete delete(DLL_delete list, int data){

        Node temp = list.head;
        Node prev = temp;
        Node next = null;

        // if the list is empty
        if(list.head == null){
            System.out.println("List is Empty");
            return list;
        }

        // if the element to delete is at the beginning of the list
        if(list.head != null && temp.data == data){
            temp = temp.next;
            list.head = temp;
            temp.prev = list.head;
            System.out.println(data + " deleted from the beginning of the list!");
//            return list;
        }

        // if the element to delete is at any other position other than beginning
        while(temp != null && temp.data != data){
            prev = temp;
            temp = temp.next;
            next = temp;
        }if(temp != null){
            prev.next = temp.next;
            next.prev = prev;
            System.out.println(data + " deleted from the list");
        }
        return list;
    } // end of delete function


    // delete a node from the beginning of the list

    public static DLL_delete delete_from_beginning(DLL_delete list) {

        Node temp = list.head;

        // if the list is empty, return the list
        if(list.head == null) {
            System.out.println("List is Empty!");
            return list;
        }
        // else delete the element from the beginning of the list
        else {
            list.head = temp.next;
            Node next = temp.next;
            next.prev = list.head;
            System.out.println(temp.data + " deleted from the beginning of the list! ");
            return list;
        }
    }


    // delete the element from the end of the list

    public static DLL_delete delete_at_end (DLL_delete list){

        Node temp = list.head;
        Node prev = null;
        // if the list is empty return to the calling function!
        if(list.head == null){
            System.out.println("List is Empty!");
            return list;
        }
        // else delete the element from the end of the list
        else{
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            } // check if it is the only element remaining in the list
            if(temp == null){
                prev = null;
            } // else delete the last element from the list
            else{
                prev.next = null;
                System.out.println(temp.data + " Element deleted from the end of the list");
            }
        }
        return list;
    }


    // delete the element from the given position from the list

    public static DLL_delete delete_from_given_posn (DLL_delete list, int posn){

        Node temp = list.head;
        Node prev = null;
        Node next = null;
        int counter = 0;
        // if the position to delete is at the beginning of the list

        // if the list is empty return to the calling function
        if(list.head == null){
            System.out.println("List is Empty!");
            return list;
        } // else delete the element if the position is at the beginning og the list
        else if (list.head != null && posn == counter){
            next = temp.next;
            next.prev = list.head;
            list.head = next;
            System.out.println(temp.data + " deleted from the given position " + posn);
            return list;
        }

        // if the position is not at the beginning
        // traverse till the temp reaches the position if it exists and the prev Node is one position behind temp.
        while(temp.next != null && posn != counter){
            prev = temp;
            counter += 1;
            temp = temp.next;
            next = temp.next;
        }
        // if temp is not null and the position is equal to the counter
        if(temp.next != null && posn == counter){
            next.prev = temp.prev;
            prev.next = next;
            System.out.println(temp.data + " deleted from the position " + posn);
            return list;
        }

        // if the position does not exist in the list
        if (temp.next == null && posn != counter) {
            System.out.println("Position not reachable, from the current list!");
        }
        return list;
    }


    // print the linkedList

    public static void printList(DLL_delete list){

        Node temp = list.head;

        // if the list is empty
        if(list.head == null){
            System.out.println("List is Empty");
        } // else print the list
        else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    } // end of printList ()

    public static void main(String[] args) {
        DLL_delete list = new DLL_delete();


//        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);

        printList(list);

//        list = delete(list, 1);
//        list = delete(list, 2);
//        list = delete(list, 3);
//        list = delete(list, 6);

        list = delete_from_beginning(list);
        list = delete_from_beginning(list);
        list = delete_at_end(list);
        list = delete_at_end(list);
//        list = delete_from_given_posn(list, 6);
        list = delete_from_given_posn(list, 0);
//        list = delete_from_beginning(list);
//        list = delete_at_end(list);

        printList(list);
    }
}
