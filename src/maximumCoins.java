public class maximumCoins {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 2, 3},
                       {2, 3, 9, 6},
                       {9, 8, 0, 1}};

        System.out.println("Maximum Coins Collected : " + maxCoins(arr));
    }

    public static int maxCoins(int[][] arr){

        int n = arr.length;
        int m = arr[0].length;

        int[][] dp = new int[n][m];

        dp[0][0] = arr[0][0];

        for(int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j-1] + arr[0][j];
        }
            for(int i = 1; i < n; i++){
                dp[i][0] = dp[i-1][0] + arr[i][0];
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                dp[i][j] = arr[i][j] + Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n-1][m-1];
    }
}
