import java.util.ArrayList;
import java.util.List;

public class compare_Strings {

    public boolean onBackspace(String s, String t) {

        String S = onBackSpace(s);
        String T = onBackSpace(t);

        return S.equals(T);
    }

    public String onBackSpace(String str){
        List<Character> res = new ArrayList<>();

        for(char c : str.toCharArray()) {
            if(c == '#') {
                if(!res.isEmpty()){
                    res.remove(res.size()-1);
                }
            } else{
                res.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c : res){
            sb.append(c);
        }

        return sb.toString();
    }
}

//class elc{
//   public static void main(String[] args) {
//       compare_Strings cs = new compare_Strings();
//
//       String s = "ab#c";
//       String t = "Ld#c";
//
//       boolean res = cs.onBackspace(s,t);
//       System.out.println(res);
//
//   }
//}