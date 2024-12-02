// Tree Map
// is part of the java.util package and is an implementation of Map Interface, that uses Red-Black trees,
// this ensures the keys are always in sorted order.
// faster retrieval of data based on key values

// characteristics

// 1. Sorted Order : The entries are sorted by keys
// 2. Logarithmic time performance : Basic operations like (get, put, remove, etc) take logarithmic time O(log*n);
// 3. Navigable Map : It provides navigational methods such as
//        firstKey, lastKey, floorKey & ceilingKey.
// 4. Null Values are not allowed : if null keys are passed then it throws NullPointerException, but null values are accepted.


import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();

        map.put("Apple", 2);
        map.put("Orange", 4);
        map.put("Mango", 6);
        map.put("Dates", 8);
        map.put("Grape", 10);

//        System.out.println(map);

        // using a for loop to retrieve data from the map.
//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }


        // Accessing specific methods of the TreeMap
        System.out.println("\nFirst Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());
        System.out.println("Floor Key (Before Dates): " + map.floorKey("Dates"));
        System.out.println("Ceiling Key (After Dates): " + map.ceilingKey("Dates"));

    }
}
