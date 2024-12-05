package in.Java;

public class minimum_depth extends range_sum_of_bst {
    public int of_binary_tree(Node root) {
        return minDepth_recursive(root);
    }

    public int minDepth_recursive(Node root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null){
            return minDepth_recursive(root.right) + 1;
        }

        if(root.right == null){
            return minDepth_recursive(root.left) + 1;
        }

        return Math.min(minDepth_recursive(root.left), minDepth_recursive(root.right) + 1);
    }
}

//class elc extends range_sum_of_bst{
//    public static void main(String[] args) {
//        minimum_depth md = new minimum_depth();
//
//        md.insert(2);
//        md.insert(3);
//        md.insert(4);
//        md.insert(5);
//        md.insert(6);
//
//        int ans = md.of_binary_tree(root);
//        System.out.println(ans);
//    }
//}