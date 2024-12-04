public class string_compression {
    public static void main(String[] args) {
        String inp = "";

        String ans = compress(inp);
        System.out.println(ans);
    }

    public static String compress(String inp) {

        StringBuilder op = new StringBuilder("");
        int count = 1;

        if((inp == null) || inp.length() == 0){
            return "";
        }
        for(int i = 1; i < inp.length(); i++) {
            if(inp.charAt(i) == inp.charAt(i-1)){
                count++;
            } else{
                op.append(inp.charAt(i-1)).append(count);
                count = 1;
            }
        }
        op.append(inp.charAt(inp.length()-1)).append(count);

        return op.toString();
    }
}
