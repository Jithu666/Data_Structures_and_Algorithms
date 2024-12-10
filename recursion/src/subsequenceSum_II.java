import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequenceSum_II {

    // main method goes here.
    public static void main(String[] args) {
        int[] arr = {0};
        List<List<Integer>> ans = generateSubsequenceSum(arr);

        // print all the subsequences.
        System.out.println("Unique Subsequences are : ");
        for(List<Integer> subsequence : ans){
            System.out.println(subsequence);    // print all unique subsequences.
        }   // for loop ends here.
    }       // main method ends here.

    // generate unique subsequences.
    public static List<List<Integer>> generateSubsequenceSum(int[] arr){

        // sort the array. so we can figure out duplicates.
        Arrays.sort(arr);
        List<List<Integer>> Subsequence = new ArrayList<>(); // ArrayList to store currentSubsequence.

        helper(0, arr, Subsequence, new ArrayList<>());
        return Subsequence;
    } // end of generateSubsequenceSum.

    // Helper Method
    public static void helper(int index, int[] arr, List<List<Integer>> Subsequence, List<Integer> currentSubsequence) {

        Subsequence.add(new ArrayList<>(currentSubsequence));

        // iterate for all the elements in the array.
        for(int i = index; i < arr.length; i++){

            // Base case
            if(i > index && arr[i] == arr[i-1])
                continue;

            currentSubsequence.add(arr[i]);

            // recursive function call.
            helper(i+1, arr, Subsequence, currentSubsequence);

            // Backtrack : remove the element present in the last index of the currentSubsequence.
            currentSubsequence.remove(currentSubsequence.size()-1);
        }   // Generated subsequences for all elements in the array.
    }       // Helper method ends here.
}           // class SubsequenceSum_II ends here.