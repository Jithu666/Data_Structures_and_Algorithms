public class fibonacciTriangle {
    public void triangle(int n) {

        int a = 0; int b = 1;
        int c;
        System.out.println(a);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                c = a + b;
                System.out.print(b + " ");
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}

class elc{
    public static void main(String[] args) {
        fibonacciTriangle ft = new fibonacciTriangle();
        ft.triangle(6);
    }
}