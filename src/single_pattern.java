// Implementation of Single Pattern program in Java.

public class single_pattern {

    // private static variable declaration, so the variable can  be accessed from anywhere in the "Program".
    private static int salary = 80000;

    // create a constructor for the class
    public single_pattern() {

    }

    // As the instance is "Private" create "getter" and "setter methods" for the "variable"
    public static void setSalary(int salary) {
        single_pattern.salary = salary;
    }

    public static int getSalary() {
        if (salary == 0) {
            return 0;
        }
        return salary;
    }

    // create a method to use the variable created.
    public void singleton_method() {
        System.out.println("This is a example Implementation of Singleton Pattern.");
    } // singleton_method ends here.
} // class single pattern ends here.

class elc{
    public static void main(String[] args) {
        single_pattern sp = new single_pattern();

        single_pattern.setSalary(90000);
        sp.singleton_method();
    }
}
