class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int k = 5;
        search s = new search();
        boolean ans = s.Search(arr, k);
        if(ans){
            System.out.println(k + " found in the array");
        } else {
            System.out.println(k + " not found in the array");
        }
    }
}

class search {
    public boolean Search(int[] arr, int k) {
        int high = arr.length - 1;

        return binary_search(arr, 0, high, k);
    }

    public boolean binary_search(int[] arr, int low, int high, int k) {
        if(low > high)
            return false;

        int mid = (high + low) / 2;

        if (k == arr[mid])
            return true;
        else if (k < arr[mid])
            return binary_search(arr, 0, mid - 1, k);
        else if (k > arr[mid])
            return binary_search(arr, mid + 1, high, k);
        else
            return false;
    }
}
