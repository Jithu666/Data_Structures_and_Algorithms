import java.util.ArrayList;

public class SubsequenceSum {

    public static void main(String[] args) {

        // String[] arr = {"a", "b", "c"};            // For String
        // ArrayList<String> al = new ArrayList<>();  // For String

        int[] arr = {1,2,3,4,5,6};                  // For Integers
        ArrayList<Integer> al = new ArrayList<>();   // For Integers
        int targetSum = 6;

        System.out.print("Subsequences are : ");
        generateSubsequence(0, arr, al, 0, targetSum);
    }

    // Generate Subsequence method
    public static void generateSubsequence(int i, int[] arr, ArrayList<Integer> subsequence, int s, int targetSum) {      // For Integer's

        // public static void generateSubsequence(int i, String[] arr, ArrayList<String> subsequence) { // For String's

        // Base Case / Stopping Condition
        if(i == arr.length){
            if(targetSum == s){
                System.out.println(subsequence);
            }
            return;
        }

        // Considering current element
        subsequence.add(arr[i]);
        generateSubsequence(i+1, arr, subsequence, s + arr[i], targetSum);

        // Not Considering current element
        subsequence.remove(subsequence.size() - 1);
        generateSubsequence(i+1, arr, subsequence, s, targetSum);
    }
}