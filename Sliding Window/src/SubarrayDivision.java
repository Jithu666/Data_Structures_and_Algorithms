import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>(Arrays.asList(2,2,1,3,2));

        int d = 4, m = 2;

        count(list, d, m);
    }

    static void count(List<Integer> list, int d, int m){
        int sum = 0, cnt = 0;

        for(int i = 0; i < m; i++){
            sum += list.get(i);
        }

        if(sum == d)
            cnt++;

        for(int i = m; i < list.size(); i++){
            sum = sum - list.get(i - m) + list.get(i);

            if(sum == d){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
