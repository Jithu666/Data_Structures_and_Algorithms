package com.java;

class Node{
    int data;
    Node next;

    public Node(int d){
        data = d;
        next = null;
    } // end of constructor
} // end of class node

public class stack_Using_LL {

    private Node top;

    stack_Using_LL(){
        this.top = null;
    }


    // push operation

    public void push(int data){

        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
    } // end of push operation


    // pop operation

    public void pop(){

        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        } else{
            int popped = top.data;
            System.out.println(popped);
        }
    } // end of pop operation


    // peek operation

    public void peek(){

        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        } else{
            System.out.println("Top Element in the stack is " + top.data);
        }
    } // end of peek function


    //  is stack empty

    public boolean isEmpty(){

        if(top != null){
            return false;
        }
        return true;
    } // end of isEmpty()


    // display the elements of the stack

    public void display(){

        if(isEmpty()){
            throw new RuntimeException("Stack is Empty");
        } else{
            Node temp = top;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            } // end of while loop
            System.out.println();
        } // end of else condition
    } // end of display ()


    // main ()

    public static void main(String[] args) {

        stack_Using_LL st = new stack_Using_LL();

//        st.peek();
//        st.pop();
        st.push(11);
        st.push(14);
        st.display();
        st.peek();
        st.pop();

        st.isEmpty();

    }


}
