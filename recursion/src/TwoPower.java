import java.util.Scanner;

public class TwoPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'N' : ");
        int n = sc.nextInt();
        boolean ans = powerOfTwo(n);
        if(ans)
            System.out.println(n + " is a power of two");
        else
            System.out.println(n + " is not a power of two");
    } // main method ends here

    static boolean powerOfTwo(int n) { // function execution begins here

        // base case
        if(n <= 0)
            return false;

        // recursive function call
        if(n % 2 == 0){
            return powerOfTwo(n/2);
        }

        // check if the number is power of 2 or not
        return n == 1;
    } // function powerOfTwo ends here
} // end of class TwoPower