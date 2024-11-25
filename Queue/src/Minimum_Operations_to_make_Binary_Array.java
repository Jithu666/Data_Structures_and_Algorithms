public class Minimum_Operations_to_make_Binary_Array {
    public int equal_To_One(int[] arr) {

        // find the length of the array
        int n = arr.length;
        // create a variable to store the size of count
        int count = 0;

        // now traverse the array from 0 to n-2 and for every character you encounter as 0,  perform a AND operation to convert 0's to 1's
        for(int i = 0; i < n-2; i++) {
            if(arr[i] == 0) {

                arr[i] = arr[i] ^ 1;
                arr[i+1] = arr[i+1] ^ 1;
                arr[i+2] = arr[i+2] ^ 1;

                // for every iteration increase the count variable.
                count++;
            }
        }

        // now check for the edge cases
        // if the last element or the second last element is 0, then such a array cannot be converted to 1's
        if(arr[n-1] == 0 || arr[n-2] == 0){
            return -1;
        }

        return count;
    }
}

//class elc{
//    public static void main(String[] args) {
//        Minimum_Operations_to_make_Binary_Array mo = new Minimum_Operations_to_make_Binary_Array();
////        int[] arr = {0,1,1,1};
//        int[] arr = {0,1,1,1,0,0};
//        int count = mo.equal_To_One(arr);
//        System.out.println(count);
//    }
//}