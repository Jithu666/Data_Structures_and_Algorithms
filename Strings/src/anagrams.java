import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String a = "jithendra";
        String b = "JITHENDRA";

        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
//        System.out.println(s2);

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2))
            System.out.println("Anagrams");
        if(!Arrays.equals(a1, a2))
            System.out.println("Not Anagrams");
    }
}
