        // Recursive approach to check if the given String is Palindrome or Not.

public class IsPalindrome {
    public static void main(String[] args) {
        String str = "A Man A plan A Canal A Panama";

        if(isPalindrome(str)){
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }
    }

    static boolean isPalindrome(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();

        // Base Condition
        if(str.length() <= 1){
            return true;
        }

        // Check if the First & Last Characters are equal
        if(str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }

        // recursive call
        return isPalindrome(str.substring(1, str.length() - 1));
    }
}
