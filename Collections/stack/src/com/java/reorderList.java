class Node {
    int data;
    Node next;

    public Node(int val) {
        data = val;
        next = null;
    }
}

public class reorderList {

    Node head;

    public void insert(int data) {
        head = insertLL(head, data);
        System.out.println(data + " inserted");
    }

    public Node insertLL(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public void reOrderList() {
        if(head == null || head.next == null) {
            return;
        }
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node current = slow;
        Node next = null;

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node first = head;
        Node second = prev;

        while(second.next != null) {
            Node temp1 = first.next;
            Node temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }

    public void printList() {
        if(head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


//class elc {
    public static void main(String[] args) {
        reorderList rl = new reorderList();
        rl.insert(1);
        rl.insert(2);
        rl.insert(3);
        rl.insert(4);
        rl.insert(5);
//        rl.insert(6);

        rl.printList();
        rl.reOrderList();
        rl.printList();


    }
}

