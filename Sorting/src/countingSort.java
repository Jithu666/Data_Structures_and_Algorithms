import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class countingSort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(6,1,2,3,4,5,6,6));
        List<Integer> res = sort(arr);
        System.out.println(res);
    }

    public static List<Integer> sort(List<Integer> arr){
        List<Integer> ans = new ArrayList<>();

        int[] res = new int[10];
        for(int i : arr){
            res[i]++;
        }

        for(int i : res){
            ans.add(i);
        }
        return ans;
    }
}
