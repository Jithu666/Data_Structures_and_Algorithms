import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int target = 6;

        // function call with array and target passed as arguments
        combinationSum(arr, target);
    } // main method ends here

    static void combinationSum(int[] arr, int target){

        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> currentCombinations = new ArrayList<>();

        int[] count = new int[1];
        helper(arr, combinations, currentCombinations, target, 0, count);
        System.out.println("Combinations are : ");
        System.out.println(combinations);

         System.out.println("Total Combinations are : " + count[0]);
    } // combinationSum method ends here.

    static void helper(int[] arr, List<List<Integer>> combinations, List<Integer> currentCombinations, int target, int index,  int[] count){

        // Stopping conditions for recursive calls.
        // 1. if current sum of combinations equals to the given target.
        if(target == 0) {
            combinations.add(new ArrayList<>(currentCombinations));
            count[0]++;
            return;
        }

        // 2. if the current sum exceeds the target
        if(target < 0){
            return;
        }

        for (int i = index; i < arr.length; i++) {
            // add combinations to the ArrayList.
            currentCombinations.add(arr[i]);

            // Recursive Function Call.
            // add array[i] to currentSum.
            helper(arr, combinations, currentCombinations, target - arr[i], i, count);

            // Backtrack: Remove the last number added
            currentCombinations.remove(currentCombinations.size() - 1);
        }
        return;
    } // helper method ends here.
} // class CombinationSum ends here.