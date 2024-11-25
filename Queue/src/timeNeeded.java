public class timeNeeded {
    public int toBuyTickets(int[] arr, int k) {

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(i <= k){
                count += Math.min(arr[i], arr[k]);
            } else {
                count += Math.min(arr[i], arr[k-1]);
            }
        }
        return count;
    }
}

//class elc{
//    public static void main(String[] args) {
//        timeNeeded tn = new timeNeeded();
//        int[] arr = {2,3,2};
//        int k = 2;
//        System.out.println(tn.toBuyTickets(arr, k));
//    }
//}