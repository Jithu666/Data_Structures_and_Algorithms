public class Singly_LinkedList_deleteBy_Key {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        } // end of constructor
    } // end of class

    public static Singly_LinkedList_deleteBy_Key insert(Singly_LinkedList_deleteBy_Key list, int data){

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

    public static Singly_LinkedList_deleteBy_Key delete(Singly_LinkedList_deleteBy_Key list, int key){

        Node temp = list.head;
        Node prev = null;

        // when the element to delete exists at the begining of the list

        if(temp != null && temp.data == key){
            list.head = temp.next;
            System.out.println(key + " found and deleted from the list");
            return list;
        }

        // if the element to delete is in any other position apart from beginning

        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        // now deleting the element
        if(temp != null){
//            assert prev != null;
            prev.next = temp.next;
            System.out.println(key + " found and deleted from the list");
        }

        // if the element to delete does not exists in the list

        if(temp == null){
            System.out.println(key + " not found in the list");
        }
        return list;
    }

    public static  void printList(Singly_LinkedList_deleteBy_Key list){

        Node temp = list.head;

        if(list.head == null){
            System.out.println("List is Empty");
        }else{
            System.out.println("LinkedList ");
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            } // end of while loop
        } // end of else condition
        System.out.println();
    } // end of printList()


    public static void main(String[] args) {

        Singly_LinkedList_deleteBy_Key list = new Singly_LinkedList_deleteBy_Key();

        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        list = insert(list, 9);
        list = insert(list, 10);

//        printList(list);

        list = delete(list, 5);
//        printList(list);
//
        list = delete(list, 10);

        list = delete(list, 7);  
        printList(list);

    }
}


















