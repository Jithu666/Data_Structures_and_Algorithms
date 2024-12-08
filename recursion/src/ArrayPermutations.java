import java.util.ArrayList;
import java.util.List;

public class ArrayPermutations {

    // main method
    public static void main(String[] args) {

        // arr of type int we be passed
        int[] nums = {1, 2, 3};

        // we need to store all possible permutations of the nums array, we are not sure to declare the size of the array beforehand. so we use List of Lists

        System.out.println("Permutations are : ");
        List<List<Integer>> result = generatePermutations(nums);

        // print out all permutations of result.
        for(List<Integer> list : result) {
            System.out.println(list);
        } // end of for loop
    }     // end of main method

    static List<List<Integer>> generatePermutations(int[] arr){

        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(arr, new ArrayList<>(), new boolean[arr.length], permutations);
        return permutations;
    }

    private static void backtrack(int[] arr, List<Integer> current, boolean[] map, List<List<Integer>> permutations) {
        if(current.size() == arr.length){
            permutations.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < arr.length; i++){
            if(map[i])
                continue;

            map[i] = true;
            current.add(arr[i]);
            backtrack(arr, current, map, permutations);
            map[i] = false;
            current.remove(current.size() - 1);
        }
    }
}         // end of class ArrayPermutations
