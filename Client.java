
/**
 * Client
 */
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 12345;
        String response = "";

        try (Socket socket = new Socket(serverAddress, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connected to server.");

            String message;
            while (true) {
                System.out.print("Type a message (or 'quit' to exit): ");
                message = userInput.readLine();

                if (message.equalsIgnoreCase("quit")) {
                    break;
                }

                out.println(message);
                response = in.readLine();
                System.out.println("Server says: " + response);
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}