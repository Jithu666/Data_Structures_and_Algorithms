public class methodSignature {

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {

        methodSignature ms = new methodSignature();

//        System.out.println("Function call with Arguments type as Integers");
//        System.out.println(methodSignature.add(3, 3));
//        System.out.println("Function call with Arguments type as Double");
//        System.out.println(methodSignature.add(3.3, 2.7));


        System.out.println("Maximum Value of Integer Class is "+Integer.MAX_VALUE);
        System.out.println("Minimum Value of Integer Class is "+Integer.MIN_VALUE);
    }

}
