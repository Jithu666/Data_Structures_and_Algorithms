import java.util.ArrayList;
public class arrayList {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        // add elements into the list
        al.add(1);
        al.add("J");
        al.add('J');
        al.add(0.3);
        al.add(false);
        al.add('\0');
        System.out.println(al);

        al.remove("J");
        System.out.println(al);


        System.out.println(al.contains(true));

        System.out.println(al.isEmpty());

        System.out.println(al.indexOf(0.3));

        System.out.println(al.size());

        System.out.println(al.get(4));
    }
}
