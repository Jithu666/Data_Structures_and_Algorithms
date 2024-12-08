public class arrayPointer {
    public static void main(String[] args) {
        int arr[] = {2,6,4,3};
        int target = 10;

        int[] res = findIndexes(arr, target);
        System.out.println("The indexes are " + res[0] + " and " + res[1]);
    }

    static int[] findIndexes(int[] arr, int target){
        int i = 0;
        int j = 0;
        int n = arr.length;

        int res[] = new int[n];

        for(i = 0; i < n; i++){
            for(j = i+1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    res[0] = i;
                    res[1] = j;
//                    return res;
                }
            }
        }
        return res;
    }
}
