public class insertionSort {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,9,8,11,10,1};
        System.out.print("Before Insertion Sort : ");
        printArray(arr);
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr){

        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        System.out.print("After Insertion Sort : ");
        printArray(arr);
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
