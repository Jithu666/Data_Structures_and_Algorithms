import java.util.Stack;

public class minStack {
    Stack<Integer> st;
    int minElement;
    public minStack(){
        st = new Stack<>();
        minElement = 0;
    }

    public void push(int x) {
        minElement =  Math.min(minElement, x);
        st.push(x);
    }

    public void pop() {
        st.pop();
//        System.out.println(x);
    }

    public int top() {
        return st.peek();
    }

    public int getMinElement() {
        int minElement = st.peek();
        while(!st.isEmpty()) {
            minElement = Math.min(minElement, st.pop());
        }
        return minElement;
    }

} // end of class minStack.

//class elc {
//    public static void main(String[] args) {
//        minStack ms = new minStack();
//
//        ms.push(6);
//        ms.push(7);
//        ms.push(-2);
//        ms.pop(); // -2
//        int param_3 = ms.top();
//        System.out.println(param_3); // 7
//        int param_4 = ms.getMinElement();
//        System.out.println(param_4); // -2
//    }
//}
