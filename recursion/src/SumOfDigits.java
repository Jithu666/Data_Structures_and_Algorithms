public class SumOfDigits {
    public static void main(String[] args) {
        int n = 6666;

        int ans = sum(n);
        System.out.println("Sum of " + n + " is " + ans);
    } // end of void main

    static int sum(int n){
        if(n == 0)
            return 0;

        int rem = n % 10;

        return rem + sum(n/10);
    } // end of sum function
} // end of class
