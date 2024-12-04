import java.util.Stack;

public class clear_Digits {

    public static String clearDigits(String s) {

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (!st.isEmpty())
                    st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();

    }
}

//class elc {
//    public static void main(String[] args) {
//
//        clear_Digits c = new clear_Digits();
//        String s = "ab3ghiL3c4";
//
//        String res = clear_Digits.clearDigits(s);
//        System.out.println(res);
//    }
//}