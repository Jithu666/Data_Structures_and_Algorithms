package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Traversal extends insertion_Into_Tree{

    // preorder traversal
//    public void preorder() {
//        System.out.print("Preorder Traversal : ");
//        // calling the preorder_traversal helper method.
//        preorder_traversal(root);
//        System.out.println();
//    }

    // inorder traversal
//    public void inorder() {
//        System.out.print("Inorder Traversal : ");
//        // calling the inorder_traversal helper method.
//        inorder_traversal(root);
//        System.out.println();
////        return true;
//    }

    // postorder traversal
//    public void postorder() {
//        System.out.print("Postorder Traversal : ");
//        // calling the postorder_traversal helper method.
//        postorder_traversal(root);
//        System.out.println();
//    }

    // level-order traversal
    public List<List<Integer>> levelorder() {
        System.out.print("Level-Order Traversal");
        // calling the level order_traversal helper method.
        List<List<Integer>> result =  levelorder_traversal();
        return result;
    }

    // preorder traversal
    public void preorder_traversal(Node root) {

        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder_traversal(root.left);
        preorder_traversal(root.right);
    }

    // inorder traversal
    public void inorder_traversal(Node root) {

        if(root == null) {
            return;
        }

        inorder_traversal(root.left);
        System.out.print(root.data + " ");
        inorder_traversal(root.right);
    }

    // postorder traversal
    public void postorder_traversal(Node root) {

        if(root == null) {
            return;
        }

        postorder_traversal(root.left);
        postorder_traversal(root.right);
        System.out.print(root.data + " ");
    }


    // level-order traversal
    public List<List<Integer>> levelorder_traversal() {
        List<List<Integer>> superList = new ArrayList<>();

        if(root == null) {
            return superList;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> sublist = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                Node curr = q.poll();
                sublist.add(curr.data);

                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            superList.add(sublist);
        }
        return superList;
    }
}


//class elc{
//    public static void main(String[] args) {
//
//        Traversal pt = new Traversal();
//        pt.insert(6);
//        pt.insert(4);
//        pt.insert(3);
//        pt.insert(5);
//        pt.insert(2);
//        pt.insert(1);
//        pt.insert(7);
//        pt.insert(8);
//        pt.insert(9);
//        pt.insert(12);
//        pt.insert(10);
//
//        pt.inorder();
//        pt.preorder();
//        pt.postorder();
//
//        List<List<Integer>> ans = pt.levelorder();
//        System.out.println(ans);
//    }
//}