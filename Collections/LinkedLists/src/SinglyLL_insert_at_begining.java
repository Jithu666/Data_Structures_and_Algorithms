public class SinglyLL_insert_at_begining {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // end of class Node


    public static SinglyLL_insert_at_begining insert(SinglyLL_insert_at_begining list, int data) {
        Node new_node = new Node(data);

        Node temp;
        temp = list.head;
        list.head = new_node;
        new_node.next = temp;
        return list;
    }   // end of insert ()

    public static void printList(SinglyLL_insert_at_begining list){
        Node temp = list.head;

        if(temp == null){
            System.out.println("List is Empty!");
        }else{
            while(temp != null){
                System.out.println("LinkedList");
                System.out.println(temp.data + " ");
                temp = temp.next;
            } // end of else condition
        } // end of while loop
    }    // end of printList()

    public static void main(String[] args) {

        SinglyLL_insert_at_begining list = new SinglyLL_insert_at_begining();

        list = insert(list, 18);
//        printList(list);
        list = insert(list, 12);
//        printList(list);
        list = insert(list, 6);
//        printList(list);
        list = insert(list, 0);

        printList(list);


    }

}


















