package trees;

import static trees.tree.root;

public class search_bt extends Traversal{

    public Node search(Node root, int key) {

        Node temp = root;
        while (temp != null) {

            if (key == temp.data) {
                return temp;
            }

            if (key < temp.data) {
                return search(temp.left, key);
            }
            if (key > temp.data) {
                return search(temp.right, key);
            }
        }
        return null;
    }
}

class elc extends tree{
    public static void main(String[] args) {
        search_bt s = new search_bt();

        s.insert(10);
        s.insert(6);
        s.insert(3);
        s.insert(5);
        s.insert(7);
        s.insert(4);

        int key = 12;
        Node res = s.search(root, key);

        if(res != null){
            System.out.println(key + " found in the tree");
        }
        else{
            System.out.println(key + " not found in the tree");
        }

    }
}
