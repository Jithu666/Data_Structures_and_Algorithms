import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutations_I {
    public static void main(String[] args) {

        // Scanner class to take string as input from user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to perform permutations : ");

        List<String> res = new ArrayList<>();

        String str = sc.nextLine();
        generatePermutations(0, str, res, " ");

        System.out.println("String Permutations with spaces are : ");
        for(String s : res){
            System.out.println(s);
        }
    }   // main method ends here.

    public static void generatePermutations(int index, String str, List<String> result, String currentPermutation){

        // Base case, if the length of the index equals to the size of the given String.
        if(index == str.length()){
            result.add(currentPermutation.trim());
            return;
        }

        // for every position other than the last position.
        generatePermutations(index+1, str, result, currentPermutation+str.charAt(index));


        // for last position.
        if(index != str.length()-1){
            generatePermutations(index+1, str, result, currentPermutation+str.charAt(index) + " ");
        }
    }
}
