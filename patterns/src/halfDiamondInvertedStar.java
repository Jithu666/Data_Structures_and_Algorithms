public class halfDiamondInvertedStar {

    public static void main(String[] args) {
        int n = 4;

        // first half
        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i;  j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // second half
        for(int i = 1; i <= n-1; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = n - i; j >= 1; j-- ){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
