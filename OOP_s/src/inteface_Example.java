
interface in {

    public void function1();
    public void function2();
}

public class inteface_Example implements in {

    public void function1 (){
        System.out.println("Interface 1 executed.");
    }

    public void function2() {
        System.out.println("Interface 2 executed.");
    }

    public static void main(String[] args) {
        inteface_Example ie = new inteface_Example();

        ie.function1();
        ie.function2();
    }
}
