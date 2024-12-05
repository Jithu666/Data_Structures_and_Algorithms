public class maxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,0,4,5,-1,-4,6,7};
        int k = 2;

        maximumSubArray ms = new maximumSubArray();

        int ans = ms.findMaxSubArray(arr, k, arr.length);
        System.out.println(ans);
    }
}

class maximumSubArray {
    public int findMaxSubArray(int[] arr, int k, int n){

        if(n == 0 || k > n){
            return 0;
        }

        int max_sum = 0, temp_max = 0;
        for(int i = 0; i < k; i++){
            max_sum += arr[i];
        }
        temp_max = max_sum;

        for(int j = k; j < n; j++){
            temp_max += arr[j] - arr[j - k];
            max_sum = Math.max(max_sum, temp_max);
        }
        return max_sum;
    }

}