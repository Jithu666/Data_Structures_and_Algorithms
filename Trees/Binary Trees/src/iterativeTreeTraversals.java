import java.util.Stack;

public class iterativeTreeTraversals {

    static class Node {

        int data;
        Node left, right;

        public Node(int d) {
            data = d;
            left = right = null;
        }
    }

    private static Node root;

    // inorder traversal
    public void inOrder(Node root) {

        Stack<Node> st = new Stack<>();
        Node temp = root;

        if(root == null){
            return;
        }

        System.out.print("Inorder Traversal : ");
        while(temp != null || !st.isEmpty()){ // checking if the root node of the tree is null, or if the stack trace is not been completed.
            while(temp != null){ // while the left subtree has not reached its last node.
                st.push(temp); // push the nodes of the left tree into the stack, until there exist any node in the tree.
                temp = temp.left; // move on to the next node.
            }
            temp = st.pop(); // pop the last inserted element, this will be the leftmost node in the tree,
            System.out.print(temp.data + " "); // print the leftmost element

            temp = temp.right; // now move to the right subtree of the tree.
        }
    }

    public void preOrder(Node root) {

        // check if the root of the tree is null, if the root of the tree is null return to the calling function.
        if(root == null)
            return;

        // create a stack because we are not using recursion. => even if we use recursion for traversal, internally stack trace will be created to return to the calling function.
        Stack<Node> st = new Stack<>();
        st.push(root); // push the root to the stack, as in preorder, we will first print the data present in the root node.
        Node temp = root;
        System.out.print("PreOrder Traversal : ");
        while(!st.isEmpty()){ // checks if there is root element in the stack
            temp = st.pop(); // pop the root element from the stack and store it in temp variable.
            System.out.print(temp.data + " "); // print the temporary variable.

            if(temp.right != null)
                st.push(temp.right); // now first push the right child of the tree, because when we pop we need the right node to be printed last.
            if(temp.left != null)
                st.push(temp.left); // now push the left node of the root node as the stack is a LIFO data structure. element pushed last will be printed first, so we can print the left node before the right node in the preorder traversal.
        }
    }

    public void postOrder(Node root) {

        // check if the root of the tree is null, if the root of the tree is null return to the calling function.
        if(root == null)
            return;

        // create two stack's because we are not using recursion. => even if we use recursion for traversal, internally stack trace will be created to return to the calling function.
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root); // push the root to the first stack


        while(!st1.isEmpty()){
            Node temp = st1.pop(); // now pop the top element from the first stack.
            st2.push(temp); // and push the popped root into the second stack

            // check if the top element has any left or right children's. if the top element has any left or right children's then push them onto the first stack.
            if(temp.left != null)
                st1.push(temp.left);
            if(temp.right != null)
                st1.push(temp.right);
        }
        System.out.print("PostOrder Traversal : ");
        while(!st2.isEmpty()){ // now the second stack contains all the elements of the tree in the tree format of postorder traversal's
            Node temp = st2.pop();
            System.out.print(temp.data + " "); // you can print that elements from here.
        }
    }


    // postorder traversal using one stack
    public void postOrder_1Stack(Node root) {

        // check if the root of the tree is null, if the root of the tree is null return to the calling function.
        if(root == null)
            return;

        Stack<Node> st = new Stack<>();
        Node temp = root;
        System.out.print("PostOrder Traversal : ");
        while(temp != null || !st.isEmpty()){
            if(temp != null){
                st.push(temp);
                temp = temp.left;
            } else{
                Node curr = st.peek().right;
                if(curr == null) {
                    curr = st.pop();
                    System.out.print(curr.data + " ");

                    while (!st.isEmpty() && curr == st.peek().right) {
                        curr = st.pop();
                        System.out.print(curr.data + " ");
                    }
                } else{
                    temp = curr;
                }
            }
        }
    }

    // insert function
    public void add(int data) {

        Node new_node = new Node(data);

        if (root == null) {
            root = new_node;
            return;
        }

        Node temp = root;
        Node parent = null;

        while (temp != null) {
            parent = temp;
            if (new_node.data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        if (new_node.data < parent.data) {
            parent.left = new_node;
        }
        else
            parent.right = new_node;
    } // Class Node ends here


    public static void main(String[] args) {

        iterativeTreeTraversals t = new iterativeTreeTraversals();

        t.add(6);
        t.add(3);
        t.add(9);
        t.add(2);
        t.add(12);
        t.add(24);
        t.inOrder(root);
        System.out.println();
        t.preOrder(root);
        System.out.println();
        t.postOrder(root);
        System.out.println();
        t.postOrder_1Stack(root);
    }
}