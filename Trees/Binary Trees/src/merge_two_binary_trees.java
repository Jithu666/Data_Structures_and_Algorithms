package in.Java;

public class merge_two_binary_trees extends range_sum_of_bst {
    public Node merge(Node root1, Node root2){

        if(root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        root1.data += root2.data;

        root1.left = merge(root1.left, root2.left);
        root1.right = merge(root1.right, root2.right);

        return root1;
    }

    public void printTree(Node root){
        if(root == null){
            return;
        }

        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }
}

//class elc extends range_sum_of_bst{
//
//    static Node root1;
//    static Node root2;
//
//    public static void main(String[] args) {
//        merge_two_binary_trees mt = new merge_two_binary_trees();
//        merge_two_binary_trees mt2 = new merge_two_binary_trees();
//
//        mt.insert(1);
//        mt.insert(2);
//        mt.insert(3);
//        mt.insert(4);
//        root1 = root;
//
//        mt2.insert(1);
//        mt2.insert(2);
//        mt2.insert(5);
//        mt2.insert(6);
////        mt2.insert(7);
//        root2 = root;
//
//        Node mergedRoot = mt.merge(root1, root2);
//        System.out.print("Merged Tree (In Order) : ");
//        mt.printTree(mergedRoot);
//    }
//}