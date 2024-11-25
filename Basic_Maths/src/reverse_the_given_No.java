import java.util.Scanner;

public class reverse_the_given_No {

    public static void main(String args[]){
       Scanner Sc = new Scanner(System.in);
       int reversed = 0;
        
       int num = Sc.nextInt();
        
       for(;num != 0; num/= 10){
        int digit = num % 10;
        reversed = reversed*10+digit;
       }
       System.out.println("reversed number:" + reversed);
    }
}