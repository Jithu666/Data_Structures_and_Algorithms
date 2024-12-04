import java.util.Stack;
public class bst_Iterator {
    class Node {
        int data;
        Node left, right;

        public Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node root;
    Stack<Node> st;
    bst_Iterator() {
        root = null;
        st = new Stack<>();
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if(root == null) {
            root = newNode;
            return;
        }
        Node temp = root;
        Node parent = null;
        while (temp != null) {
            parent = temp;
            if(newNode.data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        if(newNode.data < parent.data) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    public void inorder(Node root) {
        if(root == null) {
            return;
        }
        push(root);
    }

    public void push(Node root) {

        while(root != null) {
            st.push(root);
            root = root.left;
        }
        int res = next();
        System.out.println(res);
    }

    public int next() {
        Node temp = st.pop();
        if(temp.right != null){
            push(temp.right);
        }
        return temp.data;
    }

    public boolean hasNext() {
        return !st.isEmpty();
    }

}

//class elc {
//    public static void main(String[] args) {
//        bst_Iterator bi = new bst_Iterator();
//
//        bi.insert(5);
//        bi.insert(6);
//        bi.insert(7);
//        bi.insert(1);
//        bi.insert(2);
//        bi.insert(3);
//
//        bi.inorder(bi.root);
//
//        boolean res = bi.hasNext();
//        System.out.println(res);
//    }
//}