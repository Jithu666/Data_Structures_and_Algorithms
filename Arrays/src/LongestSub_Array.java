public class LongestSub_Array {
    public static void main(String[] args) {
        int[] arr = {10,5,2,7,1,9};
        int k = 15;

        withSum_K wk = new withSum_K();
        int ans = wk.longestSubarray(arr, k);
        System.out.println(ans);
    }
}

class withSum_K{
    public int longestSubarray (int[] arr, int k){
        int n = arr.length;
        int start = 0, current_sum = 0, max_length = 0;

        for(int end = 0; end < n; end++){
            current_sum += arr[end];

            while(current_sum > k && start <= end){
                    current_sum -= arr[start];
                    start++;
                }
            if(current_sum == k){
                max_length = Math.max(max_length, end - start + 1);
            }
        }
        return max_length;
    }
}