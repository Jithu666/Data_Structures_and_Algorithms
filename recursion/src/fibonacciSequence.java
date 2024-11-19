public class fibonacciSequence {
    public static void main(String[] args) {

        int n = 6;

        // to print the fibonacci value of given 'n'
        System.out.println("Fibonacci Sequence of " + n + " is : " + FibonacciSequence(n));

        // to print the fibonacci sequence of any given integer 'n'.
//        for(int i = 0; i < n; i++){
//            System.out.print(FibonacciSequence(i) + " ");
//        }
    }
    public static int FibonacciSequence(int n){

        if(n <= 1)
            return n;

        int last = FibonacciSequence(n-1);
        int s_last = FibonacciSequence(n-2);

        return last + s_last;
    }
}
