import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fact = sc.nextInt();

        int res = factorial(fact);
        System.out.println("Factorial of " + fact + " is : " + res);
    }

    public static int factorial(int n) {

        if(n == 0 || n == 1){
            return n;
        }
        return n * factorial(n-1);
    }
}
