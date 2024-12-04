public class mirroredRhombus {
    public static void main(String[] args) {
        int row = 4;
        int column = 6;

        for(int i = 0; i < row; i++) {
            for(int j = row - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
