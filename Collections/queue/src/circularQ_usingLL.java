public class circularQ_usingLL {

    static class Node{
        int data;
        Node next;

        public Node(int d) {
            data = d;
             next = null;
        }
    }

    public static class queue{

        private Node front, rear;

        public queue(){
            this.front = this.rear = null;
        }

        // insert operation
        public void enqueue(int data) {

            Node new_node = new Node(data);

            // if the list is empty
            if(front == null) {
                front = rear = new_node;
                rear.next = new_node;
            }

            // if the list is not empty
            rear.next = new_node;
            rear = new_node;
            rear.next = front;
        }


        // delete operation
        public int dequeue() {

            // check if the list is  empty
            if(isEmpty()) {
                System.out.println("Queue is Empty.");
                return -1;
            }

            // if the queue is not empty
            int data = front.data;
            front = front.next;
            rear.next = front;

            return data;
        }

        // peek operation
        public void peek() {
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return;
            }

            System.out.println("Front element is : " + front.data);
        }

        // isEmpty()
        public boolean isEmpty(){
            return front == null;
        }

        public void display() {
            if(isEmpty()) {
                System.out.println("Queue is Empty.");
                return;
            }
            Node temp = front;
            System.out.print("Queue Element's are : ");
            while (temp.next != rear.next){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println(temp.data);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        queue q = new queue();

        System.out.println(q.isEmpty());

        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        q.peek();
        q.display();
        int ans = q.dequeue();
        System.out.println("Deleted Element is : "+ ans);
        System.out.println(q.isEmpty());
        q.enqueue(12);
        q.display();

        System.out.println(q.front.data);
        System.out.println(q.rear.data);
    }
}
