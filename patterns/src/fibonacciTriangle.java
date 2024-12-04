public class fibonacciTriangle {
    public static void main(String[] args) {
        int n = 6;
        fibonacciTriangle(n);
    }
    public static void fibonacciTriangle(int n){
        int a = 0, b = 1, c;

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                c = a + b;
                System.out.print(b + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
