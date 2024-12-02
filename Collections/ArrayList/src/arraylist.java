import java.util.ArrayList;
import java.util.List;

public class arraylist {

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>(4);
//
////        add operation
//        for(int i = 10; i <= 100; i+=10){
//            list.add(i);
//        }
//        System.out.println(list);

//      get item from the list
//        System.out.println(list.get(5));

//        modifying the element
//        list.set(9,100);
//        System.out.println(list.get(9));

//      remove operation
//        removes element from the specified index
//        list.remove(9);
//        System.out.println(list.get(8));


//        check the size of the arraylist
//        System.out.println(list.size());


        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Apple");
        list.add("Guava");
        list.add("Pomegranate");
        list.add("Pomegranate");

//      view the contents of the arraylist, through for loop
        for (String s : list) {
//            System.out.println(s + " ");
        }

//        remove the contents of the list through its index value
//        list.remove(4);

//        remove the contents of the list through its name
            list.remove("Pomegranate");

//        update the contents of the list
//        list.set(4, "Blackberry");
//        System.out.println(list.get(4));

        for (String s : list) {
            System.out.println(s + " ");
        }
    }
}
