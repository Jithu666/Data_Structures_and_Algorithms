import java.util.Queue;
import java.util.LinkedList;
public class sumOfLeftAndRightNodes {
    class Node{
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    Node root;
    sumOfLeftAndRightNodes() {
        root = null;
    }

    public void insert(int data){
        root = insertBT(root, data);
        System.out.println(data + " Inserted into the tree");
    }

    public Node insertBT(Node root, int data) {

        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
            return root;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node temp = q.poll();

            if(temp.left == null){
                temp.left = newNode;
                break;
            }else{
                q.add(temp.left);
            }

            if(temp.right == null){
                temp.right = newNode;
                break;
            }
            else{
                q.add(temp.right);
            }
        }
        return root;
    }

    public boolean checkNodes(){
        return root.data == root.left.data + root.right.data;
    }

    public static void main(String[] args) {

        sumOfLeftAndRightNodes tree = new sumOfLeftAndRightNodes();

        tree.insert(5);
        tree.insert(2);
        tree.insert(3);

        System.out.println(tree.checkNodes());
    }

}
