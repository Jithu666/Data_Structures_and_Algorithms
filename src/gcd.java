public class gcd {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 12;

        if(n2 > n1){
            int temp = n2;
            n2 = n1;
            n1 = temp;
        }

        while(n2 != 0){
            int temp = n1 % n2;
            n1 = n2;
            n2 = temp;
        }
        if(n2 == 0){
            System.out.println(n1);
        }
    }
}
