import java.util.Calendar;
import java.util.Scanner;

public class getDay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        String ans = findDay(day, month, year);
        System.out.println(ans );
    }

    public static String findDay(int day, int month, int year) {

        Calendar c = Calendar.getInstance();

        c.set(year, month-1, day);

        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        int res = c.get(Calendar.DAY_OF_WEEK);

        return days[res-1];
    }

}
