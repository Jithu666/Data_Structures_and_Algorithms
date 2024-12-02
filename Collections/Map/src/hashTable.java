    // HashTable : is a DS that implements an associative array, which is a structure that can map keys to values.
//    It uses hash function to compute an index, also called as hash code, into an array of buckets or slots, from which the desired value can be found.

    // Hash function takes an input (key) and returns an integer (hash code), which is used as an index in the hash table.

    // The main purpose is to distribute keys uniformly across the array to minimize collisions.

    // Handling collisions: Collision occurs when two different keys map to the same index.

    // common methods to handle collision are
    // 1. Chaining : each bucket at the hashed index holds a list of entries, so multiple key value pairs can exist at the same index,

    // 2. Open Addressing : Finds another open spot in the array if collision occurs. usually through techniques like linear probing or quadratic probing.

    // 3. Load Factor : measures how full the hash table is, when it crosses the threshold often(around 0.7) the hash-table may resize itself to reduce collisions.

    // 4. Operations : Insert, Search & Delete.


import java.util.HashMap;
import java.util.Map;

public class hashTable {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // adding key value pairs
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);

        // accessing values by key
//        System.out.println("Value for key 'one': " + map.get("one"));

        // check if the given key exists
//        if(map.containsKey("thee"))
//            System.out.println("Key 'two' exists in the map");
//        else
//            System.out.println("Key doesn't exist in the map");

        // removing a key value pair
        map.remove("two");


        // iterating over keys and values
//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println("Key : " + entry.getKey() + ", Value :" + entry.getValue());
//        }


        // check the size of the map
        System.out.println("Size of Map is : " + map.size());
    }
}