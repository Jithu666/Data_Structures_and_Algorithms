import java.util.Arrays;
import java.util.HashSet;

public class rm_duplicates {

    public String[] remove(String[] str){
        HashSet<String> hs = new HashSet<>(Arrays.asList(str));

        return hs.toArray(new String[0]);
    }

    public static void main(String[] args) {
        rm_duplicates rm = new rm_duplicates();
        String[] s = {"Jithu", "Jithu", "githu", "githu", "Gowda"};
        String[] ans = rm.remove(s);
        System.out.println(Arrays.toString(ans));
    }
}
