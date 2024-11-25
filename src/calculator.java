public class calculator {
    public static void main(String[] args) {

        operations op = new operations();
        System.out.println("Addition of two numbers is : " + op.add(6, 89));
        System.out.println("Subtraction of two numbers is : " + op.sub(6, 89));
        System.out.println("Multiplication of two numbers is : " + op.mul(6, 89));
        System.out.println("Division of two numbers is : " + op.div(6, 89));

    }
}

class operations {

    public static int add (int num1, int num2) {
        return num1 + num2;
    }

    public static int sub (int num1, int num2) {
        return num1 - num2;
    }

    public static int mul (int num1, int num2) {
        return num1 * num2;
    }

    public static int div (int num1, int num2) {
        return num1 / num2;
    }
}