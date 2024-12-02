import java.util.Collections;
import java.util.PriorityQueue;

public class maxHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // adding elements to max-heap
        maxHeap.offer(10);
        maxHeap.offer(20);
        maxHeap.offer(15);


        // adding elements to min-heap
        minHeap.offer(10);
        minHeap.offer(9);
        minHeap.offer(8);


        // displaying elements of a max-heap
        System.out.println("Max-Heap Priority Queue : " + maxHeap);

        // removing elements in descending order
        System.out.println("Polling elements from max-heap");
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }

        // displaying elements of a min-heap
        System.out.println("\nMin-Heap Priority Queue : " + minHeap);

        // removing elements in ascending order
        System.out.println("\nPolling elements from min-heap");
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }
    }
}
