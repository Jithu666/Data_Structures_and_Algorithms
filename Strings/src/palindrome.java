import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        boolean flag = false;
        int i = 0;
        while(i < p.length()){
            int j = p.length()-1;
            if(p.charAt(i) != p.charAt(j)){
//                flag = false;
                break;
            }if(p.charAt(i) == p.charAt(j)){
                i++;
                j--;
                flag = true;
            }
        }
        if(!flag)
            System.out.println("Not a palindrome");
        else
            System.out.println("Palindrome");
    }
}
