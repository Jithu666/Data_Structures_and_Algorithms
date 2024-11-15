package com.package1.java;

public class protected_Class_Example {
    protected void print() {
        System.out.println("Protected class Called from main method");
    }

    public static void main(String[] args) {
        protected_Class_Example p = new protected_Class_Example();
        p.print();
    }
}
