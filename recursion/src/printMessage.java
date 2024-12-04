import java.util.Scanner;

class printMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of times you want to print your message : ");
        int n = sc.nextInt();
        sc.nextLine();

        // enter the message you want to print on to the console
        System.out.print("enter the message you want to print on to the console : ");
        String message = sc.nextLine();

        message(message, n);
    }

    static void message(String msg, int n) {

        if(n <= 0)
            return;

        System.out.println(msg);
        // Recursive Function Call
        message(msg, n-1);
    }
}
