//cl`ass Node{
//    int data;
//    Node left, right;
//
//    public Node(int d) {
//        data = d;
//        left = right = null;
//    }
//}

public class searchInBST {

    static Node root;

    public searchInBST(){
        root = null;
    }

    public void insert(int data) {
        root = insertBST(root, data);
    }

    public Node insertBST(Node root, int data) {

        if(root == null) {
            root = new Node(data);
            return root;
        }

        else{
            if(data < root.data)
                root.left = insertBST(root.left, data);
            else if (data > root.data)
                root.right = insertBST(root.right, data);
        }
        return root;
    }

    // search in bst
    public boolean search(int data) {
        return searchBST(root, data);
    }

    public boolean searchBST(Node root, int value) {

        if(root == null) {
            return false;
        }

        if(value == root.data)
            return true;


        if(value < root.data)
            return searchBST(root.left, value);
        else {
            return searchBST(root.right, value);
        }
    }

    public static void main(String[] args) {

        searchInBST tree = new searchInBST();

        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);

        System.out.println(tree.search(7));
        System.out.println(tree.search(3));
        System.out.println(tree.search(9));
        System.out.println(tree.search(17));

    }

}
