public class basicRightTriangle {
    public static void main(String[] args) {
        int n = 4, g = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(g + " ");
                g++;
            }
            System.out.println();
        }
    }
}
