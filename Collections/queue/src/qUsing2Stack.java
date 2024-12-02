import java.util.*;

public class qUsing2Stack {

    Stack<Integer> st;
    Stack<Integer> st1;

    public qUsing2Stack(){
        st = new Stack<>();
        st1 = new Stack<>();
    }


    public void enqueue(int data){
        st.push(data);
    }

    public int dequeue(){

        if(st.isEmpty() && st1.isEmpty()){
            System.out.println("Queue is Empty.");
            return -1;
        }
        else{
            if(st1.isEmpty()){
                while(!st.isEmpty()){
                    st1.push(st.pop());
                }
            }
        }
        return st1.pop();
    }

    public int peek(){
        if(st.isEmpty() && st1.isEmpty()){
            System.out.println("Queue is Empty.");
            return -1;
        }

        if(!st1.isEmpty()){
            while(!st.isEmpty()){
                st1.push(st.pop());
            }
        }
        return st1.peek();
    }

    public boolean isEmpty(){
        return st.isEmpty() && st1.isEmpty();
    }

    public static void main(String[] args) {

        qUsing2Stack q = new qUsing2Stack();
        System.out.println(q.isEmpty());
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
//        System.out.println(q.peek());
        System.out.println(q.dequeue());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());

    }
}
