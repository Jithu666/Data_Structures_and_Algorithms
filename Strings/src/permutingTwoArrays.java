import java.util.Arrays;

public class permutingTwoArrays {
    public static void main(String[] args) {

        int[] A = {4,4,3,2,1,4,4,3,2,4};
        int[] B = {5,1,0,1,6,4,1,7,4,3};
        int k = 4;
        String ans = permute(A, B, k);
        System.out.println(ans);
    }

    public static String permute(int[] A, int[] B, int k) {

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < B.length / 2; i++) {

            int temp = B[i];
            B[i] = B[B.length - i - 1];
            B[B.length - i - 1] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] + B[i] < k) {
                return "NO";
            }
        }
        return "YES";
    }
}