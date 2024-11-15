import java.util.Arrays;

public class methodOverloading {

    public static void main(String[] args) {
        methodOverloading mo = new methodOverloading();

        // Case 1

        /*System.out.print("Method with 0 parameter called : ");
        methodOverloading.print();
        System.out.print("Method with 1 parameter called : ");
        methodOverloading.print(3);
        System.out.print("Method with 2 parameter's called : ");
        mo.print(3,3);*/

//        System.out.println(Float.MIN_VALUE);
//        methodOverloading.print(10.5);


        // case 2

        // calling overloaded method by passing object type as argument

//        methodOverloading.print(new Object());

//        methodOverloading.print("Jithu");

//        methodOverloading.print(null);



        // case 3

//        String and String Buffer class
//        methodOverloading.print("Jithu");

//        StringBuffer sb = new StringBuffer("Jithendra");

//        methodOverloading.print(sb);


        // case 4

        // priority of method calls

//        methodOverloading.print(6);


        // case 5

//        methodOverloading.print(3, 2.0);

//        methodOverloading.print(1.2, 2);

//        methodOverloading.print(6,6);

        // reference not allowed from object creation at runtime


        mo.printClass("Jithu");

        J j = new J();

        j.printClass("Jithu");

        methodOverloading m1 = new J();
        m1.printClass("Jithu");




    }

    public static void print(){
        System.out.println("Method with 0 arguments executed");
        System.out.println("6");
    }

    public static void print(int num1){
        System.out.println("Method with 1 argument executed");
        System.out.println(num1);
    }

    public static void print(double num1){
        System.out.println(num1);
    }

    public static void print(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void print(Object o) {
        System.out.println("Object type " + o);
    }

    public static void print(String name) {
        System.out.println("Name is : "+ name);
    }

    public static void print(StringBuffer sb){
        System.out.println(sb.length());
    }

    public static void print(int... i){
        System.out.println("int.. i method executed");
        System.out.println(Arrays.toString(i));
    }

    public static void print(int num1, double num2){
        System.out.println(num1 + num2);
    }

    public static void print(double num1, int num2){
        System.out.println(num1 + num2);
    }

//    public static void print(int num1, int num2){
//        System.out.println(num1 + num2);
//    }


    public static void printClass(String Name) {
        System.out.println("Class name is methodOverloading");
    }

}

class J extends methodOverloading {
    public static void printClass(String name) {
        System.out.println("Class name is J");
    }
}
