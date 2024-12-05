import java.util.Scanner;

public class area {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.print("Enter Breadth : ");
     int B = sc.nextInt();
     System.out.print("Enter Height : ");
     int H = sc.nextInt();

     if(B <= 0 || H <= 0) {
         System.out.println("Java.lang.Exception Breadth and Height should be positive");
     } else {
         System.out.println("Area of parallelogram is : " + B*H);
        }
    }
}
