public class Search_in_SLL {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static Search_in_SLL insert(Search_in_SLL list, int data){

        Node new_Node = new Node(data);

        Node temp = list.head;

        if(list.head == null)
            list.head = new_Node;
        else{ // if need to insert at any other position other than beginning
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_Node;
        }
        return list;
    }

    public static void search(Search_in_SLL list, int data){

        Node temp = list.head;

        if(temp == null){
            System.out.println("List is Empty! ");
        }else{
            System.out.println("LinkedList");
            while(temp.next != null && data != temp.data){
                temp = temp.next;
            }
            if(temp.data == data){
                System.out.println("Element found in the list");
            }if(temp.data != data){
                System.out.println("Element not found in the list");
            }
        }
    }

    public static void main(String[] args) {

        Search_in_SLL list = new Search_in_SLL();

        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);

        search(list, 8);

    }

}
