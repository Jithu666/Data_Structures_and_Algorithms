import java.util.Arrays;

//import java.util.Arrays;
//
public class rm_duplicates_inPlace{
    public static void main(String[] args) {

        int arr[] = {2,2,2,5, 6,6,6,6,6,7,7,7,7,8,8,8,8,9,9,2, 3,9,9,2};
        int n = arr.length;
        Arrays.sort(arr);
        int res = rm_duplicates(arr, n);

        int []uniqueInd = new int[n];
        for(int i = 0; i < n; i++){
            uniqueInd[i] = arr[i];
        }
        for(int i = 0; i < res; i++){
            System.out.print(uniqueInd[i] + " ");
        }
    }

    static int rm_duplicates(int arr[], int n){
        int uniqueIndex = 1;

        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i-1]){
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;;
            }
        }
        return uniqueIndex;
    }
}



//    public class RemoveDuplicates {

//        public static int removeDuplicates(int[] nums) {
//            if (nums.length == 0) return 0;
//
//            int uniqueIndex = 1; // Start from the second element
//            for (int i = 1; i < nums.length; i++) {
//                if (nums[i] != nums[i - 1]) {
//                    nums[uniqueIndex] = nums[i];
//                    uniqueIndex++;
//                }
//            }
//            return uniqueIndex; // Length of array with unique elements
//        }
//
//        public static void main(String[] args) {
//            int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
//            int length = removeDuplicates(nums);
//
//            int[] uniqueArray = new int[length];
//            for (int i = 0; i < length; i++) {
//                uniqueArray[i] = nums[i];
//            }
//
//            System.out.println("Array after removing duplicates:");
//            for (int i = 0; i < uniqueArray.length; i++) {
//                System.out.print(uniqueArray[i] + " ");
//            }
//        }
//    }
