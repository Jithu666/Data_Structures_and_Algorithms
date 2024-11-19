import java.util.Scanner;

public class PalindromeWithZeroes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        if (isPalindromeWithZeroes(input)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("not palindrome");
        }
        scanner.close();
    }

    // check if the given String is Palindrome (Remove leading and trailing zero's in the given String).
    private static boolean isPalindromeWithZeroes(String input) {
        // Remove leading and trailing zeroes
        String strippedInput = input.replaceAll("^0+|0+$", ""); // This trims out all the leading and trailing zeros.

        // Check if the stripped input is a palindrome
        return isPalindrome(strippedInput);
    }

    // method to check if the given string is palindrome or not
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
