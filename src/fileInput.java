import java.io.*;

public class fileInput {

    public static void main(String[] args) throws IOException {

        String names[] = {"Jithu", "pramod", "kristen", "rahul"};
        BufferedWriter writer = new BufferedWriter(new FileWriter("index.txt"));

        writer.write("Writing into the file.  \n");

        for(String s : names) {
            writer.write(s + "\n");
        }
        writer.close();



        BufferedReader reader = new BufferedReader(new FileReader("index.txt"));
        String output = reader.readLine();
        System.out.println(output);

        String line;
        while((line = reader.readLine()) != null ){
            System.out.println(line);
        }
        reader.close();
    }
}