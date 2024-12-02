public class leftRotateBy_K_places {
    public static void main(String[] args) {
        int arr[] = {7,8,9,0,1,2,3,4,5,6};
        int k = 3;
        int n = arr.length;

        if(n == 0 || k % n == 0){
            return; 
        }

        k = k % n;
        reverseArray(arr, 0, k-1);
        reverseArray(arr, k, n-1);
        reverseArray(arr, 0, n-1);

        printArray(arr);
    }

    static void reverseArray(int [] arr, int start, int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
