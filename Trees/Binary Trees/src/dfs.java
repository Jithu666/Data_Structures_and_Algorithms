class Node{
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

public class dfs {

    Node root;

    dfs() {
        root = null;
    }

    public void insert(int data) {
        root = insertDFS(root, data);
        System.out.println(data + " inserted into the tree");
    }

    public Node insertDFS(Node root, int data) {

        if(root == null){
            root = new Node(data);
            return root;
        }

        else{
            if(data < root.data)
                root.left = insertDFS(root.left, data);
            if(data > root.data)
                root.right = insertDFS(root.right, data);
        }
        return root;
    }


    // DFS
    public void inorder() {
        System.out.print("Inorder Traversal : ");
        inOrder(root);
        System.out.println();
    }

    public void inOrder(Node root){

        if(root == null)
            return;

        else{
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preorder() {
        System.out.print("PreOrder Traversal : ");
        preOrder(root);
        System.out.println();

    }

    public void preOrder(Node root){
        if(root == null)
            return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postorder() {
        System.out.print("Postorder Traversal : ");
        postOrder(root);
        System.out.println();
    }

    public void postOrder(Node root){
        if(root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }


    public static void main(String[] args) {
        dfs tree = new dfs();

        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);

        tree.inorder();
        tree.preorder();
        tree.postorder();
    }
}
