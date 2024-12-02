public class SLL_insert_at_Given_posn {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } //  end of class Node


    public static SLL_insert_at_Given_posn insert(SLL_insert_at_Given_posn list, int data, int pos){

        Node new_node = new Node(data);

        Node temp = list.head;
        Node prev = temp;
        int counter = 0;

        // if list is empty anf the position is at beginning then insert at the given position
        if(temp == null && pos == counter){
            list.head = new_node;
            return list;
        }
        // if list is empty and the insert position is not empty then print list is empty
        else if(temp == null && pos != counter){
            System.out.println("List is Empty!");
        }

        // else traverse to the given position and insert the value at the  given position
        else{
            while(temp != null && pos != counter){
                counter += 1;
                prev = temp;
                temp = temp.next;
            } // end of while loop
            new_node.next = prev.next;
            prev.next = new_node;
        } // end of else condition
        return list;
    } // end of insert ()


    public static SLL_insert_at_Given_posn ins(SLL_insert_at_Given_posn list, int data){

        Node new_node = new Node(data);

        Node temp = list.head;

        if(list.head == null)
            list.head = new_node;
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }



    public static void printList(SLL_insert_at_Given_posn list){
        Node temp = list.head;

        // if list is empty -> print  message List is empty
        if(temp == null){
            System.out.println("List is Empty!");
        }else{
            System.out.println("LinkedList ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            } // end of while loop
        } // end of else condition
        System.out.println();
    }  // end of printList()

    public static void main(String[] args) {
        SLL_insert_at_Given_posn list = new SLL_insert_at_Given_posn();

        list = ins(list, 0);
//        list = ins(list, 1);
//        list = ins(list, 2);
//        list = ins(list, 3);
//        list = ins(list, 5);
//        list = ins(list, 6);
//        list = ins(list, 7);

        System.out.println("Before inserting at given Position");
        printList(list);

        list = insert(list, 4, 0);
//        list = insert(list, 8, 8);
//        System.out.println("After inserting at given Position");
        printList(list);

    } // end of main()
} // end of public class