import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 6;

        // store the value returned in a list and print it.
        List<List<Integer>> res = combinationSum(arr, target); // function call.

        // print the elements present in res.
        System.out.print("Combinations are : ");
        for(List<Integer> j : res){
            System.out.println(j);  // prints all combinations.
        }   // for loop ends here.

    } // main method ends here.

    public static List<List<Integer>> combinationSum(int[] arr, int target) {

        // Create a Variable to store all the possible combinations
        List<List<Integer>> ans = new ArrayList<>(); // ans stores all the combinations which add up to the give target.

        // Sort the Array as we need the elements going inside the data-structure to be less than target value.
        Arrays.sort(arr);

        // call helper method
        helper(arr, 0, target, ans, new ArrayList<>());

        // return ans to the calling function.
        return ans;
    }

    public static void helper(int[] arr, int index, int target, List<List<Integer>> ans, List<Integer> currentCombinations) {

        // base condition
        if(target == 0){ // if the combinations add up to the given target add the combination into List<List>.
            ans.add(new ArrayList<>(currentCombinations));
            return;
        }

        // iterative statement for all the elements in the array.
        for(int i = index; i < arr.length; i++){ // run the loop for all the elements in the array.
            if(i > index && arr[i] == arr[i-1]){ // if arr[i] == arr[i-1], do not consider that element.
                continue;
            }
            if(arr[i] > target){ // adding this value at array[i] will go beyond the target, so remove this function call.
                break;
            }

            // add the element at current index to the List<Integer> currentCombinations.
            currentCombinations.add(arr[i]);

            // recursive function call.
            helper(arr, i+1, target - arr[i], ans, currentCombinations);

            // while coming back BackTracking remove the element added at index i.
            currentCombinations.remove(currentCombinations.size()-1);
        }   // for loop ends here.

    } // helper method ends here.

} //  class CombinationSum2 ends here.