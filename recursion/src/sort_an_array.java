import java.util.Arrays;

public class sort_an_array {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,4,6};

        System.out.print("Array before sorting : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();

        sort(arr, 0, arr.length-1);

        System.out.print("Array after sorting : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
     static void sort(int[] arr, int low, int high){

        if(low < high){
            int mid = (low + high)/2;

            sort(arr, low, mid);
            sort(arr, mid+1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void merge(int[] arr, int low, int mid, int high){

        int left = mid - low + 1;
        int right = high - mid;

        int leftArr[] = new int[left];
        int rightArr[] = new int[right];

        for(int i = 0; i < left; i++){
            leftArr[i] = arr[low + i];
        }

        for(int i = 0; i < right; i++){
            rightArr[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = low;

        while(i < left && j < right){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else{
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < left){
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < right){
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
