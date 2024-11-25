import java.net.Socket;
import java.io.*;

public class post_request {
    public static void main(String[] args) {
        String hostname = "example.com"; // Replace with actual hostname
        int port = 80;

        try (Socket s = new Socket(hostname, port)) {
            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            // Send an OPTIONS request
            out.println("OPTIONS /submit HTTP/1.1");
            out.println("Host: " + hostname);
            out.println("User-Agent: RawSocketHttpClient/1.0");
            out.println("Connection: close");
            out.println();
            out.flush();

            // Read the server response
            String line;
            System.out.println("\nServer response:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
