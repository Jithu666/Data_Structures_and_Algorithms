import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
    public static void main(String[] args) {

        int n = 6;

        List<String> res = fizzBuzz(n);
        List<String> ans = new ArrayList<>();
        for(String str : res){
            ans.add("\"" + str + "\"");
        }

        System.out.println(ans);

    }
    public static List<String> fizzBuzz(int n) {

        List<String> fb = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i % 3 == 0  && i % 5 == 0)
                fb.add("FizzBuzz");
            else if(i % 3 == 0)
                fb.add("Fizz");
            else if(i % 5 == 0)
                fb.add("Buzz");
            else
                fb.add(String.valueOf(i));
        }
        return fb;
    }
}
