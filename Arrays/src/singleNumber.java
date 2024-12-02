public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {2, 2, 9};
        int n = arr.length;

        int res = singleNumber(arr, n);
        System.out.println(res);
    }

    public static int singleNumber(int[] arr, int n) {

        /*int single_num = 0;
        for (int i = 0; i < n; i++) {
            single_num ^= arr[i];
        }
        return single_num;
    }*/

        int count = -1;
        for (int i = 0; i < n; i++) {
            int ele = arr[i];
            count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == ele)
                    count++;
            }
            if (count == 1)
                return ele;
        }
        return -1;
    }
}