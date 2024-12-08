import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args) {
        int arr[] = {2,1,2};
        int ans = majorityElement(arr);

        if(ans != -1)
            System.out.println("Majority Element is : " + ans);
        else
            System.out.println("-1");
    }
    public static int majorityElement(int[] arr){

        HashMap<Integer, Integer> hm = new HashMap<>();

        int majorityElement = arr.length / 2;

        for(int i : arr){
            hm.put(i, hm.getOrDefault(i, 0) + 1);

            if(hm.get(i) > majorityElement)
                return i;
        }
        return -1;
    }
}
