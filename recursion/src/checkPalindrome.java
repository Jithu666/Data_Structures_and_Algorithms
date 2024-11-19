import java.util.Scanner;

public class checkPalindrome {

//     checks if the given array is palindrome or not.
    public static void main(String[] args) {

        // this is to check if the given array is palindrome or not.
//        int[] arr = {1,2,1,2,1};
//
//        System.out.print("Original Array : ");
//        printArray(arr);
//        System.out.println();
//
//        System.out.print("Array is palindrome : " + isPalindrome(arr, 0, arr.length-1));

        String s = "RADAR";
        boolean ans = isPalindrome(s, 0);
        System.out.println(ans);
    }

    //     method to check if the given string is palindrome or not (Through Recursion)
        static boolean isPalindrome(String s, int i){
            if(i >= s.length()/2)
                return true;

            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;

            return isPalindrome(s, i+1);
        }


    //     method to check if the given array is palindrome or not (Through Recursion)
//    static boolean isPalindrome(int[] arr, int idx, int end_idx){
//
//        if(idx >= end_idx)
//            return true;
//
//        if(arr[idx] != arr[end_idx])
//            return false;
//
//        return isPalindrome(arr,idx + 1, end_idx - 1);
//    }

    // print array
//    static void printArray(int[] arr){
//        for(int i : arr)
//            System.out.print(i + " ");
//    }

    // checks if the given number is palindrome or not.
//    public static void main(String[] args) {
//
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Enter Number : ");
//        int num = s.nextInt();
//
//        int original_Num = num;
//
//        int a = isPalindrome(original_Num);
//        if(original_Num == a)
//            System.out.print("The number " + original_Num + " is palindrome");
//        else
//            System.out.println("The number is not palindrome!");
//    }

    // method to check if the given string is palindrome or not (without using Recursion)
//    static int isPalindrome(int num){
//        int reversed_no = 0;
//        while(num != 0){
//            int digit = num % 10;
//            reversed_no = reversed_no * 10 + digit;
//            num /= 10;
//        }
//        return reversed_no;
//    }
}
