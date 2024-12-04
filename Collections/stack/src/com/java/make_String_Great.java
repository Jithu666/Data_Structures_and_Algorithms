import javax.swing.*;

public class make_String_Great {
    public String rmDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {

            int length = sb.length();
            if(length > 0 && Math.abs(sb.charAt(length-1) - c) == 32)
                sb.deleteCharAt(length-1);
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

//class elc{
//    public static void main(String[] args) {
//        make_String_Great msg = new make_String_Great();
//        String s = "s";
//
//        String ans = msg.rmDuplicates(s);
//        System.out.println(ans);
//    }
//}

