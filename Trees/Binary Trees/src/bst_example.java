public class bst_example {
    public static void main(String[] args) {

        // insert into tree
        bst ib = new bst();
        ib.insert(50);
        ib.insert(45);
        ib.insert(40);
        ib.insert(35);
        ib.insert(30);
        ib.insert(25);
        ib.insert(20);
        ib.insert(15);
        ib.insert(10);
        ib.insert(55);
        ib.insert(60);
        ib.insert(65);
        ib.insert(70);
        ib.insert(75);
        ib.insert(80);
        ib.insert(85);
        ib.insert(90);

        // search for a value in the tree.
        ib.search(60);
        ib.search(6);

        // inorder traversal
        ib.inorder();

        // preorder traversal
        ib.preorder();

        // postorder traversal
        ib.postorder();

        // delete a value from the tree
        ib.delete(25);
        ib.delete(75);

        // inorder traversal
        ib.inorder();

        // preorder traversal
        ib.preorder();

        // postorder traversal
        ib.postorder();
    }
}

class Node{
    int data;
    Node left, right;
    public Node(int val) {
        this.data = val;
        left = right = null;
    }
}

class bst {
    Node root;

    bst() {
        root = null;
    }

    // insert method called from the main method
    public void insert(int x) {
        root = insert(root, x);
        System.out.println(x + " inserted");
    }

    // actual implementation of the insert method.
    public Node insert(Node root, int x) {
        // base case || stopping condition.
        if (root == null) {
            root = new Node(x);
            return root;
        }

        // recursive calls
        if (x < root.data) {
            root.left = insert(root.left, x);
        } else if (x > root.data) {
            root.right = insert(root.right, x);
        }
        return root;
    }

    // search method called from the main method
    public void search(int key) {
        boolean ans = search(root, key);

        if (ans) {
            System.out.println(key + " found in the tree");
        } else {
            System.out.println(key + " not found in the tree");
        }
    }

    // actual implementation of the search method.
    public boolean search(Node root, int key) {
        // base case
        if (root == null) {
            return false;
        }
        // base case
        else if (root.data == key) {
            return true;
        }

        // recursive calls
        else if (key < root.data) {
            return search(root.left, key);
        }
        return search(root.right, key);
    }

    // delete method called from the main method
    public void delete(int val) {
        if(search(root, val)){
            delete(root, val);
            System.out.println(val + " deleted from the tree");
        } else{
            System.out.println(val + " does not exist in the tree.");
        }
    }

    // actual implementation of the delete method.
    public Node delete(Node root, int val) {
        // base case
        if (root == null) {
            return root;
        }

        // recursive calls
        if (val < root.data) {
            root.left = delete(root.left, val);
        } else if (val > root.data) {
            root.right = delete(root.right, val);
        } else {
            // there exists two cases
            // 1. if the Node has only one child(subtrees)
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // 2. if the Node has two both left and right children / subtrees
            root.data = minvalue(root.right);

            root.right = delete(root.right, val);
        }
        return root;
    }

    // recursive method to find the inorder successor (minimum value in the right subtree).
    public int minvalue(Node root) {
        int minvalue = root.data;
        while (root.left != null) {
            minvalue = root.left.data;
            root = root.left;
        }
        return minvalue;
    }

    // Inorder Traversal
    public void inorder() {
        System.out.print("Inorder Traversal : ");
        inorder(root);
        System.out.println();
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder Traversal
    public void preorder() {
        System.out.print("Preorder Traversal : ");
        preorder(root);
        System.out.println();
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder Traversal
    public void postorder() {
        System.out.print("Postorder Traversal : ");
        postorder(root);
        System.out.println();
    }

    public void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
}