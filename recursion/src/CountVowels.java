    // Count and Return the Number of Vowels in the given String using Recursion.


public class CountVowels { // wrapper class

    // main method goes here
    public static void main(String[] args) {
        String str = "Hello Jithu";
        System.out.println("The Number of 'Vowels' in the String " + str + " = " + countVowels(str, 0));
    } // main method ends here


    // CountVowels Method
    static int countVowels(String str, int index) {

        // Base Condition
        if(index == str.length()){
            return 0;
        }

        char ch = str.charAt(index);
        int currChar = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1 : 0;

        return currChar + countVowels(str, index + 1);
    }
}