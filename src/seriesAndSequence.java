import java.util.Scanner;

public class seriesAndSequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Queries : ");
        int q = sc.nextInt();

        while(q-- > 0) {

            System.out.print("Enter the Value of a :");
            int a = sc.nextInt();
            System.out.print("Enter the Value of b :");
            int b = sc.nextInt();
            System.out.print("Enter the Value of n :");
            int n = sc.nextInt();

            int sum = a;

            for(int i = 0; i < n; i++) {
                sum += Math.pow(2,i)*b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }

}
