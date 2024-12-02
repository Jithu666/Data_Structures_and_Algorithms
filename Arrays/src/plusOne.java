import java.util.Arrays;

public class plusOne {

    public static void main(String[] args) {
        int[] arr = {9};

        int n = arr.length;

        int[] ans = plusOne(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] plusOne(int[] arr, int n) {

//        while(n-- != 0){

        for(int i = n - 1; i >= 0; i--){

            if(arr[i] < 9) {
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }

        int[] new_num = new int[n + 1];
        new_num[0] = 1;

        return new_num;
    }
}
