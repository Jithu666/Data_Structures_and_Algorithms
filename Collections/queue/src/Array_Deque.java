import java.util.ArrayDeque;

public class Array_Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Add elements
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(0);

        System.out.println("DeQue : " + deque);

        // access elements
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());


        //remove elements
        deque.removeFirst();
        deque.removeLast();

        System.out.println("DeQue : " + deque);

        System.out.println(deque.size());
    }
}
