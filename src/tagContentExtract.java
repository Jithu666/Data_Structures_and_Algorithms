import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tagContentExtract {
    public static void main(String[] args) {
        String as = "<h1>hello</h1>";
        String sas = "<h1><h2>hello</h1>";

        tag(as);
        tag(sas);
    }
    public static void tag(String as){
        Pattern p = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Matcher m = p.matcher(as);

        boolean found = false;
        while(m.find()){
            found = true;
            System.out.println(m.group(2));
        }

        if(!found){
            System.out.println("None");
        }
    }
}
