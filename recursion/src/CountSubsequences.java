import java.util.ArrayList;

public class CountSubsequences {

    public static void main(String[] args) {

        // String[] arr = {"a", "b", "c"};            // For String
        // ArrayList<String> al = new ArrayList<>();  // For String

        int[] arr = {1,2,3,4,5,6};                  // For Integers
        ArrayList<Integer> al = new ArrayList<>();
        int targetSum = 6;

        System.out.print("Count of Subsequences is : ");
        System.out.println(generateSubsequence(0, al, 0, targetSum, arr));
    }

    // Generate Subsequence method
    public static int generateSubsequence(int i, ArrayList<Integer> subsequence, int s, int targetSum, int[] arr) {      // For Integer's.

        // public static void generateSubsequence(int i, String[] arr, ArrayList<String> subsequence) { // For String's

        // Base Case / Stopping Condition
        if(i == arr.length){
            if(targetSum == s){
//                System.out.println(subsequence);
                return 1;
            }
            return 0;
        }

        // Considering current element
        subsequence.add(arr[i]);
        int l = generateSubsequence(i+1, subsequence, s + arr[i], targetSum, arr);

        // Not Considering current element
        subsequence.remove(subsequence.size() - 1);
        int r = generateSubsequence(i+1, subsequence, s, targetSum, arr);

        return l+r;
    }
}