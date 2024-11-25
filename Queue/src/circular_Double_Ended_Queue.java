public class circular_Double_Ended_Queue {

    int front, rear, size, capacity;
    int[] arr;

    public circular_Double_Ended_Queue(int x) {
        arr = new int[x];
        this.capacity = x;
        front = -1;
        rear = -1;
//        size = x;
    }

    // insert operation. using rear pointer
    public void enqueue(int x) {
        // check if the queue is full.
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        // check if the queue is empty.
        if (isEmpty()) {
            front = 0;
            rear = 0;
            arr[rear] = x;
        } else {
            // if the queue is neither empty nor full, then do the below operation.
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            System.out.println(x + " inserted at the end of the queue");
        } // end of insert function.
    }

    // insert using front pointer
    public void enqueue_front(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
            arr[front] = x;
        } else {
                front = (front - 1 + capacity) % capacity;
                arr[front] = x;
            }
        System.out.println(x + " Inserted at front of the queue");
    }

    // check if the queue is full.
    public boolean isFull(){
        return (rear + 1) % capacity == front;
    }

    // check if the queue is Empty.
    public boolean isEmpty() {
        return front == -1;
    }

    // delete operation to delete the front of the queue
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " deleted from the front");

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
    }

    // delete operation to delete the rear of the queue
    public void dequeue_rear() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[rear] + " deleted from the end of the queue");
        if(front == rear) {
            front = -1;
            rear = -1;
        } else{
            rear = (rear - 1 + capacity) % capacity;
        }
    }

    // peek front element
    public void peek_front() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front element is " + arr[front]);
    }

    // peek rear element
    public void peek_rear() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Rear element is " + arr[rear]);
    }

    // display
    public void display() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.print("Queue Elements are : ");
        int temp = front;
        while(temp != rear) {
            System.out.print(arr[temp] + " ");
            temp = (temp + 1) % capacity;
        }
        System.out.print(arr[rear] +"\n");
    }

}

//class elc {
//    public static void main(String[] args) {
//
//        circular_Double_Ended_Queue cde = new circular_Double_Ended_Queue(6);
//        cde.enqueue(2);
//        cde.enqueue(3);
//        cde.enqueue(4);
//        cde.enqueue(5);
//
//        cde.display();
//
//        cde.enqueue_front(1);
//        cde.enqueue_front(0);
//
//        cde.display();
//
//        cde.dequeue();
//        cde.display();
//
//        cde.dequeue_rear();
//        cde.display();
//
//        cde.peek_front();
//        cde.peek_rear();
//
//    }
//}
