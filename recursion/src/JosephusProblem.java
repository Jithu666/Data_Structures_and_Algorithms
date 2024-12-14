import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N :");
        int n = sc.nextInt();
        System.out.print("Enter the value of K :");
        int k = sc.nextInt();

        int survivor = solve(n, k);
        int survivor_ = solve_(n, k);
        System.out.println("Survivor of Game of Death is " + survivor_);
    }

    // Recursive approach.
    public static int solve(int n, int k) {

        // Base condition.
        if(n == 1){
            return 1;
        }

        // recursive call
        return (solve(n-1, k) + k - 1) % n+1;
    }

    // Iterative Approach.
    public static int solve_ (int n, int k){
        int survivor = 0;

        for(int i = 2; i <= n; i++){
            survivor = (survivor + k ) % i;
        }
        return survivor+1;
    }

}