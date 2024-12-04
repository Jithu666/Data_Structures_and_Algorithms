public class divisionTriplets {
    public static void main(String[] args) {
        int arr[] = {3,4,7,8,9};
        int d = 5;

        int res = findCount(arr, d);
        System.out.println(res);
    }

    public static int findCount(int arr[], int d){
        int count = 0;
        for(int i = 0; i < arr.length-2; i++){
            for(int j = i+1; j < arr.length-1; j++){
                for(int k = j+1; k < arr.length; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum % d == 0)
                        count++;
                    }
                }
            }
        return count;
    }
}
