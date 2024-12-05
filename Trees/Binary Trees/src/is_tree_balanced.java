package in.Java;

public class is_tree_balanced extends range_sum_of_bst{
    public boolean is_balanced(Node root){
        return maxDepth(root) != -1;
    }

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int l_height = maxDepth(root.left);
        int r_height = maxDepth(root.right);

        if (l_height == -1 || r_height == -1)
            return -1;

        if (Math.abs(l_height - r_height) > 1)
            return -1;

        return Math.max(l_height, r_height) + 1;
    }
}

class elc {
    public static void main(String[] args) {

        is_tree_balanced it = new is_tree_balanced();

        it.insert(4);
        it.insert(5);
        it.insert(6);
        it.insert(8);
        it.insert(7);

        boolean ans = it.is_balanced(it.root);
        System.out.println(ans);

    }
}

