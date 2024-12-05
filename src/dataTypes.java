import java.util.Scanner;

public class dataTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of test cases : ");
        int q = sc.nextInt();


        while(q-- > 0) {

            System.out.print("Provide the Integer Input : ");

            try{
            Long n = sc.nextLong();
                System.out.println(n + " Fits in ");
                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE){
                    System.out.println("BYTE");
                    System.out.println("SHORT");
                    System.out.println("Integer");
                    System.out.println("Long");
                } else if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE){
                    System.out.println("SHORT");
                    System.out.println("INT");
                    System.out.println("LONG");
                } else if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("INTEGER");
                    System.out.println("LONG");
                } else if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("LONG");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere");
            }
        }
        System.out.println();
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
    }


}
