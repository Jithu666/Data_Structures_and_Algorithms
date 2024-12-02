public class qUsingLL {

    static class Node{
        int data;
        Node next;

        public Node(int d){
            data = d;
            next = null;
        } // end of constructor
    } // end of class Node

    private Node front, rear;
    private static int size;

    public qUsingLL(){
        this.front = this.rear = null;
        size = 0;
    }

    // insert
    public void insert(int data) {

        Node new_Node = new Node(data);

        if(this.rear == null){
            this.front = this.rear = new_Node;
        } else {
            rear.next = new_Node;
            this.rear = new_Node;
        }
        System.out.println(data + " inserted into the queue.");
        size++;
    }


    // delete
    public void deque(){
        if(this.front == null){
            System.out.println("Queue is Empty.");
            return;
        }
        else{
            System.out.println(front.data + " deleted from the queue.");
            front = front.next;

            if(front == null)
                rear = null;
        }
        size--;
    }


    // display the top element of the queue
    public void peek(){
        if(this.front == null){
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("Front element is : " + front.data);
    }


    // print the contents of the queue
    public void printQueue(){

        if(front == null){
            System.out.println("Queue is Null.");
            return;
        }
        else{
            Node temp = front;
            System.out.print("Elements in the Queue are : ");
            while(temp.next != rear){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(rear.data);
        }
        System.out.println();
    }

    // size of the queue
    public static int getSize(){
        return size;
    }

    public static void main(String[] args) {
        qUsingLL q = new qUsingLL();

        // insert ops
        q.insert(2);
        q.insert(4);
        q.insert(6);
        q.insert(8);
        q.insert(10);
        q.insert(12);
        q.insert(14);
        System.out.println(getSize());
        q.printQueue();
        // peek ops
        q.peek();

        // delete ops
        q.deque();
        q.peek();

        q.printQueue();
    } // main method ends here
}