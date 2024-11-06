import java.net.*;
public class Udp_server {

public static void main(String[] args) throws Exception {

DatagramSocket socket = new DatagramSocket(5000); byte[] buffer = new byte[1024];
System.out.println("Server is waiting for a client...");

// Receive message from client
DatagramPacket packet = new DatagramPacket(buffer, buffer.length); socket.receive(packet);
String received = new String(packet.getData(), 0, packet.getLength()); System.out.println("Client says: " + received);

// Send response to client
String response = "Hello Client!";
byte[] responseBuffer = response.getBytes();
DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length, packet.getAddress(), packet.getPort());
socket.send(responsePacket); 

// Close the socket
socket.close();}}