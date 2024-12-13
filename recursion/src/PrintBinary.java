import javax.sound.sampled.AudioSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N : ");
        int n = sc.nextInt();

        List<String> res = new ArrayList<>();
        solve(n, res, new StringBuilder(), 0, 0);

        // print all N-Bit Binary Numbers.
        System.out.println("N-Nit Binary Numbers where One's greater than Zero's are :");
        for(String s : res){
            System.out.println(s);
        }
    }

    public static void solve(int n, List<String> res, StringBuilder sb, int ones, int zeros) {

        // Base case
        if(n == 0){
            res.add(sb.toString());
            return;
        }

        // Recursive Function Calls:
        sb.append("1");
        solve(n-1, res, sb, ones+1, zeros);
        sb.deleteCharAt(sb.length()-1);

        if (ones > zeros) {
            sb.append("0");
            solve(n-1, res, sb, ones, zeros+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}