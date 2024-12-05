//class Node {
//
//    int data;
//    Node left, right;
//
//    public Node(int d) {
//        data = d;
//        left = right = null;
//    }
//}

class BST{

    static Node root;

    void insert(int data) {
        root = insertBST(root, data);
    }

    public Node insertBST(Node root, int data) {
        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data)
            root.left = insertBST(root.left, data);
        if(data > root.data)
            root.right = insertBST(root.right, data);

        return root;
    }

    public void delete(int data) {
        root = deleteBST(root, data);
    }

    public Node deleteBST(Node root, int data) {

        if(root == null)
            return root;


        if(data < root.data)
            root.left = deleteBST(root.left, data);
        else if(data > root.data)
            root.right = deleteBST(root.right, data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null) {
                return root.left;
            }
            root.data = minValue(root.right);

            root.right = deleteBST(root.right, root.data);
        }
        return root;
    }

    public int minValue(Node root){
        int minValue = root.data;

        while(root.left != null){
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public void inorderTraversal(Node root){
        inorder(root);
    }

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void preorderTraversal(Node root){
        preorder(root);
    }

    public void preorder(Node root){
        if(root  == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void postorderTraversal(Node root){
        postOrder(root);
    }

    public void postOrder(Node root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(10);
        tree.insert(8);
        tree.insert(6);
        tree.insert(4);
        tree.insert(2);
        tree.insert(12);
        tree.insert(14);
        tree.insert(16);
        tree.insert(18);

        System.out.print("Inorder traversal : ");
        tree.inorder(root);
        System.out.println();

        tree.delete(10);
        System.out.print("Inorder traversal : ");
        tree.inorder(root);
        System.out.println();

        System.out.print("PreOrder Traversal : ");
        tree.preorder(root);
        System.out.println();

        System.out.print("PostOrder Traversal : ");
        tree.postOrder(root);
        System.out.println();
    }
}