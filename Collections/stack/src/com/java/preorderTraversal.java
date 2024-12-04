import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class node {
    int data;
    node left, right;

    node(int val) {
        data = val;
        left = right = null;
    }
}

public class preorderTraversal {

    node root;

    preorderTraversal() {
        root = null;
    }


    public void insert(int data) {
        root = insertTree(data, root);
        System.out.println(data+" inserted");
    }

    public node insertTree(int data, node root) {

        if (root == null) {
            root = new node(data);
//            return root;
        }

        node temp = root;
        node parent = null;

        while(temp != null) {
            parent = temp;
            if(data < temp.data){
                temp = temp.left;
            } else if(data > temp.data) {
                temp = temp.right;
            } else{
                return root;
            }
        }
        if(data < parent.data){
            parent.left = new node(data);
        } else {
            parent.right = new node(data);
        }
        return root;
    }

    public void preorder() {
        List<Integer> list = new ArrayList<>();
//        preorderTraversal(root, list);
        preorderTraversalUsingStack(root, list);
        System.out.println(list);
    }

    public void preorderTraversal(node root, List<Integer> res) {
        if(root == null){
            return;
        }

        res.add(root.data);
        preorderTraversal(root.left, res);
        preorderTraversal(root.right, res);
    }

    public List<Integer> preorderTraversalUsingStack(node root, List<Integer> res) {
        if(root == null){
            return res;
        }

        Stack<node> st = new Stack<>();
        st.push(root);
        node temp = root;
//        st.push(temp);

        while(!st.isEmpty()) {
            temp = st.pop();
            res.add(temp.data);

            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left != null) {
                st.push(temp.left);
            }
        }
        return res;
    }



}

//class elc {
//    public static void main(String[] args) {
//
//        preorderTraversal pt = new preorderTraversal();
//        pt.insert(2);
//        pt.insert(1);
//        pt.insert(3);
//        pt.insert(4);
//        pt.insert(5);
//        pt.insert(6);
//
//        pt.preorder();
//
//    }
//}
