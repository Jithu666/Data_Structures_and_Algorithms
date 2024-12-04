import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int n2 = sc.nextInt();

        int lcm = -1;

        int temp = Math.min(n1, n2);
        for(int i = temp; i >= 1; i--){
            if(n1 % i == 0 && n2 % i == 0){
                lcm = i;
                break;
            }
        }

        System.out.println("LCM is :" + (n1 * n2)/lcm);

    }
}
