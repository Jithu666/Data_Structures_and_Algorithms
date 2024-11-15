public class inheritance {
    static class parent{
        public static void print(){
            System.out.println("Parent class Print method invoked!");
        }
    }

    static class child extends parent {
        public static void printChild() {
            System.out.println("Child class print method invoked.");
        }
    }

    public static void main(String[] args) {
//        child p = new child();

//        child c = new parent();
        parent p = new child();
        parent.print();
        child.printChild();
    }
}
