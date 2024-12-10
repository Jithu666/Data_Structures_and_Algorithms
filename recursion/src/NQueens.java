import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;

        List<List<String>> solutions = solveNQueens(n);

        // print all the solutions.
        printSolutions(solutions);
    }   // main method ends here.

    public static List<List<String>> solveNQueens(int n) {

        char[][] board = new char[n][n];

        // initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }   // inner for loop (Column initialization) ends here
        }     // outer for loop (Row initialization) ends here.

        List<List<String>> res = new ArrayList<List<String>>();
        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2 * n - 1];
        int[] lowerDiagonal = new int[2 * n - 1];

        solve(0, board, res, leftRow, lowerDiagonal, upperDiagonal);
        return res;
    }   // solveNQueens ends here.

    private static void solve(int col, char[][] board, List<List<String>> res, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal){
        if(col == board.length){
            res.add(constructBoard(board));
            return;
        }

        for(int row = 0; row < board.length;  row++){
            if(leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;

                // Recursive function call
                solve(col+1, board, res, leftRow, lowerDiagonal, upperDiagonal);

                // BackTrack
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }   // solve method ends here.

//    private static boolean isSafe(int row, int col, char[][] board, int n){
//
//        // check in the same column
//        for(int i = 0; i < row; i++){
//            if(board[i][col] == 'Q')
//                return false;
//        }
//
//        // check left diagonal
//        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
//            if(board[i][j] == 'Q')
//                return false;
//        }
//
//        // check right diagonal
//        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++){
//            if(board[i][j] == 'Q'){
//                return false;
//            }
//        }
//
//        return true;
//    }   // isSafe method ends here.

    private static List<String> constructBoard(char[][] board){
        List<String> result = new ArrayList<>();
        for(char[] row : board) {
            result.add(new String(row));
        }
        return result;
    }

    private static void printSolutions(List<List<String>> solutions) {
        int count = 1;
        for(List<String> solution : solutions) {
            System.out.println("Solution " + count++ + ":");
            for (String row : solution) {
                System.out.println(row + " ");
            }
            System.out.println();
        }
    }
}