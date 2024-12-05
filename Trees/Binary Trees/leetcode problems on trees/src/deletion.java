package trees;

public class deletion extends insertion_Into_Tree {

    public void delete(int data) {
        root = delete(root, data);
        System.out.println(data + " removed from the tree");
    }

    public Node delete(Node root, int key) {

        // if the tree is empty, return the root node
        if (root == null) {
            return root;
        }

        // traverse to the key value if it is present in the tree.
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        }
        // check if the node has child nodes or is it a leaf node.
        else {
            // if the key Node has zero children, return null
            if (root.left == null && root.right == null) {
                return null;
            }
            //  if the root has only one child, link the child node to the parent node of the key Node
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            // if the root has both left & right children, then find the inorder predecessor or the inorder successor, make the inorder predecessor or successor as the new root node for the below subtree & remove the key

            root.data = minval(root.right);

            root.right = delete(root.right, key);
        }
        return root;
    }

    // find the inorderr successor from the right subtree
    public int minval(Node root) {
        if(root == null){
            return 0;
        }
        int minval = root.data;
        while(root.left != null){
            minval = root.left.data;
            root = root.left;
        }
        return minval;
    }
}

//class elc extends Traversal{
//    public static void main(String[] args) {
//        deletion d = new deletion();
//        Traversal t = new Traversal();
//
//        // insertion
//        d.insert(2);
//        d.insert(3);
//        d.insert(4);
//        d.insert(5);
//        d.insert(6);
//        d.insert(1);
//        d.insert(0);
//
//        // inorder traversal
////        t.inorder_traversal(root);
//        System.out.println(t.inorder());
//
//        // deletion
//        d.delete(1);
//        System.out.println();
//
//        // inorder traversal
//        t.inorder_traversal(root);
//    }
//}