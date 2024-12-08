public class StringReverse {
    public static void main(String[] args) {

        String s = "ardnehtiJ olleH";
        System.out.println("Original String : " + s + "\nReversed String : " + reverse(s));
    }
    static String reverse(String s){
        if(s.isEmpty())
            return s;

        return reverse(s.substring(1)) +  s.charAt(0);
    }
}
