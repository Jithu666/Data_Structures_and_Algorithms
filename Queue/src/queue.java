                // Implement queue using collections

import java.util.Queue;
import java.util.LinkedList;

public class queue {
    public static void main(String[] args) {


        Queue<Integer> q = new LinkedList<>();

        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);
        q.offer(10);

        System.out.println(q.peek());

        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}
