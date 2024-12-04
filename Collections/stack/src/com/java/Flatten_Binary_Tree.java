//class Node {
//    int data;
//    node left, right;
//
//    Node(int val) {
//        data = val;
//        left = right = null;
//    }
//}
//public class Flatten_Binary_Tree {
//    node root;
//
//    // insert ops
//    public void insert (int data) {
//        root = insertTree(root, data);
//        System.out.println(data + " inserted");
//    }
//
//    public node insertTree(node root, int data) {
//
//        if(root == null) {
//            return new node(data);
//        }
//        node parent = null;
//        node temp = root;
//        while(temp != null) {
//            parent = temp;
//            if(data < temp.data){
//                temp = temp.left;
//            } else if(data > temp.data) {
//                temp = temp.right;
//            } else{
//                return root;
//            }
//        }
//        if(data < parent.data){
//            parent.left = new node(data);
//        } else {
//            parent.right = new node(data);
//        }
//        return root;
//    }
//
//    // Tree to LL
//    public void to_LinkedList() {
//        flatten(root);
//        printTree(root);
//        System.out.println();
//    }
//
//    public void flatten(node root) {
//
//        if(root == null){
//            return;
//        }
//        node rightSubTree = root.right;
//        root.right = root.left;
//        root.left = null;
//
//        node temp = root;
//        while(temp.right != null) {
//            temp = temp.right;
//        }
//        temp.right = rightSubTree;
//
//        flatten(root.right);
//
//        // Using Stack.
//
////        Stack<Node> st = new Stack<>();
////        st.push(root);
////
////        while(!st.isEmpty()) {
////            Node temp = st.pop();
////
////            if(temp.right != null)
////                st.push(temp.right);
////            if(temp.left != null) {
////                st.push(temp.left);
////            }
////
////            if(!st.isEmpty()) {
////                temp.right = st.peek();
////            }
////            temp.left = null;
////        }
//    }
//
//    public void printTree(node root) {
//        if(root == null) {
//            return;
//        }
//        node temp = root;
//        while(temp != null) {
//            System.out.print(temp.data + " ");
//            temp = temp.right;
//        }
//    }
//}
//
////class elc{
////    public static void main(String[] args) {
////        Flatten_Binary_Tree fb = new Flatten_Binary_Tree();
////
////
//////        fb.to_LinkedList();
////        fb.insert(1);
////        fb.insert(2);
////        fb.insert(5);
////        fb.insert(3);
////        fb.insert(4);
////        fb.insert(6);
////
////        fb.to_LinkedList();
//////        fb.print();
////    }
////}
