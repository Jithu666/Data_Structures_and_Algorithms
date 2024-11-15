package com.package2.java;
import com.package1.java.protected_Class_Example;
public class protected_Class extends protected_Class_Example {

    public void display() {
        System.out.println("Calling from the sub class from other package");
        print();
    }

    public static void main(String[] args) {
        protected_Class p = new protected_Class();
//        protected_Class_Example p = new protected_Class_Example(); //we cannot use parent reference to access methods in other package which            are visible under protected access modifier.
        System.out.println("Calling from other package");
        p.print();
        p.display();
    }
}
