        // implement a Queue using ArrayList

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class queue_AL {
    int front;
    int rear;
    int capacity;
    int[] arr;

    queue_AL(int x){
        front = -1;
        rear = -1;
        capacity = x;
        arr = new int[x];
    }

    public void push(int x) {
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else if(front == -1){
            front = 0;
            rear = 0;
            arr[rear] = x;
        }
        arr[rear++] = x;
        System.out.println(x + " inserted");
    }

    public boolean isFull() {
        return rear == capacity;
    }

    public void pop() {
        if(front == -1){
            System.out.println("Queue is Empty");
            return;
        }

        System.out.println(arr[front] + " deleted from the queue");
        front = front+1;
    }

    public void peek() {
        if(front == -1){
            System.out.println("Queue is Empty");
            return;
        } else
            System.out.println(arr[front] + " is the front element in the queue");
    }

}
//class elc {
//    public static void main(String[] args) {
//        queue_AL q = new queue_AL(5);
//
//        q.push(1);
//        q.push(2);
//        q.push(3);
//        q.push(4);
//        q.push(5);
//        q.push(6);
//
//        q.pop();
//        q.peek();
//        System.out.println(q.rear);
//    }
//}