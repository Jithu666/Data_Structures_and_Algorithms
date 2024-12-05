import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class first_Negative_Integer {
    public static void main(String[] args) {

        int[] arr = {0,1,-1,2,3,4,-7,-6,-6};
        int k = 3;

        firstNegative_Integer fni = new firstNegative_Integer();
        int[] res = fni.in_window_of_size_k(arr, k);
        System.out.println(Arrays.toString(res));
    }
}

class firstNegative_Integer {
    public int[] in_window_of_size_k(int[] arr, int k){
        int n = arr.length;
        int[] res = new int[n - k + 1];
        Queue<Integer> negatives = new LinkedList<>();

        for(int i = 0; i < k; i++){
            if(arr[i] < 0){
                negatives.add(i);
            }
        }

        res[0] = negatives.isEmpty() ? 0 : arr[negatives.peek()];

        for(int i = k; i < n; i++){
            if(!negatives.isEmpty() && negatives.peek() < i - k + 1){
                negatives.poll();
            }

            if(arr[i] < 0){
                negatives.add(i);
            }
            res[i - k+ 1] = negatives.isEmpty() ? 0 : arr[negatives.peek()];
        }
        return res;
    }
}