public class stringCompression {
    public String unevenStringCompression(String str) {

        StringBuilder sb = new StringBuilder();

        // if the string contains only one character return the String.
        if(str.length() == 1)
            return str;

        for(int i = 0; i < str.length(); i+=2){
            char curr = str.charAt(i);
            int count = Character.getNumericValue(str.charAt(i+1));

            while (count > 0){
                sb.append(curr);
                count--;
            }
        }
        return sb.toString();
    }
}

class elc{
    public static void main(String[] args) {

        stringCompression sc = new stringCompression();

        String str = "a3b5c3a2";
        String ans = sc.unevenStringCompression(str);
        System.out.println(ans);
    }
}