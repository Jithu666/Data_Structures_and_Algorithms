import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();

        grades(m1, m2, m3, m4);
    }

    public static void grades(int m1, int m2, int m3, int m4) {

        int total = m1 + m2 + m3 + m4;
        int avg = total / 4;

        if(avg > 90){
            System.out.println("Grade : A+");
        }
        else if (avg > 80 && avg < 90){
            System.out.println("Grade : A");
        }
        else if (avg > 70 && avg < 80){
            System.out.println("Grade : B+");
        }else if (avg > 60 && avg < 70){
            System.out.println("Grade : B");
        }else if (avg > 50 && avg < 60){
            System.out.println("Grade : C+");
        }else if (avg > 40 && avg < 50){
            System.out.println("Grade : C");
        }
    }
}
