import java.util.HashSet;

public class first_Letter {
    public char to_appear_twice(String s) {

        HashSet<Character> hs = new HashSet<>();

        for(Character c : s.toCharArray()) {
            if(hs.contains(c))
                return c;
            else {
                hs.add(c);
            }
        }
        return ' ';
    }
}

//class elc {
//    public static void main(String[] args) {
//        first_Letter fl = new first_Letter();
//
//        String s = "static";
//        char ans = fl.to_appear_twice(s);
//        System.out.println(ans);
//    }
//}

