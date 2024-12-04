
                // creating a queue using array

public class circularQueue {

    int front;
    int rear;
    int [] arr;
    int capacity;
    int size;

    public circularQueue(int capacity) {
        front = -1;
        rear = -1;
        this.capacity = capacity;
        arr = new int[capacity];
    }

    // add element into the queue
    public void enqueue(int x) {
        if(isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1)
            front = 0;

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        System.out.println(x + " inserted into the queue");
    }

    // check if the queue is full
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }


    // delete the element from the front of the queue
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        int x = arr[front];

        if(front == rear) {
            front = -1;
            rear = -1;
        }
        front = (front + 1) % capacity;
        System.out.println(x + " removed from the queue");
    }

    // check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // peek
    public int peek() {
        if(!isEmpty())
            return arr[front];
        return -1;
    }


    // display the contents of the queue
    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Elements in the Queue : ");
        int i = front;
        while (i != rear){
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.print(arr[rear]);
        System.out.println();
    }
} // class circular queue ends here.

//class elc {
//    public static void main(String[] args) {
//        circularQueue cq = new circularQueue(4);
//
////        System.out.println(cq.isEmpty());
////        System.out.println(cq.isFull());
//        cq.enqueue(1);
//        cq.enqueue(3);
//        cq.enqueue(5);
//        cq.enqueue(7);
//        cq.enqueue(9);
//        System.out.println(cq.isFull());
//        System.out.println(cq.isEmpty());
//        cq.display();
//
//        cq.dequeue();
//        System.out.println(cq.peek());
//        cq.dequeue();
//        cq.display();
//
//    }
//}