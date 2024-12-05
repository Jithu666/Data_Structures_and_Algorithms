package trees;

import java.util.Stack;

public class iterative_traversals extends Traversal{

    // traversing binary trees through iterative tree traversal techniques without using recursion.
    // inorder traversal
    public void inorder(){
        System.out.print("Inorder Traversal : ");
        root = inorder(root);
        System.out.println();
    }

    // iterative inorder traversal
    public Node inorder(Node root) {
        if(root == null){
            return root;
        }

        Node temp = root;

        Stack<Node> st = new Stack<>();

        while(!st.isEmpty() || temp != null){
            while (temp != null){
                st.push(temp);
                temp = temp.left;
            }
            temp = st.pop();
            System.out.print(temp.data + " ");

            temp = temp.right;
        }
        return root;
    }

    // preorder traversal
    public void preorder(){
        System.out.print("Preorder Traversal : ");
        root = preorder(root);
        System.out.println();
    }

    // iterative preorder traversal
    public Node preorder(Node root){
        if(root == null){
            return root;
        }

        Node temp = root;
        Stack<Node> st = new Stack<>();
        st.push(temp);
        while(!st.isEmpty()){
            temp = st.pop();
            System.out.print(temp.data + " ");

            if(temp.right != null) {
                st.push(temp.right);
            }
            if (temp.left != null){
                st.push(temp.left);
            }
        }
        return root;
    }


    public void postorder(){
        System.out.print("Postorder traversal : ");
        root = postorder(root);
        System.out.println();
    }

    public Node postorder(Node root) {
        if(root == null) {
            return root;
        }

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
//        Node temp = root;
        st1.push(root);

        while(!st1.isEmpty()){
            Node temp = st1.pop();
            st2.push(temp);

            if(temp.left != null){
                st1.push(temp.left);
            }
            if(temp.right != null){
                st1.push(temp.right);
            }
        }

        while(!st2.isEmpty()){
            Node temp = st2.pop();
            System.out.print(temp.data + " ");
        }
        return root;
    }


}

//class elc{
//    public static void main(String[] args) {
//        iterative_traversals it = new iterative_traversals();
//
//        // insert
//        it.insert(6);
//        it.insert(4);
//        it.insert(3);
//        it.insert(5);
//        it.insert(2);
//        it.insert(1);
//        it.insert(7);
//        it.insert(8);
//        it.insert(9);
//        it.insert(12);
//        it.insert(10);
//
////        it.inorder();
////        it.preorder();
//        it.postorder();
//    }
//}
