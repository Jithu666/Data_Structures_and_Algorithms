package in.Java;

import java.util.LinkedList;
import java.util.Queue;

public class invert_binary_tree extends range_sum_of_bst {

//    Node root = null;

    public Node invertTree(Node node) {
        if(node == null) {
            return null;
        }

        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertTree(node.left);
        invertTree(node.right);

        return node;
    }
//    public List<Integer> invertTree(Node root) {
//
//        List<Integer> list = new LinkedList<>();
//        if(root == null) {
//            return list;
//        }
//
//        Queue<Node> q = new LinkedList();
//        q.offer(root);
//
//        while(!q.isEmpty()){
//            Node curr = q.poll();
//            list.add(curr.data);
//
//            if(curr.left != null)
//                q.offer(curr.left);
//            if(curr.right != null)
//                q.offer(curr.right);
//            }
//        return list;
//    }

    public void printTree(Node root){
        if(root == null) {
            System.out.println("[]");
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        StringBuilder sb = new StringBuilder("[");

        while(!q.isEmpty()) {
            Node curr = q.poll();

            if(curr != null) {
                sb.append(curr.data + ",");
                q.offer(curr.left);
                q.offer(curr.right);
            }// else {
//                sb.append("null.");
//            }
        }

        if(sb.length() > 1){
            sb.setLength(sb.length() - 1);
        }
        sb.append("]");
        System.out.println(sb);
    }
}


//class elc extends range_sum_of_bst{
//    public static void main(String[] args) {
//        invert_binary_tree ib = new invert_binary_tree();
//
//        ib.insert(4);
//        ib.insert(2);
//        ib.insert(7);
//        ib.insert(1);
//        ib.insert(3);
//        ib.insert(6);
//        ib.insert(9);
//
//        root = ib.invertTree(root);
//
//        ib.printTree(root);
//    }
//}
