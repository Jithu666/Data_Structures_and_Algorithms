import java.util.Stack;

public class reverse_a_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(6);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(0);

        System.out.println("Original Stack : " + st);
        reverse(st);
        System.out.println("Reversed Stack : " + st);
    }

    public static void reverse(Stack<Integer> st){

        if(st.isEmpty()){
            return;
        }

        int top = st.pop();

//        reverse(st);

//        insertDown(st, top);
    }

//    public static void insertDown(Stack<Integer> st, int item){
//
//        if(st.isEmpty()){
//            st.push(item);
//            return;
//        }
//
//        int top = st.pop();
//
//        insertDown(st, item);
//
//        st.push(top);
//    }
}
