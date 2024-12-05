import javax.swing.plaf.PanelUI;
import java.util.Arrays;

public class two_sum {
    public static void main(String[] args) {

        twosum ts = new twosum();
        int[] arr = {2, 3, 5, 4};
        int target = 6;

        int[] res = ts.find_index(arr, target);
        System.out.println("Target's two sum is : " + Arrays.toString(res));
    }
}

class twosum {
    public int[] find_index(int[] arr, int target){

        int left = 0, right = arr.length - 1;

        while(left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return new int[]{arr[left], arr[right]};
            } else if(sum > target){
                right--;
            } else {
                left++;
            }
        }
        return new int[]{ };
    }
}