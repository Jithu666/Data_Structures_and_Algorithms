public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 60;

        boolean ans = binarySearch(arr, 0, arr.length-1, target);
        if (ans)
            System.out.println(target + " exists");
        else
            System.out.println(target + " Does not exist");
    } // end of main method

    static boolean binarySearch(int[] arr,int low, int high, int value){

        if(low > high){
            return false;
        }
        int mid = low + (high - low)/2;

        if(arr[mid] == value)
            return true;
        if(value > arr[mid])
            return binarySearch(arr, mid+1, high, value);
        else
            return binarySearch(arr, 0, mid-1, value);
    }
}// end of class BinarySearch