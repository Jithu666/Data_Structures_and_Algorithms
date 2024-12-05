package trees;

public class insertion_Into_Tree extends tree{

    public void insert(int val) {
        // helper method to call the insert function for every insert operation.
        root = insertVal(root, val);
        System.out.println(val + " inserted");
    }

    public Node insertVal(Node root, int val) {

        if(root == null) {
            return new Node(val);
        }

        if(val < root.data){
            root.left = insertVal(root.left, val);
        } else {
            root.right = insertVal(root.right, val);
        }
        return root;
    } // insert function ends here.
}

//class elc {
//    public static void main(String[] args) {
//        insertion_Into_Tree it = new insertion_Into_Tree();
//
//        it.insert(2);
//        it.insert(3);
//        it.insert(4);
//        it.insert(5);
//        it.insert(6);
//    }
//}