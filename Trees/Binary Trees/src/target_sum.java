package in.Java;

public class target_sum extends range_sum_of_bst{

    public boolean has_path(Node root, int target){
        if(root == null){
            return false;
        }
        else if(root.left == null && root.right == null){
            return target == root.data;
        }
        else {
            int required_val = target - root.data;
            return has_path(root.left, required_val) || has_path(root.right, required_val);
        }
    }
}

//class elc {
//    public static void main(String[] args) {
//        target_sum ts = new target_sum();
//
//        ts.insert(5);
//        ts.insert(4);
//        ts.insert(2);
//        ts.insert(8);
//        ts.insert(13);
//        ts.insert(1);
//
//        boolean ans = ts.has_path(ts.root, 26);
//        System.out.println(ans);
//    }
//}
