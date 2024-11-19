public class BubbleSort {
    public static void main(String[] args) {

//        int arr[] = {9,8,7,6,5,4,3,2,1};
        int arr[] = {1,2,3,4,5,6,7,8,10,9};
        System.out.println("Array before Sorting");
        printArray(arr);
        bubbleSort(arr);
    }

    /* public static void bubbleSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after Sorting");
        printArray(arr);
    } */


    // Optimised Approach

    public static void bubbleSort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                swapped = true;
            }
            if (swapped == false) {
            break;
            }
        }
        System.out.println("Array After Sorting");
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


// Time Complexity : O(N^2)
// Space Complexity : o(1)