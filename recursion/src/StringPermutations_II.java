        // Return all the permutations of the given string with changing their case.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutations_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        List<String> permutations = new ArrayList<>();
        generatePermutations(0, str, permutations, new StringBuilder());

        // print out all the permutations of the string.
        System.out.println("Permutations are : ");
        for(String permutation : permutations) {
            System.out.println(permutation);
        }
    } // main method ends here.


    public static void generatePermutations(int index, String str, List<String> permutations, StringBuilder currentPermutation) {

        // Base condition, when the index equals to the length of the given string.
        if(index == str.length()){
            permutations.add(currentPermutation.toString());
            return;
        }

        currentPermutation.append(Character.toLowerCase(str.charAt(index)));
        generatePermutations(index + 1, str, permutations, currentPermutation);
        currentPermutation.deleteCharAt(currentPermutation.length() - 1);

        currentPermutation.append(Character.toUpperCase(str.charAt(index)));
        generatePermutations(index + 1, str, permutations, currentPermutation);
        currentPermutation.deleteCharAt(currentPermutation.length() - 1);
    }


}     // Class StringPermutations_II ends here
