import java.util.Scanner;

public class typeCasting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String res = String.valueOf(n);

        if(!res.isEmpty()){
            System.out.println("Good Job!");
        } else{
            System.out.println("Wrong Answer!");
        }

    }

}
