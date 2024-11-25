import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String res = isprime(n);
        System.out.println(n + " is " + res);
    }

    public static String isprime(int n) {

        for(int i = 2; i < n/2; i++) {
            if(n % i == 0){
                return "Not prime";
            }
        }
        return "Prime";
    }

}
