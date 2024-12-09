import java.util.Scanner;

public class PowerOfFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'N' : ");
        int n = sc.nextInt();

        boolean ans = powerOfFour(n);
        if(ans)
            System.out.println(n + " is a power of four");
        else
            System.out.println(n + " is not a power of four");
    } // main method ends here

    static boolean powerOfFour(int n){

        // base condition
        if(n <= 0)
            return false;

        // recursive function call
        if(n % 4 == 0)
            return powerOfFour(n/4);

        // check if the number is power of 4 or not
        return n == 1;
    }
}