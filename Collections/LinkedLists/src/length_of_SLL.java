public class length_of_SLL {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // end of class Node

    public static length_of_SLL insert(length_of_SLL list, int data){

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

    public static int length(length_of_SLL list){

        Node temp = list.head;
        int length = 0;
        if(temp == null){
            System.out.println("List is Empty!");
            return length;
        }else{
            while (temp != null){
                length+=1;
                temp = temp.next;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        length_of_SLL list = new length_of_SLL();

        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);

        System.out.println(length(list));
    }
}
