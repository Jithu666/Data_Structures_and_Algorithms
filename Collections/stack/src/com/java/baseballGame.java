import java.util.Arrays;
import java.util.Stack;

public class baseballGame{

    public int points(String [] operations) {

        Stack<Integer> st = new Stack<>();

        for(String op : operations) {
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(2 * st.peek());
            }
            else if(op.equals("+")){
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } else{
                st.push(Integer.parseInt(op));
            }
        }

        int var = 0;
        while(!st.isEmpty()) {
            var += st.pop();
        }

        return var;
    }
}

//class elc{
//    public static void main(String[] args) {
//        baseballGame bg = new baseballGame();
//
//        String[] operations = {"5","2","C","D","+"};
//        int res = bg.points(operations);
//        System.out.println(res);
//    }
//}