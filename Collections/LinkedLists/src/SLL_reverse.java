public class SLL_reverse {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static SLL_reverse insert(SLL_reverse list, int data){

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


    public static SLL_reverse reverse(SLL_reverse list){

        Node temp = list.head;
        Node curr = null;
        Node prev = null;

        if(temp == null){
//            System.out.println("List is Empty!");
            return list;
        }else{
            while(temp != null){
                curr = temp.next;
                temp.next = prev;
                prev = temp;
                temp = curr;
            }
        }
        head = prev;
        return list;
    }

    public static void printList(SLL_reverse list){
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


    public static void main(String[] args) {
        SLL_reverse list = new SLL_reverse();

        list = insert(list, 0);
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        System.out.println("List before reverse function called");
        printList(list);

        reverse(list);
//
        System.out.println("List after reverse function called");
        printList(list);

    }

}
