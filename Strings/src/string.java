import java.util.Scanner;

public class string {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */


        int a = A.length();
        int b = B.length();

        int sum = a+b;
        System.out.println(sum);
        int n = Math.min(a,b);
//        System.out.println(n);
        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(A.charAt(i) > B.charAt(i)){
                flag  = true;
                break;
            }
            else if(A.charAt(i) < B.charAt(i)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Yes");
        }
        if(!flag){
            System.out.println("No");
        }
        String c = String.valueOf(A.charAt(0));
        String d = String.valueOf(B.charAt(0));

        StringBuilder sb = new StringBuilder();
        sb.append(c.toUpperCase());

        for(int i = 1; i < A.length(); i++){
            sb.append(A.charAt(i));
        }
        sb.append(" ");
        sb.append(d.toUpperCase());
        for(int i = 1; i < B.length(); i++){
            sb.append(B.charAt(i));
        }
        System.out.println(sb);
    }
}
