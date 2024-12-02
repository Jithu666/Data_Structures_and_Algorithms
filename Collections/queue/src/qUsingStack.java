import java.util.Stack;
public class qUsingStack {

    private Stack<Integer> stack;

    // Constructor
    public qUsingStack() {
        stack = new Stack<>();
    }

    // Enqueue operation
    public void enqueue(int value) {
        stack.push(value);
    }

    // Dequeue operation
    public int dequeue() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return dequeueRecursive();
    }

    // Helper method for recursive dequeue
    private int dequeueRecursive() {
        // Pop the top element
        int top = stack.pop();

        // If stack is empty, return the popped element
        if (stack.isEmpty()) {
            return top;
        }

        // Recursively call to pop the next element
        int result = dequeueRecursive();

        // Push the top element back into the stack
        stack.push(top);

        return result;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        qUsingStack queue = new qUsingStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());  // Output: 1
        queue.enqueue(4);
        System.out.println(queue.dequeue());  // Output: 2
        System.out.println(queue.dequeue());  // Output: 3
        System.out.println(queue.dequeue());  // Output: 4

    }
}
