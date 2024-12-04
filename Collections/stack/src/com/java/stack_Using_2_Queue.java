import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack_Using_2_Queue {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();


    // add function
    public void push(int data) {
        add(data);
        System.out.println();
    }

    public void add(int data) {
        q2.add(data);

        while(!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

//        q1.add(data);
//        while(!q2.isEmpty()){
//            q1.add(q2.poll());
//        }
    }

    // remove function
    public void pop() {
        int removed_element = remove();
        System.out.println(removed_element);
    }

    public int remove() {
        if(q1.isEmpty()) {
            System.out.println("Stack is Empty !");
            return -1;
        }
        return q1.poll();
    }


    // peek function
    public void top() {
        int top_element = peek();
        System.out.println(top_element);
    }

    public int peek() {
        if(q1.isEmpty()) {
            System.out.println("Stack is Empty !");
            return -1;
        }
        return q1.peek();
    }


    // empty
    public void empty() {
        boolean ans = isEmpty();
        System.out.println(ans);
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

//class elc {
//    public static void main(String[] args) {
//
//        stack_Using_2_Queue su = new stack_Using_2_Queue();
//
//        // push operations
//        su.push(1);
//        su.push(2);
//        su.push(3);
//        su.push(4);
//        su.push(5);
//        su.push(6);
//
////        su.top();
//
//        // pop operations
//        su.pop();
//        su.pop();
//        su.pop();
//        su.pop();
//        su.pop();
//        su.pop();
//
//        // peek operations
////        su.top();
//
//        // isEmpty
////        su.empty();
//
//    }
//}
