import java.util.Stack;

public class reverseQueue{

    public reverseQueue(queue q) {
    }

    static class queue{
        static int capacity;
        static int size;
        static int[] queue;
        static int rear;
        static int front;
    // constructor for queue class
        public queue(int capacity){
            this.capacity = capacity;
            size = 0;
            front = 0;
            rear = -1;
            queue = new int[capacity];
        } // end of constructor


        // enqueue method -> insert operation
        public static void insert(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
            System.out.println(data + " Inserted into the queue.");
            return;
        }

        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return -1;
            }

            int top = queue[front];
            front = (front+1) % capacity;
            size--;
            return top;
        }

        // peek()
        public static void peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return;
            }

            int top = queue[front];
            System.out.println("Front element in the queue is : " + top);
        }

        // printQueue
        public static void printQueue(){
            if(isEmpty()){
                System.out.println("Queue is Empty.");
                return;
            }

            for(int i = 0; i < size; i++){
                System.out.print(queue[(front + i) % capacity] + " ");
            }
            System.out.println();
        }

        // isFull()
        public static boolean isFull(){
            return size == capacity;
        }

        // isEmpty()
        public static boolean isEmpty(){
            return size == 0;
        }

        // size()
        public static int getSize(){
            return size;
        }

        // reverse the queue
        public static void reverseQueue(queue q){
            Stack<Integer> st = new Stack<>();
            while (!q.isEmpty()){
                st.push(q.remove());
            }

            while(!st.isEmpty()){
                q.insert(st.pop());
            }
            System.out.print("Reversed Queue is : ");
        }


    } // end of class queue


    public static void main(String[] args) {

        // insert functions
        queue q = new queue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(12);
        queue.insert(18);

        // getSize()
        System.out.println("Size of the queue is : " + queue.getSize());

        // pop
        System.out.println("Popped element is " + queue.remove());

        // peek()
        queue.peek();

        // printQueue()
        queue.printQueue();

        // reverse Queue
        queue.reverseQueue(q);

        queue.printQueue();
    }
}
