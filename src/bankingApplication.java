import java.util.Scanner;

public class bankingApplication {
        private static int bal;

        public bankingApplication(int opening_bal){
            this.bal = opening_bal;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        bankingApplication b = new bankingApplication(1000);

        deposit(amount);
        withdraw(amount);
//        check_balance();
    }
    public static void deposit(int amount) {
        if(amount > 0) {
            bal += amount;
            System.out.println(amount + " deposited in your ac.");
            System.out.println("Total bal in your ac. is : " + bal);
        }
        else{
            System.out.println("Enter valid denomination");
        }
    }

    public static void withdraw (int amount) {
        if(amount > 0) {
            bal -= amount;
            System.out.println(bal + " withdrawn from your ac.");
            System.out.println("Total bal in your ac. is : " + bal);
        }
        else{
            System.out.println("Enter valid denomination");
        }
    }

    public static void check_balance() {
        System.out.println("Total bal in your ac. is : " + bal);
    }
}
