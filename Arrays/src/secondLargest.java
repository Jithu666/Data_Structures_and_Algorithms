import java.util.*;

public class secondLargest {
    public static void main(String[] args) {

//        Brute force Approach

        int arr[] = {0,1,2,3,6,6,10,10};
        int second_largest = find_Second_Largest(arr);
        System.out.println("Second largest in the array is " +  second_largest);

    }

//  Brute force approach
//  time complexity O(n*logn)
//    space complexity O(n)

//    static  int find_Second_Largest(int arr[]){
//
//        int size = arr.length;
//
//        Arrays.sort(arr);
//        if(arr[size-1] == arr[size-2])
//            return arr[size-3];
//        else
//            return arr[size-2];
//    }


//    better approach

//    static int find_Second_Largest(int [] arr) {
//        int size = arr.length;
//        int max = Integer.MIN_VALUE;
//        int sec_large = -1;
//
//        for(int i = 0; i < size; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        for(int i = 0; i < size-1; i++){
//            if(arr[i] > sec_large && arr[i] != max){
//                sec_large = arr[i];
//            }
//        }
//        return sec_large;
//    }


//    optimal approach

    static int find_Second_Largest(int []arr){
        int large = arr[0];
        int second_largest = -1;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] > large){
                second_largest = large;
                large= arr[i];
            }
            if(arr[i] < large && arr[i] > second_largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
}
