import java.util.Stack;

public class sort_a_stack {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println("Original Stack : " + st);
        sort(st);
        System.out.println("Sorted Stack : " + st);
    }

    public static void sort(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }

        int top = st.pop();

        sort(st);

        insert_sort(st, top);
    }

    public static void insert_sort(Stack<Integer> st, int element){

        if(st.isEmpty() || st.peek() <= element){
            st.push(element);
            return;
        }

        int top = st.pop();

        insert_sort(st, element);
        st.push(top);
    }
}
