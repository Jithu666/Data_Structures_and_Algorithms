public class basicDoubleIncrementingTriangle {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }

        for(int i = n - 1; i >= 1; i--){
            for(int j = 0; j < i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
