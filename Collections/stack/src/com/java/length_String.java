import java.util.Stack;

public class length_String {
    public static int removeSubString(String s) {

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == 'B' || c == 'D') {
                if (!st.isEmpty()) {
                    char t = st.peek();
                    if ((c == 'B' && t == 'A') || (c == 'D' && t == 'C')) {
                        st.pop();
                    } else {
                        st.push(c);
                    }
                } else {
                    st.push(c);
                }
            }
            else {
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.length();
    }
}

//class elc {
//    length_String ls = new length_String();
//
//    public static void main(String[] args) {
//        String s = "ACBBD";
//        int value = length_String.removeSubString(s);
//
//        System.out.println(value);
//    }
//}

