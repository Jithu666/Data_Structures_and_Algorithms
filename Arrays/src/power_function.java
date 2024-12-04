public class power_function {

    public static double power(double base, int exponent) {
        double result = 1.0;

        int exp = Math.abs(exponent);

        for(int i = 0; i < exp; i++){
            result *= base;
        }

        return (exponent < 0) ? 1.0 / result : result;
    }

    public static void main(String[] args) {
//        System.out.println((int) Math.pow(2,9));
        double base = 3;
        int exponent = 5;

        double result = power(base, exponent);

        System.out.println(result);
    }
}
