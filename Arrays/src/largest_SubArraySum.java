
// kadane's algorithm

public class largest_SubArraySum {
    public static void main(String[] args) {
        int arr[] = {10, 1, 4, 6, -1, 25};

        int res = subArray(arr);
        System.out.println(res);
    }
    static int subArray(int[] nums){

        int maxSOfar = nums[0];
        int max_Ending_Here = nums[0];

        for (int i = 1; i < nums.length; i++){

            max_Ending_Here = Math.max(nums[i], max_Ending_Here+nums[i]);
            maxSOfar = Math.max(maxSOfar, max_Ending_Here);
        }
       return maxSOfar;
    }
}