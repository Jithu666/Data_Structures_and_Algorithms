
public class reverseArray {
    public static void main(String[] args) {

        int[] arr = {6,5,4,3,2,1,7,8,9,0};

        System.out.print("Original Array :");
        for (int j : arr) {
            System.out.print(j + " ");
        }

//        reverseArray(arr, 0, arr.length-1);
        reversearray(arr, 0);

        System.out.println();
        System.out.print("Reversed Array : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

//    static void reverseArray(int arr[], int idx, int last_idx) {
//
//        if (idx < last_idx) {
//            int temp = arr[idx];
//            arr[idx] = arr[last_idx];
//            arr[last_idx] = temp;
//
//            reverseArray(arr, idx + 1, last_idx - 1);
//        }
//    }

    // By using a single variable
    static void reversearray(int[] arr, int i){
        int n = arr.length;
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reversearray(arr, i+1);
    }
}
