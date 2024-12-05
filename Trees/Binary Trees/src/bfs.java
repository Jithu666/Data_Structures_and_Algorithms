import java.util.Queue;
import java.util.LinkedList;

//class Node{
//    int data;
//    Node left, right;
//
//    public Node(int d) {
//        data = d;
//        left = right = null;
//    }
//}

public class bfs {

    static Node root;
    bfs(){
        root = null;
    }
    public void insert(int data){
        root = insertBFS(root, data);
    }
    public Node insertBFS(Node root, int data) {

        if(root == null){
            root = new Node(data);
            return root;
        }

        if(data < root.data)
            root.left = insertBFS(root.left, data);
        else
            root.right = insertBFS(root.right, data);

        return root;
    }

    public void bfs(){
        System.out.print("Breadth First Search : ");
        bfs(root, root.data);
    }

    public void bfs(Node root, int data){

        if(root == null)
            return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Node> q = new LinkedList<>();

        bfs tree = new bfs();

        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        tree.bfs();
    }
}

