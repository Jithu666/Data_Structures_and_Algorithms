public class sumOfFirstN_Numbers {

    public static void main(String[] args) {
        int n = 5;

        // 1. by passing parameters
        int sum = calculateSum(n, 0);

        // 2, by passing it as a function
        // int sum = calculateSum(n);
        System.out.println("Sum of the first " + n + " numbers is: " + sum);
    }

    // this problem can be solved in two methods
    // 1. by passing parameters
    // 2, by passing it as a function


    // 1. by passing it as a parameter
    public static int calculateSum(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return sum;
        }
        return calculateSum(n-1, sum + n);
    }


    // 2. by passing it as a function
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1; // Base case: sum of the first number is 1
        } else {
            return n + calculateSum(n - 1); // Recursive step: add current number to the sum of the rest
        }
    }
}
