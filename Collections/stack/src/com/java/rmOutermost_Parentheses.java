import java.util.Stack;
public class rmOutermost_Parentheses {

    public String rm_Outermost_Parentheses(String s){

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(Character c : s.toCharArray()) {
            if(c == '(') {
                if(count > 0){
                    sb.append(c);
                }
                count++;
            }
            else if(c == ')') {
                count--;
                if(count > 0) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }

}

//class elc {
//    public static void main(String[] args) {
//        rmOutermost_Parentheses rm = new rmOutermost_Parentheses();
//
//        String s = "()(())";
//
//        String ans = rm.rm_Outermost_Parentheses(s);
//        System.out.println(ans);
//    }
//}
