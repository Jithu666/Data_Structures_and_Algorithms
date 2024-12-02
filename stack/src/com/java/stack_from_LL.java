package com.java;

public class stack_from_LL {
    static Node top;
    static Node head;
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int d){
            data = d;
            next = null;
            prev = null;
        }

    }
    public stack_from_LL() {
        this.top = null;
    }

    public void push(int data) {

        Node new_Node = new Node(data);

        new_Node.next = top;
        top = new_Node;

        System.out.println(data + " pushed into the top of the stack!");
        return;
    } // push method ends here


    public int pop() {

        if(isEmpty(top)){
            throw new RuntimeException("Stack is Empty, Top Element cannot be deleted");
        }

        int popped_data = top.data;
        top = top.next;
        return popped_data;
    }

    public static int peek() {

        if(isEmpty(top)){
            throw new RuntimeException("Stack is Empty, Top Element cannot be displayed");
        }
        return top.data;
    }

    public static boolean isEmpty (Node top) {

        if(top == null){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        stack_from_LL st = new stack_from_LL();
        st.push(0);
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);

        System.out.println("Top Element is : " + st.peek());
//        System.out.println(head.data);
        System.out.println("Popped Element is :  " + st.pop());

        System.out.println("Top Element is : " + st.peek());
    }

}
