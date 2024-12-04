import java.util.ArrayList;

public class oddEvenTransform {
    public static void main(String[] args) {
        int arr[] = {3,4,9};

        ArrayList<Integer> al = oddEvenTransform(arr);
        System.out.println(al);
    }
    public static ArrayList<Integer> oddEvenTransform(int[] arr){

        ArrayList<Integer> res = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] - 3;
            }
            else{
                arr[i] += 3;
            }
            res.add(arr[i]);
        }
        return res;
    }
}

