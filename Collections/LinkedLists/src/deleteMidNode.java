public class deleteMidNode {

    static class Node{
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    static Node head;

    deleteMidNode(){
        head = null;
    }

    public static void insert(int data){
        head = insertLL(head, data);
        System.out.println();
    }

    public static Node insertLL(Node head, int data) {

        Node new_Node = new Node(data);

        if(head == null) {
            head = new_Node;
            return head;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new_Node;

        return head;
    }

    public static void delete() {
        head = deleteMid(head);
        System.out.println();
    }

    public static Node deleteMid(Node head) {

        if(head == null || head.next == null) {
            return null;
        }

        Node fast = head;
        Node slow = head;
        Node prev = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        if(prev.next != null){
            prev.next= slow.next;
        }

        return head;
    }

    public static void display(){
        System.out.print("Contents of Linked-List are : ");
        head = displayLL(head);
    }

    public static Node displayLL(Node root){
        if(root == null){
            return head;
        }

        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);

        return head;
    }

    public static void main(String[] args) {

        deleteMidNode ll = new deleteMidNode();

        insert(1);
//        insert(3);
//        insert(4);
//        insert(7);
//        insert(1);
//        insert(2);
//        insert(6);


        display();
        delete();
        display();

    }
}
