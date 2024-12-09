import java.util.Scanner;

public class PowerOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'N' : ");
        int n = sc.nextInt();

        boolean ans = powerOfThree(n);
        if(ans)
            System.out.println(n + " is a power of three");
        else
            System.out.println(n + " is not a power of three");
    } // main method ends here

    static boolean powerOfThree(int n){

        // base condition
        if(n <= 0)
            return false;

        // recursive function call for (n/3) as input
        if(n % 3 == 0)
            return powerOfThree(n/3);

        // check if the number is power of 3 or not
        return n == 1;
    }
}
