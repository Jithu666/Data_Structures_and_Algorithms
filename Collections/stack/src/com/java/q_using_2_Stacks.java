import java.util.Stack;

public class q_using_2_Stacks {

    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();

    // push operation
    public void push(int data) {
        pushStack(data);
//        System.out.println();
    }

    public void pushStack(int data) {
        while(!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        st1.push(data);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
    }

    // pop operation
    public void pop() {
        int res = popStack();
        System.out.println("Deleted element is : " + res);
    }

    public int popStack() {
        if(st1.isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return st1.pop();
    }


    // peek operation
    public void peek() {
        int res = peekStack();
        System.out.println("Top element is : " +res);
    }

    public int peekStack() {
        if(st1.isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return st1.peek();
    }


    // isEmpty Operation
    public void isEmpty(){
        boolean ans = is_Empty();
        System.out.println(ans);
    }

    public boolean is_Empty() {
        return st1.isEmpty();
    }
}


//class elc {
//    public static void main(String[] args) {
//        q_using_2_Stacks q = new q_using_2_Stacks();
//
//        // push operation
//        q.push(1);
//        q.push(2);
//        q.push(3);
//        q.push(4);
//        q.push(5);
//        q.push(6);
//        q.peek();
//
//        // pop operation
//        q.pop();
//        q.pop();
//        q.pop();
//
//        // peek operation
//        q.peek();
//
//        // isEmpty
//        q.is_Empty();
//    }
//}
