// HashMap in Java is part of java.util package
// hashmaps are used to store data in key-value format
// where each key is unique (duplicates not allowed)
// values can be retrieved and modified based on their associated keys


import java.util.*;
import java.util.stream.Collectors;

public class hashMap {
    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();

//        insert operation
        hm.put("Apple", 1);
        hm.put("Oranges", 1);
        hm.put("Mangoes", 4);

//        System.out.println(hm);

        // to retrieve value based on particular key value.
//        System.out.println("Apple " + hm.get("Apple"));

        hm.put("Apple", 2);
//        System.out.println("Apple " + hm.get("Apple"));


//        iterating over keys and values
//        for(Map.Entry<String, String> entry : hm.entrySet()){
//            System.out.println("Key : " + entry.getKey() + ", value : " + entry.getValue());
//        }

//        check if the key and value exists
//        System.out.println(hm.containsKey("Pomegranate"));
//        System.out.println(hm.containsValue(6));


        hm.remove("Oranges");
//        System.out.println(hm);
//        System.out.println(hm.get("Apple"));

//        System.out.println(hm.size());


//        compute (updates value based on the key provided)
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);

        map.compute("Apple", (key, val) -> val + 10);
//        System.out.println(map.get("Apple"));

        map.computeIfPresent("Apple", (key, val) -> val*2);
//        System.out.println(map.get("Apple"));

        map.computeIfAbsent("Banana", key -> 30);
//        iterator
//        for(Map.Entry<String, Integer> entry : map.entrySet()){
//            System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
//        }


//        merging values

        map.merge("Apple", 5, Integer::sum);
        map.merge("Banana", 1, Integer::sum);

//        System.out.println(map);


//        replacing entries

//        replace can either update a value if key exists or update it only if a current value matches a specified value
//        map.replace("Apple", 45, 60);

//        System.out.println(map.get("Apple"));

//    Bulk Operations

//        put all: Copies all key-value pairs from old / existing map to new map

//        clear : removes all entries from new map
        map.putAll(hm);
        hm.putAll(map);

//        System.out.println(map);


//        bulk update each value by 10
        hm.replaceAll((key, value) -> value + 10);
//        System.out.println(hm);

        // bulk operation remove all values which do not meet the given condition
        // removeAll operation cannot be directly applied to the HashMap, it needs to be applied to the entrySet.

//        map.entrySet().removeIf(entry -> entry.getValue() < 30);
//        System.out.println(map);


//        for each operation
//        map.forEach((key, value) ->System.out.println(key + " -> " + value));


//        Custom sorting with LinkedHashMap

//        Since HashMap does not maintain order, we often convert it to a LinkedHashMap to maintain it in a specific order

        Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));

//        System.out.println(sortedMap);

//        counting frequency of elements

        String[] words = {"apple", "banana", "apple", "orange"};

        HashMap<String, Integer> hMap = new HashMap<>();

        for(String word : words){
            hMap.merge(word, 1, Integer::sum);
        }

//        System.out.println(hMap);


//        group elements by key
//        use computeIfAbsent to initialize a collection and add elements to it.

        HashMap<String, List<String>> group = new HashMap<>();
        String[][] data = {{"apple", "fruit"}, {"carrot", "vegetable"}, {"banana", "fruit"}};

        for(String[] pair : data){
            group.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
        }
    }
}
