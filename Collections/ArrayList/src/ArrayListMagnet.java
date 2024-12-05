import java.util.ArrayList;


public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three");
        printlist(a);

        a.remove(2);
//        printlist(a);

        if(a.contains("three")){
            a.add("four");
        }
        printlist(a);

        if(a.indexOf("four") != 4){
            a.add(4, "4.2");
        }
        printlist(a);
        printlist(a);



    }

    public static void printlist(ArrayList<String> list){
        for(String element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
