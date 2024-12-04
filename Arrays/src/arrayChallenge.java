import java.util.ArrayList;

public class arrayChallenge {
    public static void main(String[] args) {

        int arr[] = {2,4,3};

        ArrayList<Integer> ans = arrayChallenge(arr);

        for(int i = 0; i < 1; i++){
            System.out.print(ans);
        }
    }


    public static ArrayList<Integer> arrayChallenge(int arr[]){

        ArrayList<Integer> al = new ArrayList<>();

        al.add(0);

        for(int i = 1; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < i; j++){
                int res = arr[i] - arr[j];
                sum += res;
            }
        al.add(sum);
        }
        return al;
    }
}