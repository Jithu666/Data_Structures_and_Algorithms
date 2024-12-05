package in.Java;

public class is_symmetric extends range_sum_of_bst{
    public boolean isSymmetric(Node root){

        if(root == null){
            return true;
        }
        return isMirror(root.left, root.right);
    }

    public boolean isMirror(Node sr1, Node sr2){

        if(sr1 == null && sr2 == null){
            return true;
        }
        else if(sr1== null || sr2 == null){
            return false;
        }
        return (sr1.data == sr2.data) && isMirror(sr1.left, sr2.right) && isMirror(sr1.right, sr2.left);
    }
}

//class elc {
//    public static void main(String[] args) {
//        is_symmetric is = new is_symmetric();
//
//        // insert
//        is.insert(0);
//        is.insert(1);
//
//        boolean ans = is.isSymmetric(is.root);
//        System.out.println(ans);
//    }
//}