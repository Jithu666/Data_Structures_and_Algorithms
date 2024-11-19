
public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,2,7,8,9,0,3,4,5,6};

        System.out.print("Array before sorting : ");
        printArray(arr);
        selectionSort(arr);
    }

    public static void selectionSort(int arr[]){

        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int min = i;

            for(int j = i+1; j < n; j++){

                if(arr[j] < arr[min])
                    min = j;

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i]= temp;
            }
        }
        System.out.print("Array After Selection Sort : ");
        printArray(arr);
    }

    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
