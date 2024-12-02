import java.util.*;

public class union {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,7};
        int[] b = {1,2,3,4,5,6};

        ofTwoSortedArrays ot = new ofTwoSortedArrays();
        ot.union(a,b);
    }
}

class ofTwoSortedArrays{
    public void union(int[] a, int[] b){

        HashSet<Integer> hs = new HashSet<>();
        for(int i : a){
            hs.add(i);
        }
        for(int i : b){
            hs.add(i);
        }

        List<Integer> l = new ArrayList<>(hs);
        Collections.sort(l);

        System.out.println(l);
    }
}