import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class postorderTraversal {

    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node root;

    postorderTraversal() {
        root = null;
    }

    public void postorder() {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        System.out.println(list);
    }

    public static void postOrder(Node root, List<Integer> list) {


        if (root == null) {
            return;
        }

        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();

        st1.push(root);
        while (!st1.isEmpty()) {
            Node temp = st1.pop();
            st2.push(temp);

            if (temp.left != null)
                st1.push(temp.left);
            if (temp.right != null)
                st1.push(temp.right);

        }

        while (!st2.isEmpty()) {
            Node var = st2.pop();
            list.add(var.data);
        }
    }

    public void insert(int data) {

        root = insertTree(root, data);
        System.out.println();
    }

    public Node insertTree(Node root, int data) {
        Node new_Node = new Node(data);
        if (root == null) {
            root = new_Node;
            return root;
        }

        Node temp = root;
        Node parent = null;

        while (temp != null) {
            parent = temp;

            if (new_Node.data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }

        if (new_Node.data < parent.data) {
            parent.left = new_Node;
        } else {
            parent.right = new_Node;
        }
        return root;
    }
}

//class elc {
//    public static void main(String[] args) {
//
//        postorderTraversal pt = new postorderTraversal();
//        pt.insert(2);
//        pt.insert(1);
//        pt.insert(3);
//        pt.insert(4);
//        pt.insert(5);
//        pt.insert(6);
//
//        pt.postorder();
//
//    }
//}

