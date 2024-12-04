import java.util.Stack;

public class rm_All_Adjacent_duplicates{
    public String rmDuplicates(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()) {

            // if the stack is empty push the first character from the String into the stack.
            if(st.isEmpty()) {
                st.push(c);
            }
            else if(c == st.peek()){
                st.pop();
            } else {
                st.push(c);
            }
        }

        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}

//class elc{
//    public static void main(String[] args) {
//        rm_All_Adjacent_duplicates rad = new rm_All_Adjacent_duplicates();
//        String s = "azxxzy";
//
//        String ans = rad.rmDuplicates(s);
//        System.out.println(ans);
//
//    }
//}