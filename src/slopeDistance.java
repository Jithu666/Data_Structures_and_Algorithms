import java.lang.*;
import java.io.*;
import java.math.*;
import java.util.Scanner;

public class slopeDistance {

    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();

            int x_max = x1 - y1;
            x_max = Math.abs(x_max);
            int y_max = x2 - y2;
            y_max = Math.abs(y_max);

            System.out.println(Math.max(x_max, y_max));
        }
        sc.close();
    }
}
