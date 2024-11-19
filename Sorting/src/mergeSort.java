public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {10,9,8,7,6,5,4,3,2,1,0};

        System.out.print("Array before Merge sort : ");
        printArray(arr);

        int n = arr.length;
        // calling the merge-sort function
//        mergesort(arr, 0 , n-1);

        System.out.print("After merge-sort function called : ");
        printArray(arr);
    }

    // recursive call
    // mergesort function
    /* public static void mergesort(int arr[], int low, int high){

        if (low < high){

            // calculate the value of middle element
            int mid = low + (high - low) / 2;

            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high); // calling the merge function
        }
    } // end of mergesort function


    public static void merge(int arr[], int low, int mid, int high){

        int i,j, k;

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        // copying data from temporary arrays left and right

        for(i = 0; i < n1; i++){
            left[i] = arr[low + i];
        }

        for (j = 0; j < n2; j++){
            right[j] = arr[mid + 1 + j];
        }


        // merging takes place here
        i = 0;
        j = 0;
        k = low;


        while(i < n1 && j < n2){

            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // if there is any elements remaining in either of the arrays, then add them at the last.

        while(i < n1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    } */

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
