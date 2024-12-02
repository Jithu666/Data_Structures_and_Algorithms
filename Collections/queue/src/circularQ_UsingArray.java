public class circularQ_UsingArray {
    static int[] queue;
    static int rear;
    static int front;
    static int capacity;
    static int size;


    public circularQ_UsingArray(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
        this.rear = -1;
        this.front = -1;
    }

    public void enqueue(int data ){
        // check if the queue is full
        if(isFull()){
            System.out.println("Cannot add Element, Queue is full.");
            return;
        }

        if(front == -1)
            front = 0;


        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    public int dequeue() {

        if(isEmpty()) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        int data = queue[front];
        queue[front] = -1;

        if(front == rear){
            front = -1;
            rear = -1;
        } else{
            front = (front+1) % capacity;
        }
        size--;
        return data;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }

        if(size == 1){
            return queue[front];
        }

        int data = queue[front];
        return data;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {

        circularQ_UsingArray q = new circularQ_UsingArray(3);
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        System.out.println(size);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        q.enqueue(8);
        System.out.println(size);
        System.out.println(q.peek());
        q.enqueue(10);
        System.out.println(size);
        System.out.println(q.peek());
    }


}

