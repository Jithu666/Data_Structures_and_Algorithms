import java.util.Stack;

public class maximum_Nesting_Depth {

    public static int of_Parentheses (String s) {

        int maxDepth = 0;
        int currDepth = 0;
        

        for(char c : s.toCharArray()) {
            if(c == '('){
                currDepth++;
                maxDepth = Math.max(currDepth, maxDepth);
            } else if (c == ')'){
                currDepth--;
            } if (currDepth < 0) {
                return -1;
            }
        }
        if(currDepth != 0)
            return -1;

        return maxDepth;
    }
}

//class elc {
//    public static void main(String[] args) {
//        maximum_Nesting_Depth msn = new maximum_Nesting_Depth();
//
//        String str = "(1)+((2))+(((3)))";
//        int res = maximum_Nesting_Depth.of_Parentheses(str);
//        System.out.println(res);
//    }
//}
