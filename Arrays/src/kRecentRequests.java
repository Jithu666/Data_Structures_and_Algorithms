import java.util.*;

public class kRecentRequests {
    public static void main(String[] args) {
        String [] requests = {"item1", "item2", "item3", "item3", "item1"};

        Map<String, Boolean> res = kRecentRequests(requests);
//        StringBuilder sb = new StringBuilder();
//        sb.append(res);
        for(String key : res.keySet()){
            System.out.print(key + " ");
        }

    }

    public static Map<String, Boolean> kRecentRequests(String[] requests){

        Map<String, Boolean> check = new HashMap<>();
        for(int i = requests.length-1; i > 0; i--){
            check.put(requests[i], true);
        }
        return check;
    }
}