import java.util.ArrayList;
import java.util.List;

public class inOrderTraversal {

    class Node {
        int data;
        Node left, right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }

    static Node root;

    public inOrderTraversal() {
        root = null;
    }


    public void insert(int data) {
        root = insertBT(root, data);
        System.out.println(data + " Inserted into the tree");
    }

    public Node insertBT(Node root, int data) {

        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return root;
        }

        Node temp = root;
        Node parent = root;

        while (temp != null) {
            parent = temp;
            if (newNode.data < temp.data)
                temp = temp.left;
            else if (newNode.data > temp.data)
                temp = temp.right;
        }
        if (newNode.data < parent.data)
            parent.left = newNode;
        else if (newNode.data > parent.data)
            parent.right = newNode;

        return root;
    }


    public List<Integer> inOrderTraversal() {

        List<Integer> list = new ArrayList<>();
        inorder(root, list);
//        System.out.println(list);
        return list;
    }

    public static void inorder(Node root, List<Integer> list){

        if(root == null)
            return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);

        return;
    }


    public static void main(String[] args) {

        inOrderTraversal iot = new inOrderTraversal();

        iot.insert(4);
        iot.insert(2);
        iot.insert(3);
        iot.insert(5);
        iot.insert(6);

        List<Integer> list = new ArrayList<>();
        list = iot.inOrderTraversal();
        System.out.println(list.toString());
    }
}
