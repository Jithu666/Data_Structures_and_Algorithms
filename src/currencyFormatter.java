import java.util.*;
import java.text.*;

public class currencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
//        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//        System.out.println(franceFormat);

        NumberFormat jpnFormat = NumberFormat.getPercentInstance();
        String jpn = jpnFormat.format(payment);

        System.out.println("Japan: " + jpn);

        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment).replace("\u20B9", "Rs.");
        String china = chinaFormat.format(payment);
//        String france = franceFormat.format(payment);



//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}