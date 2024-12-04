import java.util.Arrays;
import java.util.Comparator;

public class sort_an_array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 15, 5, 8, 2};

        int[][] pairs = new int[arr.length / 2][2];
        for (int i = 0; i < arr.length; i+=2) {
            pairs[i / 2][0] = arr[i];
            pairs[i / 2][1] = arr[i + 1];
        }

        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] pair1, int[] pair2) {
                int sum1 = pair1[0] + pair1[1];
                int sum2 = pair2[0] + pair2[1];
                return Integer.compare(sum1, sum2);
            }
        });

        int[] sortedArray = new int[arr.length];
        for (int i = 0; i < pairs.length; i++) {
            sortedArray[i*2] = pairs[i][0];
            sortedArray[i *2  + 1] = pairs[i][1];
        }

        System.out.println(Arrays.toString(sortedArray));
    }
}
