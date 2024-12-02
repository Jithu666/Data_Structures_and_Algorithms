import java.util.Arrays;

public class arrayAfterKMultiplications {

    public static void main(String[] args) {
        int[] arr = {2,1,3,5,6};
        int k = 5;
        int multiplier = 2;

        int[] res = getFinalState(arr, k, multiplier);
        System.out.println(Arrays.toString(res));
    }

    public static int[] getFinalState(int[] arr, int k, int multiplier) {

//        int [] ans = new int[arr.length];

//        int min_ele = arr[0];
//        int min_index = 0;
        while(k-- > 0){
            int min_ele = arr[0];
            int min_index = 0;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] < min_ele){
                    min_ele = arr[i];
                    min_index = i;
                }
            }
            arr[min_index] = min_ele * multiplier;
        }
        return arr;
    }
}
