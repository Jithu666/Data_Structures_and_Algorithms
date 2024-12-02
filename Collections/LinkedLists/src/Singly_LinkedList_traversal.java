public class Singly_LinkedList_traversal {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // end of class Node

    public static void printList(Singly_LinkedList_traversal list) {

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
    } //  end of printList ()

    public Singly_LinkedList_traversal insert(Singly_LinkedList_traversal list, int data){

        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }


    public static void main(String[] args) {

        Singly_LinkedList_traversal list = new Singly_LinkedList_traversal();

        list = list.insert(list, 6);
        list = list.insert(list, 7);
        list = list.insert(list, 8);
        printList(list);
    }
}
