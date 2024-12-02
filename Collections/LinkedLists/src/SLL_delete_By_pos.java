public class SLL_delete_By_pos {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // end of class Node

    public static SLL_delete_By_pos insert(SLL_delete_By_pos list, int data){

        Node new_Node = new Node(data);

        Node temp = list.head;

        if(list.head == null)
            list.head = new_Node;

        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_Node;
        }
        return list;
    }

    public static SLL_delete_By_pos delete(SLL_delete_By_pos list, int pos){

        int counter = 0;

        Node temp = list.head;
        Node prev = temp;

        // position to delete is at the beginning
        if(temp != null && pos == counter){
            list.head = temp.next;
            return list;
        }

        // position is at the end
        while(temp.next != null && pos < counter){
            prev = temp;
            counter = counter + 1;
            temp = temp.next;
        }if(temp == null) {
            prev.next = null;
        }

        // position is not at the beginning or at the end of the list
        while(temp != null && pos != counter){
            prev = temp;
            counter = counter + 1;
            temp = temp.next;
        }if(temp != null) {
            prev.next = temp.next;
        }
        // position to delete does not exist in the list
        while(temp != null && pos != counter){
            System.out.println("Position does not exists in the list!");
        }

        return list;
    }

    public static void printList(SLL_delete_By_pos list){
        Node temp = list.head;

        if(temp == null){
            System.out.println("List is Empty");
        }else {
            System.out.println("LinkedList");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        SLL_delete_By_pos list = new SLL_delete_By_pos();

        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        System.out.println("Before delete function called");
        printList(list);

//        list = delete(list, 5);
        list = delete(list, 1);
        list = delete(list, 2);
//        list = delete(list, 9);

//        System.out.println("After delete function called");
        printList(list);

    }
}
















