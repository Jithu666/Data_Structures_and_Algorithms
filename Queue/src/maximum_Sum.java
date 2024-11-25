
                    // Kadane's Algorithm is used to find the maximum subarray sum, for arrays and Queue's

public class maximum_Sum {
    public int circular_Subarray(int[] arr) {
        int countsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;
        int curmax = 0;
        int curmin = 0;

        // calculate the total sum of the array.
        for(int n : arr) {
            countsum += n;


            curmax = Math.max(curmax + n, n);
            maxSum = Math.max(curmax, maxSum);

            curmin = Math.min(curmin + n, n);
            minsum = Math.min(curmin, minsum);
        }

        if(maxSum < 0)
            return maxSum;

        return Math.max(countsum-minsum, maxSum);
    }
}

class elc {
    public static void main(String[] args) {
        maximum_Sum ms = new maximum_Sum();

        int[] arr = {-3,-2,-3};
        int count = ms.circular_Subarray(arr);
        System.out.println(count);
    }
}