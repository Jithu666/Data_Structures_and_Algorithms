import java.util.HashSet;
import java.util.Set;

public class pangram {
    public static void main(String[] args) {
        String s = "The quick fox jumped over the Lazy dog";
        s = s.toLowerCase().replaceAll("^[a-z]", " ");

        Set<Character> hs = new HashSet<>();
        for(char c : s.toCharArray()){
            hs.add(c);
        }
        if(hs.size() == 26) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not pangram");
        }
    }
}
