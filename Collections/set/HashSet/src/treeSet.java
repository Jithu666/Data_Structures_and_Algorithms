// TreeSet

// characteristics of TreeMap

// is part of java.util package and implements the set interface
// it stores the elements in sorted and ascending order. it automatically removes duplicates,
// treeset is a good choice if we need a collection that maintains elements in a natural order or sorted order,
// It is based on TreeMap, basically used in red-black trees for efficient operations.


import java.util.TreeSet;
public class treeSet {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

//        insert ()
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);

//        duplicate values will not be inserted
        ts.add(6);

//        System.out.println(ts);

//        to retrieve the first element
        System.out.println("First element : " + ts.first());
        System.out.println("Last element : " + ts.last());


//        to remove the given value
        ts.remove(3);
        ts.remove(5);

        System.out.println(ts);

//        to check if the given value exists in the given treeset

        System.out.println(ts.contains(6));

//        for(int i : ts){
//            System.out.print(i + " ");
//        }

//        System.out.println(ts.higher(1));
//        System.out.println(ts.higher(5));
//        System.out.println(ts.higher(6));
//        System.out.println(ts.higher(4));

//        System.out.println(ts.lower(6));


//        System.out.println(ts.ceiling(5));
//        System.out.println(ts.floor(5));

        System.out.println(ts.pollFirst());
        System.out.println(ts.pollLast());

        System.out.println(ts);

        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
    }
}
