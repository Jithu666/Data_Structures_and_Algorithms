package in.Java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class maximum_depth extends range_sum_of_bst {

    // here we will be implementing the Node class & insert methods from range_sum_of_bst class
//    public List<List<Integer>> of_binary_tree() {

    // iterative approach

    public int of_binary_tree() {
        List<List<Integer>> superlist = new LinkedList<>();

        if(root == null) {
//            return superlist;
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> sublist = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                sublist.add(current.data);

                if(current.left != null) {
                    q.offer(current.left);
                }
                if(current.right != null) {
                    q.offer(current.right);
                }
            }
            superlist.add(sublist);
        }

        int count = 0;
        for(List<Integer> i : superlist){
            count++;
        }

//        return superlist;
        return count;
    }

    // recursive way
    public int maxDepth(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

}

//class elc {
//    public static void main(String[] args) {
//        maximum_depth md = new maximum_depth();
////
//        md.insert(5);
//        md.insert(4);
////        md.insert(3);
////        md.insert(2);
////        md.insert(1);
////        md.insert(6);
////        md.insert(7);
////        md.insert(8);
////        md.insert(9);
////
////
////        List<List<Integer>> ans = md.of_binary_tree();
////        System.out.println(ans);
////        int ans = md.of_binary_tree();
////        System.out.println(ans);
//
//        int ans = md.maxDepth(md.root);
//        System.out.println(ans);
//
//    }
//}