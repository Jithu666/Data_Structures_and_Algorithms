//import java.util.*;
//import java.io.*;
//
//public class readInput_From_File {
//    public static void main(String[] args) throws IOException {
//
////        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Githendra Gowda\\eclipse-workspace\\javaForUber\\HackerRank\\src\\input.txt"));
//////        System.out.println(reader.readLine());
////
////        int n = 1;
////        String Line;
////        while((Line = reader.readLine()) != null){
////            System.out.println(n + " " + Line);
////            n++;
////        }
////        reader.close();
//////        System.out.println();
//
//
//        Scanner sc = new Scanner(System.in);
//        boolean line = sc.hasNextLine();
//        int i = 1;
//
//        while(sc.hasNextLine()){
//            String Line = sc.nextLine();
//            System.out.println(i + " " + Line);
//            i++;
//        }
//    }
//}

import java.io.*;
import java.util.*;

public class readInput_From_File {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(sc.hasNext()) {
            String Line = sc.next();
            System.out.println(i + " " + Line);
            i++;
        }
    }
}