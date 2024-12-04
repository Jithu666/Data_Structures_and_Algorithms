import java.util.HashMap;

public class first_Unique_Element {

    public int in_A_String(String s) {

        HashMap<Character, Integer> count = new HashMap<>();

        for(char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < s.length(); i++) {
            if(count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}

//class elc {
//    public static void main(String[] args) {
//        first_Unique_Element fue = new first_Unique_Element();
//
//        String s = "leetcode";
//        int res = fue.in_A_String(s);
//        System.out.println(res);
//    }
//}
