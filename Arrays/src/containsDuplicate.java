import java.util.Arrays;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1};

        boolean ans = containsDUplicate(arr);
        System.out.println(ans);
    }
    public static boolean containsDUplicate(int [] nums) {

        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
}
