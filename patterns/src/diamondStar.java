public class diamondStar {

    public static void main(String[] args) {

        int n = 4;

        // first half
        for(int i = 1; i <= n; i++) {
            for(int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // second half
        for(int i = n-1; i > 0; i--){
            for(int j = n; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}