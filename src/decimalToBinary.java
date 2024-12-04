public class decimalToBinary {
    public static void main(String[] args) {

        int decimal = 10;

        String res = decimalToBinary(decimal);
        System.out.println(res);

    }

    public static String decimalToBinary(int n){

        if(n == 0)
            return "0";

        StringBuilder sb = new StringBuilder();

        while(n > 0){
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        return sb.reverse().toString();
    }



}
