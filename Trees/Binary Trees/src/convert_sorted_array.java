package in.Java;

public class convert_sorted_array extends range_sum_of_bst{
    Node root = null;

    public Node into_binary_search_tree(int[] nums, int start, int end){
//        root.data = nums[0];

        root = insert(nums, start, end);
        return root;
    }

    public Node insert(int[] nums, int start, int end) {

        if(start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        Node node = new Node(nums[mid]);

        node.left = insert(nums, start, mid-1);
        node.right = insert(nums, mid+1, end);
        return node;
    }

    public void display(Node root) {
        if(root == null){
            return;
        }
        Node temp = root;

        display(root.left);
        System.out.print(root.data + " ");
        display(root.right);
    }
}

//class elc extends range_sum_of_bst{
//    public static void main(String[] args) {
//        convert_sorted_array cs = new convert_sorted_array();
//
//        int[] nums = {-10,-3,0,2,4,6};
//
//        Node root = cs.into_binary_search_tree(nums, 0, nums.length-1);
//
//        cs.display(root);
//    }
//}

