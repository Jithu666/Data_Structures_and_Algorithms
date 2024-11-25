class Node {
    int data;
    Node next;

    public Node(int val) {
        data = val;
        next = null;
    }
}

public class queue_LL {

    Node front = null;
    Node rear = null;

    public void enqueue(int x) {
        Node newNode = new Node(x);

        if(rear == null) {
            front = rear = newNode;
            System.out.println(x + " inserted into the queue");
            return;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(x + " inserted into the queue");
    }

    public void dequeue() {
        if(front == null){
            System.out.println("Queue is Empty");
        } else{
            System.out.println(front.data + " deleted from the queue");
            front = front.next;
        }
        return;
    }

    public void peek() {
        if(front == null) {
            System.out.println("Queue is Empty");
        }
        else {
            System.out.println("Front element is " + front.data);
        }
        return;
    }

    public void display() {
        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements are ");
        Node temp = front;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        if(front == null)
            return true;
        return false;
    }
}
//
//class elc{
//    public static void main(String[] args) {
//        queue_LL q = new queue_LL();
//
//        System.out.println(q.isEmpty());
//        q.enqueue(1);
//        q.enqueue(2);
//        q.enqueue(3);
//        q.enqueue(4);
//        q.enqueue(5);
//        q.enqueue(6);
//        q.display();
////        System.out.println(q.isEmpty());
//
//        q.dequeue();
//        q.display();
//
//        System.out.println(q.isEmpty());
//        q.dequeue();
//        q.peek();
//        q.enqueue(7);
//        q.display();
//
//    }
//}