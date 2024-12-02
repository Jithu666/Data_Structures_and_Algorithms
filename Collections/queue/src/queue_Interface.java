import java.util.*;

public class queue_Interface {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.add("Jithendra");
        queue.add("Sparrow");
        queue.add("Jithu");

        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);

        queue.offer("Gowda");
//        queue.poll();
        System.out.println(queue);
        System.out.println(queue.size());

    }
}
