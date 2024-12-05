package in.Java;

public class range_sum_of_bst {
    class Node{
        int data;
        Node left, right;
        public Node(int val){
            data = val;
            left = right = null;
        }
    }
    public Node root;
    range_sum_of_bst() {
        root = null;
    }

    public void insert(int x) {
        root = insert(root, x);
    }

    public Node insert(Node root, int val){
        Node newNode = new Node(val);

        if(root == null) {
            root = newNode;
            return root;
        }

        if(val < root.data){
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public int rangeSum(Node root, int low, int high) {
        return of_bst(root, low, high);
    }
    public int of_bst(Node root, int low, int high) {
        if(root == null) {
            return 0;
        }

        if(root.data > high) {
            return of_bst(root.left, low, high);
        } else if(root.data < low) {
            return of_bst(root.right, low, high);
        }
        else
            return root.data + of_bst(root.left, low, high) + of_bst(root.right, low, high);
//        }
//        return low;
    }
}

//class elc{
//    public static void main(String[] args) {
//        range_sum_of_bst rs = new range_sum_of_bst();
//        rs.insert(4);
//        rs.insert(3);
//        rs.insert(2);
//        rs.insert(1);
//        rs.insert(5);
//        rs.insert(6);
//        rs.insert(7);
//        rs.insert(8);
//
//        int ans = rs.rangeSum(rs.root, 1, 4);
//        System.out.println(ans);
//    }
//}



