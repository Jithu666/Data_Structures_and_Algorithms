
// To find the n-th fibonacci number

import java.util.Scanner;

public class fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number n : ");
        int n = sc.nextInt();

        int res = fibonacci_val(n);
        System.out.println("Fibonacci value of " + n  + " is : " + res);
    }

    static int fibonacci_val(int n){
//        if((n == 0) || (n == 1)){
//            return n;
//        }
//
//        return fibonacci_val(n-1) + fibonacci_val(n-2);

        // this alternate approach to recursion gives the solution in "Constant time".

        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;

        return (int)Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);

    }
}
