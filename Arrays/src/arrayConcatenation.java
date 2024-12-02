import java.util.Arrays;

public class arrayConcatenation {
    public static void main(String[] args) {

        int[] arr = {1};
        int n = arr.length;

        int [] ans = concatenate(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] concatenate(int[] arr, int n){

        int [] ans = new int[2 * n];

        for(int i = 0; i < n; i++){
            ans[i] = arr[i];
            ans[i+n] = arr[i];
        }
//        for(int i = 0; i < n; i++)
        return ans;
    }
}
