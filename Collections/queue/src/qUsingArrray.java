public class qUsingArrray {
    static class queue{
        static int [] queue;
        static int size;
        static int capacity;
        static int rear = -1;
        static int front = 0;

        public queue(int capacity){
            qUsingArrray.queue.capacity = capacity;
            queue = new int[capacity];
            size = 0;
        }

        public static void add(int data){

            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }

            rear = (rear+1)%capacity;
            queue[rear] = data;
            size++;
        }

        public static int remove(){

            if(isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int temp = queue[front];
            front = (front + 1) % capacity;

//            for(int i = front; i < rear; i++){
//                queue[i] = queue[i+1];
//            }
            size--;

            return temp;
        }

        public static void peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }

            System.out.println("Front element in the Queue is : " + queue[front]);
        }

        public static void printQueue(){

            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }

            System.out.print("Elements of the Queue are : ");
            for(int i = 0; i < size; i++){
                System.out.print(queue[(front+i) % capacity] + " ");
            }
            System.out.println();
        }

        public static void rear(){
            System.out.println("Rear element in the queue is : " + queue[rear]);
        }

        public static boolean isFull(){
            return size == capacity;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static int size (){
            return size;
        }

    }

    public static void main(String[] args) {
        queue q = new queue(5);

        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.printQueue();
        System.out.println("Size of the Queue is : " + queue.size());

        queue.peek();
        int pop = queue.remove();
        System.out.println("Popped element is : " + pop);
        queue.printQueue();

        queue.peek();
        System.out.println("Size of the Queue is : " + queue.size());
        queue.add(7);
        queue.printQueue();

        queue.rear();
        System.out.println("Size of the Queue is : " + queue.size());
        queue.add(8);
        System.out.println("Size of the Queue is : " + queue.size());
        queue.printQueue();


    }
}
