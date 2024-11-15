package com.package1.java;

public class private_class_example {
    private void private_print() {
        System.out.println("Called within the Same class");
    }

    public void print_private() {
        System.out.println("Called from the same class");
        private_print();
    }

}

class blc {
    public static void main(String[] args) {

        private_class_example p = new private_class_example();
//        p.private_print(); // this cannot be called because the methods declared with private can be accessed only within the same class

      p.print_private();

    }
}