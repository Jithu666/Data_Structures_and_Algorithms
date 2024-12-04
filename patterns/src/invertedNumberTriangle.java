import java.util.Scanner;

public class invertedNumberTriangle {
    public static void main(String[] args) {

        int n = 4;

        int i, j, a;
         for (i = n; i >= 1; i--) {
	        if (i % 2 == 0) {
	            a = (i * (i + 1)) / 2;
	            for (j = 1; j <= i; j++) {
		            System.out.print (a--);
	            }
	        }
	        else {
	            a = (i * (i - 1)) / 2 + 1;
	            for(j = 1; j <= i; j++) {
		            System.out.print (a++);
	            }
	        }
	        System.out.println ();
        }
    }
}