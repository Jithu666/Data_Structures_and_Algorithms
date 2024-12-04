import java.util.Stack;

// Check whether the Linked List is Palindrome or not.
public class palindromeLL {

    class Node{
        int data;
        Node next;

        public Node(int val) {
             data = val;
             next = null;
        }
    }

    Node head;

    palindromeLL() {
        head = null;
    }

    // insert
    public void insert(int data) {
        head = insertLL(data, head);
        System.out.println(data + " inserted into list");
    }

    public Node insertLL(int data, Node head) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return head;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        return head;
    }

    // is palindrome
    public void isPalindrome() {
        boolean ans = isLL_Palindrome(head);
        System.out.println(ans);
    }

    public boolean isLL_Palindrome(Node head) {

        if(head == null || head.next == null){
            return true;
        }
        Stack<Integer> st = new Stack<>();
        Node fast = head;
        Node slow = head;
        Node temp = head;

        while(fast != null && fast.next != null) {
            st.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        while(slow != null) {
            int top = st.pop();
            if(top != slow.data){
                return false;
            }
            slow = slow.next;
        }
        return true;
    }
}

//class elc {
//    public static void main(String[] args) {
//
//        palindromeLL pll = new palindromeLL();
//
//        pll.insert(1);
//        pll.insert(2);
//        pll.insert(2);
//        pll.insert(6);
//
//        pll.isPalindrome();
//    }
//}


