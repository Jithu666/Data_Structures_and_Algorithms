public class minFlips {

    public static void main(String[] args) {
        String pwd = "00000";

        int res = minFlips(pwd);
        System.out.println(res);
    }

    public static int minFlips(String pwd){
        int count = 0;

        for(int i = 0; i < pwd.length()-1; i+=2){
            if(pwd.charAt(i) != pwd.charAt(i+1)){
                count++;
            }
        }
        return count;
    }



}
