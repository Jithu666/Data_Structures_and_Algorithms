public class print_rec {
    public static void main(String[] args) {
        int n = 6;

        System.out.println("Recursive Function Call");
//        System.out.println("Print Number's from 1 to " + n);
//        print(1, n);

//        System.out.println();

        System.out.println("Print Number's from " + n + " to 1");
         print(6);
    }

    // print one to n
    static void print(int i, int n){
        if(i > n){
            return;
        }

        System.out.print(i + " ");
        print(i+1, n);
    }

    // print n to 1
    static void print(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }


}
