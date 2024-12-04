import java.util.Arrays;

public class xor {
    public int[] findXor(int[] arr){
        int[] prefix = new int[arr.length];

        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i-1] ^ arr[i];
        }
        return prefix;
    }
}

class elc{
    public static void main(String[] args) {
        xor x = new xor();
        int[] arr = {3,5,2,10};
        int[] ans = x.findXor(arr);
        System.out.println(Arrays.toString(ans));
    }
}
