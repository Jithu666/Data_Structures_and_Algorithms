import java.util.Scanner;

public class tempConversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Temperature in oCelsius : ");
//        double temp = sc.nextDouble();

//        double ans = cToF(temp);
//        System.out.println("Celsius " + temp + " in Fahrenheit is : " + ans);

        System.out.print("Enter Temperature in oFahrenheit : ");
        double temp = sc.nextDouble();
        double res = fToC(temp);
        System.out.println("Fahrenheit " + temp + " in Celsius is : " + res);
    }

    public static double cToF(double temp) {

        double res = (((9*temp)/5 + 32));

        return res;
    }

    public static double fToC(double temp){

        return (5 * (temp - 32))/9;
    }
}
