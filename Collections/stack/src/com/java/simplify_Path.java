import java.util.Stack;

public class simplify_Path {
    public String path(String s) {

        String[] arr = s.split("/");
        Stack<String> st = new Stack<>();

        for(String str : arr){
            // push '/' as the root of the file structure.
            if(str.equals("") || str.equals(".")){
                continue;
            }
            else if(str.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(str);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String str : st){
            sb.append("/").append(str);
        }
        return sb.length() > 0 ? sb.toString() : "/";
    }
}

//class elc {
//    public static void main(String[] args) {
//        simplify_Path sp = new simplify_Path();
//        String s = "/home//foo/";
//        String ans = sp.path(s);
//        System.out.println(ans);
//    }
//}