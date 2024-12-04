import java.util.Stack;

public class delete_mid_from_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);

        System.out.println("Original Stack : " + st);
        deletemid(st, st.size());
        System.out.println("Stack after deleting middle element : " + st);
    }

    public static void deletemid(Stack<Integer> st, int size){

        if(size == 0 || st.isEmpty()){
            return;
        }
        int mid = size / 2;
        helper(st, mid);
    }

    public static void helper(Stack<Integer> st, int mid){

        if(mid == 0){
            st.pop();
            return;
        }

        int top = st.pop();

        helper(st, mid-1);

        st.push(top);
    }
}
