import java.io.*;
import java.net.*;
public class Tcp_server {

public static void main(String[] args) throws IOException {

// Create a server socket that listens on port 5000 
ServerSocket serverSocket = new ServerSocket(5001); 
System.out.println("Server is waiting for a client...");

// Accept incoming client connection
Socket clientSocket = serverSocket.accept(); 
System.out.println("Client connected.");

// Receive data from client
BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

System.out.println("Client says: " + in.readLine()); 
// Send data to client

PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
 out.println("Hello Client!");
 System.out.println("Connection closed.");

// Close the connection
clientSocket.close();
serverSocket.close();}}