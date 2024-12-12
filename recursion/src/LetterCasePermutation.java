import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCasePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str = sc.nextLine();

        List<String> res = new ArrayList<>();
        generatePermutations(0, str.toCharArray(), res, new StringBuilder());

        // print the contents of the list.
        System.out.println("Permutations are : ");
        for(String s : res)
            System.out.println(s);
    }   // main method ends here.

    public static void generatePermutations(int index, char[] Char, List<String> res, StringBuilder sb) {

        if(index == Char.length){
            res.add(sb.toString());
            return;
        }

        char currentChar = Char[index];

        if(Character.isLetter(currentChar)){
            // Recursive call for UpperCase Letter.
            sb.append(Character.toUpperCase(currentChar));
            generatePermutations(index+1, Char, res, sb);
            sb.deleteCharAt(sb.length()-1);

            // Recursive call for LowerCase Letter.
            sb.append(Character.toLowerCase(currentChar));
            generatePermutations(index+1, Char, res, sb);
            sb.deleteCharAt(sb.length()-1);
        }
        else if(Character.isDigit(currentChar)){
            sb.append(currentChar);
            generatePermutations(index+1, Char, res, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
