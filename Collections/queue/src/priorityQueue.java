    // Priority Queue
//    in java is part of the java.util package & is based on heap DS.
//    it is an unbounded queue it automatically orders its elements.


    // characteristics

    // 1. Order : The priority queue orders elements based on priority, bu default it's a min heap, so the smallest element comes out first.
    // 2. Non-null elements : priority queue does not allow non-null elements.
    // 3. Unbounded but limited by memory
    // 4. non-thread safe : priority queue is not synchronised for thread safe operations.


import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to priority queue
        pq.offer(10);
        pq.offer(20);
        pq.offer(10);


        // displaying the contents of the queue
        // System.out.println("Priority Queue : " + pq);

        // Accessing the head of the queue
        // System.out.println("Head of the queue (peek) : " + pq.peek());


        // removing the elements from priority queue
        System.out.println("Polling elements from Priority Queue:");
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
