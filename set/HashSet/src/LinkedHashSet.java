// LinkedHashSet

// linked-hash-set in java is part of the java collections framework.
// linked-hash-set implements the set interface and extends the HashSet class.
// linked-hash-set uses a hash-table with a linked-list running through it, which allows it to maintain the insertion order of elements.

// key features of LinkedHashSet

// 1. No Duplicate Elements
// 2. Insertion order of elements are maintained
// 3. Fast access to data

// Implementation
import java.util.LinkedHashSet;

class Linked_HashSet {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

//        Add (insert)
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Oranges");
        linkedHashSet.add("Dates");
        linkedHashSet.add("Apple");

//        System.out.println("Elements in LinkedHashSet are : ");
//        for(String s : linkedHashSet){
//            System.out.println(s);
//        }

//        check if the set contains the given element
//        System.out.println(linkedHashSet.contains("Peach"));

//        remove
//        linkedHashSet.remove("Apple");

//        for(String s:linkedHashSet){
//            System.out.println(s);
//        }


//        size of the linked hash map
//        System.out.println(linkedHashSet.size());

//        System.out.println(linkedHashSet);

//        clear all elements from linked hash map
        linkedHashSet.clear();

//        for(String s : linkedHashSet){
//            System.out.println(s);
//        }
    }
}
