public class isArraySorted {
    public static void main(String[] args) {

//      you need to check whether the given array is sorted or not,

        int arr[] = {1, 2, 3, 6};
        int n = arr.length;
        System.out.println(isArraySorted(arr, n));
    }
     static boolean isArraySorted(int arr[], int n){
        // Check if the array is empty or has one element
        if (n <= 1) {
            return true;
        }

        // Iterate through the array and check if each element is less than or equal to the next element
        for (int i = 0; i < n-1; i++) { // it takes a time complexity of O(n)
            if (arr[i] > arr[i + 1]) {             // & space complexity of O(1)
                return false;
            }
        }

        // If no elements are out of order, return true
        return true;
    }
}
