import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "One");
        lhm.put(2, "Two");
        lhm.put(3, "Three");
        lhm.put(4, "Four");
        lhm.put(5, "Five");
        lhm.put(6, "Six");

        // Displaying the LinkedHashMap (Insertion Order).
//        System.out.println("Contents of LinkedHashMap are : " + lhm);

        // Accessing the element to see the order change (if access order is true)
//        System.out.println("Accessing element with value 2 : " + lhm.get(2));

//        System.out.println("Contents of LinkedHashMap are : " + lhm);

//        lhm.put(3, "Three updated");

//        System.out.println(lhm);

//        iterating over the linkedHashMap
//        System.out.println("Iterating over the LinkedHashMap : ");
//        for(Map.Entry<Integer, String> entry : lhm.entrySet()){
//            System.out.println("Key : " + entry.getKey() + ", Value " + entry.getValue());
//        }

        lhm.remove(1);
        System.out.println(lhm);

    }
}
