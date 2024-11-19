public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1,0};

        System.out.print("Array before Quick sort : ");
        printArray(arr);

        int n = arr.length;
        quickSort(arr, 0, n-1);

        System.out.print("Array after Quick sort : ");
        printArray(arr);
    } // main () ends here

    public static void quickSort(int arr[], int low, int high){

        if (low < high){

            int pivot = partition(arr, low, high);

            quickSort(arr, 0, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }

    public static int partition(int arr[], int low, int high){

        int pivot = arr[high];
        int swapIndex = low-1;

        for(int j = low; j <= high - 1; j++){
            if(arr[j] < pivot){
                swapIndex++;
                swap(arr, swapIndex, j);
            }
        }
        swap(arr, swapIndex + 1, high);
        return (swapIndex + 1);
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
