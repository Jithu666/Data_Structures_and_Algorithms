import java.util.LinkedList;
import java.util.Queue;

public class number_Of_Students {

    public static int unable_To_Eat(int[] students, int[] sandwich) {

        Queue<Integer> stud = new LinkedList<>();

        // store the students values in the queue
        for(int i : students) {
            stud.add(i);
        }

        int sandwichIdx = 0;
        int n = sandwich.length;
        int count = 0;


        while(!stud.isEmpty() && sandwichIdx < n) {
            int currStud = stud.poll();

            if(currStud == sandwich[sandwichIdx]){
                sandwichIdx++;
                count = 0;
            } else {
                stud.add(currStud);
                count++;
            }

            if(stud.size() == count) {
                break;
            }
        }
        return stud.size();


    }
}

//class elc {
//    public static void main(String[] args) {
//
//        number_Of_Students ns = new number_Of_Students();
//
//        int [] students = {1,1,1,0,0,1};
//        int [] sandwich = {1,0,0,0,1,1};
//
//        int res = number_Of_Students.unable_To_Eat(students, sandwich);
//        System.out.println(res);
//    }
//}
