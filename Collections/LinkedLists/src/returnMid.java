public class returnMid {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Node head;
    returnMid() {
        head = null;
    }

    public void insert(int data){
        head = insertLL(data);
        System.out.println(data + " Inserted into the list.");
//        System.out.println();
    }

    public Node insertLL(int data) {

        Node new_Node = new Node(data);

        if (head == null) {
            head = new_Node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_Node;
        }
        return head;
    }


    // find middle element

    public void findMid(){
        head = findMiddle(head);

        System.out.print("New List : ");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    int count = 0;
    public Node findMiddle(Node head) {
        if (head == null)
            return null;

        Node ptr1 = head;
        Node ptr2 = head;

        while (ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
            count++;
        }
//        if (ptr2.next == null) {
//            count++;
//            return ptr1;
//        }
        return ptr1;
    }





    public static void main(String[] args) {
        returnMid ll = new returnMid();

        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
//        ll.insert(50);
        ll.insert(60);


        // return mid;

        ll.findMid();


    }

}
