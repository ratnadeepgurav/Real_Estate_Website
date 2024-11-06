import java.io.*;
import java.net.*;
public class Tcp_client {

public static void main(String[] args) throws IOException {

// Establish connection to the server at localhost, port 5000 
Socket socket = new Socket("localhost", 5001);

// Send data to the server
PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
out.println("Hello Server!");

// Receive data from the server
BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
System.out.println("Server says: " + in.readLine());

// Close the socket connection
socket.close(); 

}
}