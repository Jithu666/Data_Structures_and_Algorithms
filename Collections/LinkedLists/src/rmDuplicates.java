public class rmDuplicates {
    static class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
            next = null;
        }
    }

    static Node head;

    rmDuplicates() {
        head = null;
    }

    public static void insert(int data) {
        head = insertLL(head, data);
        System.out.println();
    }

    public static Node insertLL(Node head, int data) {

        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static void display() {
        System.out.print("Linked List : ");
        displayLL(head);
        System.out.println();
    }

    public static Node displayLL(Node head) {

        if(head == null){
            System.out.println("List is Empty");
            return head;
        }

        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);

        return head;
    }

    public static void rmDuplicate() {
        head = rmDuplicatesLL(head);
        System.out.println();
    }

    public static Node rmDuplicatesLL(Node head) {

        if(head == null)
            return head;

        Node temp = head;

        if(head.next == null)
            return head;

        while (temp != null && temp.next != null){
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {

        rmDuplicates rmd = new rmDuplicates();

        rmDuplicates.insert(1);
        rmDuplicates.insert(1);
        rmDuplicates.insert(2);
        rmDuplicates.insert(3);
        rmDuplicates.insert(3);

        rmDuplicates.display();

        rmDuplicates.rmDuplicate();

        rmDuplicates.display();
    }













}
