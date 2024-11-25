import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibo(n);
//        System.out.println("Fibonacci of " + n + " is : " + res);
    }

    public static void fibo(int n) {

        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++){
            int next = a + b;
            System.out.print(next + ",");
            a = b;
            b = next;
        }


    }
}
