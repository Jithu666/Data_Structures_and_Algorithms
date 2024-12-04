import java.util.Arrays;
import java.util.Stack;
public class postfix_To_Infix {

    public int evaluate(String[] arr) {

        Stack<Integer> st = new Stack<>();

        for (String str : arr) {
            if (isOperator(str)) {
                int op2 = st.pop();
                int op1 = st.pop();

                int result = calculate(str, op1, op2);
                st.push(result);
            } else {
                st.push(Integer.parseInt(str));
            }
        }

        return st.pop();
    }

    public boolean isOperator(String operator) {
        return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
    }

    public int calculate(String operator, int op1, int op2) {

        switch (operator) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                System.out.println("Invalid Choice");
        }
        return -1;
    }
}

//class elc {
//    public static void main(String[] args) {
//        String[] arr = {"2","1","+","3","*"};
//
//        postfix_To_Infix pti = new postfix_To_Infix();
//        int ans = pti.evaluate(arr);
//        System.out.println(ans);
//    }
//}
