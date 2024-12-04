import java.util.Scanner;

// Trace of the Matrix represents the sum of the diagonal elements..

public class traceMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the Number of Columns: ");
        int column = sc.nextInt();

        int[][] arr = new int[row][column];

        // take input into matrices
        System.out.println("Enter the elements into the Matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        // input taken into matrix.


        // create a local variable "trace" to store the value of the diagonals
        int trace = 0;

        // create a local variable to store the instance of "diagonal" element.
        int diagonal = -1;
        // now find the trace of the matrix
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(i == j){
                    diagonal = arr[i][j];
                    trace = trace + diagonal;
                }
            }
        }
        // print out the sum of diagonals..
        System.out.println("Trace : " + trace);
    }
}
