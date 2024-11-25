import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class numberOf {
    Queue<Integer> q;

    public numberOf(){
        q = new LinkedList<>();
    }

    public int recentCalls(int t) {
        q.add(t);
        while(q.peek() != null && t - q.peek() > 3000){
            q.poll();
        }
        return q.size();
    }
}

//class elc {
//    public static void main(String[] args) {
//        numberOf no = new numberOf();
//        System.out.println(no.recentCalls(300));
//        System.out.println(no.recentCalls(3000));
//        System.out.println(no.recentCalls(6000));
//    }
//}
