import java.io.*;
import java.net.Socket;

public class get_request {
    public static void main(String[] args) {
        String hostname = "example.com";
        int port = 80; // Default HTTP port

        try (Socket socket = new Socket(hostname, port)) {
            // Create output stream to send request to the server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Create input stream to receive response from the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            // Send a simple GET request
            out.println("GET / HTTP/1.1");
            out.println("Host: " + hostname);
            out.println("User-Agent: RawSocketHttpClient/1.0");
            out.println("Accept: */*");
            out.println("Connection: close"); // Close connection after response
            out.println(); // Blank line to signify end of request headers

            // Read and print the response
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
