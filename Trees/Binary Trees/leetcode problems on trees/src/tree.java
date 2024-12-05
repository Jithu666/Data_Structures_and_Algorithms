package trees;

public class tree {

    static Node root;
    public tree() {
        root = null;
    }

    static class Node{
        int data;
        Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }
    }

//    public static void main(String[] args) {
//        Node node = new Node(2);
//        node.left = new Node(1);
//        node.right = new Node(3);
//    }

}

