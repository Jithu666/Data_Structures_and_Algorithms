import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int n = arr.length;

        solution s = new solution();
        System.out.println("Array before moving zeroes :" + Arrays.toString(arr));
        int[] res = s.move_zeroes(arr, n);
        System.out.println("Array after moving zeroes :" + Arrays.toString(res));
    }
}

class solution {
    public int[] move_zeroes(int[] arr, int n){
        int i = 0, j = 0;

        while(j < n){
            if(arr[j] == 0){
                j++;
            } else {
                arr[i] = arr[j];
                i++;
                j++;
            }
        }
        while(i < n){
            arr[i] = 0;
            i++;
        }

        return arr;
    }
}
