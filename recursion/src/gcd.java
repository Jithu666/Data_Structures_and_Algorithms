public class gcd {
    public static void main(String[] args) {
        int num1 = 56, num2 = 98;

        System.out.println("GCD of " + num1 + " and " + num2 + " is : " + findGCD(num1, num2));
    }

    static int findGCD(int num1, int num2){

        if(num2 == 0)
            return num1;

        return findGCD(num2, num1 % num2);
    }

}
