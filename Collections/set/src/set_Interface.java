import java.util.*;


public class set_Interface {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.remove(10);
        System.out.println(set.isEmpty());
        System.out.println(set.contains(2));
        System.out.println(set.size());
        System.out.println(set);
    }

}
