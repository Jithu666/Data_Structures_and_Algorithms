public class treeTraversals {

//    static class Node{
//        int data;
//        Node left, right;
//
//        public Node(int d){
//            data = d;
//            left = right = null;
//        } // constructor ends here
//    } // class ends here

    Node root;

    public treeTraversals(){
        root = null;
    }

    public void inOrder(Node root) {

        if(root == null) {
//            System.out.println("Tree is Empty.");
            return;
        }


        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    return;
    }


    public void preOrder(Node root) {

        if(root == null) {
//            System.out.println("Tree is Empty.");
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        return;
    }


    public void postOrder(Node root) {

        if(root == null) {
//            System.out.println("Tree is Empty.");
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
        return;
    }


    public void add(int data){

        Node new_Node = new Node(data);

        if(root == null){
            root = new_Node;
        }
        // if the tree has existing elements then traverse until you find the empty node or correct position to insert the data.
        else{
            Node temp = root;
            Node parent = null;

            while(temp != null){
                parent = temp;
                if(new_Node.data < temp.data){
                    temp = temp.left;
                } else{
                    temp = temp.right;
                }
            }

            if(new_Node.data < parent.data){
                parent.left = new_Node;
            } else{
                parent.right = new_Node;
            }
        }
    }

    public static void main(String[] args) {
        treeTraversals t = new treeTraversals();

        t.add(6);
        t.add(4);
        t.add(8);
        t.add(1);
        t.add(10);
        t.add(3);
        t.add(12);


        System.out.print("InOrder Traversal : ");
        t.inOrder(t.root);
        System.out.println();

        System.out.print("PreOrder Traversal : ");
        t.preOrder(t.root);
        System.out.println();

        System.out.print("PostOrder Traversal : ");
        t.postOrder(t.root);
        System.out.println();

    }

}
