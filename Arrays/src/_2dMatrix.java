import java.util.Arrays;

public class _2dMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4,2,3},{3,2,2}};

        int res = findLargest(arr);
        System.out.println(res);
    }

    public static int findLargest(int[][] arr) {

        int n = arr.length;
        int s_max = 0;
        int[] ans = new int[n];

        for(int i = 0; i < n; i++) {
            int max = 0;
            for(int j = 0; j < arr[0].length; j++) {
                max += arr[i][j];
            }
            ans[i] = max;
        }
        int maximum = ans[0];
        for(int i = 0; i < n; i++) {
            if(ans[i] > maximum)
                maximum = ans[i];
        }
        return maximum;
    }

}
