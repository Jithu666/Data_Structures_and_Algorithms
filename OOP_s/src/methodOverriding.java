import java.io.IOException;

public class methodOverriding {

    public static void display() {
        System.out.println("display method Method Overloading class invoked at runtime");
    }

    public static Number print(float num1, float num2){
        System.out.println("Method Overloading class's method invoked");
        return num1+num2;
    }

    // private method cannot be Overridden
    private static void print(String name) {
        System.out.println("Print method from methodOverloading class class called,");
    }

    // parent class method declared as final, then the child class cannot override the parent class finale method, once any method declared as final, no class or method can override such classes and methods.
    public static void print(Object o) {
        System.out.println("Print method from methodOverloading class class called,");
    }

    // increase and decrease in the scope of method
    protected static void print(Character c) {
        System.out.println("Print method from methodOverloading class class called,");
    }


    // if the child class throws an exception then parent class methods should also throw the same exception or its parent.
    public static void print(Double d1) throws Throwable{
        System.out.println("Print method from methodOverloading class class called,");
    }

    public static void print() throws Exception{
        System.out.println("Print method from methodOverloading class class called,");
    }




    // Derived Class

    public static class derived extends methodOverriding{

        public static void display() {
            System.out.println("display method derived class invoked at runtime");
        }

        public static Integer print(float num1, float num2) {
            System.out.println("Derived class's method invoked");
//            String s = "Jithu";
//            return s;
            return (int)((int)num1 + num2);
        }

        private static void print(String Name) {
            System.out.println("Independent print method from derived class called,");
        }

        public static final void print(Object o) {
            System.out.println("Independent print method from derived class called,");
        }

//        static void print() {
//            System.out.println("Independent print method from derived class called,");
//        }
                    // Compile time error trying to assign weaker access specifier.

        public static void print(Character c) {
            System.out.println("Independent print method from derived class called,");
        }

        //
        public static void print() throws IOException {
            System.out.println("Print method from derived class class called,");
        }






    }


    // Main method

    public static void main(String[] args) throws Throwable {

        methodOverriding mo = new methodOverriding();

//        methodOverriding.display();

        derived d = new derived();

//        d.display();

//        derived d1 = new methodOverriding.derived();

//        d1.display();

        methodOverriding mor = new derived();

//        mor.display();


//        System.out.println(methodOverriding.print(1.2f, 3.6f));
//
//        System.out.println(derived.print(3f, 4f));
//
//        System.out.println(derived.print(1.2f, 4.3f));

        methodOverriding.print();
        derived.print();

//            d1.print();
//            mor.print();

    }

}
