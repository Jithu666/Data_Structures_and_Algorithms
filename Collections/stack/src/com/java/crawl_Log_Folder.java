import java.util.Stack;

public class crawl_Log_Folder {

    public int minCount(String s){
        Stack<String> st = new Stack<>();
        String[] str = s.split(",");

        for(String temp : str) {
            if(temp.equals("../")) {
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(temp.equals("./")) {
                continue;
            } else{
                st.push(temp);
            }
        }

        return st.size();
    }
}

//class elc{
//    public static void main(String[] args) {
//        crawl_Log_Folder clf = new crawl_Log_Folder();
//        String s = "d1/,../,../,../";
//        int res = clf.minCount(s);
//        System.out.println(res);
//    }
//}