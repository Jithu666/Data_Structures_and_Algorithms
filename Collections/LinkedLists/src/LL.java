import java.util.*;

public class LL {

    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.addLast("a");
        list.addFirst("is");

        System.out.println(list);
        list.addFirst("this");
        list.add("list");

        System.out.println(list);
        System.out.println(list.size());
    
        for(int i = 0; i<list.size(); i++){
            if(list.get(i) == "j kid"){
                System.out.println(list.get(i));
            }
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
    
        list.removeLast();
      System.out.println(list);

      list.remove(2);
      System.out.println(list);
    }
}
