import java.util.ArrayList;
import java.util.Arrays;

public class triangles {
    public static void main(String[] args) {

        String[][] arr =  {{"3", "3", "3"}, {"5", "5", "8"}, {"1", "2", "3"}, {"7", "10", "5"}, {"6", "6", "6"}, {"7", "7", "12"}};

        for(int i = 0; i < arr.length; i++) {
            int a = Integer.parseInt(arr[i][0]);
            int b = Integer.parseInt(arr[i][1]);
            int c = Integer.parseInt(arr[i][2]);

            if (findTriangle(a, b, c)) {
                if (a == b && b == c)
                    System.out.println("Equilateral");
                if ((a == b || b == c || c == a ))
                    System.out.println("Isosceles");
                else
                    System.out.println("Not a triangle");
            }
        }
    }

    public static boolean findTriangle(int a, int b, int c){
        if((a + b > c) && (b + c > a) && (c + a > b))
            return true;
        return false;
    }
}
