//package com;

public class abstract_Class_Example {

    public static void main(String[] args) {

       abstract_Class_Example ae = new abstract_Class_Example();

       derived d = new derived() {
           @Override
           public void print() {
               super.print();
               super.Display();
           }
       };
       child c = new child() {
           @Override
           public void Display() {
               super.Display();
               super.print();
           }
       };

       d.print();
//       d.Display();

//       c.print();
       c.Display();
    }

    abstract static class abstract_example{

        public abstract void print();
        public abstract void Display();

    }

    abstract static class derived extends abstract_example {

        public void print() {
            System.out.println("Abstract Class Print method Implemented from derived class");
        }
        public void Display() {
            System.out.println("Abstract Class Display method Implemented from derived class");
        }

    }

    abstract static class child extends abstract_example {
//
        public void Display() {
            System.out.println("Abstract Class Display method Implemented from child class");
        }
        public void print() {
            System.out.println("Abstract Class Print method Implemented from child class");
        }
    }

}
