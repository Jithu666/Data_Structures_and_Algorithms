import java.util.Arrays;

public class runningSumOf1DArray {

    public static void main(String[] args) {
        int[] arr = {3,1,2,10,1};

        int[] res = runningSum(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] runningSum(int [] arr){

        int n = arr.length;
        int[] nums = new int[n];
        nums[0] = arr[0];
        for(int i = 1; i < n; i++) {
//            int j = i+1;

            nums[i] = arr[i] + nums[i - 1];
        }
        return nums;
    }

}
