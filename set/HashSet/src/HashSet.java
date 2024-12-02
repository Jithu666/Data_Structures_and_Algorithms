// HashSet in java is a part of the util package & is commonly used for storing unique elements,

// it is an implementation of the set interface backed by hashtable.

// it is fast for basic operations like adding, removing & checking the existence of elements in the set.

// characteristics of Hashset

// 1. No duplicates
// 2. Un-order collection
// 3. Allows null values
// 4. Faster operations

import java.util.Set;
import java.util.HashSet;

class hashSet {
    public static void main(String[] args) {

        // using the HashSet collection Framework
//        HashSet<String> set = new HashSet<>();

        // using the Set interface
        Set<String> set = new HashSet<>();

//        Add elemnts to the set interface
        set.add("Apple");
        set.add("Pine-Apple");
        set.add("Custard-Apple");
        set.add("Ooty-Apple");

//        view the elements of the set
        for(String s : set){
//            System.out.println(s);
        }

//        check if the elements are present in the set
//        System.out.println(set.contains("Dates"));


//        to remove the contents from the set
        set.remove("Ooty-Apple");

        for(String s : set){
//            System.out.println(s);
        }

//        size of the set
        System.out.println(set.size());

//        check if the set is empty
        System.out.println(set.isEmpty());
    }
}
