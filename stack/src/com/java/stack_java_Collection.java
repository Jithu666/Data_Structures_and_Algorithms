package com.java;

public class stack_java_Collection {

    int top = -1;
    int max = 6;

    int arr[] = new int[max];
    void push(int data){
        try {
            if(top > max - 1){
                System.out.println("Stack Overflow");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

        arr[++top] = data;
        System.out.println(data + " Pushed into the top of the Stack");
    }

    void pop() {
        try {
            if (top < 0) {
                System.out.println("Stack Underflow");
            }
        } catch (Exception e) {
            System.out.println("Stack is Empty");
        }

        int x = arr[top--];
        System.out.println(x + " deleted from the top of the stack");
    }


    void peek() {
        try{
            if(top < 0) {
                System.out.println("Stack is Empty");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        int x = arr[top];
        System.out.println();
        System.out.println(x  + " is the top element in the stack");
    }




    public static void main(String[] args) {

        stack_java_Collection sjc = new stack_java_Collection();
        sjc.push(3);
        sjc.push(4);
        sjc.push(5);
//        sjc.push(3);
//        sjc.push(3);
        sjc.pop();
        sjc.peek();
    }

}
