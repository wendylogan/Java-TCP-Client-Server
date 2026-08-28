/**
 * Server
 */
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 12345;
        
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Waiting for clients on port " + port + "...");
            
            // Accept a client connection
            Socket client = serverSocket.accept();
            System.out.println("Client connected: " + client.getInetAddress());
            
            // Set up input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintWriter output = new PrintWriter(client.getOutputStream(), true);
            
            String message;
            while ((message = input.readLine()) != null) {
                System.out.println("Received: " + message);
                String response = message.toUpperCase();
                System.out.println("Sending: " + response);
                output.println(response);
            }
            
            System.out.println("Client disconnected.");
            
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}