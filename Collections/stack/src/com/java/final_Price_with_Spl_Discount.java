import java.util.Arrays;
import java.util.Stack;

public class final_Price_with_Spl_Discount {

    public int[] in_A_Shop(int [] arr) {

        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        int temp = -1;

        for(int i = arr.length-1; i >= 0; i--) {

            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }

            if(!st.isEmpty()) {
                ans[i] = arr[i] - st.peek();
            } else {
                ans[i] = arr[i];
            }
            st.push(arr[i]);
        }
        return ans;
    }
}

//class elc{
//    public static void main(String[] args) {
//
//        final_Price_with_Spl_Discount fp = new final_Price_with_Spl_Discount();
//        int[] arr = {8,4,6,2,3};
//        int[] res = fp.in_A_Shop(arr);
//        System.out.println(Arrays.toString(res));
//    }
//}
