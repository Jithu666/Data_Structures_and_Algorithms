package in.Java;

public class same_tree extends range_sum_of_bst{

    public boolean isSameTree(Node t1, Node t2) {

        if (t1 == null && t2 == null){
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        else if (t1.data != t2.data) {
            return false;
        }
        else {
            return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
        }
    }
}

//class elc {
//    public static void main(String[] args) {
//        same_tree st = new same_tree();
//        st.insert(2);
//        st.insert(1);
//        st.insert(4);
//
//        same_tree st1 = new same_tree();
//        st1.insert(2);
//        st1.insert(1);
//        st1.insert(4);
//
//        boolean res = st.isSameTree(st.root, st1.root);
//        System.out.println("Are trees Identical : " + res);
//    }
//
//}
